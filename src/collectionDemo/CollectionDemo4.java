package collectionDemo;

import java.util.*;

/**
 * ʹ��set���� ��ȥ������Ԫ�ص��ظ�Ԫ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��23������8:27:46
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person1("С��",18));
		hs.add(new Person1("С��",21));
		hs.add(new Person1("С��",18));
		hs.add(new Person1("С��",20));
		System.out.println("ԭ���ϣ�");
		for(Iterator it=hs.iterator();it.hasNext();)
		{
			Person1 p = (Person1)it.next();
			System.out.println(p.getName()+"---"+p.getAge());
		}
		System.out.println("------------------------");
//		HashSet bhs=mythod(hs);
//		System.out.println("�޸ĺ󼯺ϣ�");
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
