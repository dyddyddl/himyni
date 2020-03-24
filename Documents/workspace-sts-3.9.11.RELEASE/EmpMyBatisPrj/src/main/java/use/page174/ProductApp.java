package use.page174;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page174.Product;
import com.book.page174.dao.ProductMapper;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page174MyBatisContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		
		ProductMapper  mapper=( ProductMapper  )factory.getBean("xxx");
		for(Product product : mapper.findProductList()) {
			System.out.println(product);
		}
		
		System.out.println("///////////////////");
		Product product =	mapper.findProduct(3);
		System.out.println(product);

		System.out.println("///////////////////");
		/*
		 * product = mapper.findProductPrice(250); System.out.println(product);
		 */
		for(Product product2 : mapper.findProductPrice(250)) {
			System.out.println(product2);
		}
	}

}





















