package threadDemo;

import java.util.concurrent.locks.*;

/**
 * ����ʵ����ú
 * 
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��7��17������10:42:26
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		Coaldigger cd = new Coaldigger();
		new Thread(new InputCoal(cd)).start();
		new Thread(new OutputCoal(cd)).start();
	}
}

class Coaldigger1 {
	public String name;
	public String sex;
	boolean flag = false;

	private Lock lock = new ReentrantLock();
	private Condition in = lock.newCondition();
	private Condition out = lock.newCondition();

	public void set(String name, String sex) throws InterruptedException {
		lock.lock();
		try {
			while (flag)
				in.await();

			this.name = name;
			this.sex = sex;

			flag = true;
			out.signal();

		} finally {
			lock.unlock();
		}
	}

	public void get() throws InterruptedException {
		lock.lock();
		try {
			while (!flag)
				out.await();
			
			System.out.println(this.name + "-----" + this.sex);
			
			flag = false;
			in.signal();
		} finally {
			lock.unlock();
		}
	}
}

class InputCoal1 implements Runnable {
	public Coaldigger1 cd;

	public InputCoal1(Coaldigger1 cd) {
		super();
		this.cd = cd;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		int x = 0;
		while (true) {
			if (x == 0) {
				try {
					cd.set("batman", "��");
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			} else {
				try {
					cd.set("catwoman", "Ů");
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			x = (x + 1) % 2;
		}
	}
}

class OutputCoal1 implements Runnable {
	public Coaldigger1 cd;

	public OutputCoal1(Coaldigger1 cd) {
		super();
		this.cd = cd;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true) {
			try {
				cd.get();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}