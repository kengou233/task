package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取类对象的构造函数
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月3日下午12:25:16
 */
public class ReFlexDemo2 {
	
	public ReFlexDemo2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的构造函数存根
		System.out.println("-----------------------");
		Mythod1();
		System.out.println("-----------------------");
		Mythod2();
		System.out.println("-----------------------");
	}
	/*
	 * 获取无参构造函数
	 */
	private void Mythod1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO 自动生成的方法存根
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		Object o = class1.newInstance();	
	}
	/*
	 * 获取有参构造函数
	 */
	private void Mythod2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自动生成的方法存根
		String name = "reflexDemo.Person";
		Class class2 = Class.forName(name);
		Constructor constructor = class2.getConstructor(String.class,int.class);
		Object o = constructor.newInstance("小明",18);
		}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		new ReFlexDemo2();
	}
}
