package collectionDemo;

import java.util.ArrayList;

/**
 * �ü���дһ��Stringbuffer��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��2������12:38:31
 */
public class CollectionTest2 {
	
}
class MyStringBuffer{
	ArrayList aList;
	
	public MyStringBuffer() {
		// TODO �Զ����ɵĹ��캯�����
		aList = new ArrayList();	
	}
	public MyStringBuffer(String str) {
		// TODO �Զ����ɵĹ��캯����� 
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