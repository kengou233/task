package task3;
/**
 * @author kengou
 *	简单的密码验证
 */
import java.util.*;
public class UserMain {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("请输入密码：");
		String password=input.next();
		System.out.println(StringTool.passwordStrength(password));
	}
}
