package com.tns.corejava;

import java.util.concurrent.locks.*;

public class Concurrency_Demo {

	public static void main(String[] args) {


	ReentrantLock l=new ReentrantLock();
	

	l.lock();
	
	System.out.println(l.isLocked());
	
	System.out.println(l.getQueueLength());
	
	System.out.println(l.isHeldByCurrentThread());
	
	l.unlock();
	

	System.out.println(l.getHoldCount());
	
	System.out.println(l.isLocked());
	
	

	

	}

}
		
