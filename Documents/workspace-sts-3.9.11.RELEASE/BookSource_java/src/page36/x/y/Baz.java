package page36.x.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baz {
	private static final  Logger logger= 
			LoggerFactory.getLogger(Baz.class);
	public Baz() {
		logger.info("Baz()");
		System.out.println("Baz()");
	}
}
