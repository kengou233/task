package fileWRDemo;

import java.io.*;

/**
 * 字节流转换为字符流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月2日上午10:40:36
 */
public class FileWRDemo7 {
	public static void main(String[] args) throws IOException {
		System.out.println("?");
		
//		System.setIn(new FileInputStream("temp.txt"));
//		System.setOut(new PrintStream("temp.txt"));
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		/*
		 * 简化书写
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		*/
		String len = null;
		
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		while((len=br.readLine())!=null)
		{
			if("over".equals(len))
				break;
			else
			{
				bw.write(len.toUpperCase());
				bw.newLine();
				bw.flush();
			}
		}
		
		br.close();
		bw.close();
	}
}
