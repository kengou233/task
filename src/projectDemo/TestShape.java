package projectDemo;

public class TestShape {
	public static void main(String[] args) {
		Shape arr[] = {
						new Circle(2.0),
						new Rect(4,2)
					 };
		for(int i=0;i<arr.length;i++){
			System.out.println("��ͼ�ε����Ϊ��"+arr[i].area());//�����
			System.out.println("��ͼ�ε��ܳ�Ϊ��"+arr[i].girth());//���ܳ�
			System.out.println("--------------");
		}
	}
}
//ͼ��
abstract class Shape{
	//������ķ���
	public abstract double area();
	//���ܳ��ķ���
	public abstract double girth();
}
//Բ��
class Circle extends Shape{
	private double r;//�뾶
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
//����
class Rect extends Shape{
	private double a;//��
	private double b;//��
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
//������
class Square extends Rect{
	double x;//�߳�
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
