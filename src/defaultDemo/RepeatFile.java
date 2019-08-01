package defaultDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 简单使用i/o
 * 
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月16日下午2:03:55
 */
public class RepeatFile {
	public static void main(String[] args) {
//		creatORdelete();//创建和删除
//		fileTest();//查看该文件的属性
//		StreamTest();
		WR();
	}

	public static void creatORdelete() {
		File file = new File("temp.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("文件已删除");
		} else {
			try {
				file.createNewFile();
				System.out.println("文件已创建");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public static void fileTest() {
		File file =new File("temp.txt");
		if(file.exists()) {
			String name=file.getName();
			long length=file.length();
			boolean hidden=file.isHidden();
			System.out.println("文件名称："+name);
			System.out.println("文件长度："+length);
			System.out.println("是否为隐藏文件："+hidden);
			System.out.println("文件路径："+file.getAbsolutePath());
		}
		else {
			System.out.println("该文件不存在");
		}
	}
	public static void StreamTest(){
		File file =new File("temp.txt");
		try {
			FileOutputStream out =new FileOutputStream(file);
			byte buy[]="我有一只小毛驴，我从来也不骑。".getBytes();
			try {
				out.write(buy);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			FileInputStream in =new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("文件内容："+new String(byt,0,len));
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public static void WR() {
			//写入
			FileWriter fw = null;
			try {
				fw = new FileWriter("temp.txt");
				fw.write("你好呀 嘿嘿");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
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

			}
			//读取
			FileReader fr= null;
			try {
				fr = new FileReader("temp.txt");
				try {
					/*
					 * 读取方式一
					int len =0;
					while((len=fr.read())!=-1)
					{
						System.out.print((char)len);
					}
					*/
					//读取方式二
					int len=0;
					char a [] =new char[1024];
					while((len=fr.read(a))!=-1)
					{
						System.out.println(len+" "+new String(a,0,len));
					}
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			finally {
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
