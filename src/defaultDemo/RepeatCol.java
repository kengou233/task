package defaultDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * 集合框架
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月20日下午11:06:17
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
		aList.add("d");//添加
		print(aList);
//		print(aList.size());//大小
		aList.remove("d");
//		aList.clear();//清除
		print(aList);
		print(aList.contains("a"));
		Vector v= new Vector();
		v.add("e");
		v.add("f");
		v.add("g");
		v.add("h");
//		查找元素的方法
//		方法一
//		for(Iterator it=aList.iterator();it.hasNext();) {
//			print(it.next());
//		}
//		方法二
//		for(int i=0;i<aList.size();i++) {
//			print(aList.get(i));
//		}
//		方法三
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
		aList.retainAll(bList);//保留指定列表中包含的元素
		aList.removeAll(bList);//删除指定列表中包含的元素
		print(aList);	
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
