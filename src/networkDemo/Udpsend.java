package networkDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��5������12:28:47
 */
public class Udpsend {
	public static void main(String[] args) throws Exception, IOException {
		Socket s = new Socket("127.0.0.1", 8888);
		 
        // �������
        OutputStream os = s.getOutputStream();

        // ��������110�������
        os.write(110);
        os.close();
        s.close();
	}
}
