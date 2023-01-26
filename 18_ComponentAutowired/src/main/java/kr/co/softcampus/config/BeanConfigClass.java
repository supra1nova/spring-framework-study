package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean3;
import kr.co.softcampus.beans.DataBean4;
import kr.co.softcampus.beans.DataBean5;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;

@ComponentScan(basePackages = "kr/co/softcampus/beans")
@Configuration
public class BeanConfigClass {
	
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	@Bean
	public TestBean3 java2() {
		TestBean3 t2 = new TestBean3(200, "문자열", new DataBean4(), new DataBean5());
		return t2;
	}
}
