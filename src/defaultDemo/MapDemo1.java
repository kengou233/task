package defaultDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��25������11:14:52
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,String>aMap=new 	HashMap<String,String>();
		aMap.put("01","С��");
		aMap.put("02","С��");
		aMap.put("03","С��");
		aMap.put("04","С��");
//		System.out.println(aMap.containsKey("02"));
//		System.out.println(aMap.get("02"));
//		System.out.println(aMap);
		
		Collection<String>bCollection=aMap.values();
		System.out.println(bCollection);
		//����
		//����һ ���ü�������
//		Set<String>mapSet=aMap.keySet();
//		Iterator<String> it=mapSet.iterator();
//		while(it.hasNext()) 
//		{
//			String key = it.next();
//			String value=aMap.get(key);
//			System.out.println(key+"\t"+value);
//		}
		//������ ʵ��map.entry�ӿ�
		Set<Map.Entry<String,String>>mapset=aMap.entrySet();
		for(Iterator<Map.Entry<String,String>>it =mapset.iterator();it.hasNext();)
		{
			Map.Entry<String,String>set=it.next();
			System.out.println(set.getKey()+"\t"+set.getValue());
		}
	}
}
