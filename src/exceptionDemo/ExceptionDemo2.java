package exceptionDemo;

/**
 * ����Number�� ͨ�����еķ���count�õ��������ĳ˻�
 * ��try-catch������������а�Χ�˷���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��20������9:37:45
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			int result=Number.conut(5,0);
			System.out.println(result);
		} catch (Myexception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
class Number{
	public static int conut(int n,int m)throws Myexception {
		if(m==0)
			throw new Myexception("��������Ϊ0");
		return n/m;
	}
}
