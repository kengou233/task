package exceptionDemo;

/**
 * 异常类型应用
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月25日下午7:25:05
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Teacher1 t = new Teacher1("毕老师");
		try {
			t.prelect();
		} catch (NoplanException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
			System.out.println("自习...");
		}
	}
}
class Computer1{
	private int state =3;
	public void run() throws LanpingException, MaoyanException {
		if(state==2)
			throw new LanpingException("电脑蓝屏了...");
		if(state==3)
			throw new MaoyanException("电脑冒烟了...");
		System.out.println("电脑已启动...");
	}
	public void reset() {
		System.out.println("电脑已重启...");
		
	}
}
class Teacher1{
	private String name;
	private Computer1 com;
	Teacher1(String name){
		this.name=name;
		com = new Computer1();
	}
	public void prelect() throws NoplanException {
		try {
			com.run();
		} catch (LanpingException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
			com.reset();
		} catch (MaoyanException e) {
			// TODO 自动生成的 catch 块
			throw new NoplanException("课时无法继续");
		}
		System.out.println("讲课");
	}
}
class LanpingException extends Exception{

	public LanpingException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
class MaoyanException extends Exception{

	public MaoyanException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
class NoplanException extends Exception{

	public NoplanException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}