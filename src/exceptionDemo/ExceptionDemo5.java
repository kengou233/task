package exceptionDemo;

/**
 * 使用异常 终止非法程序
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月26日下午4:00:51
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
			throw new NovalueException("非法数值");
		this.a = a;
		this.b = b;
	}

	@Override
	public void getArea() {
		// TODO 自动生成的方法存根
		System.out.println("该矩形的面积为：" + a * b);
	}

}

class Circle implements Shape {
	private int r;
	public static final double PI = 3.14;

	public Circle(int r) {
		super();
		if(r<=0)
			throw new NovalueException("非法数值");	
		this.r = r;
	}

	@Override
	public void getArea() {
		// TODO 自动生成的方法存根
		System.out.println("该圆形的面积为：" + r * r * PI);
	}

}

class NovalueException extends RuntimeException {

	public NovalueException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

}