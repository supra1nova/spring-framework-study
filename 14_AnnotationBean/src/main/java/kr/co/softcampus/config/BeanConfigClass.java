package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;
import kr.co.softcampus.beans.DataBean4;
import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	// @Autowired 가 붙으면 반드시 bean 을 정의해야한다.
	@Scope(scopeName = "prototype")
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Scope(scopeName="prototype")
	@Bean
	public DataBean3 data_bean3() {
		return new DataBean3();
	}
	
	@Scope(scopeName="prototype")
	@Bean
	public DataBean4 data_bean() {
		return new DataBean4();
	}
}
