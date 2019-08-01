package stringDemo;

/**将字符串 以小写和大写的形式输出
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月16日上午9:39:05
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String str ="abCDef";
		String str1=str.toUpperCase();
		String str2=str.toLowerCase();
		System.out.printf("大写为：%s\n",str1);
		System.out.printf("小写为：%s\n",str2);
	}
}
