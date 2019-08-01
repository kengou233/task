package testDemo;

import java.util.*;

/**
 * 集合嵌套输出
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月28日下午12:58:14
 */
public class MapTest2 {
	public static void main(String[] args) {
		//形式一
		/*
		ArrayList<Student> aList = new ArrayList<Student>();
		aList.add(new Student("小朱",001));
		aList.add(new Student("小李",002));
		aList.add(new Student("小彭",003));
		ArrayList<Student>bList=new ArrayList<Student>();
		bList.add(new Student("xiaozhu",001));
		bList.add(new Student("xiaoli",002));
		bList.add(new Student("xiaopeng",003));
		HashMap<String,ArrayList<Student>> map=new HashMap<String, ArrayList<Student>>();
		map.put("a",aList);
		map.put("b",bList);
		Set<String> set = map.keySet();
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			ArrayList<Student> value=map.get(key);
			Mythod(value);
		}
		*/
		//形式二
		HashMap<String,String> jichu = new HashMap<String, String>();
		jichu.put("001","小朱");
		jichu.put("002","小李");
		jichu.put("003","小彭");
		HashMap<String,String> jiuye = new HashMap<String, String>();
		jiuye.put("001","xiaozhu");
		jiuye.put("002","xiaoli");
		jiuye.put("003","xiaopeng");
		HashMap<String,HashMap<String,String>>summary=new HashMap<String, HashMap<String, String>>();
		summary.put("a",jichu);
		summary.put("b",jiuye);
		Set<String>set=summary.keySet();
		for(Iterator<String> it = set.iterator();it.hasNext();) 
		{
			String key=it.next();
			HashMap<String,String> value=summary.get(key);
			Mythod(value);
		}
	
	}
	/*
	public static void Mythod(ArrayList<Student> a)
	{
		for(int i=0;i<a.size();i++)
		{
			Student value=a.get(i);
			System.out.println(value.getId()+"..."+value.getName());
		}
	}
	*/
	public static void Mythod(HashMap<String,String> ha)
	{
		Set<Map.Entry<String,String>>set=ha.entrySet();
		Iterator<Map.Entry<String,String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String>map=it.next();
			String key=map.getKey();
			String value=map.getValue();
			System.out.println(key+"..."+value);
		}
	}
}
