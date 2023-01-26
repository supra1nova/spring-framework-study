package kr.co.softcampus.beans2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
//기본적으로 @Component 는 type 으로 autowire 하지만, ("id값") 또는 (value = "id값") 를 옆에 붙이면 autowire 할 id 지정가능
// 또한 @Component 의 경우 type 을 우선으로 등록하고 이름을 주어지기 때문에 여러 Bean을 여러개의 이름으로 사용할 수 없다 -> 한 Bean을 여러 이름으로 사용하기 위해서는 결국 xml이나 BeanConfig에서 개별적으로 등록해야한다. 
@Component("bean4")
public class TestBean4 {

}
