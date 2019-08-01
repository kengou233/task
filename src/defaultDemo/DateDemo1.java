package defaultDemo;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * 使用时间类
 * @author	 创建人：灰凉
 * @date   创建时间：2019年7月31日下午12:20:43
 */
public class DateDemo1 {
	public static void main(String[] args) {
		/*格式化时间
		long start = System.currentTimeMillis( );
		Date date =new Date();
		System.out.println("当前时间为："+date);
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		String time=d.format(date);
		System.out.println("当前时间为："+time);
		long end = System.currentTimeMillis();
		long summary = end-start;
		System.out.println(summary);
		*/
		
		/*打印日历
		String month[]= {
				"一月","二月","三月","四月",
				"五月","六月","七月","八月",
				"九月","十月","十一月","十二月"
		};
		String week[]= {
				"星期天","星期一","星期二","星期三","星期四","星期五","星期六"
		};
		Calendar c = Calendar.getInstance();
		
		String Month_day=month[c.get( Calendar.MONTH)];
		String Week_day=week[c.get(Calendar.DAY_OF_WEEK)];
		
		System.out.println(c.get(Calendar.YEAR)+"年");
		System.out.println(Month_day);
		System.out.println(c.get( Calendar.DAY_OF_MONTH)+"日");
		System.out.println(Week_day);
		*/
		
		Calendar c = Calendar.getInstance();
		c.set(2011,11,6);//更改为指定日期
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		c.add(Calendar.DAY_OF_MONTH,-2);//对日历参数进行加减
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}
}
