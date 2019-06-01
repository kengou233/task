package task1;
/**
 * @author kengou
 *	使用封装 简单卖书
 */
public class Book {
	private String name;
	private String isbn;
	private double price;
	private int count;
	private boolean borrow;
	
	public boolean isBorrow() {
		return borrow;
	}
	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}
	
	public Book() {
		
	}
	public Book(String name,int count) {
		this.setName(name);
		this.setCout(count);
	}
	public Book(String name,String isbn,double price,int count) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCout(count);
		setBorrow(borrow);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0)
			this.price=0;
		else {
			this.price = price;
		}
	}

	public int getCout() {
		return count;
	}

	public void setCout(int cout) {
		if(cout<0)
		this.count=0;
		else
		this.count = cout;
	}

}
