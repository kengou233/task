package defaultDemo;

/**
 * ʹ���߳�ÿ100�����ӡһ�仰
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��30������4:00:19
 */
public class ThreadDemo2 extends Thread {
	int index = 0;
	String[] str = { "��", "��", "��", "��", "ѽ", "\n" };

	public static void main(String[] args) {
		new ThreadDemo2().start();
		System.out.println("���������� �ǵùر��߳�Ŷ");
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		super.run();
		while (true) {
			try {
				System.out.printf(str[index++ % 6]);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
