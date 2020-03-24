package page36;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import page36.x.y.Bar;
import page36.x.y.Baz;

public class Foo {
	private static final  Logger logger= 
			LoggerFactory.getLogger(Foo.class);
	private Bar bar;
	private String email;
	private Baz baz;
	public Foo(Bar bar,Baz baz) {
		this.bar=bar;
		this.baz=baz;
		logger.info("Foo(Bar bar,Baz baz)");
		System.out.println("Foo(Bar bar,Baz baz)");
	}
	public void setBar(Bar bar) {
		this.bar =bar;
		
	}
	public void setEmail(String email) {
		this.email = email;
	}

	protected Bar getBar() {
		return null;
	}
}










