package projectDemo;

public class Dancer extends Actor {

	public Dancer() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Dancer(String name) {
		super(name);
	}
	public void performs() {
		System.out.println("�赸��Ա"+getName()+"����չʾ����ȶ��˵��赸");
	}
	
}
