package projectDemo;
/**
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��5��14������3:58:36
 */
public class Singer extends Actor {

	public Singer() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Singer(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void performs() {
		System.out.println("�質��Ա"+getName()+"���ڱ��ݸ質��Ŀ�����һ��ϲ����");
	}

}
