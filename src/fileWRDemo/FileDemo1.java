package fileWRDemo;

import java.io.*;

/**
 * ʹ���ļ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��2������8:46:57
 */
public class FileDemo1 {
	public static void main(String[] args)throws IOException {
		File file = new File("temp.txt");
		mythod1(file,0);
//		mythod2(file);
		mythod3(file);
		
	}
	/*
	 * ����ɾ���ļ���Ŀ¼
	 */
	public static void mythod1(File file,int index) throws IOException
	{
		if(file.exists())//�ж��ļ���Ŀ¼�Ƿ����
		{
			System.out.println("�ļ���Ŀ¼�Ѵ��� ��������Ĳ���");
			
			file.delete();//ɾ���ļ���·�� ���ɾ��ʧ�� ����false
//			file.deleteOnExit();//����������˳�ʱ ɾ�����ļ���Ŀ¼
			
			System.out.println("�ļ���Ŀ¼��ɾ�� ��л����ʹ��");
		}
		else if(index==0)
		{
			file.createNewFile();//����һ���ļ� ����ļ����ڷ���false
			System.out.println("�ļ������� ��Ϊ��Ĭ�ϴ��� ");
		}
		else if(index==1)
		{
			file.mkdir();//����һ���ļ��� ����ļ��д��ڷ���false
			System.out.println("�ļ��в����� ��Ϊ��Ĭ�ϴ��� ");
		}
	}
	/*
	 * �ж��ļ���Ŀ¼����Ϣ
	 */
	public static void mythod2(File file)
	{
		System.out.println("�ļ��Ƿ��ִ�� "+file.canExecute());//�ж��ļ��Ƿ��ִ�� �������ڷ���false
		
		System.out.println("�ö����Ƿ�Ϊ�ļ� "+file.isFile());
		
		System.out.println("�ö����Ƿ�Ϊ�ļ��� "+file.isDirectory());
		
//		file.isAbsolute(); �ж��ļ�·���Ƿ�Ϊ����·��
//		file.isHidden() �ж��ļ��Ƿ�Ϊ�����ļ�
		
		file.deleteOnExit();	
	}
	/*
	 * ��ȡ�ļ���Ŀ¼����Ϣ
	 */
	public static void mythod3(File file) throws IOException
	{
		System.out.println(file.getName());//��ȡ�ļ���
		System.out.println(file.getPath());//��ȡ�ļ����·��
		System.out.println(file.getAbsolutePath());//��ȡ�ļ�����·��
		System.out.println(file.getParent());//���ؾ���·���ĸ�·�� ���߷����ļ�����һ�� ��ֻ���ļ� �򷵻�null
		System.out.println(file.lastModified());//�����ļ����һ���޸ĵ�ʱ��
		File fila = new File("text.txt");
		file.renameTo(fila);//�޸��ļ���������  ���ڲ�ͬ·���� ��ֱ�Ӽ���
		
		fila.deleteOnExit();
	}
}
