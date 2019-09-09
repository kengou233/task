package guiDemo;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.event.*;

import javax.swing.JFrame;

/**
 * 创建模态对话框
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月1日下午3:00:04
 */
public class GuiDemo4 {
	JFrame jf;
	Button b1,b2;
	Dialog d;
	public GuiDemo4() {
		super();
		// TODO 自动生成的构造函数存根
		Mythod();
	}
	public void Mythod() {
		jf = new JFrame("我的窗口");
		jf.setSize(500,500);
		jf.setLocation(500,250);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1 = new Button("变身");
		b1.setSize(100,50);
		b1.setLocation(200,200);
		b2 = new Button("确认");
		b2.setBounds(200,200,100,50);
		jf.add(b1);
		
		d = new Dialog(jf,"我的对话框",true);
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
				// TODO 自动生成的方法存根
				d.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			int count=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
				// TODO 自动生成的方法存根
				d.setVisible(false);
			}
			
		});
	}
	public static void main(String[] args) {
		   new GuiDemo4();
	}
}
