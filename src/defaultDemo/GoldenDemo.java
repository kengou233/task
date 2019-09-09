package defaultDemo;

/**
 * 1.寻找离黄金分割数 最近的除数和被除数
 * 2.x+y=8
 *   j-k=6 
 * 	 x+j=14
 *   y+k=10
 * @author	 创建人：灰凉
 * @date   创建时间：2019年9月7日下午12:15:50
 */
public class GoldenDemo {
	public static void main(String[] args) {
		System.out.println("启动");
//		Mythod1();
		Mythod2();
	}
	public static void Mythod1() {
		for(double i=1;i<=20;i++)
		{
			for(double j=1;j<20;j++)
			{
				if((j/i)==0.618)
					System.out.println(i+"/"+j+"="+j/i);
			}
		}
	}
	public static void Mythod2() {
		for(int x=0;x<=20;x++)
		{
			for(int y=0;y<=20;y++)
			{
				for(int j=0;j<=20;j++)
				{
					for(int k=0;k<=20;k++)
					{
						if(x+y==8&&x+j==14&&y+k==10&&j-k==6)
							System.out.println(x+":"+y+":"+j+":"+k);
					}
				}
			}
		}
	}
}
