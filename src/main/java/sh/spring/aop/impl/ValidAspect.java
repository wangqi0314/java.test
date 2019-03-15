package sh.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 验证声明切面；
 * 
 * @author Administrator
 *
 */
@Order(2)
@Aspect
@Component
public class ValidAspect {

	/**
	 * 验证切面；
	 * 
	 * @param joinPoint
	 */
	@Before("sh.com.spring.aop.impl.LoggingAspect.declareJointPointExpression()")
	public void BeforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " begins args "
				+ list + "....... Valid..");
	}
}
