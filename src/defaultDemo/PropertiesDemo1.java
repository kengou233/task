package defaultDemo;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
/**
 * 使用属性类 值得注意的是 properties 是 Hashtable的子类 即properties也归属于 map集合
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月3日下午4:45:46
 */
public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
//		mythod1();
		mythod2();
	}
	/*
	 * 简单使用
	 * properties 是map集合的子类 所以功能相似
	 */
	public static void mythod1()
	{
		Properties pp = new Properties();
		pp.setProperty("001","哇哦");
		pp.setProperty("002","卧槽");
		pp.setProperty("003","牛批");
		Set<Entry<Object, Object>>set = pp.entrySet();
		
		for(Map.Entry a:set)
		{
			System.out.println(a.getKey()+" "+a.getValue());
	
		}
	}
	/*
	 * 将文件里的内容 分割并保存在properties中
	 */
	public static void mythod2 ()throws IOException
	{
		
		/*
		 * 方法一
		Properties pp = new Properties();
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader("D:\\迅雷下载\\temp.txt"));
			String len = null;
			while((len=br.readLine())!=null)
			{
				String [] a = len.split("=");
				pp.setProperty(a[0],a[1]);
			}
			System.out.println(pp);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			throw e;
		}
		finally {
			if(br!=null)
				br.close();
		}
		*/
	
		Properties pp = new Properties();
		FileInputStream fis = new FileInputStream("D:\\\\迅雷下载\\\\temp.txt");
		pp.load(fis);
		FileOutputStream fos = new  FileOutputStream("D:\\\\\\\\迅雷下载\\\\\\\\temp.txt");
//		System.out.println(pp);
		pp.store(fos,"哈哈");
		pp.list(System.out);//打印集合
		
		fis.close();
		fos.close();
	}
}
