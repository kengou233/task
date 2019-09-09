package fileWRDemo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 使用打印流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月3日下午10:53:13
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		PrintWriter pw = new PrintWriter(System.out);
		
		PrintWriter pw = new PrintWriter(new FileWriter("temp.txt"),true);
		
		String line = null;
		
		while((line=br.readLine())!=null)
		{
			if("over".equals(line))
				break;
			pw.println(line.toUpperCase());
			pw.flush();
		}
		br.close();
		pw.close();
		
	}
}
