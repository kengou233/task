package theardDemo;

/**
 * ģ��������Ʊ
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��30������12:41:19
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		TrainShoupiao t = new TrainShoupiao();
		Thread t1 = new Thread(t, "1�Ŵ���");
		Thread t2 = new Thread(t, "2�Ŵ���");
		Thread t3 = new Thread(t, "3�Ŵ���");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("�������������ǵùر��߳�Ŷ");
	}
}

class TrainShoupiao implements Runnable {
	int num = 100;

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true) {
			synchronized (TrainShoupiao.class) {
				if (num > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "�۳�" + num--);
				}
			}
		}
	}

}
