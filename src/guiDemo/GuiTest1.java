package guiDemo;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * 实现图形界面 并且重新打开时在原位置显示
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月11日下午6:09:24
 */
public class GuiTest1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println();
		Frame f = new Frame("哈喽");//框架
		f.setSize(500,300);//设置长和宽
		
		Rect r = Mythod();
		if(r!=null)
			f.setLocation(r.x,r.y);
		else
			f.setLocation(200,100);
		
		
		f.setLayout(new FlowLayout());//设置布局方式 
		
		
		Button b = new Button("退出");
		b.setSize(200,50);
		Myevent1(f);
		Myevent2(b);
		f.add(b);
		
		f.setVisible(true);//将窗口可见
		
		new Thread(new Mythread(f)).start();
	}
	public static void Myevent1(Frame f)
	{
		f.addWindowListener(
			new WindowAdapter() {
	
				@Override
				public void windowClosing(WindowEvent e) {
					// TODO 自动生成的方法存根
					System.exit(0);
				}
				
			}
		);
	}
	public static void Myevent2(Button b) {
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
		
	}
	public static Rect Mythod()
	{	
		Rect r=null;
			try {
				FileInputStream fis = new FileInputStream("temp.txt");
				DataInputStream dis = new DataInputStream(fis);
				
				int x = dis.readInt();
				int y = dis.readInt();
				
				r= new Rect(x,y);
				dis.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		
		return r;	
	}
}

class Rect{
	int x;
	int y;
	public Rect(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

class Mythread implements Runnable{
	Frame f;
	public Mythread() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public Mythread(Frame f) {
		super();
		this.f = f;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
		{
			int x = f.getX();
			int y =	f.getY();
			try {
			File file = new File("temp.txt");
			if(!file.exists())
				file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(x);
			dos.writeInt(y);
			
			dos.close();
			Thread.sleep(300);
			}  catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
}
