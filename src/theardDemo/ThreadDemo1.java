package theardDemo;

/**
 * 模拟售卖火车票
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月30日下午12:41:19
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		TrainShoupiao t = new TrainShoupiao();
		Thread t1 = new Thread(t, "1号窗口");
		Thread t2 = new Thread(t, "2号窗口");
		Thread t3 = new Thread(t, "3号窗口");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("程序已启动，记得关闭线程哦");
	}
}

class TrainShoupiao implements Runnable {
	int num = 100;

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			synchronized (TrainShoupiao.class) {
				if (num > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "售出" + num--);
				}
			}
		}
	}

}
