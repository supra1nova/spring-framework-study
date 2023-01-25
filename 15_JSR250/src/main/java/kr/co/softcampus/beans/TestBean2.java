package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2 생성자 호출");
	}
	
	// 생성자 호출 이후 자동으로 호출
	@PostConstruct
	public void init() {
		System.out.println("TestBean2 init 메서드 호출");
	}
	
	
	// 객체 소멸 직전에 호출
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean2 destroy 메서드 호출");
	}
}
