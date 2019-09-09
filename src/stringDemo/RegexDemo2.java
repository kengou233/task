package stringDemo;

import java.util.TreeSet;

/**
 * 1.�Ե����������У��
 * 2.���ظ����ʽ����滻
 * 3.��ip��ַ ��ȷ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��8������7:03:31
 */
public class RegexDemo2 {
	/*
	 * �ַ���ƥ��
	 */
	public static void Mythod1() {
		String mail = "abc12@sina.com";
		String regex = "\\w+@\\w+(\\.[a-z]+)+";//�Ͼ�׼
//		String regex1 = ".+@.+\\..+";//��ͨ
//		mail.indexOf("@")!=-1;//�ֲ�
		boolean flag = mail.matches(regex);
		System.out.println("�������������Ϊ��"+flag);
	}
	/*
	 * �ַ����и�+�滻
	 */
	public static void Mythod2() {
		String str = "����...����...��Ҫ..ҪҪ...ҪҪ...ѧѧѧ....ѧѧ...����...���..��.�̳�...��...��";
		str = str.replaceAll("\\.+","");
		str = str.replaceAll("(.)\\1+","$1");
		System.out.println(str);
	}
	/*
	 * �ַ����滻+�滻+�и�+����+�滻
	 */
	public static void Mythod3() {
		String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";
		ip = ip.replaceAll("(\\d+)","00$1");//�滻
		ip = ip.replaceAll("0*(\\d{3})","$1");//�滻
		System.out.println(ip);
		String a[] = ip.split(" ");//�и�
		TreeSet<String> t = new TreeSet<String>();//����
		for(String b:a)
		{
			t.add(b);
		}
		for(String b:t)
		{
			System.out.println(b.replaceAll("0*(\\d+)","$1"));//�滻
		}
	}
	public static void main(String[] args) {
		Mythod1();
		Mythod2();
		Mythod3();
	}
}
