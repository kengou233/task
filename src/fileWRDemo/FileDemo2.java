package fileWRDemo;

import java.io.*;

/**
 * 使用文件类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月2日下午10:15:16
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\迅雷下载\\电影");
		/*
		 * list打印时包括隐藏文件夹 并且传入的对象必须为目录 如果不是则返回空指针异常
		 */
//		mythod1(file);
//		mythod2(file);
		mythod3(file);	
	}
	/*
	 * 打印对象和文件 
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
	 * 打印文件 
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
	 * 打印过滤后文件
	 */
	public static void mythod3(File file)
	{
		String [] aString =file.list(
			new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO 自动生成的方法存根
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
