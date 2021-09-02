package com.ibm.training.spring.mobile.phone.processor.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ibm.training.spring.mobile.phone.processor.Microprocessor;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;

@Component
public class A13 implements Microprocessor {
	
	@Autowired
	private MemoryUnit memoryUnit;
	
	public MemoryUnit getMemoryUnit() {
		return memoryUnit;
	}

	public void setMemoryUnit(MemoryUnit memoryUnit) {
		this.memoryUnit = memoryUnit;
	}

	public A13(MemoryUnit memoryUnit) {
		super();
		this.memoryUnit = memoryUnit;
	}
	
	public A13() {
		
	}

	@Override
	public String toString() {
		return "A13 [memoryUnit=" + memoryUnit + "]";
	}

	public void process() {
		// TODO Auto-generated method stub

	}

}
