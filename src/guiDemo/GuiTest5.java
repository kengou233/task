package guiDemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 移动鼠标 图片离开鼠标所指范围
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月31日下午7:58:05
 */
public class GuiTest5 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	public GuiTest5() {
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
		l.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				Random r = new Random();
				  
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
  
                l.setLocation(x, y);
			}
			
		});
	}
	public static void main(String[] args) {
		new GuiTest5();
	}
}
