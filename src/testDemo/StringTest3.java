package testDemo;

/**
 * ��ȡһ���ַ�������һ���ַ��������˶��ٴ�
 * ����
 * 1.���������
 * 2.��indexof�������ظ��ַ������ֵ��±�
 * 3.�ӷ��ص��±��������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��18������11:24:43
 */
public class StringTest3 {
	public static void main(String[] args) {
		lookup("aaaaabc","a");
		lookup1("aaaaabc","a");
	}
	//�ҵ����ַ������ֵ����� �ټ��ַ������� �ظ��˲���
	public static void lookup(String a , String b) {
		int index=0;
		int count=0;
		while((index=a.indexOf(b))!=-1)
		{
			a=a.substring(index+b.length());
			count++;
		}
		System.out.println(count);
	}
	public static void lookup1(String a,String b) {
		int index=0;
		int count=0;
		while((index=a.indexOf(b,index))!=-1)
		{
			index=index+b.length();
			count++;
		}
		System.out.println(count);
	}
	
}
