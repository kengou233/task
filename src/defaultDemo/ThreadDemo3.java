package defaultDemo;

/**
 * �������ģʽʹ���̵߳�©��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��7��1������10:23:50
 */
public class ThreadDemo3 {
	// ����ʽ
//	private static final ThreadDemo3 t = new ThreadDemo3(); 
//	private ThreadDemo3() {
//		super();
//		// TODO �Զ����ɵĹ��캯�����
//	}
//	public static ThreadDemo3 getInstance() {
//		return t;
//	}

	// ����ʽ
	private static ThreadDemo3 t = null;

	private ThreadDemo3() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
//����һ
//	public static synchronized ThreadDemo3 getInstance() {
//		if(t==null)
//			t=new ThreadDemo3();
//		return t;
//	}
//������
	public static synchronized ThreadDemo3 getInstance() {
		if(t==null) {
			synchronized (ThreadDemo3.class) {
				if(t==null)
					t=new ThreadDemo3();				
			}
		}
		return t;
	}
}
