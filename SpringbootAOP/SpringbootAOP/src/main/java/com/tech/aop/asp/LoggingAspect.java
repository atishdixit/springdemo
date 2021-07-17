package com.tech.aop.asp;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Pointcut("within(@org.springframework.stereotype.Repository *)"
			+ " || within(@org.springframework.stereotype.Service *)"
			+ " || within(@org.springframework.web.bind.annotation.RestController *)")
	public void springBeanPointcut() {
		System.out.println("springBeanPointcut");
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
	}

	@Pointcut("within(com.tech.aop..*)" + " ||within(com.tech.aop.service..*)"
			+ "||within(com.tech.aop.controller..*)")
	public void applicationPackagePointcut() {
		// Method is empty as this is just a Pointcut, the implementations are in the
		// advices.
		System.out.println("applicationPackagePointcut");
	}

	@AfterThrowing(pointcut = "springBeanPointcut() && applicationPackagePointcut()", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
		log.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringType(),
				joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL");
		System.out.println("logAfterThrowing");
	}

	@Around("springBeanPointcut() && applicationPackagePointcut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround");
		if (log.isDebugEnabled()) {
			log.debug("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringType(),
					joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
		}

		Object result = joinPoint.proceed();

		try {

			if (log.isDebugEnabled()) {
				log.debug("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
						joinPoint.getSignature().getName(), result);
			}

		} catch (IllegalArgumentException e) {
			log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
					joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
			throw e;
		}
		return null;

	}
}
