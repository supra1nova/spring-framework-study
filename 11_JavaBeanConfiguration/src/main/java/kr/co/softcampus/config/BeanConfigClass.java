package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

// @Configuration을 넣음으로써 beans.xml 역할 -> bean을 컨테이너에 등록/생성 -> IoC와 DI가 발생
@Configuration
public class BeanConfigClass {
	
	// 메서드의 이름이 xml 방식의 id와 동일하게 작동하므로 메서드의 이름이 곧 bean의 이름으로 등록됨
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// name 속성을 주면, 해당 이름으로 등록될 bean 이름을 변경할 수 있다.
	@Bean(name = "java600")
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// Lazy 속성에 boolean 값을 줌으로써 xml의 lazy-init 과 동일한 효과를 갖는다.
	// @Lazy(value = true) 의 value 값은 생략 가능하다 
	@Lazy
	@Bean
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	// scope 기본값은 singleton 이고, @Scope와 동일하다.
	// prototype으로 사용하기 위해서는 @Scope(value = "prototype") 로 표기한다.
	@Scope(value = "prototype")
	@Bean
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		return t4;
	};
	
	@Primary
	@Bean
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		return t4;
	};
}
