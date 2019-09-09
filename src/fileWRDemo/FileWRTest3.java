package fileWRDemo;

import java.io.*;

/**
 * 通过缓冲区复制.java文件
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午12:48:02
 */
public class FileWRTest3 {
	public static void main(String[] args) {
		BufferedWriter bWriter = null;
		BufferedReader bReader = null;
		
		try 
		{
			bWriter = new BufferedWriter(new FileWriter("temp.txt")) ;
			bReader = new BufferedReader(new FileReader("D:\\Eclipse\\task\\src\\fileWRDemo\\FileWRDemo1.java"));
			String content = null;
			while((content=bReader.readLine())!=null)
			{
				bWriter.write(content);
				bWriter.newLine();
				bWriter.flush();
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			throw new RuntimeException("读写错误");
		}
		finally 
		{
			if(bWriter!=null)
				try {
					bWriter.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			if(bReader!=null)
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		}
	}
}
