package guiDemo;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * ʵ��ͼ�ν��� �������´�ʱ��ԭλ����ʾ
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��11������6:09:24
 */
public class GuiTest1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println();
		Frame f = new Frame("���");//���
		f.setSize(500,300);//���ó��Ϳ�
		
		Rect r = Mythod();
		if(r!=null)
			f.setLocation(r.x,r.y);
		else
			f.setLocation(200,100);
		
		
		f.setLayout(new FlowLayout());//���ò��ַ�ʽ 
		
		
		Button b = new Button("�˳�");
		b.setSize(200,50);
		Myevent1(f);
		Myevent2(b);
		f.add(b);
		
		f.setVisible(true);//�����ڿɼ�
		
		new Thread(new Mythread(f)).start();
	}
	public static void Myevent1(Frame f)
	{
		f.addWindowListener(
			new WindowAdapter() {
	
				@Override
				public void windowClosing(WindowEvent e) {
					// TODO �Զ����ɵķ������
					System.exit(0);
				}
				
			}
		);
	}
	public static void Myevent2(Button b) {
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
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
				// TODO �Զ����ɵ� catch ��
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
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public Mythread(Frame f) {
		super();
		this.f = f;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
	}
}
