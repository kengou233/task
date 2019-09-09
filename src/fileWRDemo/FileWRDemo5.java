package fileWRDemo;

import java.io.*;

/**
 * 自定义 BufferedInputStream 类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午10:27:15
 */
public class FileWRDemo5 {
	public static void main(String[] args) {
		try 
		{
			mythod();
		} catch (IOException e) 
		{
			// TODO 自动生成的 catch 块
			throw new RuntimeException("读写错误");
		}
	}
	public static void mythod() throws IOException
	{
		FileInputStream fis = new FileInputStream("temp.txt");
	
		MyBufferedInputStream mbd = new MyBufferedInputStream(fis);
		
		int len=0;
		while((len=mbd.read())!=-1)
		{
			System.out.print((char)len);
		}
		mbd.close();

	}
}
class MyBufferedInputStream extends InputStream{
	private InputStream is;
	
	private byte [] b = new byte[1024];
	
	private int pointer,count=0;

	public MyBufferedInputStream() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public MyBufferedInputStream(InputStream is) {
		super();
		this.is = is;
	}

	@Override
	public int read() throws IOException {
		// TODO 自动生成的方法存根
		if(count==0)
		{
			count=is.read(b);
			pointer=0;
			if(count==-1)
				return -1;
			byte a = b[pointer];
			
			count--;
			pointer++;
			return a&255;
		}
		else if(count>0)
		{
			byte a = b[pointer];
			
			count--;
			pointer++;
			return a&0xff;
		}
		return -1;
	}
	
	
}