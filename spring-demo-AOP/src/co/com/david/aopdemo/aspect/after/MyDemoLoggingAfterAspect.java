package co.com.david.aopdemo.aspect.after;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import co.com.david.aopdemo.entity.Account;

@Aspect
@Component
public class MyDemoLoggingAfterAspect {

	@AfterReturning(pointcut = "execution(* find*(..))", returning = "result")
	public void afterReturningFindAccounts(JoinPoint joinPoint, List<Account> result) {
		result.stream().forEach(a -> a.setNumber(a.getNumber() + 1));
		System.out.println("=====> ** AfterReturning Method");
	}

	@AfterThrowing(pointcut = "execution(* find*(..))", throwing = "exception")
	public void afterException(JoinPoint joinPoint, Throwable exception) {
		System.out.println("=====> ** AfterException Method: " + exception);
	}

	@After("execution(* find*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("=====> ** After Method ****************: ");
	}

	@Around("execution(String co.com.david.aopdemo.dao.AccountDAO.getFortune())")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("=====> ** Start Around Method ****************: ");

		long start = System.currentTimeMillis();

		Object result = proceedingJoinPoint.proceed();

		System.out.println("=====> ** Finish Around Method ****************: ");

		long end = System.currentTimeMillis();

		System.out.println("Duration: " + ((end - start)));

		return result;
	}

}
