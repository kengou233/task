package guiDemo;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * ģ��Ŀ¼�б�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��13������12:26:34
 */
public class GuiDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("�˵���");
		f.setSize(500,500);
		f.setLocation(200,200);
		f.setLayout(new FlowLayout());
		Myevent1(f);
		
		Button b = new Button("ת��");
		TextField tf = new TextField(20);
		TextArea ta  = new TextArea(15,45);
		Dialog d = new Dialog(f,"��ʾ��Ϣ",true);
		Label l = new Label();
		Button bt = new Button("ȷ��");
		Myevent2(b,tf,ta,d,l);
		
		d.setLocation(100,100);
		d.setLayout(new FlowLayout());
		Myevent3(d,bt,tf,ta,l);
		d.add(l);
		d.add(bt);
		
		
		
		f.add(tf);//���ı�����ӵ�������
		f.add(b);//����ť��ӵ�������
		f.add(ta);//���ı�������ӵ�������
		f.setVisible(true);//�����ڿɼ�
	}
	public static void Myevent1(Frame f) {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
	}
	public static void Myevent2(Button b,TextField tf,TextArea ta,Dialog d,Label l) {
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String dirpath = tf.getText();
//				ta.setText(text);
				File f = new File(dirpath);
				if(f.exists()&&f.isDirectory())
				{
					String [] a = f.list();
					for(String b:a)
					{
						ta.append(b+"\r\n");
					}
				}
				else
				{
					String information ="�������·������"+"..."+dirpath;
					l.setText(information);
					d.setVisible(true);	
				}
			}
		});
	}
	public static void Myevent3(Dialog d,Button bt,TextField tf,TextArea ta,Label l)
	{
		d.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(false);
			}
		});
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				int value=e.getKeyCode();
				if(value==KeyEvent.VK_ENTER)
				{
					String dirpath = tf.getText();
//					ta.setText(text);
					File f = new File(dirpath);
					if(f.exists()&&f.isDirectory())
					{
						String [] a = f.list();
						for(String b:a)
						{
							ta.append(b+"\r\n");
						}
					}
					else
					{
						String information ="�������·������"+"..."+dirpath;
						l.setText(information);
						d.setVisible(true);	
					}
				}
			}
		});
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(false);
			}
		});
	}
}
