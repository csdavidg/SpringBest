package co.com.david.aopdemo.aspect.before;

import org.aspectj.lang.annotation.Pointcut;

public class MajorAspect {

	@Pointcut("execution(* co.com.david.aopdemo.controller.*.add*(..))")
	public void forControllerPackageAnyMethods() {
	}

	/*
	 * @Pointcut("execution(* co.com.david.aopdemo.controller.*.*(..))") private
	 * void forControllerPackageAnyMethods() { }
	 */

	@Pointcut("execution(* co.com.david.aopdemo.controller.*.get*(..))")
	public void forControllerPackageGetMethods() {
	}

	@Pointcut("execution(* co.com.david.aopdemo.controller.*.set*(..))")
	public void forControllerPackageSetMethods() {
	}

	@Pointcut("forControllerPackageAnyMethods() && !(forControllerPackageGetMethods() || forControllerPackageSetMethods())")
	public void forControllerPackageNoGetterSetterMethods() {
	}

}
