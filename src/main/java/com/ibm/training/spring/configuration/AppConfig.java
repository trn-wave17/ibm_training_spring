package com.ibm.training.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ibm.training.spring.mobile.phone.MobilePhone;
import com.ibm.training.spring.mobile.phone.dimension.Dimension;
import com.ibm.training.spring.mobile.phone.impl.Apple;
import com.ibm.training.spring.mobile.phone.processor.Microprocessor;
import com.ibm.training.spring.mobile.phone.processor.impl.A13;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.impl.IntelMMU;

@Configuration
@ComponentScan(basePackages = {"com.ibm.training.spring"})
public class AppConfig {
	
	//@Bean("intelMMU")
	public MemoryUnit memoryUnit() {
		return new IntelMMU();
	}
	
	//@Bean
	public Microprocessor processor() {
		return new A13(memoryUnit());
	}
	
	//@Bean 
	public Dimension dimension() {
		return new Dimension();
	}
	
	//@Bean
	public MobilePhone applePhone() {
		Apple apple = new Apple();
		apple.setDimension(dimension());
		apple.setProcessor(processor());
		return apple;
	}

}
