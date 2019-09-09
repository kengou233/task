package defaultDemo;

import java.io.*;
import java.util.Properties;

/**
 * 创建配置文件 记录应用使用次数 如果超出范围则停止使用
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月3日下午9:37:48
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
					System.out.println("您好 您的使用次数已到 谢谢您的支持");
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
