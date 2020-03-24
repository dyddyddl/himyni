package LifeCycle;

import org.springframework.beans.factory.BeanFactory;

public class GreetingServiceImpl implements setBeanName,setBeanFactory, afterPropertiesSet, destroy {

	private String name;
	private BeanFactory beanFactory;
	private setBeanName setBeanName;
	private afterPropertiesSet afterPropertiesSet;
	
	
	@Override
	public void setBeanName(String name) {
		System.out.println("name");
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) {
		System.out.println("beanFac");
	}
	@Override
	public void afterPropertiesSet() {
		System.out.println("after");
	}
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
