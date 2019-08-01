package exceptionDemo;

/**
 * 创建Number类 通过类中的方法count得到两个数的乘积
 * 用try-catch语句在主方法中包围此方法
 * @author	 创建人：灰凉
 * @date   创建时间：2019年6月20日上午9:37:45
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			int result=Number.conut(5,0);
			System.out.println(result);
		} catch (Myexception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
class Number{
	public static int conut(int n,int m)throws Myexception {
		if(m==0)
			throw new Myexception("除数不能为0");
		return n/m;
	}
}
