package defaultDemo;

import java.util.Random;

/**
 * 使用数学类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月31日下午4:56:21
 */
public class MathDemo1 {
	public static void main(String[] args) {
		double a = Math.ceil(3.14);//返回大于指定数据的数值
		double b = Math.floor(3.14);//返回小于指定数据的数值
		long c = Math.round(3.14);//四舍五入
		int d = (int) Math.pow(2,3);//返回指定 指定参数的参数次方
		int e =(int) (Math.random()*10+1);//返回0~10之间的随机数
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int f = random.nextInt(10);//返回0~10(不包含)之间的随机数
			System.out.println(f);
		}
	}
}
