package fileWRDemo;

import java.io.*;

/**
 * �����ֽ��� ������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��1������10:10:57
 */
public class FileWRDemo4 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bit =  new BufferedInputStream(new FileInputStream("C:\\Users\\kengou\\Desktop\\001.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Ѹ������\\001.jpg"));
		
		int len=0;
		byte b[] = new byte[1024];
		
		while((len=bit.read(b))!=-1)
		{
			bos.write(b,0,len);
		}
		
		bit.close();
		bos.close();
	}
	
}
