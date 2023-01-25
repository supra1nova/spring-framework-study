package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean5 {
	
	// 변수의 이름과 BeanConfigClass 에 등록된 메서드명이 동일한한 bean을 찾아 주입한다.
	@Resource
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
	
}
