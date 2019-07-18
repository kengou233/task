package testDemo;

import java.util.Scanner;

/**
 * if语句的应用
 * @author 创建人：灰凉
 * @date 创建时间：2019年7月13日下午1:52:16
 */
public class Iftest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的税前工资：");
		//税前工资
		int num = input.nextInt();
		//应纳税所得额
		int x=num-3500;
		//应交款税
		double y=0;
		//实发工资
		double k=0;
		if(x==1500) 
		{
			y=(x-262)*0.03;
			k=num-y-262;
		}
		if(x>=9001&&x<=35000) 
		{
			y=(x-262)*0.25-1005;
			k=num-y-262;
		}
		System.out.printf("您的应缴税款为：%.2f\n",y);
		System.out.printf("您的实发工资为：%.2f\n",+k);
	}
}
