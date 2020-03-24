package com.bit.myapp;

public class LogAspect {
	public void beforeLogging() {
		System.out.println("** 메서드 호출 전 **");
	}
	public void afterLogging(Object returnValue) {
		System.out.println("** 메서드 호출 후 **");
	}
	public void throwingLogging(Exception ex) {
		System.out.println("** 예{외 발생 :  " + ex.getMessage()+"**");
	}
	public void alwaysLogging() {
		System.out.println("**항상 실행**");
	}
}
