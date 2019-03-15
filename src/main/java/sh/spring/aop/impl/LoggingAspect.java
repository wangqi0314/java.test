package sh.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 日志声明切面；
 * 
 * 把这个类生命为一个切面，需要做到： 1.需要将该类添加到IOC容器中，方法是添加 @Component; 2.再生命为一个切面，方法是添加@Aspect;
 * 
 * @author Administrator
 *
 */
@Order(1)
@Aspect
@Component
public class LoggingAspect {

	/**
	 * 声明切面的统一声明方式，使用@Pointcut;
	 */
	@Pointcut("execution(* sh.com.spring.aop.impl.ArithmeticCalculator.*(..))")
	public void declareJointPointExpression() {
	}

	/**
	 * 声明该方法是一个前置通知，使用@Before；
	 * 
	 * execution()方法表示需要在执行的那些方法上前置；
	 * 
	 * 例如：
	 * 
	 * @Before("execution(public int
	 *                           sh.com.spring.aop.impl.ArithmeticCalculator.
	 *                           add(int, int))")
	 * 
	 *                           又如：用 * 代表给类的所有方法；
	 * 
	 * @Before("execution(public int
	 *                           sh.com.spring.aop.impl.ArithmeticCalculator.
	 *                           *(int, int))")
	 * 
	 *                           * 可以代表的形式： public * = public int； * = public
	 *                           int； 也可以代表 类和方法名等；
	 * @param joinPoint
	 */
	@Before("declareJointPointExpression()")
	public void BeforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " begins args "
				+ list + ".......");
	}

	/**
	 * 声明一个方法是后置通知，使用@After;
	 * 
	 * @param joinPoint
	 */
	@After("execution(* sh.com.spring.aop.impl.ArithmeticCalculator.*(int, int))")
	public void AfterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " ends args "
				+ list + ".......");
	}

	/**
	 * 声明切面的返回方法，用@AfterReturning声明；
	 * 
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(value = "execution(* sh.com.spring.aop.impl.*.*(int, int))", returning = "result")
	public void AfterReturnMethod(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method Name " + methodName + " Returns result "
				+ result + ".......");
	}

	/**
	 * 声明切面的异常返回方法，用@AfterThrowing声明；
	 * 
	 * @param joinPoint
	 * @param ex
	 */
	@AfterThrowing(value = "execution(* sh.com.spring.aop.impl.*.*(int, int))", throwing = "ex")
	public void AfterExMethod(JoinPoint joinPoint, Exception ex) {

		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method Name " + methodName + " Ex result " + ex
				+ ".......");
	}

	/**
	 * 声明切面的环绕方法，用@Around声明；
	 * 
	 * @param pro
	 * @return
	 */
	@Around("execution(* sh.com.spring.aop.impl.*.*(int, int))")
	public Object AroundMethod(ProceedingJoinPoint pro) {
		Object result = null;

		try {
			result = pro.proceed();
		} catch (Throwable e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		System.out.println("The Method Name " + pro.getSignature().getName()
				+ " Around result ......." + 1000);
		return result;

	}

}
