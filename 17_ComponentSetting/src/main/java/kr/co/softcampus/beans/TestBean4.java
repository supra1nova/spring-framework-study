package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// getBean 메서드를 호출할 때마다 새로운 객체를 생성해 반환한다.
@Scope("prototype")
public class TestBean4 {
	public TestBean4() {
		System.out.println("TestBean4 생성자 호출");
	}
}
