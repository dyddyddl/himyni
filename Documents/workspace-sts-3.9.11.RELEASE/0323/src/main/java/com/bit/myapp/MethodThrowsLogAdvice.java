package com.bit.myapp;

import org.springframework.aop.ThrowsAdvice;

public class MethodThrowsLogAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
		System.out.println("예외 발생 ");
	}
}
