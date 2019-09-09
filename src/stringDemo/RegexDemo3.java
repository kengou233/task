package stringDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网页爬虫
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月8日下午9:43:02
 */
public class RegexDemo3 {
	/*
	 * 获取本地文档电子邮箱
	 */
	public static void Mythod1() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\迅雷下载\\毕向东JAVA教程\\合集\\源码\\day25\\mail.txt"));
			/*
			 * 获取字符串
			 */
			String regex ="\\w+@\\w+\\.\\w+";
			Pattern p = Pattern.compile(regex);
			/*
			 * 打印字符串
			 */
			String line = null;
			while((line=br.readLine())!=null)
			{
				Matcher m = p.matcher(line);
				while(m.find())
				{
					System.out.println(m.group());
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/*
	 * 获取浏览器电子邮箱 需要服务器的支持
	 */
	public static void Mythod2() {
		try {
			/*
			 * 获取电子邮箱地址并获取其连接信息
			 */
			URL url = new URL("http://localhost:8080/Myweb/mail.html");
			URLConnection uc = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			/*
			 * 给定规则 获取所要字符串
			 */
			String regex = "\\w+@\\w+\\.\\w+";
			Pattern p = Pattern.compile(regex);
			/*
			 * 使用字符流打印数据
			 */
			String line = null;
			while((line=br.readLine())!=null)
			{
				Matcher m = p.matcher(line);
				while(m.find())
				{
					System.out.println(m.group());
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Mythod1();
//		Mythod2();
	}
}
