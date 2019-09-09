package fileWRDemo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用随机存储文件类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午8:09:54
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		writer();
		reader();
	}
	public static void writer() throws IOException
	{
		 RandomAccessFile raf = new RandomAccessFile("temp.txt","rw");
		 
		 raf.write("哈哈".getBytes());
		 raf.write(98);
		 raf.close();
	}
	public static void reader() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("temp.txt","r");
		
		raf.seek(4);
		
		byte a[] = new byte[1024];
		int len=raf.read(a);
		
		String aString = new String(a,0,len);
		
		System.out.println(aString);
	}
}
