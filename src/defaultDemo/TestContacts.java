package defaultDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �绰��
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��17������7:56:45
 */
public class TestContacts {
	public static void main(String[] args) {
		Contacts c = new Contacts();
		c.showMenue();
	}
}

// ͨѶ¼�ࣺ������ϵ��
class Contacts {
	public static Person[] ps = new Person[10];// ���ڴ洢��ϵ��
	int count;// ��¼�洢��ϵ�˵ĸ���
	Scanner sc = new Scanner(System.in);// ��Ա����

	public void showMenue() {
		init();
		int select;
		String chonice;
		do {
			System.out.println("=========================");
			System.out.println("1.��ѯ������ϵ����Ϣ  ");
			System.out.println("2.�����±��ѯ�M����Ϣ");
			System.out.println("3.������ϵ��");
			System.out.println("4.����id(�±�)�޸���ϵ����Ϣ");
			System.out.println("5.����id(�±�)ɾ����ϵ��");
			System.out.println("6.ɾ�����е���ϵ��  ");
			System.out.println("7.�˳�");
			System.out.println("���������Ĳ�����");
			select = sc.nextInt();
			switch (select) {
			case 1:
				// ��ѯ������ϵ��
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
				// ɾ�����е���ϵ��
				deleteAll();
				break;
			case 7:
				// �˳�
				System.out.println("лл����ʹ�ã�");
				System.exit(0);
				break;
			default:
				System.out.println("���������������������룡");
				break;
			}
			System.out.println("�Ƿ������y/n");
//				chonice=sc.next().charAt(0);
			chonice = sc.next();
		} while (!chonice.equals("n"));
	}

	// ��ʼ������
	public void init() {
		ps[0] = new Person("����", 19, "��", "����");
		ps[1] = new Person("����", 20, "��", "����");
		ps[2] = new Person("����", 20, "��", "����");
		count = 3;
	}

	// ��ѯ������ϵ��
	public void queryAll() {
		if (ps[0] == null)
			System.out.println("������ϵ�ˣ�");
		else {
			System.out.printf("����\t����\t�Ա�\tסַ\n");
			for (int i = 0; i < count; i++)
				System.out.println(ps[i].name + "\t" + ps[i].age + "\t" + ps[i].sex + "\t" + ps[i].address);
		}
	}

	// ����id(�±�)��ѯ��ϵ��
	public void queryPersonById() {
		// �ӿ���̨����һ���±�
		System.out.println("������һ���±꣺");
		int n = sc.nextInt();
		if (n < 0 || n >= count) {
			System.out.println("ݔ��������������룡");
		} else {
			System.out.println(ps[n].name + "\t" + ps[n].age + "\t" + ps[n].sex + "\t" + ps[n].address);
		}
	}

	// ������ϵ��
	public void addPerson() {
		// 1�����鳤�ȹ����� ����������
		if (count == ps.length) {
			ps = Arrays.copyOf(ps, ps.length * 2);
		} // ����

		System.out.println("���������֣�");
		String name = sc.next();// �ӿ���̨����һ���ַ���
		System.out.println("���������䣺");
		int age = sc.nextInt();
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("�������ַ��");
		String addr = sc.next();

		ps[count] = new Person(name, age, sex, addr);
		count++;
	}

	// ����id(�±�)�޸���ϵ����Ϣ
	public void updatePerson() {
		System.out.println("��ӿ���̨����һ���±꣺");
		int index = 0;
		do {
			index = sc.nextInt();
			if (index < 0 || index > count)
				System.out.println("���������룡");
		} while (index < 0);
		System.out.print("����������");
		ps[index].name = sc.next();
		System.out.print("����������");
		ps[index].age = sc.nextInt();
		System.out.print("�������Ա�");
		ps[index].sex = sc.next();
		System.out.print("�������ַ");
		ps[index].address = sc.next();
		System.out.println("�û���Ϣ���޸���ɣ�");
	}

	// ����id(�±�)ɾ����ϵ��
	public void removeAll() {
		int index = 0;
		System.out.println("��ӿ���̨����һ���±꣺");
		do {
			index = sc.nextInt();
			if (index < 0 || index > count)
				System.out.println("���������룡");
		} while (index < 0);
		for (int i = index; i < count; i++) {
			ps[i + 1] = ps[i];
		}
		ps[count - 1] = null;
		System.out.println("����ϵ����Ϣ��ɾ����");
		count--;
	}

	// �����ϵ��
	public void deleteAll() {
		for (int i = 0; i < count; i++) {
			ps[i] = null;
		}
		System.out.println("��ϵ������գ�");
	}
}

// ��ϵ��
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
