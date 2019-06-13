package defaultDemo;
import java.util.*;
/**
   *   别问 问就是为了装逼
 * @author	 创建人：贺岩
 * @date   创建时间：2019年6月3日下午10:00:25
 */
public class Student {
	private String name; // 姓名
	private String sex; // 性别
	private int age; // 年龄
	private int score; // 成绩

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null)
			System.out.println("请重新输入你的大名！");
		else
			this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (sex == "男" || sex == "女")
			this.sex = sex;
		else
			this.sex = "男";
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
		System.out.println("学习使我快乐，一天不学我浑身难受！");
	}

	public void Exam() {
		System.out.println("考个屁啊，啥也没学会考什么，一个问号。");
	}

	public void monologue() {
		System.out.println("你说有啥招我就问你。");
	}

	public static void main(String[] args) {
		Student stu1 = new Student("雷伊", "男", 18, 98);
		System.out.printf("我叫%s，性别%s，今年%d岁，今个考试考了%d分\n", stu1.name, stu1.sex, stu1.age, stu1.score);
		Student stu2 = new Student("盖亚", "男", 18, 99);
		System.out.printf("我叫%s，性别%s，今年%d岁，今个考试考了%d分\n", stu2.name, stu2.sex, stu2.age, stu2.score);
		Student stu3 = new Student();
		Scanner input = new Scanner(System.in);
		stu3.setName(input.next());
		stu3.setSex(input.next());
		stu3.setAge(input.nextInt());
		stu3.setScore(input.nextInt());
		System.out.printf("我叫%s，性别%s，今年%d岁，今个考试考了%d分\n", stu3.name, stu3.sex, stu3.age, stu3.score);
		System.out.println();
		stu1.Study();
		stu2.Exam();
		stu3.monologue();
	}
}