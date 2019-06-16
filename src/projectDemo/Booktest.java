package projectDemo;
/**
 * @author kengou
 *	使用封装 简单卖书
 */
public class Booktest {
	public static void main(String [] args) {
		Book book = new Book("如何一夜暴富",95);
		Booker booker = new Booker();
		booker.sellbook(book);
		System.out.println(book.getCout());
	}
}
