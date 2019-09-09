package guiDemo;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * 模拟目录列表
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月13日下午12:26:34
 */
public class GuiDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("菜单栏");
		f.setSize(500,500);
		f.setLocation(200,200);
		f.setLayout(new FlowLayout());
		Myevent1(f);
		
		Button b = new Button("转到");
		TextField tf = new TextField(20);
		TextArea ta  = new TextArea(15,45);
		Dialog d = new Dialog(f,"提示信息",true);
		Label l = new Label();
		Button bt = new Button("确认");
		Myevent2(b,tf,ta,d,l);
		
		d.setLocation(100,100);
		d.setLayout(new FlowLayout());
		Myevent3(d,bt,tf,ta,l);
		d.add(l);
		d.add(bt);
		
		
		
		f.add(tf);//将文本框添加到窗口里
		f.add(b);//将按钮添加到窗口里
		f.add(ta);//将文本区域添加到窗口中
		f.setVisible(true);//将窗口可见
	}
	public static void Myevent1(Frame f) {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
	}
	public static void Myevent2(Button b,TextField tf,TextArea ta,Dialog d,Label l) {
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
					String information ="您输入的路径错误"+"..."+dirpath;
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
				// TODO 自动生成的方法存根
				d.setVisible(false);
			}
		});
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
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
						String information ="您输入的路径错误"+"..."+dirpath;
						l.setText(information);
						d.setVisible(true);	
					}
				}
			}
		});
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				d.setVisible(false);
			}
		});
	}
}
