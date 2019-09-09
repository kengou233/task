package stringDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��ҳ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��8������9:43:02
 */
public class RegexDemo3 {
	/*
	 * ��ȡ�����ĵ���������
	 */
	public static void Mythod1() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Ѹ������\\����JAVA�̳�\\�ϼ�\\Դ��\\day25\\mail.txt"));
			/*
			 * ��ȡ�ַ���
			 */
			String regex ="\\w+@\\w+\\.\\w+";
			Pattern p = Pattern.compile(regex);
			/*
			 * ��ӡ�ַ���
			 */
			String line = null;
			while((line=br.readLine())!=null)
			{
				Matcher m = p.matcher(line);
				while(m.find())
				{
					System.out.println(m.group());
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	/*
	 * ��ȡ������������� ��Ҫ��������֧��
	 */
	public static void Mythod2() {
		try {
			/*
			 * ��ȡ���������ַ����ȡ��������Ϣ
			 */
			URL url = new URL("http://localhost:8080/Myweb/mail.html");
			URLConnection uc = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			/*
			 * �������� ��ȡ��Ҫ�ַ���
			 */
			String regex = "\\w+@\\w+\\.\\w+";
			Pattern p = Pattern.compile(regex);
			/*
			 * ʹ���ַ�����ӡ����
			 */
			String line = null;
			while((line=br.readLine())!=null)
			{
				Matcher m = p.matcher(line);
				while(m.find())
				{
					System.out.println(m.group());
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Mythod1();
//		Mythod2();
	}
}
