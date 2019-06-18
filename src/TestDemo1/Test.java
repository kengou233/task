package TestDemo1;

import java.util.Scanner;

/**
 * �������ʵ��
 * 
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��18������1:02:29
 */
public class Test {
	public static void main(String[] args) {
		Employe staff[] = { 
				new SalariedEmployee("����", 7, 30000),
				new HourlyEmployee("С��",8,161,100),
				new SalesEmployee("����",6,25000,0.3),
				new BasePlusSalesEmploye("С��",7,10000,0.3,10000)
		};
		Scanner input = new Scanner(System.in);
		System.out.print("������Ա�� �����˼����£�");
		int month = input.nextInt();
		printArr(staff, month);
	}

	public static void printArr(Employe Staff[], int month) {
		System.out.println("����" + "\t" + "����" + "\t" + "����");
		for (int i = 0; i < Staff.length; i++) {
			System.out.println(Staff[i].getName() + "\t" + Staff[i].getBirthday() + "��\t" + Staff[i].getSalary(month));
		}
	}
}

//��ʽԱ�� ���ʱ�
class SalariedEmployee extends Employe {
	private int monSalary;// ��н

	public SalariedEmployee() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public SalariedEmployee(String name, int birthday, int monSalary) {
		super(name, birthday);
		this.monSalary = monSalary;
	}

	@Override
	public int getSalary(int month) {
		// TODO �Զ����ɵķ������
		int Salary = super.getSalary(month);
		Salary += monSalary * month;
		return Salary;
	}

	public int getMonSalary() {
		return monSalary;
	}

	public void setMonSalary(int monSalary) {
		this.monSalary = monSalary;
	}

}

//Сʱ�� ���ʱ�
class HourlyEmployee extends Employe {
	private int hour;// ����Сʱ
	private int hourSalary;// Сʱ��

	public HourlyEmployee() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public HourlyEmployee(String name, int birthday, int hour, int hourSalary) {
		super(name, birthday);
		this.hour = hour;
		this.hourSalary = hourSalary;
	}

	@Override
	public int getSalary(int month) {
		// TODO �Զ����ɵķ������
		int Salary = super.getSalary(month);
		if(hour<=160)
			Salary+=hour*hourSalary;
		else {
			Salary+=160*hourSalary;
			hour-=160;
			Salary+=(hour*hourSalary)*1.5;
			Salary*=month;
		}
		return Salary;
	}

	public int getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
}

//����Ա�� ���ʱ�
class SalesEmployee extends Employe {
	private int Salesvolume;// ���۶�
	private double Salesrate;// ������
	
	public SalesEmployee() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public SalesEmployee(String name, int birthday, int salesvolume, Double salesrate) {
		super(name, birthday);
		Salesvolume = salesvolume;
		Salesrate = salesrate;
	}
	
	@Override
	public int getSalary(int month) {
		// TODO �Զ����ɵķ������
		int Salary =super.getSalary(month);
		Salary+=(int)Salesvolume*Salesrate*month;
		return Salary;
	}

	public double getSalesrate() {
		return Salesrate;
	}

	public void setSalesrate(int salesrate) {
		Salesrate = salesrate;
	}

	public int getSalesvolume() {
		return Salesvolume;
	}

	public void setSalesvolume(int salesvolume) {
		Salesvolume = salesvolume;
	}

}

//��ʽ����Ա�� ���ʱ�
class BasePlusSalesEmploye extends SalesEmployee {
	private int SalesSalary;
	
	public BasePlusSalesEmploye() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public BasePlusSalesEmploye(String name, int birthday, int salesvolume, Double salesrate, int salesSalary) {
		super(name, birthday, salesvolume, salesrate);
		SalesSalary = salesSalary;
	}
	

	@Override
	public int getSalary(int month) {
		// TODO �Զ����ɵķ������
		int Salary= super.getSalary(month);
		Salary+=month*SalesSalary;
		Salary+=month*(getSalesrate()*getSalesvolume());
		return Salary;
	}

	public int getSalesSalary() {
		return SalesSalary;
	}

	public void setSalesSalary(int salesSalary) {
		SalesSalary = salesSalary;
	}
}
