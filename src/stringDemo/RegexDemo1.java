package stringDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 使用正则表达式规定字符串
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月8日下午4:23:15
 */
public class RegexDemo1 {
	/*
	 * 匹配字符串
	 */
	public static void Mythod1() {
		/*
		 * 验证手机号
		 */
		String str1 = "13856567878";
		String regex1 ="1[358]\\d{9}";
		boolean flag = str1.matches(regex1);
		System.out.println("您所输入的号码："+flag);
		/*
		 * 验证QQ号 方法一
		 */
		String str2 = "197435A779";
		String regex2 = "[1-9]\\d{4,12}";
		boolean flag1 = str2.matches(regex2);
		if(flag1)
			System.out.println("登陆成功");
		else
			System.out.println("您所输入的QQ号不合法");
		/*
		 * 验证QQ号 方法二
		 */
		int len=str2.length();
		if(len<14&&len>2)
		{
			
			/*
			 * 判断号码是否为纯数字 方法一
			 */
//			try {
//				long l = Long.parseLong(str2);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("您所输入的号码包含非法字符请重新输入");
//			}
			/*
			 * 判断号码是否为纯数字 方法二
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
					System.out.println("登陆成功");
				else
					System.out.println("出现非法字符");
			}
			else
				System.out.println("首位数字不能为0");
		}
		else
		{
			System.out.println("您所输入的QQ号码长度不符");
		}
	}
	/*
	 * 切割字符串
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
	 * 替换字符串
	 */
	public static void Mythod3() {
		String str1 = "wer1389980000ty1234564uiod234345675f";//将字符串中的数字替换成#
		String str2 = "erkktyqqquizzzzzo";//将叠词替换成$.  //将重叠的字符替换成单个字母。zzzz->z
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
	 * 获取字符串
	 */
	public static void Mythod4() {
		String str = "ming tian jiu yao fang jia le ,da jia。";
		String regex = "\\b[a-zA-z]{3}\\b";
		/*
		 * 1.将规则封装成pattern对象
		 * 2.将pattern对象和字符串关联
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
