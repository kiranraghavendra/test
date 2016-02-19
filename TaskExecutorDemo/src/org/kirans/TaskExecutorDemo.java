package org.kirans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskExecutorDemo {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		TaskExecutorExample example = ctx.getBean("taskExecutorExample", TaskExecutorExample.class);
		
		example.printMessages();
		
		System.out.println("### Done with execution");
		
	}
}
