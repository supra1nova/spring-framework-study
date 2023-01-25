package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	private int data1;
	private DataBean1 data2;
	
	// 자동주입을 변수에 설정 가능 -> 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입됨
	@Autowired
	private DataBean1 data3;
	
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	// @Autowired를 이용해 setter 를 생략 + @Qualifier 를 통해 @Bean(autowire="Autowire.BY_NAME") 생략
	// @Qualifier를 붙이는 이유 : @Autowire는 타입으로 인지하므로 name으로 인지시킬때 필요
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required=false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	
	public TestBean1() {
		System.out.println("TestBean1 생성자 호출");
	}

	public int getData1() {
		return data1;
	}

	// 필수 주입 프로퍼티(스프링 5.1붜 혹은 자바 파일로 bean 등록했을 경우 무시됨)
	// spring 5.1 부터는 @Required는 작동하지 않는다 -> 필요한 필드값이 있다면 생성자를 통해 주입해야한다.
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}
	
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}
	
}
