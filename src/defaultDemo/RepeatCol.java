package defaultDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * ���Ͽ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��20������11:06:17
 */
public class RepeatCol {
	public static void main(String[] args) {
		method();
//		method1();
	}
	public static void method() {
		ArrayList aList = new ArrayList();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");//���
		print(aList);
//		print(aList.size());//��С
		aList.remove("d");
//		aList.clear();//���
		print(aList);
		print(aList.contains("a"));
		Vector v= new Vector();
		v.add("e");
		v.add("f");
		v.add("g");
		v.add("h");
//		����Ԫ�صķ���
//		����һ
//		for(Iterator it=aList.iterator();it.hasNext();) {
//			print(it.next());
//		}
//		������
//		for(int i=0;i<aList.size();i++) {
//			print(aList.get(i));
//		}
//		������
//		Iterator it = aList.iterator();
//		while(it.hasNext()) {
//			print(it.next());
//		}
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			print(en.nextElement());
		}
	}
	public static void method1() {
		ArrayList aList = new ArrayList();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		ArrayList bList = new ArrayList();
		bList.add("a");
		bList.add("b");
		bList.add("e");
		bList.add("f");
		aList.retainAll(bList);//����ָ���б��а�����Ԫ��
		aList.removeAll(bList);//ɾ��ָ���б��а�����Ԫ��
		print(aList);	
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
