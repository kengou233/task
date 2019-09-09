package guiDemo;

import java.awt.*;
import java.awt.event.*;
/**
 * 模拟菜单栏
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月14日下午8:49:36
 */
public class GuiDemo3 {
	private Frame f;
	private	MenuBar mb;
	private Menu m,subMenu;
	private MenuItem mi,subItem;
	
	public GuiDemo3() {
		// TODO 自动生成的构造函数存根
		super();
		mythod();
	}
	public void mythod() {
		f = new Frame("哈喽");		
		f.setSize(500,300);//设置长和宽
		f.setLocation(200,100);//设置左上边距
		f.setLayout(new FlowLayout());//设置布局方式 
		
		mb = new MenuBar();//创建菜单栏
		m = new Menu("文件");//创建菜单
		mi = new MenuItem("退出");//创建菜单项
		
		subMenu = new Menu("子文件");
		subItem = new MenuItem("子文件项");
		
		subMenu.add(subItem);
		m.add(subMenu);
		
		mb.add(m);
		m.add(mi);
		f.setMenuBar(mb);
		
		myevent();
		f.setVisible(true);
	}
	public void myevent() {
		f.addWindowListener(
				new WindowAdapter() {
		
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO 自动生成的方法存根
						System.exit(0);
					}
					
				}
		);
		mi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new GuiDemo3();
	}
}	
