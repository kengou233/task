package defaultDemo;

/**
 * 匿名内部类的使用
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月24日下午6:54:30
 */
public class InsideDemo3 {
	public static void main(String[] args) {
		Test1.function().method();
		//不new对象直接调用方法 说明function是静态方法
		//而function可以调用method方法
		//说明function的返回值类型是 Inter
		//因为只有Inter才可以调用method方法
	}
}

interface Inter{
	void method();
}
class Test1{
	//补全代码 通过匿名内部类
//方法一、
//	static class Inner implements Inter{
//
//		@Override
//		public void method() {
//			// TODO 自动生成的方法存根
//			System.out.println("method 运行...");
//		}
//	}
//	static Inter function() {
//		return new Inner();
//	}
//方法二、
	static Inter function() {
		return new Inter() {

			@Override
			public void method() {
				// TODO 自动生成的方法存根
				System.out.println("method 运行...");	
			}	
		};
	}
}