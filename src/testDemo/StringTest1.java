package testDemo;

/**
 * ����trim(�޽�)����
 * ����
 * 1.д��������
 * 2.������ʼǰ����û�пո��λ��
 * 3.��¼λ�� ��ӡ��������֮�����ֵ
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��18������4:59:20
 */
public class StringTest1 {
	public static void main(String[] args) {
		String a =" �Բ� ��˭����ס�� ";
		come(a);
		come(mytrim(a));
		come(a.trim());
	}
	public static void come(Object obj) {
		System.out.println(obj);
	}
	public static String mytrim(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<=end&&str.charAt(start)==' ') 
		{
			start++;
		}
		while(end>=start&&str.charAt(end)==' ') 
		{
			end--;
		}
		return str.substring(start,end+1);
		
	}
}
