package guiDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 实现图片按钮 并且每次点击图片都会显示或隐藏
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月12日下午2:20:42
 */
public class GuiTest2 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	private	Button b1;
	
	public GuiTest2() {
		super();
		// TODO 自动生成的构造函数存根
		Mythod();
	}
	public void Mythod()
	{
		f = new JFrame("我的窗口");
		f.setBounds(200,200,500,500);
		f.setLayout(new GridLayout(2,1));
		l = new JLabel();
		
		
		i = new ImageIcon("D:\\迅雷下载\\001.jpg");
		l.setIcon(i);
		l.setSize(200,200);
		l.setHorizontalAlignment(JLabel.CENTER);
		
		b1 = new Button("隐藏图片");
		b1.setSize(20,20);
		b1.setBounds(50,50,50,50);
		
		f.add(l);
		f.add(b1);
		Myevent();
		
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
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
					if(b1.getLabel().equals("显示图片"))
					{
						l.setVisible(true);
						b1.setLabel("隐藏图片");
					}
					else if(b1.getLabel().equals("隐藏图片")) 
					{
						l.setVisible(false);
						b1.setLabel("显示图片");
					}
				}
		});
	}
	public static void main(String[] args) {
		new GuiTest2();
	}
}
