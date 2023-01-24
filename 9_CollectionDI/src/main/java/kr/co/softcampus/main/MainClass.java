package kr.co.softcampus.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.getList1 : %s\n", t1.getList1());
		
		List<String> list1 = t1.getList1();
		list1.stream().forEach(i -> System.out.printf("list1 contains : %s\n", i));
		
		System.out.printf("t1.getList2 : %s\n", t1.getList2());
		List<Integer> list2 = t1.getList2();
		list2.stream().forEach(i -> System.out.printf("list2 contains : %d\n", i));
		
		System.out.printf("t1.getList3 : %s\n", t1.getList3());
		List<DataBean> list3 = t1.getList3();
		list3.stream().forEach(i -> System.out.printf("list3 contains : %s\n", i));
		
		System.out.println("----------------------------------");
		
		System.out.printf("t1.getSet1 : %s\n", t1.getSet1());
		Set<String> set1 = t1.getSet1();
		set1.stream().forEach(i -> System.out.printf("set1 contains : %s\n", i));
		
		System.out.printf("t1.getSet2 : %s\n", t1.getSet2());
		Set<Integer> set2 = t1.getSet2();
		set2.stream().forEach(i -> System.out.printf("set1 contains : %s\n", i));
		
		System.out.printf("t1.getSet3 : %s\n", t1.getSet3());
		Set<DataBean> set3 = t1.getSet3();
		set3.stream().forEach(i -> System.out.printf("set1 contains : %s\n", i));
		
		System.out.printf("t1.getSet4 : %s\n", t1.getSet4());
		Set<Boolean> set4 = t1.getSet4();
		set4.stream().forEach(i -> System.out.printf("set1 contains : %s\n", i));
		
		System.out.println("----------------------------------");
		
		System.out.printf("t1.getMap1 : %s\n", t1.getMap1());
		Map<String, Object> map1 = t1.getMap1();
		// map1.forEach((key, value) -> System.out.println(map1.get(key)));
		int loopCnt = 0;
		for(String key : map1.keySet()) {
			loopCnt++;
			if(loopCnt > map1.size()) {
				break;
			}
			System.out.println(map1.get(key));
		}
		String a1 = (String)map1.get("a1");
		Integer a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		Set<Integer> a6 = (Set<Integer>)map1.get("a6");
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %d\n", a2);
		System.out.printf("a3 : %s\n", a3);
		System.out.printf("a4 : %s\n", a4);
		System.out.printf("a5 : %s\n", a5);
		System.out.printf("a6 : %s\n", a6);
		
		System.out.println("--------------------------------");
		
		Properties prop1 = t1.getProp1();
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		System.out.printf("p1 : %s\n", p1);
		System.out.printf("p2 : %s\n", p2);
		System.out.printf("p3 : %s\n", p3);
		
		ctx.close();
	}
}
