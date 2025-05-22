package cdc1;

public class demo_2 extends Thread {
	String s;
	public demo_2(String name) {
		s=name;
	}
	public void run()
	{
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s +"is Daemon Thread");
		}
		else
		{
			System.out.println(s+"is user threads");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_2 thread1 = new demo_2("thread1");
		demo_2 thread2 = new demo_2("thread2");
		demo_2 thread3 = new demo_2("thread3");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(false);
		thread3.start();
   
	}

}