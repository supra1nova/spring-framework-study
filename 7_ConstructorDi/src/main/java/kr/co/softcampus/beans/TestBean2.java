package kr.co.softcampus.beans;

public class TestBean2 {
	
	private DataBean data1;
	private DataBean data2;
	
	public TestBean2(DataBean data1, DataBean data2) {
		System.out.println("TestBean2 생성자 호출");
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void printData() {
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
	}
}
