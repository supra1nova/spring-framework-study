package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean xml1 = ctx1.getBean("xml1", TestBean.class);
		System.out.printf("t1 : %s\n", xml1);
		int a1 = xml1.method1();
		System.out.printf("a1 : %d\n", a1);
		
		ctx1.close();
	}
}
