package fileWRDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * �����ֽ�����������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��8��6������11:03:24
 */
public class ByteArraySteamDemo {
	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ByteArrayInputStream bis = new ByteArrayInputStream("abcd".getBytes());
		int by=0;
		while((by=bis.read())!=-1)
			bos.write(by);
		
		System.out.println(bos.size());
		System.out.println(bos.toString());
	}
}
