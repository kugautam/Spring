package org.gautam.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.*;

public class Testproj
{
/*
		public static void main(String[] args)
		{
	       ApplicationContext context=new ClassPathXmlApplicationContext("Sample.xml");
	       Customer customer=(Customer)context.getBean("customer");
	       System.out.println(customer);
		}
*/
	@Test
	public void getText() {
		ApplicationContext context=new ClassPathXmlApplicationContext("Sample.xml");
	       Customer customer=(Customer)context.getBean("customer");
	       System.out.println(customer);
	}

}
