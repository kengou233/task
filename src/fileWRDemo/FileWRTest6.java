package fileWRDemo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 键盘录入学生信息 并按照总成绩排名 存放在系统文件中
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午11:11:50
 */
public class FileWRTest6 {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> s=getStu();
		setStu(s);
	}
	public static TreeSet<Student> getStu() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet t = new TreeSet();
		String line=null;
		System.out.println("嗯？");
		while((line=br.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String [] a = line.split(",");
			Student s = new Student(a[0],Integer.parseInt(a[1]),
					Integer.parseInt(a[2]),
					Integer.parseInt(a[3])
					);
			t.add(s);
		}
		br.close();
		return t;
	}
	public static void setStu(TreeSet<Student> t) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
		for(Student s :t)
		{
			bw.write(s.getName()+"\t");
			bw.write(s.getSum());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
class Student implements Comparable<Student>{
	private String Name;
	private int Chinese;
	private int Math;
	private int English;
	private int Sum;
	
	public Student(String name, int chinese, int math, int english) {
		super();
		Name = name;
		Chinese = chinese;
		Math = math;
		English = english;
		Sum=this.Math+this.English+this.Chinese;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getChinese() {
		return Chinese;
	}
	public void setChinese(int chinese) {
		Chinese = chinese;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getSum()
	{
		return Sum;
		
	}

	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
		return Name.hashCode()+Sum*3;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		if(!(obj instanceof Student))
			return false;
		Student s =(Student)obj;
		return this.Name.equals(s.Name)&&this.Sum==s.Sum;
	}
	@Override
	public int compareTo(Student o) {
		// TODO 自动生成的方法存根
		int num=new Integer(Sum).compareTo(new Integer(o.Sum));
		if(num==0)
			return this.Name.compareTo(o.Name);
		return num;
	}
	
}