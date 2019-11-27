package com.face.spring;

public class Main {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/Hello.xml");
		HelloWorld myBean = (HelloWorld) beanFactory.getBean("SpringJava");
		myBean.printHello();

	}

}
