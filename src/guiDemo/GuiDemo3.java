package guiDemo;

import java.awt.*;
import java.awt.event.*;
/**
 * ģ��˵���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��14������8:49:36
 */
public class GuiDemo3 {
	private Frame f;
	private	MenuBar mb;
	private Menu m,subMenu;
	private MenuItem mi,subItem;
	
	public GuiDemo3() {
		// TODO �Զ����ɵĹ��캯�����
		super();
		mythod();
	}
	public void mythod() {
		f = new Frame("���");		
		f.setSize(500,300);//���ó��Ϳ�
		f.setLocation(200,100);//�������ϱ߾�
		f.setLayout(new FlowLayout());//���ò��ַ�ʽ 
		
		mb = new MenuBar();//�����˵���
		m = new Menu("�ļ�");//�����˵�
		mi = new MenuItem("�˳�");//�����˵���
		
		subMenu = new Menu("���ļ�");
		subItem = new MenuItem("���ļ���");
		
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
						// TODO �Զ����ɵķ������
						System.exit(0);
					}
					
				}
		);
		mi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new GuiDemo3();
	}
}	
