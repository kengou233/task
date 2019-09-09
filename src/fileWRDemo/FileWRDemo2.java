package fileWRDemo;

import java.io.*;

/**
 * 使用字节流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午9:27:49
 */
public class FileWRDemo2 {
	public static void main(String[] args) throws IOException {
		writer();
//		reader1();
//		reader2();
		reader3();
	}
	public static void writer() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("temp.txt");
		fos.write("abcd".getBytes());
		fos.close();
	}
	public static void reader1() throws IOException
	{
		FileInputStream fis = new FileInputStream("temp.txt");
		
		int len=0;
		while((len=fis.read())!=-1)
		{
			System.out.print((char)len);
		}
		fis.close();
	}
	public static void reader2() throws IOException
	{
		FileInputStream fis = new FileInputStream("temp.txt");
		
		int len=0;
		byte b[]= new byte[1024];
		
		while((len=fis.read(b))!=-1)
		{
			System.out.println(new String(b,0,len));
		}
		fis.close();
	}
	public static void reader3() throws IOException
	{
		FileInputStream fis = new FileInputStream("temp.txt");
		
		byte[] b = new byte[fis.available()];
		fis.read(b);
		
		System.out.println(new String(b));
		fis.close();
	}
}
