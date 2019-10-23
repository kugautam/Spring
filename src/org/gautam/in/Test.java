package org.gautam.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

		public static void main(String[] args)
		{
	       ApplicationContext context=new ClassPathXmlApplicationContext("Sample.xml");
	       Customer customer=(Customer)context.getBean("customer");
	       System.out.println(customer);
		}

	

}
