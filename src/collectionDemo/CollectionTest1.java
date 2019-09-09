package collectionDemo;

import java.util.Scanner;

/**
 *ʵ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��2������12:34:40
 */
public class CollectionTest1 {
	public static void main(String[] args) {
		Contacts c = new Contacts();
		c.showMenue();
	}
}
class Contacts{
	Person[] ps=new Person[10];//���ڴ洢��ϵ��
	int count;//��¼�洢��ϵ�˵ĸ���
	Scanner sc=new Scanner(System.in);
	
	public void showMenue(){
		init();
		int select;
		do{
			System.out.println("=========================");
			System.out.println("1. ��ѯ������ϵ��    2.�����±��ѯ  3.������ϵ�� ");
			System.out.println("4.����id(�±�)�޸���ϵ����Ϣ  5.����id(�±�)ɾ����ϵ�� 6.ɾ�����е���ϵ��  ");
			System.out.println("7.�˳�");
			System.out.println("���������Ĳ�����");
			select= sc.nextInt();
			switch(select){
				case 1:
					//��ѯ������ϵ��
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
					//ɾ�����е���ϵ��
					removeAll();
					break;
				case 7:
					//�˳�
					System.out.println("лл����ʹ�ã�");
					System.exit(0);
					break;
				default :System.out.println("���������������������룡");break;
			}
		}while(select!=7);
	}
	
	//��ʼ������
	public void init(){
		ps[0]=new Person("zhangsan",19,false,"����");
		ps[1]=new Person("����",20,false,"����");
		ps[2]=new Person("����",20,false,"����");
		count=3;
	}
	//��ѯ������ϵ��
	public void queryAll(){
		for(int i=0;i<count;i++){
			System.out.println("������"+ps[i].name+" ���䣺"+ps[i].age+" ��ַ��"+ps[i].address);
		}
	} 
	//����id(�±�)��ѯ��ϵ��
	public void queryPersonById(){
		System.out.println("�������ѯ��id:");
		
		int id=sc.nextInt();
		if(id<0||id>=count){
			System.out.println("��������");
		}else{
			Person p=ps[id];
			System.out.println("������"+p.name+" ���䣺"+p.age+" ��ַ��"+p.address);
		}
	}
	//������ϵ��
	public void addPerson(){
		System.out.println("��������ϵ��������");
		String name=sc.next();
		System.out.println("��������ϵ�����䣺");
		int age=sc.nextInt();
		System.out.println("��������ϵ���Ա�");
		boolean s=sc.nextBoolean();
		System.out.println("��������ϵ�˵�ַ��");
		String addr=sc.next();
		
		Person p=new Person(name,age,s,addr);
		ps[count]=p;
		count++;
	}
	//����id(�±�)�޸���ϵ����Ϣ
	public void updatePerson(){
		System.out.println("�������޸ĵ�id:");
		int id=sc.nextInt();
		
		System.out.println("��������ϵ��������");
		String name=sc.next();
		System.out.println("��������ϵ�����䣺");
		int age=sc.nextInt();
		System.out.println("��������ϵ���Ա�");
		boolean s=sc.nextBoolean();
		System.out.println("��������ϵ�˵�ַ��");
		String addr=sc.next();
		
		ps[id]=new Person(name,age,s,addr);
	}
	//����id(�±�)ɾ����ϵ��
	//�����ϵ��
	public void removeAll(){
		for(int i=0;i<count;i++){
			ps[i]=null;
		}
		count=0;
	}
}
//��ϵ����:
class Person{
	String name;//��ϵ������
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