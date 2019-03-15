package sh.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class ValidAspect {

	public void BeforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " begins args "
				+ list + "....... Valid..");
	}
}
