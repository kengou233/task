package fileWRDemo;

import java.io.*;
import java.util.ArrayList;

/**
 * ��һ��Ŀ¼�������ļ��� ����һ���ı��ļ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��3������1:11:15
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("D:\\Ѹ������\\��Ӱ");
		ArrayList<File> aList= new ArrayList<File>();
		mythod1(file,aList);
		try {
			mythod2(aList);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void mythod1(File file,ArrayList<File> aList)
	{
		File [] aFiles = file.listFiles();
		
		for(File bFile:aFiles)
		{
			if(bFile.isDirectory())
				mythod1(bFile,aList);
			else
			{
				if(bFile.getName().endsWith(".mp4"))
					aList.add(bFile);
			}	
			System.out.println(bFile);
		}
	}
	public static void mythod2(ArrayList<File>aList) throws IOException
	{
		BufferedWriter bw =null;
		try {
			bw= new BufferedWriter(new FileWriter("D:\\Ѹ������\\�嵥.txt"));
			for(File f:aList)
			{
				String path = f.getAbsolutePath();
				bw.write(path);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO: handle exception
			throw e;
		}
		finally {
			if(bw!=null)
				bw.close();
		}
	}
}
