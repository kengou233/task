package fileWRDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象序列化
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午4:19:49
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		writer();
		reader();
	}
	public static void writer() throws FileNotFoundException, IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.txt"));
		
		oos.writeObject(new person(1,"哈哈"));
		
		oos.close();
	}
	public static void reader() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp.txt"));
		
		person p = (person)ois.readObject();
		
		System.out.println(p.getName());
	}
}
class person implements Serializable{
	private static final long serialVersionUID = 42L;
	private static int id=0;
	private String name;
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}