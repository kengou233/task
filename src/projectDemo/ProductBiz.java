package projectDemo;
import javax.swing.JOptionPane;
/**
 * @author kengou
 *	利用封装 简单购物
 */
public class ProductBiz {
	public static void main(String[] args) {
		int counts[] = new int[3];// 用来保存每种商品的总量
		double tatal = 0;
		//对象数组 Product product[] = new Product[3];
		//使用对象数组一定要分配内存空间
		//if(product[i]=null)	product[i]=new product();
		//如果有内存空间 将product改为product[i];
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			product.setName(name);
			String strprice = JOptionPane.showInputDialog("请输入商品单价：");
			product.setPrice(Double.parseDouble(strprice));// 将字符串类型强转成整数类型
			String strcount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strcount);
			tatal += product.getPrice() * counts[i];
		}
		System.out.println("总计消费" + tatal + "元");
	}
}
