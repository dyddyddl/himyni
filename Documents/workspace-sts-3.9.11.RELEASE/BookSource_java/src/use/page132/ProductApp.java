package use.page132;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page132.Product;
import com.book.page132.ProductDAO;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("config/Page132JDBCContext.xml");
		BeanFactory  factory = new XmlBeanFactory(resource);
		
		ProductDAO dao =(ProductDAO)factory.getBean("userDao2");
		List<Product> products = dao.findProductList();
		for(Product p : products) {
			System.out.println(p);
		}
	}

}





















