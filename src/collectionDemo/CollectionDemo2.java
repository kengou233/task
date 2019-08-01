package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 除去集合中的重复元素
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月23日上午11:15:39
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		ArrayList arrayLis= new ArrayList();
		arrayLis.add("01");
		arrayLis.add("02");
		arrayLis.add("01");
		arrayLis.add("03");
		System.out.println("原集合：");
		for(Iterator it=arrayLis.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}
		System.out.println("------------------------");
		ArrayList bArrayList=mythod(arrayLis);
		System.out.println("修改后集合：");
		for(Iterator it=bArrayList.iterator();it.hasNext();)
		{
			System.out.println(it.next());
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
