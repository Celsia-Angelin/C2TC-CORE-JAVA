package com.tns.corejava;

public class Multi_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		
		for (int i=0;i<10;i++);
		{
			System.out.println("Main thread");
		}
	}

}

class MyThread extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++);
		{
			System.out.println("Child thread");
		}
	}
}
