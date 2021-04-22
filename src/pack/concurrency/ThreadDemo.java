package pack.concurrency;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("was held up on  " + threadName);
		};
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("Program end");
	}

	Thread thread = new Thread(new Runnable() {
	    @Override
	    public void run(){
	    }
	});
}
