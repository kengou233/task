package defaultDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月25日下午11:14:52
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,String>aMap=new 	HashMap<String,String>();
		aMap.put("01","小王");
		aMap.put("02","小李");
		aMap.put("03","小张");
		aMap.put("04","小朱");
//		System.out.println(aMap.containsKey("02"));
//		System.out.println(aMap.get("02"));
//		System.out.println(aMap);
		
		Collection<String>bCollection=aMap.values();
		System.out.println(bCollection);
		//遍历
		//方法一 利用键来遍历
//		Set<String>mapSet=aMap.keySet();
//		Iterator<String> it=mapSet.iterator();
//		while(it.hasNext()) 
//		{
//			String key = it.next();
//			String value=aMap.get(key);
//			System.out.println(key+"\t"+value);
//		}
		//方法二 实现map.entry接口
		Set<Map.Entry<String,String>>mapset=aMap.entrySet();
		for(Iterator<Map.Entry<String,String>>it =mapset.iterator();it.hasNext();)
		{
			Map.Entry<String,String>set=it.next();
			System.out.println(set.getKey()+"\t"+set.getValue());
		}
	}
}
