package socketDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SocketDemo1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("±¾»úipµØÖ·£º" + ip);
	}
}
