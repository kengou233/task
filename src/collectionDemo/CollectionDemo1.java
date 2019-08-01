package collectionDemo;

import java.util.LinkedList;

/**
 * 打印正序倒序集合
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月22日下午10:58:37
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		mythod();
	}
	public static void mythod() {
		LinkedList aList= new LinkedList();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		while(!aList.isEmpty())
		{
//			System.out.println(aList.removeFirst());
			System.out.println(aList.removeLast());
		}
	}
}
