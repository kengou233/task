package TestDemo1;

/**
 * 使用抽象类 
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月20日下午8:49:54
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

//圆形
class Circle extends Shape {
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void s() {
		// TODO 自动生成的方法存根
		double s = 3.14 * r * r;
		System.out.println("该圆形的面积为：" + s);
	}

	@Override
	public void c() {
		// TODO 自动生成的方法存根
		double c = 3.14 * r * 2;
		System.out.println("该圆形的周长为：" + c);
	}
}

//矩形
class Rect extends Shape {
	private int a, b;

	public Rect(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void s() {
		// TODO 自动生成的方法存根
		int s = a * b;
		System.out.println("该矩形的面积为：" + s);
	}

	@Override
	public void c() {
		// TODO 自动生成的方法存根
		int c = (a + b) * 2;
		System.out.println("该矩形的周长为：" + c);
	}
}

//正方形
class Square extends Shape {
	private int a;

	public Square(int a) {
		super();
		this.a = a;
	}

	@Override
	public void s() {
		// TODO 自动生成的方法存根
		int s = a * a;
		System.out.println("改正方形的面积为：" + s);
	}

	@Override
	public void c() {
		// TODO 自动生成的方法存根
		int c = 4 * a;
		System.out.println("该正方形的周长为：" + c);
	}

}