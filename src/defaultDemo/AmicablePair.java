package defaultDemo;

/**
 * 相亲数 一个数的因子和等于另一个数 另一个数的因子和等于这个数(手动滑稽)
 * 
 * @author 创建人：灰凉
 * @date 创建时间：2019年6月13日下午12:02:33
 */
public class AmicablePair {
	public static void main(String[] args) {
		// 让我想一下 想干什么...思考中...
		// 对了 先求因数 嘿嘿
		for (int i = 1; i < 9999; i++) {
			int n = factor(i);
			if (factor(n) == i)//如果该数字
				System.out.println(i + "\t" + n);
		}
	}
/**
 * 将该数字除本身以外所有因数相加
 * @return
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
