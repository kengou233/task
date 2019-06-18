package projectDemo;

public class TestShape {
	public static void main(String[] args) {
		Shape arr[] = {
						new Circle(2.0),
						new Rect(4,2)
					 };
		for(int i=0;i<arr.length;i++){
			System.out.println("该图形的面积为："+arr[i].area());//求面积
			System.out.println("该图形的周长为："+arr[i].girth());//求周长
			System.out.println("--------------");
		}
	}
}
//图形
abstract class Shape{
	//求面积的方法
	public abstract double area();
	//求周长的方法
	public abstract double girth();
}
//圆形
class Circle extends Shape{
	private double r;//半径
	public double area(){
		return 3.14*r*r;
	} 
	public double girth(){
		return 2*3.14*r;
	}
	public Circle(){}
	public Circle(double r){
		this.r = r;
	}
}
//矩形
class Rect extends Shape{
	private double a;//长
	private double b;//宽
	public double area(){
		return a*b;
	} 
	public double girth(){
		return (a+b)*2;
	}
	public Rect(){}
	public Rect(double a,double b){
		this.a = a;
		this.b = b;
	}
}
//正方形
class Square extends Rect{
	double x;//边长
	public double area(){
		return x*x;
	} 
	public double girth(){
		return 4*x;
	}
	public Square(){}
	public Square(double x){
		this.x = x;
	}
}
