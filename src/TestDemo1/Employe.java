package TestDemo1;

/**
 * Ա����
 * @author �����ˣ�����
 * @date ����ʱ�䣺2019��6��18������1:30:00
 */
public class Employe {
	private String name;
	private int birthday;

	public Employe() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Employe(String name, int birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	// ��õĹ���
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
