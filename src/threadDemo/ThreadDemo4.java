package threadDemo;

/**
 * 拉煤运煤
 * @author 创建人：灰凉
 * @date 创建时间：2019年7月10日下午7:07:28
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
				// TODO 自动生成的 catch 块
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
				// TODO 自动生成的 catch 块
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
		// TODO 自动生成的方法存根
		int x = 0;
		while (true) {
			if (x == 0) {
				cd.set("batman", "男");
			} else {
				cd.set("catwoman", "女");
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
		// TODO 自动生成的方法存根
		while (true) {
				cd.get();
			}
		}
	}
