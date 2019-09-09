package networkDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 发送
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月5日下午12:28:47
 */
public class Udpsend {
	public static void main(String[] args) throws Exception, IOException {
		Socket s = new Socket("127.0.0.1", 8888);
		 
        // 打开输出流
        OutputStream os = s.getOutputStream();

        // 发送数字110到服务端
        os.write(110);
        os.close();
        s.close();
	}
}
