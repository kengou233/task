package fileWRDemo;

import java.io.File;

/**
 * 使用 文件类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月2日下午10:45:25
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("D:\\迅雷下载\\电影");
		mythod1(file,0);	
	}
	/*
	 * 打印文件夹中的文件夹文件
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
	 * 分层
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
