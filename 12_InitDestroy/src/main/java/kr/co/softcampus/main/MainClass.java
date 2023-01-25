package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		TestBean1 t1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		ctx1.close();
		
		System.out.println("==================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java1 : %s\n", java1);
				
		ctx2.close();
	}
}
