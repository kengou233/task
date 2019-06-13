package defaultDemo;
import java.util.*;
/**
   *   ���� �ʾ���Ϊ��װ��
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��6��3������10:00:25
 */
public class Student {
	private String name; // ����
	private String sex; // �Ա�
	private int age; // ����
	private int score; // �ɼ�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null)
			System.out.println("������������Ĵ�����");
		else
			this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (sex == "��" || sex == "Ů")
			this.sex = sex;
		else
			this.sex = "��";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100)
			this.age = 18;
		else
			this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student() {

	}

	public Student(String name, String sex, int age, int score) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}

	public void Study() {
		System.out.println("ѧϰʹ�ҿ��֣�һ�첻ѧ�һ������ܣ�");
	}

	public void Exam() {
		System.out.println("����ƨ����ɶҲûѧ�ῼʲô��һ���ʺš�");
	}

	public void monologue() {
		System.out.println("��˵��ɶ���Ҿ����㡣");
	}

	public static void main(String[] args) {
		Student stu1 = new Student("����", "��", 18, 98);
		System.out.printf("�ҽ�%s���Ա�%s������%d�꣬������Կ���%d��\n", stu1.name, stu1.sex, stu1.age, stu1.score);
		Student stu2 = new Student("����", "��", 18, 99);
		System.out.printf("�ҽ�%s���Ա�%s������%d�꣬������Կ���%d��\n", stu2.name, stu2.sex, stu2.age, stu2.score);
		Student stu3 = new Student();
		Scanner input = new Scanner(System.in);
		stu3.setName(input.next());
		stu3.setSex(input.next());
		stu3.setAge(input.nextInt());
		stu3.setScore(input.nextInt());
		System.out.printf("�ҽ�%s���Ա�%s������%d�꣬������Կ���%d��\n", stu3.name, stu3.sex, stu3.age, stu3.score);
		System.out.println();
		stu1.Study();
		stu2.Exam();
		stu3.monologue();
	}
}