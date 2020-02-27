package sh.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/*
 * 与时间相关的类 
 *  1. System 类下的 currentTimeMillis(); 
 *  2. Date类:java.util.Date  如何创建其实例；其下的方法：toString()、getTime() (以及其子类java.sql.Date) 
 *  3. SimpleDateFormat类
 *  4.Calendar类
 */
public class DateTimeTest {

	@SuppressWarnings("deprecation")
	@Test
	public void DateTest() {
		Date t = new Date(new Date().getTime() - 1000);
		System.out.println(new Date().after(t)); //true
		System.out.println(new Date().before(t)); //false

		Date cloneDate = (Date) t.clone();
		cloneDate.setHours(17); //修改时间副本
		System.out.println(t.getTime());
		System.out.println(cloneDate.compareTo(t)); //时间副本和源对象不相同
		System.out.println(t.getTime()); //修改时间副本后，源对象没有改变
		System.out.println(cloneDate.equals(t)); //两者对象不相等

		System.out.println(cloneDate.toString()); //Mon Feb 18 17:00:19 CST 2019
	}

	@Test
	public void SimpleDateFormatTest() {
		// 1.格式化1
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date = dateFormat.format(new Date());
		System.out.println(date);// 14-5-12 下午3:24
		// 2.格式化2
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEE, yyy-MM-dd HH:mm:ss Z");
		date = dateFormat2.format(new Date());
		System.out.println(date);// 星期一, 12 五月 2014 15:29:16 +0800

		// 3.解析：
		Date date1;
		try {
			date1 = dateFormat.parse("14-5-12 下午3:24");
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		try {
			date1 = dateFormat2.parse("星期一, 2015-12-01 15:29:16 +0800");
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Test
	public void printfTest() {
		// 初始化 Date 对象
		Date date = new Date();
		// 使用toString()显示日期和时间
		String str = String.format("Current Date/Time : %tc", date);
		System.out.printf(str);

		System.out.println();
		//索引必须紧跟在%后面，而且必须以$结束
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

		System.out.println();
		// 显示格式化时间
		System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
	}

	@Test
	public void DiffTime() {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(1000);
			System.out.println(new Date() + "\n");
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}

	/**
	 * 日历：Calendar类
	 *                       get()
	 *                       add()
	 *                       set()
	 */
	@Test
	public void CalendarTest() {
		/**
		 * 日历类是一个抽象类，它提供了一些方法，用于在特定的时间瞬间与一组日历字段(如年、月、小时等)之间进行转换， 并操作日历字段，
		 * 例如获取下一周的日期。
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

	@Test
	public void GregorianCalendarTest() {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		int year;
		// 初始化 Gregorian 日历
		// 使用当前时间和日期
		// 默认为本地时间和时区
		GregorianCalendar gcalendar = new GregorianCalendar();
		// 显示当前时间和日期的信息
		System.out.print("Date: ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		// 测试当前年份是否为闰年
		if (gcalendar.isLeapYear(year)) {
			System.out.println("当前年份是闰年");
		} else {
			System.out.println("当前年份不是闰年");
		}
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

}
