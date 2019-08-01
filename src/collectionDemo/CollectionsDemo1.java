package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * 使用Collections工具
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月28日下午7:17:48
 */
public class CollectionsDemo1 {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("ab");
		aList.add("cd");
		aList.add("bdf");
//		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
//		String string=Collections.max(aList,new Myclass());
//		System.out.println(string);
//		System.out.println(Collections.binarySearch(aList,"aaa"));
//		System.out.println(aList);
//		int num=halfsearch(aList,"aaa");
//		System.out.println(num);
		Collections.reverse(aList);
		System.out.println(aList);
		Collections.reverseOrder(new Myclass());
	}
	//重写二分查找
	public static int halfsearch(ArrayList<String> a,String key/*,Comparator<String>Myclass*/) {
		int min=0;
		int max=a.size()-1;
		int mid;
		while(min<=max)
		{
			mid=(max+min)/2;
			String str=a.get(mid);
			int num=str.compareTo(key);
//			int num=Myclass.compare(str,key);
			if(num<0)
			{
				min=mid+1;
			}
			else if(num>0)
			{
				max=mid-1;
			}
			else 
				return mid;
		}
		return min;
	}

}
class Myclass implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO 自动生成的方法存根
			if(o1.length()>o2.length())
				return 1;
			if(o1.length()<o2.length())
				return -1;
		return o1.compareTo(o2); 
	}
	
}
