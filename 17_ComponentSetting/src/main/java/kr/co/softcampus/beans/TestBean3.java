package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// @Lazy 를 사용하면 getBean 메서드를 호출할 때 Singleton으로 객체가 생성된다.
@Lazy
public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3 생성자 호출");
	}
}
