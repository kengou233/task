package Printer;
public class printer {
	private Inkbox inkbox=null;
	private Paper paper=null;
	public void print(String content) {
		if(inkbox==null||paper==null) {
			System.out.println("未设置纸张颜色和类型，请重新输入！");
		}
		String color = inkbox.getColor();
		String style = paper.getSize();
		System.out.println("纸张颜色为："+color);
		System.out.println("纸张类型为："+style);
		System.out.println("纸张内容为："+content);
	}
	
	public Inkbox getInkbox() {
		return inkbox;
	}
	public void setInkbox(Inkbox inkbox) {
		this.inkbox = inkbox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
}
