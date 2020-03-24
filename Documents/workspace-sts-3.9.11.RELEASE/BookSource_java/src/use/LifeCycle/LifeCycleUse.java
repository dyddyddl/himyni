package use.LifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import LifeCycle.afterPropertiesSet;
import LifeCycle.destroy;
import LifeCycle.setBeanFactory;
import LifeCycle.setBeanName;

public class LifeCycleUse {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("config/LifeCycle.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		afterPropertiesSet after = (afterPropertiesSet)factory.getBean("after");
		destroy destroy = (destroy)factory.getBean("destroy");
		setBeanFactory setBeanFactory= (setBeanFactory)factory.getBean("setBeanFactory");
		setBeanName setBeanName = (setBeanName)factory.getBean("setBeanName");
		System.out.println(""+after+destroy+setBeanFactory+setBeanName);
	}

}
