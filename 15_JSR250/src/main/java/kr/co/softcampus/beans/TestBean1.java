package kr.co.softcampus.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1 생성자 호출");
	}
	
	public void init() {
		System.out.println("TestBean1 init 메서드 호출");
	}
	
	public void destroy() {
		System.out.println("TestBean1 destroy 메서드 호출");
	}
}
