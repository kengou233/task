package fileWRDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 操作字节数组流对象
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月6日下午11:03:24
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
