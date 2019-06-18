package TestDemo1;

/**
 * 员工表
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月18日下午1:30:00
 */
public class Employe {
	private String name;
	private int birthday;

	public Employe() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Employe(String name, int birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	// 获得的工资
	public int getSalary(int month) {
		int Salary = 0;
		if (month>=birthday) {
			Salary += 100;
		}
		return Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

}
