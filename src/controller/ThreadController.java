package controller;

public class ThreadController extends Thread{

	@Override
	public void run() {
		System.out.println("Thread #"+getId());
	}
}
