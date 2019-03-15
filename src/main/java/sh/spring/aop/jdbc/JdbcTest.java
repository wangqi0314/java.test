package sh.spring.aop.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest {
	private ApplicationContext act = null;
	private JdbcTemplate jdbc;
	{
		act = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
		jdbc = (JdbcTemplate) act.getBean("jdbcTemp");

	}

	@Test
	public void bathUpdate() {
		String sql2 = "  insert into AU_TESTS values(?,?,?)";
		List<Object[]> lo1 = new ArrayList<Object[]>();
		lo1.add(new Object[] { "WQ-O", 1, "MK-09" });
		lo1.add(new Object[] { "WQ-O", 1, "MK-09" });

		jdbc.batchUpdate(sql2, lo1);
	}

	@Test
	public void testUpdata() {
		String sql = "update AU_TESTS set AU_Note=? where AU_Code= ? ";
		String sql2 = "  insert into AU_TESTS values(?,?,?)";
		int i = jdbc.update(sql, "hg", 5);
		System.out.println(i);

		int i2 = jdbc.update(sql2, "WQ-O", 1, "MK-09");
		System.out.println(i2);

	}

	@Test
	public void testDataSource() throws SQLException {
		DataSource source = (DataSource) act.getBean("DataSource");
		System.out.println(source.getConnection());
	}

}
