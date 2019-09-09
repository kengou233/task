package fileWRDemo;

import java.io.*;

/**
 * ʹ���ļ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��2������10:15:16
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\Ѹ������\\��Ӱ");
		/*
		 * list��ӡʱ���������ļ��� ���Ҵ���Ķ������ΪĿ¼ ��������򷵻ؿ�ָ���쳣
		 */
//		mythod1(file);
//		mythod2(file);
		mythod3(file);	
	}
	/*
	 * ��ӡ������ļ� 
	 */
	public static void mythod1(File file) 
	{
		File [] aFiles = file.listFiles();
		for(File bFile:aFiles)
		{
			System.out.println(bFile);
		}
	}
	/*
	 * ��ӡ�ļ� 
	 */
	public static void mythod2(File file)
	{
		String [] aString =file.list();
		for(String bString:aString)
		{
			System.out.println(bString);
		}
	}
	/*
	 * ��ӡ���˺��ļ�
	 */
	public static void mythod3(File file)
	{
		String [] aString =file.list(
			new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO �Զ����ɵķ������
//					System.out.println("|--"+dir+" "+"|--"+name);
					return name.endsWith(".mp4");
				}
			}
		);
		for(String bString:aString)
		{
			System.out.println(bString);
		}
	}
}
