package defaultDemo;

/**
 * 使用线程每100毫秒打印一句话
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月30日下午4:00:19
 */
public class ThreadDemo2 extends Thread {
	int index = 0;
	String[] str = { "相", "信", "自", "已", "呀", "\n" };

	public static void main(String[] args) {
		new ThreadDemo2().start();
		System.out.println("程序已运行 记得关闭线程哦");
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		while (true) {
			try {
				System.out.printf(str[index++ % 6]);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
