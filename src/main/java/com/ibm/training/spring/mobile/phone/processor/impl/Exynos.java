package com.ibm.training.spring.mobile.phone.processor.impl;

import com.ibm.training.spring.mobile.phone.processor.Microprocessor;
import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;

public class Exynos implements Microprocessor {
	
	private MemoryUnit memoryUnit;
	
	public MemoryUnit getMemoryUnit() {
		return memoryUnit;
	}
	
	
	
	@Override
	public String toString() {
		return "Exynos [memoryUnit=" + memoryUnit + "]";
	}



	public Exynos(MemoryUnit memoryUnit) {
		super();
		this.memoryUnit = memoryUnit;
	}
	
	public Exynos() {
		
	}


	public void setMemoryUnit(MemoryUnit memoryUnit) {
		this.memoryUnit = memoryUnit;
	}
	
	public void process() {
		// TODO Auto-generated method stub

	}

}
