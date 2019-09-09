package fileWRDemo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 改变系统输出流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月2日上午11:41:12
 */
public class FileWRDemo8 {
	public static void main(String[] args) {
//		System.setIn(new FileInputStream());
//		System.setOut(new PrintStream("temp.txt"));
		Properties p = System.getProperties();
		p.list(new PrintStream(System.out));
		try 
		{
			int a[]=new int[2];
			System.out.println(a[3]);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			try {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
				String a = sdf.format(date);
				PrintStream ps = new PrintStream("temp.txt");
				ps.println(a);
				System.setOut(ps);
			} catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				throw new RuntimeException("日志文件创建失败");
			}
			e.printStackTrace(System.out);
		}
	}
}
