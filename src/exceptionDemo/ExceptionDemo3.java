package exceptionDemo;

/**
 * 创建类Computer 该类有计算最大公约数的方法
 * 如果传入的数值为负数则抛出异常
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月20日上午9:55:01
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		int n=-1;
		int m=100;
		try {
			int result=Computer.divisor(n,m);
			System.out.println("这两个数的最大公因数为："+result);
			System.out.println("这两个数的最小公倍数为："+m*n/result);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
	}
}
/**
 * 求最大公因数和最小公倍数的方法：欧几里得算法
 * 即  先判断 前一个数是否大于后一个
 * 然后 求出这两个数的  余数 和 乘积
 * 利用 while循环  反复求余数 使余数=0为止
 * 其中 后一次的 被除数是 前一次的除数 
 * 	      后一次的 除数是前一次的余数
 */
class Computer{
	public static int divisor(int n,int m)throws NumlessOneException {
		if(n<=0||m<=0)
			throw new NumlessOneException("数值不能为0或负数 请重新输入！");
		//判断 前一个数是否大于后一个数
		if(n<m) {
			int temp=n;
			n=m;
			m=temp;
		}
		//求余数 	
		int s=n%m;
		while(s!=0) {
			n=m;
			m=s;
			s=n%m;
		}
		return m;	
	}
}
class NumlessOneException extends RuntimeException{

	public NumlessOneException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
