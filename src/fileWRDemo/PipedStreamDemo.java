package fileWRDemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * ʹ�ùܵ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��6������5:34:52
 */
public class PipedStreamDemo {
	public static void main(String[] args) throws IOException {
		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream  pis =	new PipedInputStream();
		pis.connect(pos);
		
		Mywriter writer = new Mywriter(pos);
		Myreader reader = new Myreader(pis);
		
		Thread t1 = new Thread(writer);
		Thread t2 = new Thread(reader);
		
		t1.start();
		t2.start();
	}
}
class Mywriter implements Runnable{
	private PipedOutputStream pos;

	public Mywriter(PipedOutputStream pos) {
		super();
		this.pos = pos;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			System.out.println("��ȡǰ�ȴ�����");
			Thread.sleep(6000);
			pos.write("����".getBytes());
			pos.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			throw new RuntimeException("�ܵ������ʧ��");

		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
}
class Myreader implements Runnable{
	private PipedInputStream pis;
	

	public Myreader(PipedInputStream pis) {
		super();
		this.pis = pis;
	}


	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			System.out.println("���ڶ�ȡ����");
			byte []  a = new byte[1024];
			int len=pis.read(a);
			System.out.println("���ݶ�ȡ�ɹ�");
			String b= new String(a,0,len);
			System.out.println(b);
			pis.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			throw new RuntimeException("�ܵ���ȡ��ʧ��");

		}
	} 
}