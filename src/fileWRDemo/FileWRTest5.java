package fileWRDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * ��һ��ͼƬ �и� �ϳ�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��3������11:24:02
 */
public class FileWRTest5 {
	public static void main(String[] args) throws IOException {
//		mythod1();
		mythod2();
	}
	public static void  mythod1() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Ѹ������\\001.jpg");
		FileOutputStream fos = null;
		
		int len=0;
		int count=1;
		byte [] a= new byte[1030];
		while((len=fis.read(a))!=-1)
		{
			fos=new FileOutputStream("D:\\Ѹ������\\"+(count++)+".part");
			fos.write(a,0,len);
			fos.close();
		}
		fis.close();
	}
	public static void mythod2() throws IOException {
		ArrayList<FileInputStream> aList = new ArrayList();
		for(int i=1;i<=14;i++)
		{
			aList.add(new FileInputStream("D:\\Ѹ������\\"+i+".part"));
		}
		Iterator it = aList.iterator();
		Enumeration en = new Enumeration() {

			@Override
			public boolean hasMoreElements() {
				// TODO �Զ����ɵķ������
				return it.hasNext();
			}

			@Override
			public Object nextElement() {
				// TODO �Զ����ɵķ������
				return it.next();
			}
		};
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("D:\\Ѹ������\\000.jpg");
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
