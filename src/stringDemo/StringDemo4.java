package stringDemo;

/**
 * ʹ���ַ��������� ׷��1~10ʮ������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��16������10:28:43
 */
public class StringDemo4 {
	public static void main(String[] args) {
		StringBuffer bf =new StringBuffer("û�뵽�� �ٺ�");
		for(int i=1;i<11;i++) {
			bf.append(i);
		}
		System.out.println(bf);
	}
}
