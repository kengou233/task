package defaultDemo;

/**
 * ʵ�ֶ��߳�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��30������10:14:29
 */
public class RepeatThr extends Thread {
	private int count=10;
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		super.run();
		while(true) {
			System.out.println(currentThread().getName()+"������..."+"��"+count--+"��");
			if(count==0)
				return;
		}
	}

	public static void main(String[] args) {
		new RepeatThr().start();
	}
}
