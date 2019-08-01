package threadDemo;

/**
 * ��ú��ú
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��7��10������7:07:28
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Coaldigger cd = new Coaldigger();
		new Thread(new InputCoal(cd)).start();
		new Thread(new OutputCoal(cd)).start();
	}
}

class Coaldigger {
	public String name;
	public String sex;
	boolean flag = false;

	public synchronized void set(String name, String sex) {
		while (flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}

		this.name = name;
		this.sex = sex;

		flag = true;
		this.notify();
	}

	public synchronized void get() {
		while(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		System.out.println(this.name + "-----" + this.sex);
		flag=false;
		this.notify();
	}
}

class InputCoal implements Runnable {
	public Coaldigger cd;

	public InputCoal(Coaldigger cd) {
		super();
		this.cd = cd;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		int x = 0;
		while (true) {
			if (x == 0) {
				cd.set("batman", "��");
			} else {
				cd.set("catwoman", "Ů");
			}
			x = (x + 1) % 2;
		}
	}
}

class OutputCoal implements Runnable {
	public Coaldigger cd;

	public OutputCoal(Coaldigger cd) {
		super();
		this.cd = cd;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true) {
				cd.get();
			}
		}
	}
