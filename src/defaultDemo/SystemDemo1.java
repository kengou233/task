package defaultDemo;

import java.io.IOException;
import java.util.Properties;

/**
 * ʹ��ϵͳ�෽��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��30������4:53:53
 */
public class SystemDemo1 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("����","����"); ����ϵͳ��������
		
		/*
		 * ��ӡϵͳ������Ϣ
		Properties ps = System.getProperties();
		for(Object obj:ps.keySet())
		{
			String a=(String)ps.get(obj);
			System.out.println(a);
		}
		*/
		
		/*��ȡ��ǰϵͳ��Ϣ
		String value=System.getProperty("os.name");
		System.out.println(value);
		*/
		
		
//		Runtime r = Runtime.getRuntime();//����
//		Process p=r.exec("notepad.exe");//��ֹ
//		Thread.sleep(4000);
//		p.destroy();
	}
}
