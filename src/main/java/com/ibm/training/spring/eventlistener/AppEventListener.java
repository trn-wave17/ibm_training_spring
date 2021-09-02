package com.ibm.training.spring.eventlistener;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventListener {
	//ContextStartedEvent
	//ContextRefreshedEvent
	//ContextStoppedEvent
	//ContextClosedEvent
	@EventListener
	public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
		System.out.println(event);
	}
	
	@EventListener
	public void handleContextStartedEvent(ContextStartedEvent event) {
		System.out.println(event);
	}
	
	@EventListener
	public void handleContextStoppedEvent(ContextStoppedEvent event) {
		System.out.println(event);
	}
	
	@EventListener
	public void handleContextClosedEvent(ContextClosedEvent event) {
		System.out.println(event);
	}

}
