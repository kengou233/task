package projectDemo;
/**
 * @author kengou
 *	ʹ�÷�װ ������
 */
public class Booktest {
	public static void main(String [] args) {
		Book book = new Book("���һҹ����",95);
		Booker booker = new Booker();
		booker.sellbook(book);
		System.out.println(book.getCout());
	}
}
