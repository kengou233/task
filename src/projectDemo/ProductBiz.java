package projectDemo;
import javax.swing.JOptionPane;
/**
 * @author kengou
 *	���÷�װ �򵥹���
 */
public class ProductBiz {
	public static void main(String[] args) {
		int counts[] = new int[3];// ��������ÿ����Ʒ������
		double tatal = 0;
		//�������� Product product[] = new Product[3];
		//ʹ�ö�������һ��Ҫ�����ڴ�ռ�
		//if(product[i]=null)	product[i]=new product();
		//������ڴ�ռ� ��product��Ϊproduct[i];
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			product.setName(name);
			String strprice = JOptionPane.showInputDialog("��������Ʒ���ۣ�");
			product.setPrice(Double.parseDouble(strprice));// ���ַ�������ǿת����������
			String strcount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strcount);
			tatal += product.getPrice() * counts[i];
		}
		System.out.println("�ܼ�����" + tatal + "Ԫ");
	}
}
