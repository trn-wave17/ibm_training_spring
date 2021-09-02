package com.ibm.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.training.spring.configuration.AppConfig;
import com.ibm.training.spring.mobile.phone.MobilePhone;
import com.ibm.training.spring.mobile.phone.dimension.Dimension;
import com.ibm.training.spring.mobile.phone.impl.Apple;
import com.ibm.training.spring.mobile.phone.processor.Microprocessor;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.impl.IntelMMU;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.impl.NxpMMU;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * MemoryUnit memoryUnit = new IntelMMU(4,32); Microprocessor processor = new
		 * A13(memoryUnit); Dimension dimensions = new Dimension(6.5,3.4,1.2);
		 * MobilePhone phone = new Apple("Iphone12",dimensions,processor);
		 */
    	
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Apple phone1 = context.getBean("applePhone", Apple.class);
    	phone1.setModel("iphone11");
    	
    	MemoryUnit memoryUnit = context.getBean("intelMMU", IntelMMU.class);
    	
    	ConfigurableApplicationContext configurableContext = (ConfigurableApplicationContext) context;
    	configurableContext.stop();
    	configurableContext.start();
    	configurableContext.close();
    	
    	//Apple phone2 = context.getBean("applePhone", Apple.class);
    	//System.out.println(phone2);
    	System.out.println(phone1);
        System.out.println(memoryUnit);
    }
}
