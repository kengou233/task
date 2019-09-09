package fileWRDemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 使用管道流
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午5:34:52
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
		// TODO 自动生成的方法存根
		try {
			System.out.println("读取前等待输入");
			Thread.sleep(6000);
			pos.write("哈哈".getBytes());
			pos.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			throw new RuntimeException("管道输出流失败");

		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
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
		// TODO 自动生成的方法存根
		try {
			System.out.println("正在读取数据");
			byte []  a = new byte[1024];
			int len=pis.read(a);
			System.out.println("数据读取成功");
			String b= new String(a,0,len);
			System.out.println(b);
			pis.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			throw new RuntimeException("管道读取流失败");

		}
	} 
}