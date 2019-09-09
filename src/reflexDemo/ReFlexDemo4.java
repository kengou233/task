package reflexDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取类对象的方法
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月3日下午3:51:36
 */
public class ReFlexDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("reflexDemo.Person");
		Constructor constructor = class1.getConstructor(String.class,int.class);
		Person p = (Person)constructor.newInstance("小明",18);
		
		/*
		 * 获取所有公共方法(包括父类)
		 */
		System.out.println("-----------------------");
		Method[] method1 = class1.getMethods();
		for(Method a:method1)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------");
		/*
		 * 获取所有方法(只包括本类)
		 */
		System.out.println("-----------------------");
		Method[] method2 = class1.getDeclaredMethods();
		for(Method a:method2)
		{
			System.out.println(a);
		}
		System.out.println("-----------------------");
		/*
		 * 获取无参方法
		 */
		System.out.println("-----------------------");
		Method method3 = class1.getMethod("show",null);
		method3.invoke(p,null);
		System.out.println("-----------------------");
		/*
		 * 获取有参方法并修改其数值
		 */
		System.out.println("-----------------------");
		Method method4 = class1.getMethod("paramMethod",String.class,int.class);
		method4.invoke(p,"小张",20);
		System.out.println("-----------------------");
		/*
		 * 获取无参   静态方法和私有方法
		 */
		System.out.println("-----------------------");
		
		Method method5 = class1.getMethod("staticMethod",null);
		method5.invoke(p,null);
		
		Method method6 = class1.getDeclaredMethod("privateMethod",null);
		method6.setAccessible(true);
		method6.invoke(p,null);
		
		System.out.println("-----------------------");
		/*
		 * 总结 要想获取私有方法 需要使用 (getDeclaredmethod)方法
		 * 并且 要将访问权限设置为 true
		 */
	}
}
