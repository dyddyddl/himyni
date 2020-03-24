package use.page36;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import page36.Foo;

public class FooApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page36AppContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		Foo fooX = (Foo)factory.getBean("fooId");
		
	}

}





















