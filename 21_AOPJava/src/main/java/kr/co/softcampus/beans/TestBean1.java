package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	public void method1() throws Exception {
		System.out.println("TestBean1 method1 호출");
		int a = 10 / 0;
	}
}
