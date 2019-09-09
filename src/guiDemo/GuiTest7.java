package guiDemo;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 使用网格布局 做一个简易的计算器
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月1日下午4:21:33
 */
public class GuiTest7 {
	JFrame jf;
	JPanel jp;
	public GuiTest7() {
		// TODO 自动生成的构造函数存根
		Mythod();
	}
	
	private void Mythod() {
		// TODO 自动生成的方法存根
		jf = new JFrame("计算器");
		jf.setLayout(null);
		jf.setBounds(200,200,330,300);
		

		int gap=8;
		jp = new JPanel();
        jp.setBounds(gap, gap, 300, 225);
        jp.setLayout(new GridLayout(4, 5,gap,gap));
        jf.add(jp);
	
		
	    jp.add(new JButton("7"));
		jp.add(new JButton("8"));
		jp.add(new JButton("9"));
		jp.add(new JButton("/"));
		jp.add(new JButton("sq"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jp.add(new JButton("*"));
		jp.add(new JButton("%"));
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("-"));
		jp.add(new JButton("1/x"));
		jp.add(new JButton("0"));
		jp.add(new JButton("+/-"));
		jp.add(new JButton("."));
		jp.add(new JButton("+"));
		jp.add(new JButton("="));
		
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiTest7();
	}
}
