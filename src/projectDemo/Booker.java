package projectDemo;
/**
 * @author kengou
 *	ʹ�÷�װ ������
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
