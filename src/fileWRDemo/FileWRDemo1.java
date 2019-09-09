package fileWRDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 使用字符缓冲
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午12:22:53
 */
public class FileWRDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("temp.txt");
		FileReader fr = new FileReader("temp.txt");
		writer(fw);
		reader(fr);
	}
	public static void writer(Writer fw) throws IOException
	{
		BufferedWriter bWriter= new BufferedWriter(fw);
		for(int i=0;i<5;i++)
		{
			bWriter.write("abcd"+i);
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}
	public static void reader(Reader fw) throws IOException 
	{
		BufferedReader bReader = new BufferedReader(fw);
		String aString =null;
		while((aString=bReader.readLine())!=null)
		{
			System.out.println(aString);
		}
	}
}
