package defaultDemo;

/**
 * �����ڲ����ʹ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��24������6:54:30
 */
public class InsideDemo3 {
	public static void main(String[] args) {
		Test1.function().method();
		//��new����ֱ�ӵ��÷��� ˵��function�Ǿ�̬����
		//��function���Ե���method����
		//˵��function�ķ���ֵ������ Inter
		//��Ϊֻ��Inter�ſ��Ե���method����
	}
}

interface Inter{
	void method();
}
class Test1{
	//��ȫ���� ͨ�������ڲ���
//����һ��
//	static class Inner implements Inter{
//
//		@Override
//		public void method() {
//			// TODO �Զ����ɵķ������
//			System.out.println("method ����...");
//		}
//	}
//	static Inter function() {
//		return new Inner();
//	}
//��������
	static Inter function() {
		return new Inter() {

			@Override
			public void method() {
				// TODO �Զ����ɵķ������
				System.out.println("method ����...");	
			}	
		};
	}
}