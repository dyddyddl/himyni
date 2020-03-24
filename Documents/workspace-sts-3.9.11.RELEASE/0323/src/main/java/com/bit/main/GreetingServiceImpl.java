package com.bit.main;


public class GreetingServiceImpl implements GreetingService{

	@Override
	public void setGreeting(String msg) {
		// TODO Auto-generated method stub
		System.out.println("setGreeting() ~~~~  &&&  "+msg);
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("sayHello()~~~~  &&&  "+name);
	}

	@Override
	public void sayGoodbye(String name) {
		// TODO Auto-generated method stub
		System.out.println("sayGoodbye()~~~~  &&&  "+name);
	}

	@Override
	public void goodbyeSay(String name) {
		// TODO Auto-generated method stub
		System.out.println("goodbyeSay()~~~~  &&&  "+name);
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("sayHello()~~~~   ");
	}

	@Override
	public void my_calc(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		System.out.println(num1+" % "+num2+" = "+(num1%num2));
	}

}
















