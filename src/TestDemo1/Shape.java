package TestDemo1;

/**
 * ʹ�ó����� 
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��20������8:49:54
 */
public abstract class Shape {
	public abstract void s();

	public abstract void c();

	public static void main(String[] args) {
		Shape a[] = { new Circle(4), new Square(5), new Rect(3, 4) };
		for (int i = 0; i < a.length; i++) {
			a[i].s();
			a[i].c();
		}
	}
}

//Բ��
class Circle extends Shape {
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void s() {
		// TODO �Զ����ɵķ������
		double s = 3.14 * r * r;
		System.out.println("��Բ�ε����Ϊ��" + s);
	}

	@Override
	public void c() {
		// TODO �Զ����ɵķ������
		double c = 3.14 * r * 2;
		System.out.println("��Բ�ε��ܳ�Ϊ��" + c);
	}
}

//����
class Rect extends Shape {
	private int a, b;

	public Rect(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void s() {
		// TODO �Զ����ɵķ������
		int s = a * b;
		System.out.println("�þ��ε����Ϊ��" + s);
	}

	@Override
	public void c() {
		// TODO �Զ����ɵķ������
		int c = (a + b) * 2;
		System.out.println("�þ��ε��ܳ�Ϊ��" + c);
	}
}

//������
class Square extends Shape {
	private int a;

	public Square(int a) {
		super();
		this.a = a;
	}

	@Override
	public void s() {
		// TODO �Զ����ɵķ������
		int s = a * a;
		System.out.println("�������ε����Ϊ��" + s);
	}

	@Override
	public void c() {
		// TODO �Զ����ɵķ������
		int c = 4 * a;
		System.out.println("�������ε��ܳ�Ϊ��" + c);
	}

}