package defaultDemo;

/**
 * �����ڲ���ʵ��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��24������6:47:06
 */
public class InsideDemo2 {
	public static void main(String[] args) {
		new Outer().function();
	}
}

//�����ڲ���
//ǰ�� �����ڲ������̳�һ���ڻ���ʵ��һ���ӿ�
abstract class AbsDemo {
	abstract void show();
}

class Outer {
	int x = 3;
//����һ��
	class Inner extends AbsDemo{
		void show() {
			System.out.println("method�еĵ�xΪ��"+x);
		}

	}
	void function() {
		new Inner().show();
	}
	
//��������
//	void function() {
//		AbsDemo d = new AbsDemo() {
//			
//			@Override
//			void show() {
//				// TODO �Զ����ɵķ������
//				System.out.println("method�еĵ�xΪ��"+x);
//			}
//		};
//		d.show();
//���� Ҳ���� ���ӷֺ� ֱ�ӵ��÷���
//	void function() {
//		new AbsDemo() {
//
//			@Override
//			void show() {
//				// TODO �Զ����ɵķ������
//				System.out.println("method�еĵ�xΪ��" + x);
//			}
//		}.show();
//	}
}
