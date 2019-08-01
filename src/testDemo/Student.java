package testDemo;

/**
 * 学生类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月28日下午1:04:27
 */
public class Student {
	private String name;
	private int id;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
