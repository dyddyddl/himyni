package use.page38;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page38.GreetingService;

import page36.Foo;

public class GreetingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page38AppContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		GreetingService service =
				(GreetingService)factory.getBean("greeting1");
		service.out();
	}

}





















