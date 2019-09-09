package reflexDemo;

class Person {
	private String name;
	private int age;
	/*
	 * ����Ϊ��̬�����
	 */
	static {
		System.out.println("����������");
	}
	/*
	 * ����Ϊ����Ĺ��캯��
	 */
	public Person() {
		super();
		
		System.out.println("�޲� run...");
		
	}
	
	public Person(String name,int age) {
		super();
		this.age = age;
		this.name = name;
		
		System.out.println("�в� run...");
		System.out.println(this.name+":"+this.age);
	
	}
	/*
	 * ����Ϊ ���޲� ˽�� �в� ��̬������
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