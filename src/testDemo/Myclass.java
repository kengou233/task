package testDemo;

/**
 * 粗略使用静态修饰符
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月20日下午9:54:49
 */
public class Myclass {
	public static int count;
	public static void main(String[] args) {
		Myclass a =new Myclass();
		a.count();
		a.count();
		a.count();
		a.count();
		a.count();
		a.count();
		a.count();
		System.out.println(count);
	}
	public void count() {
		count++;
	}
}
