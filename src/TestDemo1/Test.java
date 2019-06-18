package TestDemo1;

import java.util.Scanner;

/**
 * 面向对象实践
 * 
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月18日下午1:02:29
 */
public class Test {
	public static void main(String[] args) {
		Employe staff[] = { 
				new SalariedEmployee("雷伊", 7, 30000),
				new HourlyEmployee("小明",8,161,100),
				new SalesEmployee("盖亚",6,25000,0.3),
				new BasePlusSalesEmploye("小朱",7,10000,0.3,10000)
		};
		Scanner input = new Scanner(System.in);
		System.out.print("请输入员工 工作了几个月：");
		int month = input.nextInt();
		printArr(staff, month);
	}

	public static void printArr(Employe Staff[], int month) {
		System.out.println("姓名" + "\t" + "生日" + "\t" + "工资");
		for (int i = 0; i < Staff.length; i++) {
			System.out.println(Staff[i].getName() + "\t" + Staff[i].getBirthday() + "月\t" + Staff[i].getSalary(month));
		}
	}
}

//正式员工 工资表
class SalariedEmployee extends Employe {
	private int monSalary;// 月薪

	public SalariedEmployee() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public SalariedEmployee(String name, int birthday, int monSalary) {
		super(name, birthday);
		this.monSalary = monSalary;
	}

	@Override
	public int getSalary(int month) {
		// TODO 自动生成的方法存根
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

//小时工 工资表
class HourlyEmployee extends Employe {
	private int hour;// 工作小时
	private int hourSalary;// 小时费

	public HourlyEmployee() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public HourlyEmployee(String name, int birthday, int hour, int hourSalary) {
		super(name, birthday);
		this.hour = hour;
		this.hourSalary = hourSalary;
	}

	@Override
	public int getSalary(int month) {
		// TODO 自动生成的方法存根
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

//销售员工 工资表
class SalesEmployee extends Employe {
	private int Salesvolume;// 销售额
	private double Salesrate;// 销售率
	
	public SalesEmployee() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public SalesEmployee(String name, int birthday, int salesvolume, Double salesrate) {
		super(name, birthday);
		Salesvolume = salesvolume;
		Salesrate = salesrate;
	}
	
	@Override
	public int getSalary(int month) {
		// TODO 自动生成的方法存根
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

//正式销售员工 工资表
class BasePlusSalesEmploye extends SalesEmployee {
	private int SalesSalary;
	
	public BasePlusSalesEmploye() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BasePlusSalesEmploye(String name, int birthday, int salesvolume, Double salesrate, int salesSalary) {
		super(name, birthday, salesvolume, salesrate);
		SalesSalary = salesSalary;
	}
	

	@Override
	public int getSalary(int month) {
		// TODO 自动生成的方法存根
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
