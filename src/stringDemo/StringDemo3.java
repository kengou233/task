package stringDemo;

/**
 * ʹ��������ʽ �ж��ַ����Ƿ�Ϊ�Ϸ��ֻ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��16������9:59:29
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str ="15569922535";
		String regex="1[358]\\d{9}";
		//�ַ������ַ�Ϊ1֮����֮ƥ���Ϊ3,5,8  Ȼ��֮��ľ�λΪ0~9֮�����������
		boolean a=str.matches(regex);
		if(a)
			System.out.println("���ֻ��������Ҫ��");
		else {
			System.out.println("��������ֻ���������");
		}
	}
}
