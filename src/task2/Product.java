package task2;
/**
 * @author kengou
 *	利用封装 简单购物
 */
public class Product {
	private String name;
	private double price; // 价格
	private String description; // 描述
	private String services[]; // 服务

	public Product() {}
	
	public Product(String name,String desString) {
		setName(name);
		setDescription(desString);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
