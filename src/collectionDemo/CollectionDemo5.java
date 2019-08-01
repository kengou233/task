package collectionDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 使用Treeset类 存储自定义对象
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月24日上午10:06:39
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Mycompare());
		t.add(new Person1("hh02",18));
		t.add(new Person1("hh04",21));
		t.add(new Person1("hh01",18));
		t.add(new Person1("hh03",20));
		for(Iterator it=t.iterator();it.hasNext();)
		{
			Person1 p=(Person1)it.next();
			System.out.println(p.getName()+"..."+p.getAge());
		}
	}
}
class Mycompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		Person1 p1 = (Person1)o1;
		Person1 p2 = (Person1)o2;
		int num= p1.getName().compareTo(p2.getName());
		if(num==0)
		{
			return new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));
		}
		return num;
	}
	
}