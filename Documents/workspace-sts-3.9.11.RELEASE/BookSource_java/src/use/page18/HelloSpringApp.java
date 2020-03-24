package use.page18;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import page18.HelloBean;

public class HelloSpringApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page18AppContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		HelloBean bean =( HelloBean  )factory.getBean("hello");
		bean.sayHello("코로나 올림픽");
	}

}









