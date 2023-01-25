package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {
	
	// name과 동일한 이름을 BeanConfigClass에서 찾아서 가져와 주입
	@Resource(name="data1")
	private DataBean1 data100;
	
	@Resource(name="data2")
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
	
}
