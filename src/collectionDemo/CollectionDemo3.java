package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.management.RuntimeErrorException;

/**
 * 除去集合中的元素中的重复元素
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月23日下午1:14:17
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		ArrayList arrayLis= new ArrayList();
		arrayLis.add(new Person1("小明",18));
		arrayLis.add(new Person1("小朱",21));
		arrayLis.add(new Person1("小明",18));
		arrayLis.add(new Person1("小彭",20));
		System.out.println("原集合：");
		for(Iterator it=arrayLis.iterator();it.hasNext();)
		{
			Person1 p = (Person1)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
		System.out.println("------------------------");
		ArrayList bArrayList=mythod(arrayLis);
		System.out.println("修改后集合：");
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
		// TODO 自动生成的构造函数存根
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
		return this.name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		if(!(obj instanceof Person1))
			return false;
		Person1 p =(Person1)obj;
		return this.getName().equals(p.getName())&&this.age==p.age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		if(!(o instanceof Person1))
			throw new RuntimeException("该对象不是学生类");
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
