package reflexDemo;

import java.lang.reflect.Field;

/**
 * ��ȡ����������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��3������2:52:24
 */
public class ReFlexDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		String name = "reflexDemo.Person";
		Class class1 = Class.forName(name);
		Person p = (Person) class1.newInstance();
		/*
		 * ��ȡָ������
		 */
		System.out.println("-----------------------");
		Field field = class1.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println(field.getName());
		
		field.set(p,"С��");
		p.show();
		
		/*
		 * ����������ȡ�����Ե���ֵ
		 */
		Object o = field.get(p);
		System.out.println(o);
		
		System.out.println("-----------------------");
		/*
		 * ��ȡȫ������
		 */
		System.out.println("-----------------------");
		Field [] field1 = class1.getDeclaredFields();
		for(int i=0;i<field1.length;i++)
		{
			field1[i].setAccessible(true);//��Ȩ������Ϊ���Է����κ����͵�ֵ
			System.out.println(field1[i].getName()+"..."+i);
		}
		field1[0].set(p,"С��");
		field1[1].set(p,18);
		p.show();
		
		System.out.println("-----------------------");
		/*
		 * getField��getDeclaredField������
		 * �����������������ڻ�ȡ�ֶ�
		 * getField ֻ�ܻ�ȡ public�ģ������Ӹ���̳������ֶΡ�
		 * getDeclaredField ���Ի�ȡ�������е��ֶΣ�����private�ģ����ǲ��ܻ�ȡ�̳������ֶΡ� 
		 * (ע�� ����ֻ�ܻ�ȡ��private���ֶΣ��������ܷ��ʸ�private�ֶε�ֵ,���Ǽ���setAccessible(true))
		 */
	}
}
