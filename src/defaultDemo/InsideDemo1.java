package defaultDemo;

/**
 * �ڲ����ʹ��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��23������4:23:57
 */
public class InsideDemo1 {
	public static void main(String[] args) {
//		Outside o = new Outside();
//		o.method();
//		�������		
//		new Outside().method();

//		Outside.Inside oi =new Outside().new Inside();
//		oi.function();
//		�������
//		new Outside().new Inside().function();
//�������ڲ���ĵ���
//		new Outer1().method(5);
//�����Ƕ����ھֲ����ڲ������		
	}
}

//�ڲ���ʵ����
//class Outside {
//	private int a = 4;
//
//	class Inside {
//		int a = 5;
//
//		void function() {
//			int a = 6;
//			System.out.println("��ô��������a���ڼ���");
//			System.out.println("����a���ڣ�" + a);
//			System.out.println("����a���ڣ�" + this.a);
//			System.out.println("�ⲿa���ڣ�" + Outside.this.a);
//		}
//	}
//
//	void method() {
////		Inside i = new Inside();
////		i.function();
//		// ���±�����
//		new Inside().function();
//	}
//}
//�ڲ��ඨ���ھֲ�ʱ �����Ա���Ա���η�����
//��������ʺ�������ֵ
//class Outer1 {
//	int x = 3;
//
//	void method(int a) {
//		int x=4;
//		class Inner {
//			void function() {
//				System.out.println(a);
//				System.out.println(x);
//				System.out.println(Outer1.this.x);
//			}
//		}
//		new Inner().function();
//	}
//}
