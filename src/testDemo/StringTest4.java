package testDemo;

/**
 * �ҳ������ַ����� ����������ַ���
 * ����
 * 1.���̵��ַ��� ÿһ�εݼ�һ��Ԫ��
 * 2.���ַ����ݼ���Ľ�� ���뵽�����ַ������ж��Ƿ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��19������1:47:48
 */
public class StringTest4 {
	public static void main(String[] args) {
		String aString="meirenainiahahaha";
		String bString="woainiazheihei";
		judge(aString,bString);
	}
	public static void judge(String a, String b) {
		String max=(a.length()>b.length())?a:b;
		String min=(max==a)?b:a;
		for(int x=0;x<min.length();x++) {
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++) {
				String temp=b.substring(y,z);
				if(max.contains(temp)) {
					System.out.println(temp);
						return;
				} 
			}
			
		}
	}
}

