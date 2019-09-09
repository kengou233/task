package stringDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ʹ��������ʽ�涨�ַ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��8������4:23:15
 */
public class RegexDemo1 {
	/*
	 * ƥ���ַ���
	 */
	public static void Mythod1() {
		/*
		 * ��֤�ֻ���
		 */
		String str1 = "13856567878";
		String regex1 ="1[358]\\d{9}";
		boolean flag = str1.matches(regex1);
		System.out.println("��������ĺ��룺"+flag);
		/*
		 * ��֤QQ�� ����һ
		 */
		String str2 = "197435A779";
		String regex2 = "[1-9]\\d{4,12}";
		boolean flag1 = str2.matches(regex2);
		if(flag1)
			System.out.println("��½�ɹ�");
		else
			System.out.println("���������QQ�Ų��Ϸ�");
		/*
		 * ��֤QQ�� ������
		 */
		int len=str2.length();
		if(len<14&&len>2)
		{
			
			/*
			 * �жϺ����Ƿ�Ϊ������ ����һ
			 */
//			try {
//				long l = Long.parseLong(str2);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("��������ĺ�������Ƿ��ַ�����������");
//			}
			/*
			 * �жϺ����Ƿ�Ϊ������ ������
			 */
			char a[] = str2.toCharArray();
			if(a[0]>'0'&&a[0]<='9')
			{
				boolean flag3 =true;
				for(int j=1;j<a.length;j++)
				{
					if(!(a[j]>='0'&&a[j]<='9'))
					{
						flag3=false;
						break;
					}
				}
				if(flag3)
					System.out.println("��½�ɹ�");
				else
					System.out.println("���ַǷ��ַ�");
			}
			else
				System.out.println("��λ���ֲ���Ϊ0");
		}
		else
		{
			System.out.println("���������QQ���볤�Ȳ���");
		}
	}
	/*
	 * �и��ַ���
	 */
	public static void Mythod2() {
		String str1 = "zhangsan.lisi.wangwu";
		String str2 = "c:\\abc\\a.txt";
		String str3 = "erkktyqqquizzzzzo";
		
		String a[];
		String b[];
		String c[];
		
		String regex1 = "\\.";
		String regex2 = "\\\\";
		String regex3 = "(.)\\1+";
		
		a = str1.split(regex1);
		b = str2.split(regex2);
		c = str3.split(regex3);
		
		System.out.println("----------------------");
		Mythod5(a);
		System.out.println("----------------------");
		Mythod5(b);
		System.out.println("----------------------");
		Mythod5(c);
		System.out.println("----------------------");
	}
	/*
	 * �滻�ַ���
	 */
	public static void Mythod3() {
		String str1 = "wer1389980000ty1234564uiod234345675f";//���ַ����е������滻��#
		String str2 = "erkktyqqquizzzzzo";//�������滻��$.  //���ص����ַ��滻�ɵ�����ĸ��zzzz->z
		System.out.println("----------------------");
		String regex1 = "(\\d)+"; 
		str1 = str1.replaceAll(regex1,"#");
		System.out.println(str1);
		System.out.println("----------------------");
		String regex2 = "([a-zA-Z])\\1+";
		str2 = str2.replaceAll(regex2,"$1");
		System.out.println(str2);
		System.out.println("----------------------");
	
	}
	/*
	 * ��ȡ�ַ���
	 */
	public static void Mythod4() {
		String str = "ming tian jiu yao fang jia le ,da jia��";
		String regex = "\\b[a-zA-z]{3}\\b";
		/*
		 * 1.�������װ��pattern����
		 * 2.��pattern������ַ�������
		 */
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}
	public static void Mythod5(String a[]) {
		for(String b:a)
		{
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		Mythod1();
		Mythod2();
		Mythod3();
		Mythod4();
	}
}
