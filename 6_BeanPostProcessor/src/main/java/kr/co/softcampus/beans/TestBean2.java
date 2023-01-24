package kr.co.softcampus.beans;

public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2 의 생성자");
	}
	
	public void bean2_init() {
		System.out.println("TestBean2 의 init 메서드");
	}
	
	public void bean2_destroy() {
		System.out.println("TestBean2 의 destroy 메서드");
	}
}
