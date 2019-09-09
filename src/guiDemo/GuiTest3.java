package guiDemo;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 实现图形化界面的保存
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月26日下午8:08:51
 */
public class GuiTest3 {
	private File file;
	private Frame f;
	private	MenuBar mb;//创建菜单栏
	private Menu m;//创建菜单
	private MenuItem openItem,saveItem,closeItem;//创建文件条
	private FileDialog opendia,savedia;//创建文件对话框
	private TextArea ta;
	
	public GuiTest3() {
		super();
		// TODO 自动生成的构造函数存根
		Mythod();
	}

	public void Mythod()
	{
		f = new Frame("我的窗口");
		f.setBounds(500,200,500,600);
		ta = new TextArea();
		
		mb = new MenuBar();
		m = new Menu("文件");
		
		openItem = new MenuItem("打开");
		saveItem = new MenuItem("保存");
		closeItem = new MenuItem("关闭");
		
		m.add(openItem);
		m.add(saveItem);
		m.add(closeItem);
		
		mb.add(m);
		Myevent();
		
		opendia = new FileDialog(f,"我要打开");
		savedia = new FileDialog(f,"我要保存",FileDialog.SAVE);
		
		f.add(ta);
		f.setMenuBar(mb);
		f.setVisible(true);
	}
	
	public void Myevent() {
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
			
		});
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new GuiTest3();
	}
}
