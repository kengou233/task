package theardDemo;

/**
 * 终止线程
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月17日下午10:40:48
 */
public class ThreadDemo7 {
	public static void main(String[] args) throws InterruptedException {
		Stopthread stopthread = new Stopthread();
		Thread thread = new Thread(stopthread);
		Thread thread1 = new Thread(stopthread);
//		thread.setDaemon(true);//守护线程
//		thread1.setDaemon(true);
		thread.start();
//		thread.join();使该线程有优先执行权 并且该线程执行完后 主线程才会启动
//		thread.setPriority(thread.MAX_PRIORITY);//使线程有优先执行权
//		thread.yield();//转交执行权
		thread1.start();
		
		int num=0;
		while(true)
		{
			if(num++==60)
			{
//				Stopthread.temp();//改变标记终止线程
				thread.interrupt();//强制解除冻结 改变标记终止线程
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
		// TODO 自动生成的方法存根
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
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