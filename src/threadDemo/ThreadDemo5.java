package threadDemo;

import java.util.concurrent.locks.*;

/**
 * 用锁实现拉煤
 * 
 * @author 创建人：灰凉
 * @date 创建时间：2019年7月17日上午10:42:26
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
		// TODO 自动生成的方法存根
		int x = 0;
		while (true) {
			if (x == 0) {
				try {
					cd.set("batman", "男");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			} else {
				try {
					cd.set("catwoman", "女");
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
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
		// TODO 自动生成的方法存根
		while (true) {
			try {
				cd.get();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}