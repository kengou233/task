package socketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年8月31日下午5:31:13
 */
public class SocketDemo2 {
	public static void main(String[] args) throws IOException {
		 Process p = Runtime.getRuntime().exec("ping " + "192.168.2.106");
	        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        while ((line = br.readLine()) != null) {
	            if (line.length() != 0)
	                sb.append(line + "\r\n");
	        }
	        System.out.println("本次指令返回的消息是：");
	        System.out.println(sb.toString());
	}
}
