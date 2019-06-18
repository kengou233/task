package defaultDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 电话簿
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月17日下午7:56:45
 */
public class TestContacts {
	public static void main(String[] args) {
		Contacts c = new Contacts();
		c.showMenue();
	}
}

// 通讯录类：操作联系人
class Contacts {
	public static Person[] ps = new Person[10];// 用于存储联系人
	int count;// 记录存储联系人的个数
	Scanner sc = new Scanner(System.in);// 成员变量

	public void showMenue() {
		init();
		int select;
		String chonice;
		do {
			System.out.println("=========================");
			System.out.println("1.查询所有联系人信息  ");
			System.out.println("2.根据下标查询聯繫人信息");
			System.out.println("3.增加联系人");
			System.out.println("4.根据id(下标)修改联系人信息");
			System.out.println("5.根据id(下标)删除联系人");
			System.out.println("6.删除所有的联系人  ");
			System.out.println("7.退出");
			System.out.println("请输入您的操作：");
			select = sc.nextInt();
			switch (select) {
			case 1:
				// 查询所有联系人
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
				removeAll();
				break;
			case 6:
				// 删除所有的联系人
				deleteAll();
				break;
			case 7:
				// 退出
				System.out.println("谢谢本次使用！");
				System.exit(0);
				break;
			default:
				System.out.println("您的输入有误，请重新输入！");
				break;
			}
			System.out.println("是否继续？y/n");
//				chonice=sc.next().charAt(0);
			chonice = sc.next();
		} while (!chonice.equals("n"));
	}

	// 初始化数据
	public void init() {
		ps[0] = new Person("张三", 19, "男", "北京");
		ps[1] = new Person("李四", 20, "男", "北京");
		ps[2] = new Person("李四", 20, "男", "北京");
		count = 3;
	}

	// 查询所有联系人
	public void queryAll() {
		if (ps[0] == null)
			System.out.println("暂无联系人！");
		else {
			System.out.printf("姓名\t年龄\t性别\t住址\n");
			for (int i = 0; i < count; i++)
				System.out.println(ps[i].name + "\t" + ps[i].age + "\t" + ps[i].sex + "\t" + ps[i].address);
		}
	}

	// 根据id(下标)查询联系人
	public void queryPersonById() {
		// 从控制台输入一个下标
		System.out.println("请输入一个下标：");
		int n = sc.nextInt();
		if (n < 0 || n >= count) {
			System.out.println("輸入错误请重新输入！");
		} else {
			System.out.println(ps[n].name + "\t" + ps[n].age + "\t" + ps[n].sex + "\t" + ps[n].address);
		}
	}

	// 增加联系人
	public void addPerson() {
		// 1、数组长度够不够 不够：扩容
		if (count == ps.length) {
			ps = Arrays.copyOf(ps, ps.length * 2);
		} // 扩容

		System.out.println("请输入名字：");
		String name = sc.next();// 从控制台输入一个字符串
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入性别：");
		String sex = sc.next();
		System.out.println("请输入地址：");
		String addr = sc.next();

		ps[count] = new Person(name, age, sex, addr);
		count++;
	}

	// 根据id(下标)修改联系人信息
	public void updatePerson() {
		System.out.println("请从控制台输入一个下标：");
		int index = 0;
		do {
			index = sc.nextInt();
			if (index < 0 || index > count)
				System.out.println("请重新输入！");
		} while (index < 0);
		System.out.print("请输入姓名");
		ps[index].name = sc.next();
		System.out.print("请输入年龄");
		ps[index].age = sc.nextInt();
		System.out.print("请输入性别");
		ps[index].sex = sc.next();
		System.out.print("请输入地址");
		ps[index].address = sc.next();
		System.out.println("用户信息已修改完成！");
	}

	// 根据id(下标)删除联系人
	public void removeAll() {
		int index = 0;
		System.out.println("请从控制台输入一个下标：");
		do {
			index = sc.nextInt();
			if (index < 0 || index > count)
				System.out.println("请重新输入！");
		} while (index < 0);
		for (int i = index; i < count; i++) {
			ps[i + 1] = ps[i];
		}
		ps[count - 1] = null;
		System.out.println("该联系人信息已删除！");
		count--;
	}

	// 清空联系人
	public void deleteAll() {
		for (int i = 0; i < count; i++) {
			ps[i] = null;
		}
		System.out.println("联系人已清空！");
	}
}

// 联系人
class Person {
	String name;
	int age;
	String sex;
	String address;

	public Person() {
	}

	public Person(String name, int age, String sex, String address) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
}
