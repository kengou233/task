package stringDemo;

/**
 * ���ַ����ָ� ���ȽϷָ��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��16������9:48:40
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = "��ϲ������ʲô�ط���";
		String str2 = "��ϲ������Ц�����ӣ�";
		String str3 = str1.substring(1, 3);
		String str4 = str2.substring(1, 3);
		System.out.println(str3);
		System.out.println(str4);
		boolean a = str3.equals(str4);
		if (a) {
			System.out.println("����������ͨ��");
		} else {
			System.out.println("������������");
		}
	}
}
