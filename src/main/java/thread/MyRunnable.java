package thread;
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x =1; x < 10; x++) {
			System.out.println("MyRunnable running for Thread Name: " + Thread.currentThread().getName());
			}
	}

	public static void main (String [] args) {
		MyRunnable myrunnable = new MyRunnable();
		//Passing myrunnable object to Thread class constructor
		Thread t1 = new Thread(myrunnable);
		t1.setName("Amit-1 Thread");
		//Starting Thread t1
		t1.start();
		Thread t2 = new Thread(()->{
			for(int x =1; x < 10; x++) {
				System.out.println("MyRunnable running for Thread1 Name: " + Thread.currentThread().getName());
			}
		});
		t2.setName("Amit-2 Thread");
		t2.start();
	}
}