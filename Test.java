package cdc1;

class Test2 extends Thread {
	public void run() {
		System.out.println("hi");
	}
}
class Test3 implements Runnable {
	public void run() {
		System.out.println("good morning");
	}
}
public class Test {
	public static void main(String[] args) {
		Test2 t1=new Test2();
		Test3 t2=new Test3();
		//System.out.println("hello");
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();

	}
	

}
