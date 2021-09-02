package com.ibm.training.spring.mobile.phone.processor.memory.unit.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ibm.training.spring.mobile.phone.processor.memory.unit.MemoryUnit;

@Component
@Primary
public class NxpMMU implements MemoryUnit {
	
	private int RAMSize;
	private int totalMemory;
	
	public void init() {
		this.RAMSize = 4;
		this.totalMemory = 32;
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}

	@Override
	public String toString() {
		return "NxpMMU [RAMSize=" + RAMSize + ", totalMemory=" + totalMemory + "]";
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
	
	public NxpMMU() {
		
	}
	

	public NxpMMU(int rAMSize, int totalMemory) {
		super();
		RAMSize = rAMSize;
		this.totalMemory = totalMemory;
	}

	public void store() {
		// TODO Auto-generated method stub
		
	}

	public void retrieve() {
		// TODO Auto-generated method stub
		
	}

}
