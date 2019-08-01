package testDemo;

/**
 * 自制trim(修建)方法
 * 步骤
 * 1.写两个索引
 * 2.索引开始前进到没有空格的位置
 * 3.记录位置 打印两个索引之间的数值
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月18日下午4:59:20
 */
public class StringTest1 {
	public static void main(String[] args) {
		String a =" 卧槽 这谁顶得住啊 ";
		come(a);
		come(mytrim(a));
		come(a.trim());
	}
	public static void come(Object obj) {
		System.out.println(obj);
	}
	public static String mytrim(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<=end&&str.charAt(start)==' ') 
		{
			start++;
		}
		while(end>=start&&str.charAt(end)==' ') 
		{
			end--;
		}
		return str.substring(start,end+1);
		
	}
}
