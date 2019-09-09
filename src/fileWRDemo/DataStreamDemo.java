package fileWRDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 操作基本数据流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午9:59:49
 */
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		writer();
		reader();
	}
	public static void writer() throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.txt"));
		dos.writeInt(234);
		dos.writeBoolean(true);
		dos.close();
	}
	public static void reader() throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("temp.txt"));
		int a = dis.readInt();
		boolean b = dis.readBoolean();
		System.out.println(a+" "+b);
	}
}
