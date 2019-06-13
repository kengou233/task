package Printer;

public class Test {
	public static void main(String[] args) {
		printer p = new printer();
		p.setInkbox(new Realize());
		p.setPaper(new Realize());
		p.print("ºÃÏëÌ¸Áµ°®£¡");
	}
}
