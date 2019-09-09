package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 获取类对象 并获取其构造方法
 * 所谓类对象就是   类的实例化
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月3日上午10:40:16
 */
public class ReFlexDemo1 {
	public ReFlexDemo1() throws ClassNotFoundException {
		super();
		// TODO 自动生成的构造函数存根
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
	 * 以下是获取类对象的三种方法
	 */
	private void Mythod1() {
		// TODO 自动生成的方法存根
		Person p1 = new Person();
		Class class1  = p1.getClass();
		
		Person p2 = new Person();
		Class class2  = p2.getClass();
		
		System.out.println(class1==class2);
		System.out.println(class1);
	}
	private void Mythod2() {
		// TODO 自动生成的方法存根
		/*
		 * 该方法不会导致静态属性初始化
		 */
		Class class1 = Person.class;
		Class class2 = Person.class;
		
		System.out.println(class1==class2);
		System.out.println(class1);
	}
	private void Mythod3() {
		// TODO 自动生成的方法存根
		String name = "reflexDemo.Person";
		Class class1;
		try {
			class1 = Class.forName(name);
			System.out.println(class1);
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	private void Mythod4() throws ClassNotFoundException {
		// TODO 自动生成的方法存根
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		/*
		 * 获取类对象 所有 构造函数 若为私有设置其访问权限 便可修改其值
		 */
		Constructor[] constructor = class1.getConstructors();
		for(Constructor c:constructor)
		{
			System.out.println(c);
		}
		/*
		 * 获取构造函数的参数类型
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


