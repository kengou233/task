package fileWRDemo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ������洢�ļ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��6������8:09:54
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		writer();
		reader();
	}
	public static void writer() throws IOException
	{
		 RandomAccessFile raf = new RandomAccessFile("temp.txt","rw");
		 
		 raf.write("����".getBytes());
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
