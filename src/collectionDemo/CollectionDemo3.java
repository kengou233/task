package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.management.RuntimeErrorException;

/**
 * ��ȥ�����е�Ԫ���е��ظ�Ԫ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��23������1:14:17
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		ArrayList arrayLis= new ArrayList();
		arrayLis.add(new Person1("С��",18));
		arrayLis.add(new Person1("С��",21));
		arrayLis.add(new Person1("С��",18));
		arrayLis.add(new Person1("С��",20));
		System.out.println("ԭ���ϣ�");
		for(Iterator it=arrayLis.iterator();it.hasNext();)
		{
			Person1 p = (Person1)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
		System.out.println("------------------------");
		ArrayList bArrayList=mythod(arrayLis);
		System.out.println("�޸ĺ󼯺ϣ�");
		for(Iterator it=bArrayList.iterator();it.hasNext();)
		{
			Person1 p = (Person1)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
	}
	
	public static ArrayList mythod(ArrayList a) {
		ArrayList bArrayList=new ArrayList();
		for(Iterator it=a.iterator();it.hasNext();)
		{
			Object object=it.next();
			if(!bArrayList.contains(object))
				bArrayList.add(object);
		}
		return bArrayList;
	}
}
class Person1 implements Comparable{
	private String name;
	private int age;
	public Person1() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO �Զ����ɵķ������
		return this.name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO �Զ����ɵķ������
		if(!(obj instanceof Person1))
			return false;
		Person1 p =(Person1)obj;
		return this.getName().equals(p.getName())&&this.age==p.age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		if(!(o instanceof Person1))
			throw new RuntimeException("�ö�����ѧ����");
		Person1 p =(Person1)o;
		if(this.age<p.age)
			return 1;
		if(this.age==p.age)
		{
			return this.name.compareTo(p.name);
		}
		return -1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
