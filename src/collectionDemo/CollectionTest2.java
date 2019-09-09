package collectionDemo;

import java.util.ArrayList;

/**
 * 用集合写一个Stringbuffer类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月2日下午12:38:31
 */
public class CollectionTest2 {
	
}
class MyStringBuffer{
	ArrayList aList;
	
	public MyStringBuffer() {
		// TODO 自动生成的构造函数存根
		aList = new ArrayList();	
	}
	public MyStringBuffer(String str) {
		// TODO 自动生成的构造函数存根 
		if(str==null)
			return;
		char [] a=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			char b=a[i];
			aList.add(b);
		}
	}
}