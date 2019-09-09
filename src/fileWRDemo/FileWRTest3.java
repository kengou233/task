package fileWRDemo;

import java.io.*;

/**
 * ͨ������������.java�ļ�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��1������12:48:02
 */
public class FileWRTest3 {
	public static void main(String[] args) {
		BufferedWriter bWriter = null;
		BufferedReader bReader = null;
		
		try 
		{
			bWriter = new BufferedWriter(new FileWriter("temp.txt")) ;
			bReader = new BufferedReader(new FileReader("D:\\Eclipse\\task\\src\\fileWRDemo\\FileWRDemo1.java"));
			String content = null;
			while((content=bReader.readLine())!=null)
			{
				bWriter.write(content);
				bWriter.newLine();
				bWriter.flush();
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			throw new RuntimeException("��д����");
		}
		finally 
		{
			if(bWriter!=null)
				try {
					bWriter.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			if(bReader!=null)
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		}
	}
}
