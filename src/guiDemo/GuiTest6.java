package guiDemo;

import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * ������¼�뷵�ص��ı���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��1������2:42:20
 */
public class GuiTest6 {
	JFrame jf;
	Button b;
	public GuiTest6() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}
	public void Mythod() {
		jf = new JFrame("�ҵĴ���");
		jf.setBounds(500,500,500,500);
		jf.setLayout(null);
		
		b = new Button("������");
		b.setBounds(200,200,100,100);
		jf.add(b);
		
		Myevent();
		jf.setVisible(true);
	}
	public void Myevent() {
		jf.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println(e.getKeyCode()+"..."+KeyEvent.getKeyText(e.getKeyCode()));
			}
			
		});
	}
	public static void main(String[] args) {
		new GuiTest6();
	}
}
