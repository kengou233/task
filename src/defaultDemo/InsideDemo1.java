package defaultDemo;

/**
 * 内部类的使用
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月23日下午4:23:57
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
			System.out.println("那么问题来了a等于几？");
			System.out.println("函数a等于：" + a);
			System.out.println("本类a等于："+this.a);
			System.out.println("外部a等于："+Outside.this.a);
		}
	}
	void method() {
		Inside i = new Inside();
		i.function();
	}
}
