package kr.co.softcampus.beans2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
// @Component 를 붙이면 Component scan 시 Bean 자동으로 등록
// 이름을 별도로 지정하지 않았으므로 타입으로 체크한다. 
@Component
public class TestBean3 {
	
}
