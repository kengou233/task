package defaultDemo;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
/**
 * ʹ�������� ֵ��ע����� properties �� Hashtable������ ��propertiesҲ������ map����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��3������4:45:46
 */
public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
//		mythod1();
		mythod2();
	}
	/*
	 * ��ʹ��
	 * properties ��map���ϵ����� ���Թ�������
	 */
	public static void mythod1()
	{
		Properties pp = new Properties();
		pp.setProperty("001","��Ŷ");
		pp.setProperty("002","�Բ�");
		pp.setProperty("003","ţ��");
		Set<Entry<Object, Object>>set = pp.entrySet();
		
		for(Map.Entry a:set)
		{
			System.out.println(a.getKey()+" "+a.getValue());
	
		}
	}
	/*
	 * ���ļ�������� �ָ������properties��
	 */
	public static void mythod2 ()throws IOException
	{
		
		/*
		 * ����һ
		Properties pp = new Properties();
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader("D:\\Ѹ������\\temp.txt"));
			String len = null;
			while((len=br.readLine())!=null)
			{
				String [] a = len.split("=");
				pp.setProperty(a[0],a[1]);
			}
			System.out.println(pp);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			throw e;
		}
		finally {
			if(br!=null)
				br.close();
		}
		*/
	
		Properties pp = new Properties();
		FileInputStream fis = new FileInputStream("D:\\\\Ѹ������\\\\temp.txt");
		pp.load(fis);
		FileOutputStream fos = new  FileOutputStream("D:\\\\\\\\Ѹ������\\\\\\\\temp.txt");
//		System.out.println(pp);
		pp.store(fos,"����");
		pp.list(System.out);//��ӡ����
		
		fis.close();
		fos.close();
	}
}
