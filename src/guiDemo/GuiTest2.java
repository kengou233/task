package guiDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * ʵ��ͼƬ��ť ����ÿ�ε��ͼƬ������ʾ������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��12������2:20:42
 */
public class GuiTest2 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	private	Button b1;
	
	public GuiTest2() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}
	public void Mythod()
	{
		f = new JFrame("�ҵĴ���");
		f.setBounds(200,200,500,500);
		f.setLayout(new GridLayout(2,1));
		l = new JLabel();
		
		
		i = new ImageIcon("D:\\Ѹ������\\001.jpg");
		l.setIcon(i);
		l.setSize(200,200);
		l.setHorizontalAlignment(JLabel.CENTER);
		
		b1 = new Button("����ͼƬ");
		b1.setSize(20,20);
		b1.setBounds(50,50,50,50);
		
		f.add(l);
		f.add(b1);
		Myevent();
		
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
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
					if(b1.getLabel().equals("��ʾͼƬ"))
					{
						l.setVisible(true);
						b1.setLabel("����ͼƬ");
					}
					else if(b1.getLabel().equals("����ͼƬ")) 
					{
						l.setVisible(false);
						b1.setLabel("��ʾͼƬ");
					}
				}
		});
	}
	public static void main(String[] args) {
		new GuiTest2();
	}
}
