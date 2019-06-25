package defaultDemo;

/**
 * 匿名内部类实现
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月24日下午6:47:06
 */
public class InsideDemo2 {
	public static void main(String[] args) {
		new Outer().function();
	}
}

//匿名内部类
//前提 匿名内部类必须继承一个内或者实现一个接口
abstract class AbsDemo {
	abstract void show();
}

class Outer {
	int x = 3;
//方法一、
	class Inner extends AbsDemo{
		void show() {
			System.out.println("method中的的x为："+x);
		}

	}
	void function() {
		new Inner().show();
	}
	
//方法二、
//	void function() {
//		AbsDemo d = new AbsDemo() {
//			
//			@Override
//			void show() {
//				// TODO 自动生成的方法存根
//				System.out.println("method中的的x为："+x);
//			}
//		};
//		d.show();
//综上 也可以 不加分号 直接调用方法
//	void function() {
//		new AbsDemo() {
//
//			@Override
//			void show() {
//				// TODO 自动生成的方法存根
//				System.out.println("method中的的x为：" + x);
//			}
//		}.show();
//	}
}
