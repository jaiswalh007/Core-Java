package com.project1.corejava;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
			
		}

	}

}
class MyThread implements Runnable
{
	Public void run()
	{
		for(int i=0;i<10;i++)
		{
	System.out.println("child thread");
}
}
}
