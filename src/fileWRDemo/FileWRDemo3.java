package fileWRDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �����ֽ�������һ��ͼƬ
 * ����
 * 1.��ȡһ��ͼƬ�ļ�
 * 2.����ͼƬ�ļ�����һ��·��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��1������9:53:24
 */
public class FileWRDemo3 {
	public static void main(String[] args) {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try 
			{
				fis = new FileInputStream("C:\\Users\\kengou\\Desktop\\001.jpg");
				fos = new FileOutputStream("D:\\Ѹ������\\001.jpg");
				
				int len=0;
				byte [] b = new byte[1024];
				while((len=fis.read(b))!=-1)
				{
					fos.write(b,0,len);
				}
			} 
			catch (FileNotFoundException e) 
			{
				// TODO �Զ����ɵ� catch ��
				throw new RuntimeException("�ļ�����ʧ�� ������·������");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			finally 
			{
				if(fis!=null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				if(fos!=null)
					try {
						fos.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
			}	
	}
}
