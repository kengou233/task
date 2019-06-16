package projectDemo;
/**
 * @author kengou
 *	简单的密码验证
 */
public class StringTool {
	public static boolean isCorrect(String userName) {
		if (userName == null)
			return false;
		if (userName.length() > 25)
			return false;
		char[] invalidchar = { ' ', '\'', '"', '?', '<', '>', ',' };
		for (char ch : invalidchar) {
			if (userName.contains(Character.toString(ch))) {
				return false;
			}
		}
		return true;
	}

	public static String passwordStrength(String password) {
		String power = "";
		if (password == null)
			return power=("请重新输入密码！");//判断密码是否为空
		if (password.length() < 6 || password.length() > 18)
			return power=("请输入六位数密码!");//判断密码长度是否达到要求
		String part = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {//判断密码是否包含字母也和数字
				if (!part.contains(Character.toString(password.charAt(i)))) {
					return power=("您输入的密码包含特殊字符，请重新输入！");
				}
			}
		}
		if(isDigit(password)||isletter(password)) {
			power="★★☆☆☆☆";
		}
		else if(isDigitAndletter(password)) {
			power="★★★★☆☆";
		}
		return power="★★★★★★";
	}

	private static boolean isDigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}

		}
		return true;
	}

	private static boolean isletter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isLetter(value.charAt(i)))
				return false;
		}
		return true;
	}

	private static boolean isDigitAndletter (String value) {
		for (int i = 0; i <value.length(); i++) {
			if(Character.isLetterOrDigit(value.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
