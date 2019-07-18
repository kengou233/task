package defaultDemo;

/**
 * дһ������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��17������10:21:10
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
					System.out.println("�� ���� û�뵽��");
					synchronized (Templock.o2) 
					{
						System.out.println("�� �ٺ� û�뵽��");
					}
				}
		
			}
			else
			{
				synchronized (Templock.o2)
				{
					System.out.println("Ŷ �ٺ� û�뵽��");
					synchronized (Templock.o1) 
					{
						System.out.println("Ŷ ���� û�뵽��");
					}
				}
			}
		}
	}
}
