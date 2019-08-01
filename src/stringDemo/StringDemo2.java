package stringDemo;

/**
 * 将字符串分割 并比较分割部分
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月16日上午9:48:40
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = "你喜欢，我什么地方？";
		String str2 = "我喜欢，你笑的样子！";
		String str3 = str1.substring(1, 3);
		String str4 = str2.substring(1, 3);
		System.out.println(str3);
		System.out.println(str4);
		boolean a = str3.equals(str4);
		if (a) {
			System.out.println("你们心意相通！");
		} else {
			System.out.println("爱可遇不可求！");
		}
	}
}
