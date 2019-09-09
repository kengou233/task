package fileWRDemo;

import java.io.FileReader;
import java.io.IOException;

/**
 * 将.java文件打印到控制台
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月31日下午10:57:39
 */
public class FileWRTest1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\Eclipse\\task\\src\\testDemo\\Iftest.java");
		
		int len=0;
		char a[]=new char[1024];
		while((len=fr.read(a))!=-1)
		{
			System.out.println(new String(a,0,len));
		}
		fr.close();
	}
}
