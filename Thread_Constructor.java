package Java_Examples;

class Mythread extends Thread {
	public Mythread(String name) {
		super(name);
	}

	void run1() {
		while (true) {
			int i =34;
			System.out.println("hello everyone");
			System.out.println("i am thread");
		}
	}
}

public class Thread_Constructor {
	public static void main(String[] args) {
		Mythread t1 = new Mythread("amit");
		Mythread t2=new Mythread("ram chandra");
		
		t2.start();
	System.out.println(t2.getId());
	System.out.println(t2.getName());
		
		t1.start();
		System.out.println();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		
	}
}
