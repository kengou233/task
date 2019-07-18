package defaultDemo;

/**
 * 写一个死锁
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月17日下午10:21:10
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		new Thread(new Dielock(true)).start();
		new Thread(new Dielock(false)).start();
	}
}
class Templock{
	static Object o1= new Object();
	static Object o2= new Object();
}
class Dielock implements Runnable{
	private boolean flag;
	public Dielock(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		
		while(true) 
		{
			if(flag) 
			{
				synchronized (Templock.o1)
				{
					System.out.println("啊 哈哈 没想到吧");
					synchronized (Templock.o2) 
					{
						System.out.println("啊 嘿嘿 没想到吧");
					}
				}
		
			}
			else
			{
				synchronized (Templock.o2)
				{
					System.out.println("哦 嘿嘿 没想到吧");
					synchronized (Templock.o1) 
					{
						System.out.println("哦 哈哈 没想到吧");
					}
				}
			}
		}
	}
}
