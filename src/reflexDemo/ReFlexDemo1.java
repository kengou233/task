package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * ��ȡ����� ����ȡ�乹�췽��
 * ��ν��������   ���ʵ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��3������10:40:16
 */
public class ReFlexDemo1 {
	public ReFlexDemo1() throws ClassNotFoundException {
		super();
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("-----------------------");
		Mythod1();
		System.out.println("-----------------------");
		Mythod2();
		System.out.println("-----------------------");
		Mythod3();
		System.out.println("-----------------------");
		Mythod4();
	}
	/*
	 * �����ǻ�ȡ���������ַ���
	 */
	private void Mythod1() {
		// TODO �Զ����ɵķ������
		Person p1 = new Person();
		Class class1  = p1.getClass();
		
		Person p2 = new Person();
		Class class2  = p2.getClass();
		
		System.out.println(class1==class2);
		System.out.println(class1);
	}
	private void Mythod2() {
		// TODO �Զ����ɵķ������
		/*
		 * �÷������ᵼ�¾�̬���Գ�ʼ��
		 */
		Class class1 = Person.class;
		Class class2 = Person.class;
		
		System.out.println(class1==class2);
		System.out.println(class1);
	}
	private void Mythod3() {
		// TODO �Զ����ɵķ������
		String name = "reflexDemo.Person";
		Class class1;
		try {
			class1 = Class.forName(name);
			System.out.println(class1);
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	private void Mythod4() throws ClassNotFoundException {
		// TODO �Զ����ɵķ������
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		/*
		 * ��ȡ����� ���� ���캯�� ��Ϊ˽�����������Ȩ�� ����޸���ֵ
		 */
		Constructor[] constructor = class1.getConstructors();
		for(Constructor c:constructor)
		{
			System.out.println(c);
		}
		/*
		 * ��ȡ���캯���Ĳ�������
		 */
		Class[] class2 = constructor[0].getParameterTypes();
		for(Class c:class2)
		{
			System.out.println(c);
		}
		int a = constructor[0].getModifiers();
		System.out.println(Modifier.toString(a));
	}
	public static void main(String[] args) throws ClassNotFoundException {
		new ReFlexDemo1();
	}	
}


