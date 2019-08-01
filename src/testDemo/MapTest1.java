package testDemo;

import java.util.*;

/**
 * 将一组字符串中  每个字符对应的个数 写入map集合中
 * 步骤
 * 1.将字符串转为字符数组
 * 2.将字符数组中的值作为键 查找对应的值
 * 3.如果返回为null则值+1 循环往复
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月27日下午10:18:50
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
