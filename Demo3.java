package Day_4;

public class Demo3 {
	int x;
	int y;
	public Demo3(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	
	public Demo3(Demo3 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		Demo3 t1=new Demo3(45,23);
		Demo3 t2=new Demo3(t1);
		
	}
}
