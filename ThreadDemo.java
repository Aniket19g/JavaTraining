package com.javaprac;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");		
	}
	public static void main(String[] args) {
		
		Thread th = new Thread(new ThreadDemo());
		th.start();
	}

}
