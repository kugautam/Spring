package com.gautam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic
{
    public static void main(String args[])
    {
      	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	 InitializeDestroyExample id=(InitializeDestroyExample)context.getBean("in");
	       System.out.println(id);
    }
}
