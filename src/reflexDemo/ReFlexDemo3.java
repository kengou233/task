package reflexDemo;

import java.lang.reflect.Field;

/**
 * 获取类对象的属性
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月3日下午2:52:24
 */
public class ReFlexDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		Person p = (Person) class1.newInstance();
		/*
		 * 获取指定属性
		 */
		System.out.println("-----------------------");
		Field field = class1.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println(field.getName());
		
		field.set(p,"小王");
		p.show();
		
		/*
		 * 以下用来获取该属性的数值
		 */
		Object o = field.get(p);
		System.out.println(o);
		
		System.out.println("-----------------------");
		/*
		 * 获取全部属性
		 */
		System.out.println("-----------------------");
		Field [] field1 = class1.getDeclaredFields();
		for(int i=0;i<field1.length;i++)
		{
			field1[i].setAccessible(true);//将权限设置为可以访问任何类型的值
			System.out.println(field1[i].getName()+"..."+i);
		}
		field1[0].set(p,"小李");
		field1[1].set(p,18);
		p.show();
		
		System.out.println("-----------------------");
		/*
		 * getField和getDeclaredField的区别
		 * 这两个方法都是用于获取字段
		 * getField 只能获取 public的，包括从父类继承来的字段。
		 * getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。 
		 * (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
		 */
	}
}
