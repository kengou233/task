package defaultDemo;

import java.io.*;
import java.util.Properties;

/**
 * ���������ļ� ��¼Ӧ��ʹ�ô��� ���������Χ��ֹͣʹ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��3������9:37:48
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		Properties pp = new Properties();
		File file = new File("count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		
		pp.load(fis);
		System.out.println(pp);
		

		int count=0;
	
		String value = pp.getProperty("time");
		System.out.println(value);
		
		if(value!=null)
		{
			count=Integer.parseInt(value);
				if(count>=5)
				{
					System.out.println("���� ����ʹ�ô����ѵ� лл����֧��");
					return;
				}
		}
		count++;
		pp.setProperty("time",String.valueOf(count));
		
		FileOutputStream fos = new FileOutputStream(file);
		pp.store(fos,"");
		
		fis.close();
		fos.close();
	}
}
