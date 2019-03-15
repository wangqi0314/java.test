package sh.spring.ioc.dependencies;

import java.beans.ConstructorProperties;

public class ExampleBean {

	// Number of years to calculate the Ultimate Answer
	private int years;

	// The Answer to Life, the Universe, and Everything
	private String ultimateAnswer;

	@ConstructorProperties({ "years", "ultimateAnswer" })
	public ExampleBean(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;

		System.out.println(this.years + " " + this.ultimateAnswer);
	}
}
