package use.page55.singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page55.singleton.GreetingService;


public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page55_singletonAppContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		System.out.println("main() getBean(\"greeting\")호출전");
		GreetingService service =
				(GreetingService)factory.getBean("greeting");
		GreetingService service2 =
				(GreetingService)factory.getBean("greeting2");
		System.out.println("main() getBean(\"greeting\")호출 후 "+service);
		System.out.println(service==service2);
	}

}





















