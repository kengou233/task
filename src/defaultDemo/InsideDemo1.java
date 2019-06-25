package defaultDemo;

/**
 * 内部类的使用
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月23日下午4:23:57
 */
public class InsideDemo1 {
	public static void main(String[] args) {
//		Outside o = new Outside();
//		o.method();
//		上下相等		
//		new Outside().method();

//		Outside.Inside oi =new Outside().new Inside();
//		oi.function();
//		上下相等
//		new Outside().new Inside().function();
//以上是内部类的调用
//		new Outer1().method(5);
//以上是定义在局部的内部类调用		
	}
}

//内部类实例化
//class Outside {
//	private int a = 4;
//
//	class Inside {
//		int a = 5;
//
//		void function() {
//			int a = 6;
//			System.out.println("那么问题来了a等于几？");
//			System.out.println("函数a等于：" + a);
//			System.out.println("本类a等于：" + this.a);
//			System.out.println("外部a等于：" + Outside.this.a);
//		}
//	}
//
//	void method() {
////		Inside i = new Inside();
////		i.function();
//		// 上下表达相等
//		new Inside().function();
//	}
//}
//内部类定义在局部时 不可以被成员修饰符修饰
//可随意访问函数的数值
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
