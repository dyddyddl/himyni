package com.book.page55;

public class GreetingServiceImpl implements GreetingService {
	private String msg;
	
	public GreetingServiceImpl() {
		System.out.println("GreetingServiceImpl()");
	}

	@Override
	public String toString() {
		return "GreetingServiceImpl [msg=" + msg + "]";
	}
	
	@Override
	public void setGreeting(String msg) {
		this.msg = msg;
		System.out.println("GreetingServiceImpl(String msg)");// 확인
	}

}
