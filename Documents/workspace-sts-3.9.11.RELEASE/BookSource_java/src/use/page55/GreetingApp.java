package use.page55;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page55.GreetingService;


public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page55AppContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		System.out.println("main() getBean(\"greeting\")호출전");
		GreetingService service =
				(GreetingService)factory.getBean("greeting");
		System.out.println("main() getBean(\"greeting\")호출 후 "+service);
	}

}





















