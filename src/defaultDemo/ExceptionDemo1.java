package defaultDemo;

import java.io.ObjectInputStream.GetField;

/**
 * ��д������ Myexception �� Student1 ���ߺ����쳣����speak(int n) Ҫ��n��ֵ����1000ʱ
 * �׳�һ��MyException���� ����������ʵ����Student ������speak���� *
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��20������8:56:52
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		try {
			stu.speak(1001);
		} catch (Myexception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
class Student1 {
	public void speak(int n) throws Myexception {
		// TODO �Զ����ɵķ������
		if (n > 1000)
			throw new Myexception("��ֵ����");

	}
}

class Myexception extends Exception {
	private String message;

	public Myexception(String message) {
		this.message = message;
	}


	public String getMessage() {
		// TODO �Զ����ɵķ������
		return message;
	}	
	
}
