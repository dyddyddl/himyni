/*
 * package com.bit.main;
 * 
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext;
 * 
 * public class GreetingTest {
 * 
 * public static void main(String[] args) { ApplicationContext ctx = new
 * ClassPathXmlApplicationContext("com/bit/myx/applicationContext.xml");
 * GreetingService bean = (GreetingService)ctx.getBean("greeting");
 * bean.sayHello("홍길동"); bean.sayHello("   "); bean.sayGoodbye("홍길동");
 * bean.goodbyeSay("홍길동");
 * 
 * GreetingService bean2 = (GreetingService)ctx.getBean("interceptorTest");
 * //bean.2~~calc(4/0); }
 * 
 * }
 */
package com.bit.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.main.GreetingService;

public class GreetingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bit/myx/applicationContext2.xml");
		GreetingService bean = (GreetingService)ctx.getBean("greetingTarget");
		bean.sayHello("홍길동");
		
		bean.sayGoodbye("fhdhdjd");
		
	}

}
