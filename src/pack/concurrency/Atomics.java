package pack.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomics extends Thread {
	
	AtomicInteger Acount = new AtomicInteger();
	int b = 0;

	public void mycounter() {
		for (int i = 0; i <= 5; i++) {
			b = Acount.addAndGet(1);
		}
		System.out.println("value of atomic " + this.b + " " + Thread.currentThread().getName());
	}

	public void run() {
		mycounter();
	}
}
