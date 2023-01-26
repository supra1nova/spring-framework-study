package kr.co.softcampus.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
	
	public void beforeMethod() {
		System.out.println("Advisor beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("Advisor afterMethod 호출");
	}
	
	// ProceedingJoinPoint pjp 안에 실행할 메서드가 들어가므로, 내부에서 .proceed()를 통해 실행시킬 수 있다.
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Advisor aroundMethod 호출1");
		// 원래의 메서드를 개별적으로 수동으로 호출한 다음, 리턴한다.
		Object obj = pjp.proceed();
		System.out.println("Advisor aroundMethod 호출2");
		return obj;
	}
	
	public void afterReturningMethod() {
		System.out.println("Advisor afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("Advisor afterThrowingMethod 호출");
		System.out.println(e1);
	}
	
}
