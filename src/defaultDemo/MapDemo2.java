package defaultDemo;

import java.util.*;

/**
 * Map����ʵ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��26������1:05:32
 */
public class MapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student1,String> aMap= new TreeMap<Student1, String>(new Stusort());
		aMap.put(new Student1("С��",19),"�Ϻ�");
		aMap.put(new Student1("С��",18),"����");
		aMap.put(new Student1("С��",20),"�Ͼ�");
		aMap.put(new Student1("С��",18),"����");
//		Set<Student1>set=aMap.keySet();
//		Iterator<Student1> it =set.iterator();
//		while(it.hasNext())
//		{
//			Student1 key=it.next();
//			String value=aMap.get(key);
//			System.out.println(key.getName()+"\t"+key.getAge()+"\t"+value);
//		}
		Set<Map.Entry<Student1,String>> set=aMap.entrySet();
		Iterator<Map.Entry<Student1,String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Student1,String>map=it.next();
			System.out.println(map.getKey().getName()+"\t"+map.getKey().getAge()+"\t"+map.getValue());
			
		}
	}
}
class Student1 implements Comparable<Student1>
{
	private String name;
	private int age;
	public Student1() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO �Զ����ɵķ������
		return name.hashCode()+age*3;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO �Զ����ɵķ������
		if(!(obj instanceof Student1))
			throw new ClassCastException("���Ͳ�ƥ�䣬���������룡");
		Student1 s = (Student1)obj;
		return this.name.equals(s.name)&&this.age==s.age;
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
	@Override
	public int compareTo(Student1 o) {
		int num=new Integer((this.age)).compareTo(new Integer(o.age));
		if(num==0)
		{
			return this.name.compareTo(o.name);
		}
		return num;
	}

}
class Stusort implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO �Զ����ɵķ������
		int num=o1.getName().compareTo(o2.getName());
		if(num==0)
			return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
		return num;
	}

	
}