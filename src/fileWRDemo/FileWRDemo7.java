package fileWRDemo;

import java.io.*;

/**
 * �ֽ���ת��Ϊ�ַ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��2������10:40:36
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
		 * ����д
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
