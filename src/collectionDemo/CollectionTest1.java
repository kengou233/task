package collectionDemo;

import java.util.Scanner;

/**
 *实践
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月2日下午12:34:40
 */
public class CollectionTest1 {
	public static void main(String[] args) {
		Contacts c = new Contacts();
		c.showMenue();
	}
}
class Contacts{
	Person[] ps=new Person[10];//用于存储联系人
	int count;//记录存储联系人的个数
	Scanner sc=new Scanner(System.in);
	
	public void showMenue(){
		init();
		int select;
		do{
			System.out.println("=========================");
			System.out.println("1. 查询所有联系人    2.根据下标查询  3.增加联系人 ");
			System.out.println("4.根据id(下标)修改联系人信息  5.根据id(下标)删除联系人 6.删除所有的联系人  ");
			System.out.println("7.退出");
			System.out.println("请输入您的操作：");
			select= sc.nextInt();
			switch(select){
				case 1:
					//查询所有联系人
					queryAll();
					break;
				case 2:
					queryPersonById();
					break;
				case 3:
					addPerson();
					break;
				case 4:
					updatePerson();
					break;
				case 5:
					
					break;
				case 6:
					//删除所有的联系人
					removeAll();
					break;
				case 7:
					//退出
					System.out.println("谢谢本次使用！");
					System.exit(0);
					break;
				default :System.out.println("您的输入有误，请重新输入！");break;
			}
		}while(select!=7);
	}
	
	//初始化数据
	public void init(){
		ps[0]=new Person("zhangsan",19,false,"北京");
		ps[1]=new Person("李四",20,false,"北京");
		ps[2]=new Person("李四",20,false,"北京");
		count=3;
	}
	//查询所有联系人
	public void queryAll(){
		for(int i=0;i<count;i++){
			System.out.println("姓名："+ps[i].name+" 年龄："+ps[i].age+" 地址："+ps[i].address);
		}
	} 
	//根据id(下标)查询联系人
	public void queryPersonById(){
		System.out.println("请输入查询的id:");
		
		int id=sc.nextInt();
		if(id<0||id>=count){
			System.out.println("输入有误！");
		}else{
			Person p=ps[id];
			System.out.println("姓名："+p.name+" 年龄："+p.age+" 地址："+p.address);
		}
	}
	//增加联系人
	public void addPerson(){
		System.out.println("请输入联系人姓名：");
		String name=sc.next();
		System.out.println("请输入联系人年龄：");
		int age=sc.nextInt();
		System.out.println("请输入联系人性别：");
		boolean s=sc.nextBoolean();
		System.out.println("请输入联系人地址：");
		String addr=sc.next();
		
		Person p=new Person(name,age,s,addr);
		ps[count]=p;
		count++;
	}
	//根据id(下标)修改联系人信息
	public void updatePerson(){
		System.out.println("请输入修改的id:");
		int id=sc.nextInt();
		
		System.out.println("请输入联系人姓名：");
		String name=sc.next();
		System.out.println("请输入联系人年龄：");
		int age=sc.nextInt();
		System.out.println("请输入联系人性别：");
		boolean s=sc.nextBoolean();
		System.out.println("请输入联系人地址：");
		String addr=sc.next();
		
		ps[id]=new Person(name,age,s,addr);
	}
	//根据id(下标)删除联系人
	//清空联系人
	public void removeAll(){
		for(int i=0;i<count;i++){
			ps[i]=null;
		}
		count=0;
	}
}
//联系人类:
class Person{
	String name;//联系人姓名
	int age;
	boolean sex;
	String address;
	public Person() {}
	public Person(String name, int age, boolean sex, String address) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
}