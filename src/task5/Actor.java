package task5;
/**
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��5��14������3:55:18
 */
public class Actor {
	public String getName() {
		return name;
	}
	
	public Actor(String name) {
		super();
		this.name = name;
	}

	public Actor() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public void performs() {
		System.out.println("��Ա"+name+"���ڱ��ݾ��ʵĽ�Ŀ");
	}
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
}
