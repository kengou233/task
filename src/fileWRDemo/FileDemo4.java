package fileWRDemo;

import java.io.*;
import java.util.ArrayList;

/**
 * 将一个目录的所有文件名 存在一个文本文件中
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月3日下午1:11:15
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("D:\\迅雷下载\\电影");
		ArrayList<File> aList= new ArrayList<File>();
		mythod1(file,aList);
		try {
			mythod2(aList);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void mythod1(File file,ArrayList<File> aList)
	{
		File [] aFiles = file.listFiles();
		
		for(File bFile:aFiles)
		{
			if(bFile.isDirectory())
				mythod1(bFile,aList);
			else
			{
				if(bFile.getName().endsWith(".mp4"))
					aList.add(bFile);
			}	
			System.out.println(bFile);
		}
	}
	public static void mythod2(ArrayList<File>aList) throws IOException
	{
		BufferedWriter bw =null;
		try {
			bw= new BufferedWriter(new FileWriter("D:\\迅雷下载\\清单.txt"));
			for(File f:aList)
			{
				String path = f.getAbsolutePath();
				bw.write(path);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw e;
		}
		finally {
			if(bw!=null)
				bw.close();
		}
	}
}
