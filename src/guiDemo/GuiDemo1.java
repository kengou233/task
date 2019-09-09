package guiDemo;

import java.awt.*;
import java.awt.event.*;

/**
 * 实现图形界面
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月13日上午11:07:55
 */
public class GuiDemo1 {
	public static void main(String[] args) {
		
		Frame f = new Frame("哈喽");//框架
		f.setSize(500,300);//设置长和宽
		f.setLocation(200,100);//设置左上边距
		f.setLayout(new FlowLayout());//设置布局方式 
		Myevent1(f);
		
		
		Button b = new Button("退出");
		b.setSize(200,50);
		Myevent2(b);
		
		TextField tf = new TextField(20);//设置文本框列宽
		Myevent3(tf);
		
		
		f.add(tf);//将文本框添加到窗口里
		f.add(b);//将按钮添加到窗口里
		f.setVisible(true);//将窗口可见
	}
	/*
	 * 窗口事件
	 */
	public static void Myevent1(Frame f)
	{
		//窗口监听器
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
	/*
	 * 按钮事件
	 */
	public static void Myevent2(Button b) 
	{
		//动作监听器
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
//				System.exit(0);
			}
		});
		//鼠标监听器
		b.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				if(e.getClickCount()==2)
					System.out.println("鼠标已被点击两次");
				else
					System.exit(0);
			}
			
		});
		//键盘监听器
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				//getkeycode返回键盘输入值得ascll码
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE)//e.isControlDown()判断是否按下ctrl键
					System.exit(0);
				//getkeytext根据ascll码返回字符串
//				System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
			}	
		});
	}
	/*
	 * 文本框事件
	 */
	public static void Myevent3(TextField tf) 
	{
		tf.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				int i=e.getKeyCode();
				if(!(i>=KeyEvent.VK_0&&i<=KeyEvent.VK_9))//判断键盘中输入的字符是否为0~9 如果是则写入文本框
				{
					System.out.println(i+"输入非法字符 请重新输入！");
					e.consume();
				}
			}
			
		});
	}
}
