package fileWRDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * ʹ��������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��3������11:04:43
 */
public class SequenceDemo {
	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v  = new Vector<FileInputStream>();
		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));
		Enumeration<FileInputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("4.txt");
		int len = 0;
		byte []b= new byte[1024];
		while((len=sis.read(b))!=-1)
		{
			fos.write(b,0,len);
			fos.flush();
		}
		fos.close();
		sis.close();
	}
}
