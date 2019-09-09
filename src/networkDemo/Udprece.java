package networkDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接收
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月5日下午12:28:56
 */
 class Udprece {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i); 
    }
    
    public static void main(String[] args) {
		new Udprece().method1(5);
		//结果打印出来是 1还是5?
	}
}

