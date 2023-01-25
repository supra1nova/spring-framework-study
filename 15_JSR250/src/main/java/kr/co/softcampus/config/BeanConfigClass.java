package kr.co.softcampus.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;
import kr.co.softcampus.beans.TestBean5;
import kr.co.softcampus.beans.TestBean6;

@Configuration
public class BeanConfigClass {
	
	@Scope(scopeName = "prototype")
	@Lazy
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public TestBean1 obj1() {
		return new TestBean1(); 
	}
	
	@Lazy
	@Bean
	public TestBean2 obj2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Lazy
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean3 obj3() {
		return new TestBean3();
	}
	
	@Lazy
	@Bean
	public TestBean4 obj4() {
		return new TestBean4();
	}
	
	@Lazy
	@Bean
	public TestBean5 obj5() {
		return new TestBean5();
	}
	
	@Lazy
	@Bean
	public TestBean6 obj6() {
		return new TestBean6();
	}
	
}
