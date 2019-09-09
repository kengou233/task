package fileWRDemo;

import java.io.*;

/**
 * 使用文件类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月2日下午8:46:57
 */
public class FileDemo1 {
	public static void main(String[] args)throws IOException {
		File file = new File("temp.txt");
		mythod1(file,0);
//		mythod2(file);
		mythod3(file);
		
	}
	/*
	 * 创建删除文件或目录
	 */
	public static void mythod1(File file,int index) throws IOException
	{
		if(file.exists())//判断文件或目录是否存在
		{
			System.out.println("文件或目录已存在 请继续您的操作");
			
			file.delete();//删除文件或路径 如果删除失败 返回false
//			file.deleteOnExit();//请求虚拟机退出时 删除该文件或目录
			
			System.out.println("文件或目录已删除 感谢您的使用");
		}
		else if(index==0)
		{
			file.createNewFile();//创建一个文件 如果文件存在返回false
			System.out.println("文件不存在 已为您默认创建 ");
		}
		else if(index==1)
		{
			file.mkdir();//创建一个文件夹 如果文件夹存在返回false
			System.out.println("文件夹不存在 已为您默认创建 ");
		}
	}
	/*
	 * 判断文件或目录的信息
	 */
	public static void mythod2(File file)
	{
		System.out.println("文件是否可执行 "+file.canExecute());//判断文件是否可执行 若不存在返回false
		
		System.out.println("该对象是否为文件 "+file.isFile());
		
		System.out.println("该对象是否为文件夹 "+file.isDirectory());
		
//		file.isAbsolute(); 判断文件路径是否为绝对路径
//		file.isHidden() 判断文件是否为隐藏文件
		
		file.deleteOnExit();	
	}
	/*
	 * 获取文件或目录的信息
	 */
	public static void mythod3(File file) throws IOException
	{
		System.out.println(file.getName());//获取文件名
		System.out.println(file.getPath());//获取文件相对路径
		System.out.println(file.getAbsolutePath());//获取文件绝对路径
		System.out.println(file.getParent());//返回绝对路径的父路径 或者返回文件的上一层 若只有文件 则返回null
		System.out.println(file.lastModified());//返回文件最后一次修改的时间
		File fila = new File("text.txt");
		file.renameTo(fila);//修改文件名并覆盖  若在不同路径下 则直接剪切
		
		fila.deleteOnExit();
	}
}
