package com.mirim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object Obj = pjp.proceed();
		
		stopwatch.stop();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð�: " + stopwatch.getTotalTimeMillis() + "(ms) ��");
		
		return Obj;
	}
}
