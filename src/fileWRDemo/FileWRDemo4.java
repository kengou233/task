package fileWRDemo;

import java.io.*;

/**
 * 操作字节流 缓冲区
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午10:10:57
 */
public class FileWRDemo4 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bit =  new BufferedInputStream(new FileInputStream("C:\\Users\\kengou\\Desktop\\001.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\迅雷下载\\001.jpg"));
		
		int len=0;
		byte b[] = new byte[1024];
		
		while((len=bit.read(b))!=-1)
		{
			bos.write(b,0,len);
		}
		
		bit.close();
		bos.close();
	}
	
}
