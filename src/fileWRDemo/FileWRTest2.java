package fileWRDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制文件
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月31日下午11:05:30
 */
public class FileWRTest2 {
	public static void main(String[] args) throws IOException  {
//		mythod1();
		mythod2();
	}
	public static void mythod1() throws IOException{
		FileWriter fw = new FileWriter("D:\\temp.txt");
		
		FileReader fr = new FileReader("temp.txt");
		
		int len=0;
		while((len=fr.read())!=-1)
		{
			fw.write(len);
		}
		
		fw.close();
		fr.close();
	}
	public static void mythod2() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("D:\\temp.txt");
			fr = new FileReader("temp.txt");
			
			int len=0;
			char a[]=new char[1024];
			while((len=fr.read(a))!=-1)
			{
				fw.write(a,0,len);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			throw new RuntimeException("读写失败");
		}
		finally {
			if(fw!=null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
	
			if(fr!=null)
			{
				try {
				fr.close();
				} catch (IOException e) {
				// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
