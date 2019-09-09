package guiDemo;

import java.awt.*;
import java.awt.event.*;

/**
 * ʵ��ͼ�ν���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��13������11:07:55
 */
public class GuiDemo1 {
	public static void main(String[] args) {
		
		Frame f = new Frame("���");//���
		f.setSize(500,300);//���ó��Ϳ�
		f.setLocation(200,100);//�������ϱ߾�
		f.setLayout(new FlowLayout());//���ò��ַ�ʽ 
		Myevent1(f);
		
		
		Button b = new Button("�˳�");
		b.setSize(200,50);
		Myevent2(b);
		
		TextField tf = new TextField(20);//�����ı����п�
		Myevent3(tf);
		
		
		f.add(tf);//���ı�����ӵ�������
		f.add(b);//����ť��ӵ�������
		f.setVisible(true);//�����ڿɼ�
	}
	/*
	 * �����¼�
	 */
	public static void Myevent1(Frame f)
	{
		//���ڼ�����
		f.addWindowListener(
			new WindowAdapter() {
	
				@Override
				public void windowClosing(WindowEvent e) {
					// TODO �Զ����ɵķ������
					System.exit(0);
				}
				
			}
		);
	}
	/*
	 * ��ť�¼�
	 */
	public static void Myevent2(Button b) 
	{
		//����������
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
//				System.exit(0);
			}
		});
		//��������
		b.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				if(e.getClickCount()==2)
					System.out.println("����ѱ��������");
				else
					System.exit(0);
			}
			
		});
		//���̼�����
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				//getkeycode���ؼ�������ֵ��ascll��
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE)//e.isControlDown()�ж��Ƿ���ctrl��
					System.exit(0);
				//getkeytext����ascll�뷵���ַ���
//				System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
			}	
		});
	}
	/*
	 * �ı����¼�
	 */
	public static void Myevent3(TextField tf) 
	{
		tf.addKeyListener(new KeyAdapter(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				int i=e.getKeyCode();
				if(!(i>=KeyEvent.VK_0&&i<=KeyEvent.VK_9))//�жϼ�����������ַ��Ƿ�Ϊ0~9 �������д���ı���
				{
					System.out.println(i+"����Ƿ��ַ� ���������룡");
					e.consume();
				}
			}
			
		});
	}
}
