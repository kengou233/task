package projectDemo;
/**
 * @author kengou
 *	�򵥵�������֤
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
			return power=("�������������룡");//�ж������Ƿ�Ϊ��
		if (password.length() < 6 || password.length() > 18)
			return power=("��������λ������!");//�ж����볤���Ƿ�ﵽҪ��
		String part = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {//�ж������Ƿ������ĸҲ������
				if (!part.contains(Character.toString(password.charAt(i)))) {
					return power=("�������������������ַ������������룡");
				}
			}
		}
		if(isDigit(password)||isletter(password)) {
			power="�������";
		}
		else if(isDigitAndletter(password)) {
			power="�������";
		}
		return power="�������";
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
