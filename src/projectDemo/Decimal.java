package projectDemo;
import java.util.Scanner;

public class Decimal {
/**
 * 判断输入的字符串是否为小数
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String num = input.next();
		if(isDecimal(num))
			System.out.println("该数字是小数！");
		else 
			System.out.println("该数字不是小数！");
	}
	
	public static boolean isDecimal(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {//判断该字符串是否为数字
				if(str.charAt(i)=='.'){//判断该字符串是否有小数点
					if(i==0||i==str.length()-1) {//如果小数点在第一位或最后一位则不是小数
						return false;
					}
					else {//否则是小数
						return true;
					}
				}
			}
		}
		return false;
	}
}
