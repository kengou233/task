package testDemo;

/**
 * 找出两个字符串中 包含的最大字符串
 * 步骤
 * 1.将短的字符串 每一次递减一个元素
 * 2.将字符串递减后的结果 代入到长的字符串中判断是否包含
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月19日下午1:47:48
 */
public class StringTest4 {
	public static void main(String[] args) {
		String aString="meirenainiahahaha";
		String bString="woainiazheihei";
		judge(aString,bString);
	}
	public static void judge(String a, String b) {
		String max=(a.length()>b.length())?a:b;
		String min=(max==a)?b:a;
		for(int x=0;x<min.length();x++) {
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++) {
				String temp=b.substring(y,z);
				if(max.contains(temp)) {
					System.out.println(temp);
						return;
				} 
			}
			
		}
	}
}

