package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

// Lazy 설정을하지 않으면 IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성된다.
//@Lazy
//@Scope(scopeName = "prototype")
@Component
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1 생성자 호출");
	}
	
}
