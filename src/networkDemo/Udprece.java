package networkDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��5������12:28:56
 */
 class Udprece {
    int i = 1; //��������i
    public void method1(int i){ //����Ҳ��i
        System.out.println(i); 
    }
    
    public static void main(String[] args) {
		new Udprece().method1(5);
		//�����ӡ������ 1����5?
	}
}

