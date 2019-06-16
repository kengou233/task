package projectDemo;
/**
 * @author kengou
 *	使用封装 简单卖书
 */
public class Booker {
	public int  sellbook(Book book) {
		if(!(book.getCout()>1)) {
			return -1;
		}
		book.setCout(book.getCout()-1);
		return 1;
	}
}
