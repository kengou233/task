package defaultDemo;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * ʹ��ʱ����
 * @author	 �����ˣ�����
 * @date   ����ʱ�䣺2019��7��31������12:20:43
 */
public class DateDemo1 {
	public static void main(String[] args) {
		/*��ʽ��ʱ��
		long start = System.currentTimeMillis( );
		Date date =new Date();
		System.out.println("��ǰʱ��Ϊ��"+date);
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		String time=d.format(date);
		System.out.println("��ǰʱ��Ϊ��"+time);
		long end = System.currentTimeMillis();
		long summary = end-start;
		System.out.println(summary);
		*/
		
		/*��ӡ����
		String month[]= {
				"һ��","����","����","����",
				"����","����","����","����",
				"����","ʮ��","ʮһ��","ʮ����"
		};
		String week[]= {
				"������","����һ","���ڶ�","������","������","������","������"
		};
		Calendar c = Calendar.getInstance();
		
		String Month_day=month[c.get( Calendar.MONTH)];
		String Week_day=week[c.get(Calendar.DAY_OF_WEEK)];
		
		System.out.println(c.get(Calendar.YEAR)+"��");
		System.out.println(Month_day);
		System.out.println(c.get( Calendar.DAY_OF_MONTH)+"��");
		System.out.println(Week_day);
		*/
		
		Calendar c = Calendar.getInstance();
		c.set(2011,11,6);//����Ϊָ������
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		c.add(Calendar.DAY_OF_MONTH,-2);//�������������мӼ�
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
}
