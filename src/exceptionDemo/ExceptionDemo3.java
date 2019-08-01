package exceptionDemo;

/**
 * ������Computer �����м������Լ���ķ���
 * ����������ֵΪ�������׳��쳣
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��20������9:55:01
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		int n=-1;
		int m=100;
		try {
			int result=Computer.divisor(n,m);
			System.out.println("�����������������Ϊ��"+result);
			System.out.println("������������С������Ϊ��"+m*n/result);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println(e.getMessage());
		}
	}
}
/**
 * �������������С�������ķ�����ŷ������㷨
 * ��  ���ж� ǰһ�����Ƿ���ں�һ��
 * Ȼ�� �������������  ���� �� �˻�
 * ���� whileѭ��  ���������� ʹ����=0Ϊֹ
 * ���� ��һ�ε� �������� ǰһ�εĳ��� 
 * 	      ��һ�ε� ������ǰһ�ε�����
 */
class Computer{
	public static int divisor(int n,int m)throws NumlessOneException {
		if(n<=0||m<=0)
			throw new NumlessOneException("��ֵ����Ϊ0���� ���������룡");
		//�ж� ǰһ�����Ƿ���ں�һ����
		if(n<m) {
			int temp=n;
			n=m;
			m=temp;
		}
		//������ 	
		int s=n%m;
		while(s!=0) {
			n=m;
			m=s;
			s=n%m;
		}
		return m;	
	}
}
class NumlessOneException extends RuntimeException{

	public NumlessOneException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
