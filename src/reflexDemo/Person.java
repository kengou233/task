package reflexDemo;

class Person {
	private String name;
	private int age;
	/*
	 * 以下为静态代码块
	 */
	static {
		System.out.println("程序已启动");
	}
	/*
	 * 以下为该类的构造函数
	 */
	public Person() {
		super();
		
		System.out.println("无参 run...");
		
	}
	
	public Person(String name,int age) {
		super();
		this.age = age;
		this.name = name;
		
		System.out.println("有参 run...");
		System.out.println(this.name+":"+this.age);
	
	}
	/*
	 * 以下为 （无参 私有 有参 静态）方法
	 */
	public void show(){
		System.out.println(name+"..."+age);
	}
	
	private void privateMethod(){
		System.out.println(" privateMethod run... ");
	}
	
	public static void staticMethod(){
		System.out.println(" static method run... ");
	}
	
	public void paramMethod(String str,int num){
		System.out.println("paramMethod run.....");
		System.out.println(str+":"+num);
		
	}
}