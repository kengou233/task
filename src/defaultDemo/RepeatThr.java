package defaultDemo;

/**
 * 实现多线程
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月30日上午10:14:29
 */
public class RepeatThr extends Thread {
	private int count=10;
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		while(true) {
			System.out.println(currentThread().getName()+"哈哈哈..."+"第"+count--+"遍");
			if(count==0)
				return;
		}
	}

	public static void main(String[] args) {
		new RepeatThr().start();
	}
}
