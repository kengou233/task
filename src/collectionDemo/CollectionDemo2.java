package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ��ȥ�����е��ظ�Ԫ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��23������11:15:39
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		ArrayList arrayLis= new ArrayList();
		arrayLis.add("01");
		arrayLis.add("02");
		arrayLis.add("01");
		arrayLis.add("03");
		System.out.println("ԭ���ϣ�");
		for(Iterator it=arrayLis.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}
		System.out.println("------------------------");
		ArrayList bArrayList=mythod(arrayLis);
		System.out.println("�޸ĺ󼯺ϣ�");
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
