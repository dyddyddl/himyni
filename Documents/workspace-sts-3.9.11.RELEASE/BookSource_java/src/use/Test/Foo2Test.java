package use.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import page43.x.y.Foo43;
import page43Test.ServiceImpl;


public class Foo2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page43AppContextTest.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		ServiceImpl foo2 = (ServiceImpl)factory.getBean("serviceImpl");
		foo2.print();
	}

}





















