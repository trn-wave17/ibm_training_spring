package com.ibm.training.spring.mobile.phone.processor.impl;

import com.ibm.training.spring.mobile.phone.processor.Microprocessor;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;

public class Snapdragon implements Microprocessor {
	
	private MemoryUnit memoryUnit;
	
	public MemoryUnit getMemoryUnit() {
		return memoryUnit;
	}
	
	public void setMemoryUnit(MemoryUnit memoryUnit) {
		this.memoryUnit = memoryUnit;
	}
	
	
	
	
	public Snapdragon(MemoryUnit memoryUnit) {
		super();
		this.memoryUnit = memoryUnit;
	}
	
	public Snapdragon() {
		
	}

	@Override
	public String toString() {
		return "Snapdragon [memoryUnit=" + memoryUnit + "]";
	}

	public void process() {
		// TODO Auto-generated method stub

	}

}
