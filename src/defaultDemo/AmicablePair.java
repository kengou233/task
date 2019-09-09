package defaultDemo;
/**
 * 相亲数：彼此除本身以外的因数和 等于 彼此
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月13日下午12:02:33
 */
public class AmicablePair {
	public static void main(String[] args) {
		// 让我想一下 想干什么...思考中...
		// 对了 先求因数 嘿嘿
		for (int i = 1; i < 9999; i++) {
			int n = factor(i);
			if (i > n && factor(n) == i)// 如果前一个数大于它的因子和 并且 它的因子和的因子和等于它本身
				System.out.println(i + "\t" + n);
		}
	}
	/**
	 * 将该数字除本身以外所有因数相加
	 */
	public static int factor(int i) {
		int sum = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}
		return sum;
	}
}
