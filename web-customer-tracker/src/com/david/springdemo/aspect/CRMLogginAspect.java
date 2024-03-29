package com.david.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLogginAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.david.springdemo.controller.*.*(..))")
	private void forControllerPackage() {
	}

	@Pointcut("execution(* com.david.springdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("execution(* com.david.springdemo.service.*.*(..))")
	private void forServicePackage() {
	}

	@Pointcut("forControllerPackage() || forDaoPackage() || forServicePackage()")
	private void forAppFlow() {
	}

	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		logger.info("=========> Before Method: " + method);

		Object[] args = joinPoint.getArgs();

		for (Object object : args) {

			logger.info("ARGS: " + object.toString());
		}

	}

	@AfterReturning(pointcut = "forAppFlow()", returning ="result")
	public void afterReturn(JoinPoint joinPoint, Object result) {
		String method = joinPoint.getSignature().toShortString();
		logger.info("=========> AfterReturning Method: " + method);
		
		logger.info("=========> AfterReturning RESULT **: " + result);
		
		
	}

}
