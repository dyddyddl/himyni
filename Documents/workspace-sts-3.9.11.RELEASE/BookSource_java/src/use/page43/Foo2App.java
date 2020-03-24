package use.page43;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import page43.x.y.Foo43;


public class Foo2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page43ApplicationContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		Foo43 foo2 = (Foo43)factory.getBean("foo43");
		System.out.println(foo2);
		
	}

}





















