package collectionDemo;

import java.util.LinkedList;

/**
 * ��ӡ�����򼯺�
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��22������10:58:37
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
