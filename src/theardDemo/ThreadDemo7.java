package theardDemo;

/**
 * ��ֹ�߳�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��17������10:40:48
 */
public class ThreadDemo7 {
	public static void main(String[] args) throws InterruptedException {
		Stopthread stopthread = new Stopthread();
		Thread thread = new Thread(stopthread);
		Thread thread1 = new Thread(stopthread);
//		thread.setDaemon(true);//�ػ��߳�
//		thread1.setDaemon(true);
		thread.start();
//		thread.join();ʹ���߳�������ִ��Ȩ ���Ҹ��߳�ִ����� ���̲߳Ż�����
//		thread.setPriority(thread.MAX_PRIORITY);//ʹ�߳�������ִ��Ȩ
//		thread.yield();//ת��ִ��Ȩ
		thread1.start();
		
		int num=0;
		while(true)
		{
			if(num++==60)
			{
//				Stopthread.temp();//�ı�����ֹ�߳�
				thread.interrupt();//ǿ�ƽ������ �ı�����ֹ�߳�
				thread1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"..."+num);
		}
	}
}
class Stopthread implements Runnable{
	 static boolean flag = true;
	@Override
	public synchronized void run() {
		// TODO �Զ����ɵķ������
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println(Thread.currentThread().getName()+"...Execption");
				flag=false;
			}
		System.out.println(Thread.currentThread().getName()+"...run");
		}
	}
	public static  void temp() {
		flag=false;
	}
	
}