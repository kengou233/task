package collectionDemo;

import java.util.*;

/**
 * 使用set集合 除去集合中元素的重复元素
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月23日下午8:27:46
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person1("小明",18));
		hs.add(new Person1("小朱",21));
		hs.add(new Person1("小明",18));
		hs.add(new Person1("小彭",20));
		System.out.println("原集合：");
		for(Iterator it=hs.iterator();it.hasNext();)
		{
			Person1 p = (Person1)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
		System.out.println("------------------------");
//		HashSet bhs=mythod(hs);
//		System.out.println("修改后集合：");
//		for(Iterator it=bhs.iterator();it.hasNext();)
//		{
//			Person1 p = (Person1)it.next();
//			System.out.println(p.getName()+"---"+p.getAge());
//		}
	}
//	public static HashSet mythod(HashSet a) {
//		HashSet bHashSet=new HashSet();
//		for(Iterator it=a.iterator();it.hasNext();)
//		{
//			Object object=it.next();
//			if(!bHashSet.contains(object))
//				bHashSet.add(object);
//		}
//		return bHashSet;
//	}
}
