package exceptionDemo;

/**
 * ʹ���쳣 ��ֹ�Ƿ�����
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��26������4:00:51
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Shape s[] = { new Rect(3, 0), new Circle(2) };
		method(s);
	}

	public static void method(Shape s[]) {
		for (int i = 0; i < s.length; i++)
			s[i].getArea();
	}
}

interface Shape {
	void getArea();
}

class Rect implements Shape {
	private int a, b;

	public Rect(int a, int b) {
		super();
		if(a<=0||b<=0)
			throw new NovalueException("�Ƿ���ֵ");
		this.a = a;
		this.b = b;
	}

	@Override
	public void getArea() {
		// TODO �Զ����ɵķ������
		System.out.println("�þ��ε����Ϊ��" + a * b);
	}

}

class Circle implements Shape {
	private int r;
	public static final double PI = 3.14;

	public Circle(int r) {
		super();
		if(r<=0)
			throw new NovalueException("�Ƿ���ֵ");	
		this.r = r;
	}

	@Override
	public void getArea() {
		// TODO �Զ����ɵķ������
		System.out.println("��Բ�ε����Ϊ��" + r * r * PI);
	}

}

class NovalueException extends RuntimeException {

	public NovalueException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

}