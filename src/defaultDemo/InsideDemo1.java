package defaultDemo;

/**
 * �ڲ����ʹ��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��23������4:23:57
 */
public class InsideDemo1 {
	public static void main(String[] args) {
		Outside o = new Outside();
		o.method();
	}
}

class Outside {
	private int a = 4;

	class Inside {
		int a = 5;

		void function() {
			int a = 6;
			System.out.println("��ô��������a���ڼ���");
			System.out.println("����a���ڣ�" + a);
			System.out.println("����a���ڣ�"+this.a);
			System.out.println("�ⲿa���ڣ�"+Outside.this.a);
		}
	}
	void method() {
		Inside i = new Inside();
		i.function();
	}
}
