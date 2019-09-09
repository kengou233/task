package guiDemo;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ʵ��ͼ�λ�����ı���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��26������8:08:51
 */
public class GuiTest3 {
	private File file;
	private Frame f;
	private	MenuBar mb;//�����˵���
	private Menu m;//�����˵�
	private MenuItem openItem,saveItem,closeItem;//�����ļ���
	private FileDialog opendia,savedia;//�����ļ��Ի���
	private TextArea ta;
	
	public GuiTest3() {
		super();
		// TODO �Զ����ɵĹ��캯�����
		Mythod();
	}

	public void Mythod()
	{
		f = new Frame("�ҵĴ���");
		f.setBounds(500,200,500,600);
		ta = new TextArea();
		
		mb = new MenuBar();
		m = new Menu("�ļ�");
		
		openItem = new MenuItem("��");
		saveItem = new MenuItem("����");
		closeItem = new MenuItem("�ر�");
		
		m.add(openItem);
		m.add(saveItem);
		m.add(closeItem);
		
		mb.add(m);
		Myevent();
		
		opendia = new FileDialog(f,"��Ҫ��");
		savedia = new FileDialog(f,"��Ҫ����",FileDialog.SAVE);
		
		f.add(ta);
		f.setMenuBar(mb);
		f.setVisible(true);
	}
	
	public void Myevent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
			
		});
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				opendia.setVisible(true);
				String dirpath = opendia.getDirectory();
				String filename = opendia.getFile();
				if(dirpath==null||filename==null)
					return;
				ta.setText("");
				file = new File(dirpath,filename);
				
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = null;
					while((line=br.readLine())!=null)
					{
						ta.append(line+"\r\n");
					}
					br.close();
				} catch (FileNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(file==null)
				{
					savedia.setVisible(true);
					String dirpath = savedia.getDirectory();
					String filename = savedia.getFile();
					if(dirpath==null||filename==null)
						return;
					file = new File(dirpath,filename);
				}
				
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(file));
					String text = ta.getText();
					bw.write(text);
					bw.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new GuiTest3();
	}
}
