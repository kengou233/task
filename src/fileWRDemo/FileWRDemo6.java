package fileWRDemo;

import java.io.*;

/**
 * ʹ�ü��� �������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��2������10:04:04
 */
public class FileWRDemo6 {
	public static void main(String[] args) throws IOException {
//		mythod1();
		mythod2();
	}
	public static void mythod1() throws IOException
	{
		System.out.println("?");
		InputStream is = System.in;
		int len = 0;
		while((len=is.read())!=-1)
		{
			System.out.println(len);
		}
	}
	public static void mythod2() throws IOException 
	{
		System.out.println("?");
		InputStream is = System.in;
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			int len = is.read();
			if(len=='\r')
				continue;
			if(len=='\n')
			{
				String a =sb.toString();
				if("over".equals(a))
					break;
				else
				{
					System.out.println(a.toUpperCase());
					sb.delete(0,sb.length());
				}
			}
			else
				sb.append((char)len);
		}
		
		
	}
}
