package edu.bit.training.token;

public class TokenService implements Runnable {
	private static Integer token = 1;//shared token number across all counters
	private String counterName;
	
	private static final Object lock = new Object();//To synchronize token access
	
	//Constructor to set counter name
	public TokenService(String counterName) {
		this.counterName = counterName;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (lock) {
				//if token generation exceeds a limit, exit the loop
				if(token > 10) {
					break;
				}
				System.out.println("Counter: " + counterName + " Token Number: " + token);
				token++;
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}