package fileWRDemo;

import java.io.FileReader;
import java.io.IOException;

/**
 * ��.java�ļ���ӡ������̨
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��31������10:57:39
 */
public class FileWRTest1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\Eclipse\\task\\src\\testDemo\\Iftest.java");
		
		int len=0;
		char a[]=new char[1024];
		while((len=fr.read(a))!=-1)
		{
			System.out.println(new String(a,0,len));
		}
		fr.close();
	}
}
