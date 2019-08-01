package testDemo;

import java.util.*;

/**
 * ��һ���ַ�����  ÿ���ַ���Ӧ�ĸ��� д��map������
 * ����
 * 1.���ַ���תΪ�ַ�����
 * 2.���ַ������е�ֵ��Ϊ�� ���Ҷ�Ӧ��ֵ
 * 3.�������Ϊnull��ֵ+1 ѭ������
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��27������10:18:50
 */
public class MapTest1 {
	public static void main(String[] args) {
		String aString ="abcdaecd";
		System.out.println(mythed(aString));
	}
	public static String mythed(String str) {
		char[] a = str.toCharArray();
		TreeMap<Character,Integer> map = new TreeMap<Character, Integer>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			Integer value = map.get(a[i]);
			if(!(map.get(a[i])==null))
				count=value;
			count++;
			map.put(a[i],count);
			/*
			 if(value==null)
			 	map.put(a[i],1);
			 else
			 {
			 	value+=1;
			 	map.put(a[i],value);
			 }
			*/
		}
		StringBuilder sbBuilder=new StringBuilder();
		Set<Map.Entry<Character,Integer>>set=map.entrySet();
		for(Iterator<Map.Entry<Character,Integer>> it=set.iterator();it.hasNext();)
		{
			Map.Entry<Character,Integer>ok=it.next();
			Character key=ok.getKey();
			Integer value=ok.getValue();
			sbBuilder.append(key+"("+value+")");
		}
		return sbBuilder.toString();
	}
}
