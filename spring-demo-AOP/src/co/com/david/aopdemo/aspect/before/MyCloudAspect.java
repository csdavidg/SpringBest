package co.com.david.aopdemo.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
//@Order(3)
//@Component
public class MyCloudAspect extends MajorAspect{
	
	/*@Pointcut("execution(* co.com.david.aopdemo.controller.*.*(..))")
	private void forControllerPackageAnyMethods() {
	}*/
	
	@Before("forControllerPackageAnyMethods()") // specific PACKAGE
	public void beforeAddAccountAdvice() {
		System.out.println("\n" + getClass() + " --> : beforeAddAccountAdvice()");
	}
}
