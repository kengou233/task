package fileWRDemo;

import java.io.File;

/**
 * ʹ�� �ļ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��2������10:45:25
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("D:\\Ѹ������\\��Ӱ");
		mythod1(file,0);	
	}
	/*
	 * ��ӡ�ļ����е��ļ����ļ�
	 */
	public static void mythod1(File file,int count) {
		File [] aFiles = file.listFiles();
		count++;
		for(int i=0;i<aFiles.length;i++)
		{
			if(aFiles[i].isDirectory())
				mythod1(aFiles[i],count);
			else
			System.out.println(mythod2(count)+""+aFiles[i]);
		}
	}
	/*
	 * �ֲ�
	 */
	public static String mythod2(int count)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++)
		{
			sb.append(" ");
		}
		return sb.toString();
	}
}
