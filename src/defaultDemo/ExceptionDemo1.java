package defaultDemo;

/**
 * 编写两个类 Myexception 和 Student1 后者含有异常方法speak(int n) 要求n的值大于1000时
 * 抛出一个MyException对象 在主方法中实例化Student 并调用speak方法 *
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月20日上午8:56:52
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
//		Student1 stu = new Student1();
//		try {
//			stu.speak(1001);
//		} catch (Myexception e) {
//			// TODO 自动生成的 catch 块
//			System.out.println(e.getMessage());//打印错误消息
//			System.out.println(e.toString());//打印错误消息和包类
//			e.printStackTrace();//打印错误消息 包类和位置
//		}
		try {
			sum(5,0);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static int sum(int a,int b)throws Exception {
		if(b==0)
		throw new Exception("除数不能为零");
		return a/b; 
	}
}
//class Student1 {
//	public void speak(int n) throws Myexception {
//		// TODO 自动生成的方法存根
//		if (n > 1000)
//			throw new Myexception("数值过大！");
//
//	}
//}

class Myexception extends Exception {
	private String message;

	public Myexception(String message) {
		this.message = message;
	}


	public String getMessage() {
		// TODO 自动生成的方法存根
		return message;
	}	
	
}
