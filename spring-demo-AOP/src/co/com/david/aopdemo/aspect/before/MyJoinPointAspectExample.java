package co.com.david.aopdemo.aspect.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(4)
@Component
public class MyJoinPointAspectExample extends MajorAspect {

	@Before("forControllerPackageAnyMethods()") // specific PACKAGE
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n\n\n" + getClass() + " --> : JOIN POINT beforeAddAccountAdvice()");

		MethodSignature methSignature = (MethodSignature) joinPoint.getSignature();

		System.out.println("Method Signature : " + methSignature);

		Object[] args = joinPoint.getArgs();

		for (Object object : args) {
			System.out.println(object);
		}
	}

}
