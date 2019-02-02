package sh.basic_data_type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 * 与时间相关的类 
 *  1. System 类下的 currentTimeMillis(); 
 *  2. Date类:java.util.Date  如何创建其实例；其下的方法：toString()、getTime() (以及其子类java.sql.Date) 
 *  3. SimpleDateFormat类
 *  4.Calendar类
 */
public class DateTest {

	/**
	 * 日历：Calendar类
	 *                       get()
	 *                       add()
	 *                       set()
	 *               Date
	 *                      getTime()
	 *                      setTime(Date d)
	 */
	@Test
	public void CalendarTest() {

		/**
		 * 日历类是一个抽象类，它提供了一些方法，用于在特定的时间瞬间与一组日历字段(如年、月、小时等)之间进行转换，
		 * 并操作日历字段，例如获取下一周的日期。
		 */
		Calendar c = Calendar.getInstance();

		int day = c.get(Calendar.DAY_OF_MONTH); // 获取一个月的当前第几天
		System.out.println(day);

		c.add(Calendar.DAY_OF_MONTH, -2); // 本月天数减去两天
		day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);

		c.set(Calendar.DAY_OF_MONTH, 23); // 设置本月为23日
		Date d = c.getTime();
		System.out.println(d);

	}

	/**
	 * 返回date1与date2之间的天数,date1早于date2
	 */
	private int gitTimeDifference(String date1, String date2) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateFormat.parse(date1);
		Date d2 = dateFormat.parse(date2);
		long milliTime = d2.getTime() - d1.getTime();
		System.out.println("总毫秒数：" + milliTime);
		System.out.println("总秒数    ：" + milliTime / 1000);
		System.out.println("总分数    ：" + milliTime / 1000 / 60);
		System.out.println("总小时    ：" + milliTime / 1000 / 60 / 60);
		System.out.println("总天        ：" + milliTime / 1000 / 60 / 60 / 24);
		return (int) milliTime / 1000 / 3600 / 24;
	}

	/**
	 * 计算时间差
	 * @throws ParseException
	 */
	@Test
	public void testTimeDifference() throws ParseException {
		String str1 = "1990-01-01";
		String str2 = "1990-01-06";
		int dates = gitTimeDifference(str1, str2);
		System.out.println(dates);
	}

	/**
	 * 数据格式化
	 * @throws ParseException 
	 */
	@Test
	public void testDateFormat() throws ParseException {
		// 1.格式化1
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date = dateFormat.format(new Date());
		System.out.println(date);// 14-5-12 下午3:24
		// 2.格式化2
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEE, yyy-MM-dd HH:mm:ss Z");
		date = dateFormat2.format(new Date());
		System.out.println(date);// 星期一, 12 五月 2014 15:29:16 +0800

		// 3.解析：
		Date date1 = dateFormat.parse("14-5-12 下午3:24");
		System.out.println(date1);

		date1 = dateFormat2.parse("星期一, 2015-12-01 15:29:16 +0800");
		System.out.println(date1);
	}

	/**
	 * java.util.Date不易于国际化对象
	 */
	@Test
	public void testDate() {
		Date d1 = new Date();
		System.out.println(d1.toString());
		System.out.println(d1.getTime());
		Date d2 = new Date(1399879144434L);
		System.out.println(d2);
	}
}
