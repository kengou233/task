package stringDemo;

/**
 * 使用正则表达式 判断字符串是否为合法手机号
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月16日上午9:59:29
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str ="15569922535";
		String regex="1[358]\\d{9}";
		//字符串首字符为1之后与之匹配的为3,5,8  然后之后的九位为0~9之间的任意数字
		boolean a=str.matches(regex);
		if(a)
			System.out.println("该手机号码符合要求！");
		else {
			System.out.println("您输入的手机号码有误！");
		}
	}
}
