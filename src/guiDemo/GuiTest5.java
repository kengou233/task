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
 * �ƶ���� ͼƬ�뿪�����ָ��Χ
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��31������7:58:05
 */
public class GuiTest5 {
	private JFrame f;
	private	JLabel l;
	private	Icon i;
	public GuiTest5() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}
	public void Mythod()
	{
		f = new JFrame("�ҵĴ���");
		f.setBounds(200,200,500,500);
		f.setLayout(new FlowLayout());
		
		l = new JLabel();
		i = new ImageIcon("D:\\Ѹ������\\001.jpg");
		l.setIcon(i);
		l.setSize(200,200);
		l.setHorizontalAlignment(JLabel.CENTER);

		
		Myevent();
		
		f.add(l);
		f.setVisible(true);
	}
	/*
	 * ����¼�������
	 */
	public void Myevent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
			
		});
		l.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
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
