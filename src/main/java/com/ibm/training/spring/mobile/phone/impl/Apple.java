package com.ibm.training.spring.mobile.phone.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ibm.training.spring.mobile.phone.MobilePhone;
import com.ibm.training.spring.mobile.phone.dimension.Dimension;
import com.ibm.training.spring.mobile.phone.processor.Microprocessor;

@Component("applePhone")
@Scope("prototype")
public class Apple implements MobilePhone {
	

	private String model;
	
	@Autowired
	private Dimension dimension;
	
	@Autowired
	private Microprocessor processor;
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public Microprocessor getProcessor() {
		return processor;
	}

	public void setProcessor(Microprocessor processor) {
		this.processor = processor;
	}

	public void call() {
		// TODO Auto-generated method stub

	}

	public void message() {
		// TODO Auto-generated method stub

	}
	
	public Apple() {
		
	}
	
	public Apple(String model, Dimension dimension, Microprocessor processor) {
		super();
		this.model = model;
		this.dimension = dimension;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Apple [model=" + model + ", dimension=" + dimension + ", processor=" + processor + "]";
	}
	
	
	
	

}
