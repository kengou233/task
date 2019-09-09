package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ��ȡ�����ķ���
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��3������3:51:36
 */
public class ReFlexDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("reflexDemo.Person");
		Constructor constructor = class1.getConstructor(String.class,int.class);
		Person p = (Person)constructor.newInstance("С��",18);
		
		/*
		 * ��ȡ���й�������(��������)
		 */
		System.out.println("-----------------------");
		Method[] method1 = class1.getMethods();
		for(Method a:method1)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------");
		/*
		 * ��ȡ���з���(ֻ��������)
		 */
		System.out.println("-----------------------");
		Method[] method2 = class1.getDeclaredMethods();
		for(Method a:method2)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------");
		/*
		 * ��ȡ�޲η���
		 */
		System.out.println("-----------------------");
		Method method3 = class1.getMethod("show",null);
		method3.invoke(p,null);
		System.out.println("-----------------------");
		/*
		 * ��ȡ�вη������޸�����ֵ
		 */
		System.out.println("-----------------------");
		Method method4 = class1.getMethod("paramMethod",String.class,int.class);
		method4.invoke(p,"С��",20);
		System.out.println("-----------------------");
		/*
		 * ��ȡ�޲�   ��̬������˽�з���
		 */
		System.out.println("-----------------------");
		
		Method method5 = class1.getMethod("staticMethod",null);
		method5.invoke(p,null);
		
		Method method6 = class1.getDeclaredMethod("privateMethod",null);
		method6.setAccessible(true);
		method6.invoke(p,null);
		
		System.out.println("-----------------------");
		/*
		 * �ܽ� Ҫ���ȡ˽�з��� ��Ҫʹ�� (getDeclaredmethod)����
		 * ���� Ҫ������Ȩ������Ϊ true
		 */
	}
}
