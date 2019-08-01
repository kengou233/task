package defaultDemo;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用系统类方法
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月30日下午4:53:53
 */
public class SystemDemo1 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("爱你","啊哈"); 设置系统启动参数
		
		/*
		 * 打印系统参数信息
		Properties ps = System.getProperties();
		for(Object obj:ps.keySet())
		{
			String a=(String)ps.get(obj);
			System.out.println(a);
		}
		*/
		
		/*获取当前系统信息
		String value=System.getProperty("os.name");
		System.out.println(value);
		*/
		
		
//		Runtime r = Runtime.getRuntime();//运行
//		Process p=r.exec("notepad.exe");//终止
//		Thread.sleep(4000);
//		p.destroy();
	}
}
