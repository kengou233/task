package guiDemo;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.event.*;

import javax.swing.JFrame;

/**
 * ����ģ̬�Ի���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��1������3:00:04
 */
public class GuiDemo4 {
	JFrame jf;
	Button b1,b2;
	Dialog d;
	public GuiDemo4() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}
	public void Mythod() {
		jf = new JFrame("�ҵĴ���");
		jf.setSize(500,500);
		jf.setLocation(500,250);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new Button("����");
		b1.setSize(100,50);
		b1.setLocation(200,200);
		b2 = new Button("ȷ��");
		b2.setBounds(200,200,100,50);
		jf.add(b1);
		
		d = new Dialog(jf,"�ҵĶԻ���",true);
		d.setLayout(null);
		d.setSize(300,150);
		d.setLocation(200,200);
		d.add(b2);
		
		Myevent();
		jf.setVisible(true);
	}
	public void Myevent() {
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			int count=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				count++;
				if(count%2==1)
					d.setResizable(false);
				else
					d.setResizable(true);
			}
		});
		d.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(false);
			}
			
		});
	}
	public static void main(String[] args) {
		   new GuiDemo4();
	}
}
