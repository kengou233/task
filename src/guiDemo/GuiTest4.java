package guiDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * ���ü���ʹͼƬ���������ƶ�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��31������7:34:23
 */
public class GuiTest4 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	public GuiTest4() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}
	public void Mythod()
	{
		f = new JFrame("�ҵĴ���");
		f.setBounds(200,200,500,500);
		f.setLayout(new FlowLayout());
		
		l = new JLabel();
		i = new ImageIcon("D:\\Ѹ������\\001.jpg");
		l.setIcon(i);
		l.setSize(200,200);
		l.setHorizontalAlignment(JLabel.CENTER);

		
		Myevent();
		
		f.add(l);
		f.setVisible(true);
	}
	/*
	 * ����¼�������
	 */
	public void Myevent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
			
		});
		f.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				if(e.getKeyCode()==39)
				{
					l.setLocation(l.getX()+10,l.getY());
				}
				else if(e.getKeyCode()==37)
				{
					l.setLocation(l.getX()-10,l.getY());
				}
				else if(e.getKeyCode()==38)
				{
					l.setLocation(l.getX(),l.getY()-10);
				}
				else if(e.getKeyCode()==40)
				{
					l.setLocation(l.getX(),l.getY()+10);
				}
			}
			
		});
	}
	public static void main(String[] args) {
		new GuiTest4();
	}
}
