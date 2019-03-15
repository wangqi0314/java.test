package sh.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public void BeforeMethod(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " begins args "
				+ list + ".......");
	}

	public void AfterMethod(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		List<Object> list = Arrays.asList(joinPoint.getArgs());
		System.out.println("The Method Name " + methodName + " ends args "
				+ list + ".......");
	}

	public void AfterReturnMethod(JoinPoint joinPoint, Object result) {

		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method Name " + methodName + " Returns result "
				+ result + ".......");
	}

	public void AfterExMethod(JoinPoint joinPoint, Exception ex) {

		String methodName = joinPoint.getSignature().getName();
		System.out.println("The Method Name " + methodName + " Ex result " + ex
				+ ".......");
	}

	public Object AroundMethod(ProceedingJoinPoint pro) {
		Object result = null;

		try {

			result = pro.proceed();
		} catch (Throwable e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		System.out.println("The Method Name " + pro.getSignature().getName()
				+ " Around result ......." + 1000);
		return result;

	}

}
