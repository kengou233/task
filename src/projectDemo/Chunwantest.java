package projectDemo;

public class Chunwantest {
	public static void main(String[] args) {
		Director 张艺谋 = new Director();
		Singer 周杰伦 = new Singer("周杰伦");
		Dancer 貂蝉 = new Dancer("貂蝉");
		Actor actor = new Actor("成龙");
		张艺谋.action(周杰伦);
		张艺谋.action(貂蝉);
		张艺谋.action(actor);
		

	}
}
