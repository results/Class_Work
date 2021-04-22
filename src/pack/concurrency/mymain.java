package pack.concurrency;

public class mymain {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		{ 
	        Atomics c = new Atomics(); 

	        Thread first = new Thread(c, "First"); 
	        Thread second = new Thread(c, "Second"); 
	  

	        first.start(); 
	        second.start(); 


	        first.join(); 
	        second.join(); 
			System.out.println("value of atomic " + c.b + " " + Thread.currentThread().getName());
            
	    } 
	}


}
