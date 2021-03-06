/*
 * package com.bit.myapp;
 * 
 * import java.lang.reflect.Method;
 * 
 * import org.springframework.aop.MethodBeforeAdvice;
 * 
 * public class MethodBeforeLogAdvice implements MethodBeforeAdvice{ public void
 * before(Method method, Object[] args, Object target) {
 * System.out.println("[Log]METHOD Before : " + method.getName()+ " on "
 * +target+"calling"); }
 * 
 * }
 */

package com.bit.myapp;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeLogAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("[Log]METHODBefore:  " + method.getName() + "   on   " + target + "   calling  --  " + args);

	}

}