package projectDemo;
import java.util.Scanner;

public class Decimal {
/**
 * �ж�������ַ����Ƿ�ΪС��
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String num = input.next();
		if(isDecimal(num))
			System.out.println("��������С����");
		else 
			System.out.println("�����ֲ���С����");
	}
	
	public static boolean isDecimal(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {//�жϸ��ַ����Ƿ�Ϊ����
				if(str.charAt(i)=='.'){//�жϸ��ַ����Ƿ���С����
					if(i==0||i==str.length()-1) {//���С�����ڵ�һλ�����һλ����С��
						return false;
					}
					else {//������С��
						return true;
					}
				}
			}
		}
		return false;
	}
}
