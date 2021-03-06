package co.com.david.aopdemo.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
//@Order(1)
//@Component
public class MyDemoLoggingAspect extends MajorAspect {

	/*
	 * @Pointcut("execution(* co.com.david.aopdemo.controller.*.*(..))") private
	 * void forControllerPackageAnyMethods() { }
	 * 
	 * @Pointcut("execution(* co.com.david.aopdemo.controller.*.get*(..))") private
	 * void forControllerPackageGetMethods() { }
	 * 
	 * @Pointcut("execution(* co.com.david.aopdemo.controller.*.set*(..))") private
	 * void forControllerPackageSetMethods() { }
	 * 
	 * @Pointcut("forControllerPackageAnyMethods() && !(forControllerPackageGetMethods() || forControllerPackageSetMethods())"
	 * ) public void forControllerPackageNoGetterSetterMethods() { }
	 */

	// @Before("execution(public void addAccount())") Any class
	// @Before("execution(* add*())") // Any class that match with this conditons
	// @Before("execution(* co.com.david.aopdemo.dao.AccountDAO.add*())") //
	// specific class
	// @Before("execution(* add*(co.com.david.aopdemo.entity.Account))") // specific
	// parameter type
	// @Before("execution(* add*(..))") // zero or more parameters
	// @Before("execution(* add*(co.com.david.aopdemo.entity.Account, boolean))") //
	// specific parameters
	@Before("forControllerPackageNoGetterSetterMethods()") // specific PACKAGE
	public void beforeAddAccountAdvice() {
		System.out.println("\n" + getClass() + " --> : beforeAddAccountAdvice()");
	}

	/*@Before("forControllerPackageGetMethods()") // specific PACKAGE
	public void beforeGetMethods() {
		System.out.println("\n" + getClass() + " : beforeGetMethods()");
	}*/
}
