package kr.co.softcampus.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softcampus.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}
	
	public static void test1() {
		ClassPathResource res = new ClassPathResource("kr/co/softcampus/config/beans.xml");
		
		// XmlBeanFactory 의 경우 bean.xml에 선언이 되어 있다고 해서 자동으로 빈을 생성하는 것은 아님 -> 별도의 생성자 호출 필요.
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		// 따라서 별도로 생성한다.
		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
	}
	
	public static void test2() {
		// ClassPathResource와는 달리 package 외부에 beans.xml 파일이 있을 경우 사용한다.
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}
	
	public static void test3() {
		// package 안에 위치할 경우 사용
		// ClassPathXmlApplicationContext는 별다른 설정을 하지 않으면 beans.xml에 등록된 모든 bean들을 자동으로 생성한다 -> 커스마이징할 수 있다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		ctx.close();
	}
	
	public static void test4() {
		// beans.xml이 package 외부에 위치할 경우 사용
		// FileSystemXmlApplicationContext의 경우에도 ClassPathXmlApplicationContext와 동일하게 xml 로드시 자동으로 생성까지 할 수 있고, 시기를 커스터마이징 할 수 있다.
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t1);
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}
}