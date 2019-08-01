package testDemo;

/**
 * 获取一个字符串中另一个字符串出现了多少次
 * 步骤
 * 1.定义计数器
 * 2.用indexof方法返回该字符串出现的下标
 * 3.从返回的下标继续查找
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月18日下午11:24:43
 */
public class StringTest3 {
	public static void main(String[] args) {
		lookup("aaaaabc","a");
		lookup1("aaaaabc","a");
	}
	//找到该字符串出现的索引 再加字符串长度 重复此操作
	public static void lookup(String a , String b) {
		int index=0;
		int count=0;
		while((index=a.indexOf(b))!=-1)
		{
			a=a.substring(index+b.length());
			count++;
		}
		System.out.println(count);
	}
	public static void lookup1(String a,String b) {
		int index=0;
		int count=0;
		while((index=a.indexOf(b,index))!=-1)
		{
			index=index+b.length();
			count++;
		}
		System.out.println(count);
	}
	
}
