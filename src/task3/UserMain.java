package task3;
/**
 * @author kengou
 *	�򵥵�������֤
 */
import java.util.*;
public class UserMain {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("���������룺");
		String password=input.next();
		System.out.println(StringTool.passwordStrength(password));
	}
}
