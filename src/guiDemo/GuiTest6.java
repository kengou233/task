package guiDemo;

import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 将键盘录入返回到文本框
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月1日下午2:42:20
 */
public class GuiTest6 {
	JFrame jf;
	Button b;
	public GuiTest6() {
		super();
		// TODO 自动生成的构造函数存根
		Mythod();
	}
	public void Mythod() {
		jf = new JFrame("我的窗口");
		jf.setBounds(500,500,500,500);
		jf.setLayout(null);
		
		b = new Button("请输入");
		b.setBounds(200,200,100,100);
		jf.add(b);
		
		Myevent();
		jf.setVisible(true);
	}
	public void Myevent() {
		jf.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				System.out.println(e.getKeyCode()+"..."+KeyEvent.getKeyText(e.getKeyCode()));
			}
			
		});
	}
	public static void main(String[] args) {
		new GuiTest6();
	}
}
