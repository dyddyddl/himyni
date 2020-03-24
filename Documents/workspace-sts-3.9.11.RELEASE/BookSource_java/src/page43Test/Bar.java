package page43Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import page43Test.Bar;

public class Bar {
	private static final  Logger logger= 
			LoggerFactory.getLogger(Bar.class);
	public Bar() {
		System.out.println("생성자 호출 Bar()"); // 생성자 호출 
		}
}
