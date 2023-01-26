package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
		kr.co.softcampus.beans2.TestBean1 xml3 = ctx1.getBean("xml3", kr.co.softcampus.beans2.TestBean1.class);
		
		System.out.printf("xml1 : %s\n", xml1);
		xml1.method1();
		
		System.out.println("------------------------");
		
		xml1.method1(100);
		
		System.out.println("------------------------");
		xml1.method1("문자열");
		
		System.out.println("------------------------");
		xml1.method1(100, 200);
		
		System.out.println("------------------------");
		xml1.method1(100, "문자열");
		
		System.out.println("------------------------");
		xml1.method2();
		
		System.out.println("============================");
		xml2.method1();
		
		System.out.println("============================");
		xml3.method1();
		
		System.out.println("============================");
		System.out.printf("a1 : %d\n", xml1.method3());
		
		ctx1.close();
	}
}
