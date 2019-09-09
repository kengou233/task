package fileWRDemo;

import java.io.*;

/**
 * 重写Buffer Reader 和 LineNumber Reader类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午2:53:29
 */
public class FileWRTest4 {
	public static void main(String[] args) throws IOException {
		/*
		FileReader fr=null;
		try {
			fr = new FileReader("temp.txt");
			MyBufferedreader mb = new MyBufferedreader(fr);
			String line = null;
			while((line=mb.readline())!=null)
			{
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally {
			fr.close();
		}
		*/
		
		FileReader fr = new FileReader("temp.txt");
		MylineNumberReader mr = new MylineNumberReader(fr);
		String line = null;
		while((line=mr.readline())!=null)
		{
			System.out.println(mr.getLinenum()+" "+line);
		}
		mr.close();
	}
}
class MyBufferedreader extends Reader
{
	private Reader r;

	public MyBufferedreader(Reader r) {
		super();
		this.r = r;
	}
	
	public  String readline() throws IOException
	{
		StringBuilder sbBuilder = new StringBuilder();
		int len=0;
		while((len=r.read())!=-1)
		{
			if(len=='\r')
				continue;
			if(len=='\n')
				return sbBuilder.toString();
			else
				sbBuilder.append((char)len);
		}
		if(sbBuilder.length()!=0)
			return sbBuilder.toString();
		return null;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO 自动生成的方法存根
		return r.read(cbuf,off,len);
	}

	@Override
	public void close() throws IOException {
		// TODO 自动生成的方法存根
		r.close();
	}
}
class MylineNumberReader extends MyBufferedreader
{
	private int linenum;
	public MylineNumberReader(Reader r) {
		super(r);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String readline() throws IOException {
		// TODO 自动生成的方法存根
		linenum++;
		return super.readline();
	}
	public int getLinenum() {
		return linenum;
	}
	public void setLinenum(int linenum) {
		this.linenum = linenum;
	}
	
	
}