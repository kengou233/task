package fileWRDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节流复制一个图片
 * 步骤
 * 1.读取一个图片文件
 * 2.复制图片文件到另一个路径
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月1日下午9:53:24
 */
public class FileWRDemo3 {
	public static void main(String[] args) {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try 
			{
				fis = new FileInputStream("C:\\Users\\kengou\\Desktop\\001.jpg");
				fos = new FileOutputStream("D:\\迅雷下载\\001.jpg");
				
				int len=0;
				byte [] b = new byte[1024];
				while((len=fis.read(b))!=-1)
				{
					fos.write(b,0,len);
				}
			} 
			catch (FileNotFoundException e) 
			{
				// TODO 自动生成的 catch 块
				throw new RuntimeException("文件复制失败 可能是路径问题");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			finally 
			{
				if(fis!=null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				if(fos!=null)
					try {
						fos.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
			}	
	}
}
