package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

// IoC 컨테이너가 만들어 질 때 자동으로 객체가 생성된다
// 객체의 주소값을 가져올 때 이름을 통해 가져올 수 있지만 Singleton으로 가져온다.
@Component("t3")
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2 생성자 호출");
	}
}
