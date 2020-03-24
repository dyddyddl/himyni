package page36.x.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
	private static final  Logger logger= 
			LoggerFactory.getLogger(Bar.class);
	public Bar() {
		System.out.println("Bar()");
		logger.info("Bar()");
	}
}
