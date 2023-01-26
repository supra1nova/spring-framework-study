package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	
	public TestBean5() {
		System.out.println("TestBean5 생성자 호출");
	}
	
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("PostConstruct 메서드 호출");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		System.out.println("PreDestroy 메서드 호출");
	}
}
