package defaultDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ʹ��i/o
 * 
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��16������2:03:55
 */
public class RepeatFile {
	public static void main(String[] args) {
//		creatORdelete();//������ɾ��
//		fileTest();//�鿴���ļ�������
//		StreamTest();
		WR();
	}

	public static void creatORdelete() {
		File file = new File("temp.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ���ɾ��");
		} else {
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	public static void fileTest() {
		File file =new File("temp.txt");
		if(file.exists()) {
			String name=file.getName();
			long length=file.length();
			boolean hidden=file.isHidden();
			System.out.println("�ļ����ƣ�"+name);
			System.out.println("�ļ����ȣ�"+length);
			System.out.println("�Ƿ�Ϊ�����ļ���"+hidden);
			System.out.println("�ļ�·����"+file.getAbsolutePath());
		}
		else {
			System.out.println("���ļ�������");
		}
	}
	public static void StreamTest(){
		File file =new File("temp.txt");
		try {
			FileOutputStream out =new FileOutputStream(file);
			byte buy[]="����һֻСë¿���Ҵ���Ҳ���".getBytes();
			try {
				out.write(buy);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			FileInputStream in =new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("�ļ����ݣ�"+new String(byt,0,len));
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public static void WR() {
			//д��
			FileWriter fw = null;
			try {
				fw = new FileWriter("temp.txt");
				fw.write("���ѽ �ٺ�");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			finally {
				if(fw!=null)
				{
					try {
						fw.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}

			}
			//��ȡ
			FileReader fr= null;
			try {
				fr = new FileReader("temp.txt");
				try {
					/*
					 * ��ȡ��ʽһ
					int len =0;
					while((len=fr.read())!=-1)
					{
						System.out.print((char)len);
					}
					*/
					//��ȡ��ʽ��
					int len=0;
					char a [] =new char[1024];
					while((len=fr.read(a))!=-1)
					{
						System.out.println(len+" "+new String(a,0,len));
					}
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			finally {
				if(fr!=null)
				{
					try {
						fr.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			
			}
		}
}
