package Printer;
public class printer {
	private Inkbox inkbox=null;
	private Paper paper=null;
	public void print(String content) {
		if(inkbox==null||paper==null) {
			System.out.println("δ����ֽ����ɫ�����ͣ����������룡");
		}
		String color = inkbox.getColor();
		String style = paper.getSize();
		System.out.println("ֽ����ɫΪ��"+color);
		System.out.println("ֽ������Ϊ��"+style);
		System.out.println("ֽ������Ϊ��"+content);
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
