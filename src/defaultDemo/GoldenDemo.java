package defaultDemo;

/**
 * 1.Ѱ����ƽ�ָ��� ����ĳ����ͱ�����
 * 2.x+y=8
 *   j-k=6 
 * 	 x+j=14
 *   y+k=10
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��9��7������12:15:50
 */
public class GoldenDemo {
	public static void main(String[] args) {
		System.out.println("����");
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
