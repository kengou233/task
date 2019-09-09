package stringDemo;

import java.util.TreeSet;

/**
 * 1.对电子邮箱进行校验
 * 2.对重复叠词进行替换
 * 3.将ip地址 正确输出
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月8日下午7:03:31
 */
public class RegexDemo2 {
	/*
	 * 字符串匹配
	 */
	public static void Mythod1() {
		String mail = "abc12@sina.com";
		String regex = "\\w+@\\w+(\\.[a-z]+)+";//较精准
//		String regex1 = ".+@.+\\..+";//普通
//		mail.indexOf("@")!=-1;//粗糙
		boolean flag = mail.matches(regex);
		System.out.println("您所输入的邮箱为："+flag);
	}
	/*
	 * 字符串切割+替换
	 */
	public static void Mythod2() {
		String str = "我我...我我...我要..要要...要要...学学学....学学...编编编...编程..程.程程...程...程";
		str = str.replaceAll("\\.+","");
		str = str.replaceAll("(.)\\1+","$1");
		System.out.println(str);
	}
	/*
	 * 字符串替换+替换+切割+排序+替换
	 */
	public static void Mythod3() {
		String ip = "192.68.1.254 102.49.23.013 10.10.10.10 2.2.2.2 8.109.90.30";
		ip = ip.replaceAll("(\\d+)","00$1");//替换
		ip = ip.replaceAll("0*(\\d{3})","$1");//替换
		System.out.println(ip);
		String a[] = ip.split(" ");//切割
		TreeSet<String> t = new TreeSet<String>();//排序
		for(String b:a)
		{
			t.add(b);
		}
		for(String b:t)
		{
			System.out.println(b.replaceAll("0*(\\d+)","$1"));//替换
		}
	}
	public static void main(String[] args) {
		Mythod1();
		Mythod2();
		Mythod3();
	}
}
