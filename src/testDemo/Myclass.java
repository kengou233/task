package testDemo;

/**
 * ����ʹ�þ�̬���η�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��20������9:54:49
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
