package exceptionDemo;

/**
 * �쳣����Ӧ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��25������7:25:05
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Teacher1 t = new Teacher1("����ʦ");
		try {
			t.prelect();
		} catch (NoplanException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println(e.getMessage());
			System.out.println("��ϰ...");
		}
	}
}
class Computer1{
	private int state =3;
	public void run() throws LanpingException, MaoyanException {
		if(state==2)
			throw new LanpingException("����������...");
		if(state==3)
			throw new MaoyanException("����ð����...");
		System.out.println("����������...");
	}
	public void reset() {
		System.out.println("����������...");
		
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
			// TODO �Զ����ɵ� catch ��
			System.out.println(e.getMessage());
			com.reset();
		} catch (MaoyanException e) {
			// TODO �Զ����ɵ� catch ��
			throw new NoplanException("��ʱ�޷�����");
		}
		System.out.println("����");
	}
}
class LanpingException extends Exception{

	public LanpingException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
class MaoyanException extends Exception{

	public MaoyanException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
class NoplanException extends Exception{

	public NoplanException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}