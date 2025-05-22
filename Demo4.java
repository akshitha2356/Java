package Day_4;

public class Demo4 {
	int x;
	int y;
	int z;
	public Demo4() {
		System.out.println("hi");
	}
	public Demo4(int x) {
		this.x=x;
		System.out.println(x);
	}
	public Demo4(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo4(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Demo4 t1=new Demo4();
		Demo4 t2=new Demo4(23);
		Demo4 t3=new Demo4(23,45);
		Demo4 t4=new Demo4(23,45,67);
	}

}
