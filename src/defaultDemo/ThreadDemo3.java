package defaultDemo;

/**
 * 单力设计模式使用线程的漏洞
 * @author 创建人：灰凉
 * @date 创建时间：2019年7月1日下午10:23:50
 */
public class ThreadDemo3 {
	// 饿汉式
//	private static final ThreadDemo3 t = new ThreadDemo3(); 
//	private ThreadDemo3() {
//		super();
//		// TODO 自动生成的构造函数存根
//	}
//	public static ThreadDemo3 getInstance() {
//		return t;
//	}

	// 懒汉式
	private static ThreadDemo3 t = null;

	private ThreadDemo3() {
		super();
		// TODO 自动生成的构造函数存根
	}
//方法一
//	public static synchronized ThreadDemo3 getInstance() {
//		if(t==null)
//			t=new ThreadDemo3();
//		return t;
//	}
//方法二
	public static synchronized ThreadDemo3 getInstance() {
		if(t==null) {
			synchronized (ThreadDemo3.class) {
				if(t==null)
					t=new ThreadDemo3();				
			}
		}
		return t;
	}
}
