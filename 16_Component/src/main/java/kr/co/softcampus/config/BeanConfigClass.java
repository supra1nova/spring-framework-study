package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans2.TestBean4;

@Configuration
// @ComponentScan(basePackages = "") 를 이용하면 지정된 패키지의 Bean 클래스들의 어노테이션을 분석하여 Bean을 등록하라고 지정함.
// 여러 경로를 넣으면 해당하는 경로의 Bean 들을 모두 자동으로 스캔함
//@ComponentScan(basePackages = "kr.co.softcampus.beans2")
//@ComponentScan(basePackages = "kr.co.softcampus.beans3")
// {}를 이용해 한줄로 표기할 수도 있다.
@ComponentScan(basePackages = {"kr.co.softcampus.beans2", "kr.co.softcampus.beans3"})
public class BeanConfigClass {
	
	@Lazy
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Lazy
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Lazy
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Lazy
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	
	@Lazy
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
}
