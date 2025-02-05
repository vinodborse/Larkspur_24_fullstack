package com.ts;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {

/*	
	@Before("execution(public void *Data())")
	public void extraData() {
		System.out.println("Welcome");		
	}
*/
	
/*	
	@After("execution(public void teacherData())")
	public void extraData2() {
		System.out.println("End");		
	}
*/
	@Around("execution(public void teacherData())")
	public void aroundData(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Vinod");
		pjp.proceed();
		System.out.println("Ramu");
		System.out.println("Don");
		
	}
	
	
}
