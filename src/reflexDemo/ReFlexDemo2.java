package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ��ȡ�����Ĺ��캯��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��3������12:25:16
 */
public class ReFlexDemo2 {
	
	public ReFlexDemo2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("-----------------------");
		Mythod1();
		System.out.println("-----------------------");
		Mythod2();
		System.out.println("-----------------------");
	}
	/*
	 * ��ȡ�޲ι��캯��
	 */
	private void Mythod1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO �Զ����ɵķ������
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		Object o = class1.newInstance();	
	}
	/*
	 * ��ȡ�вι��캯��
	 */
	private void Mythod2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO �Զ����ɵķ������
		String name = "reflexDemo.Person";
		Class class2 = Class.forName(name);
		Constructor constructor = class2.getConstructor(String.class,int.class);
		Object o = constructor.newInstance("С��",18);
		}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		new ReFlexDemo2();
	}
}
