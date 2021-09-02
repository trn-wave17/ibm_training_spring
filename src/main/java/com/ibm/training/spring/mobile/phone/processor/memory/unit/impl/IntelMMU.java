package com.ibm.training.spring.mobile.phone.processor.memory.unit.impl;

import org.springframework.stereotype.Component;

import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;

@Component
public class IntelMMU implements MemoryUnit {
	
	private int RAMSize;
	private int totalMemory;
	
	public void init() {
		System.out.println("Init");
	}

	public int getRAMSize() {
		return RAMSize;
	}

	public void setRAMSize(int rAMSize) {
		RAMSize = rAMSize;
	}

	public int getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(int totalMemory) {
		this.totalMemory = totalMemory;
	}
	
	

	@Override
	public String toString() {
		return "IntelMMU [RAMSize=" + RAMSize + ", totalMemory=" + totalMemory + "]";
	}

	public IntelMMU(int rAMSize, int totalMemory) {
		super();
		RAMSize = rAMSize;
		this.totalMemory = totalMemory;
	}
	
	public IntelMMU() {
		
	}

	public void store() {
		// TODO Auto-generated method stub

	}

	public void retrieve() {
		// TODO Auto-generated method stub

	}

}
