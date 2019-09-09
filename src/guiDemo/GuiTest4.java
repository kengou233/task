package guiDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 利用键盘使图片上下左右移动
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月31日下午7:34:23
 */
public class GuiTest4 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	public GuiTest4() {
		super();
		// TODO 自动生成的构造函数存根
		Mythod();
	}
	public void Mythod()
	{
		f = new JFrame("我的窗口");
		f.setBounds(200,200,500,500);
		f.setLayout(new FlowLayout());
		
		l = new JLabel();
		i = new ImageIcon("D:\\迅雷下载\\001.jpg");
		l.setIcon(i);
		l.setSize(200,200);
		l.setHorizontalAlignment(JLabel.CENTER);

		
		Myevent();
		
		f.add(l);
		f.setVisible(true);
	}
	/*
	 * 添加事件监听器
	 */
	public void Myevent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
			
		});
		f.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
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
