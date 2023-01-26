package kr.co.softcampus.beans;

public class TestBean1 {
	
	public void method1() {
		System.out.println("beans.TestBean1.method1() 호출");
	}
	
	public void method1(int a1) {
		System.out.println("beans.TestBean1.method1(int) 호출");
	}
	
	public void method1(String a2) {
		System.out.println("beans.TestBean1.method1(String) 호출");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("beans.TestBean1.method1(int, int) 호출");
	}
	
	public void method1(int a1, String a2) {
		System.out.println("beans.TestBean1.method1(int, String) 호출");
	}
	
	public void method2() {
		System.out.println("beans.TestBean1.method2() 호출");
	}
	
	public int method3() {
		System.out.println("int beans.TestBean1.method3() 호출");
		return 100;
	}
	
	
}
