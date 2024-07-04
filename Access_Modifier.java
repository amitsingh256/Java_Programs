package Java_Examples;

class c{
	public int x=10;
	private int y=20;
	int z=30;
	protected int a=40;
   
 public void meth() {
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(z);
	 System.out.println(a);
 }
}

public class Access_Modifier {
	public static void main(String[] args) {
	c c=new c();
	System.out.println(c.x);
	// System.out.println(c.y);
	System.out.println(c.z);
	System.out.println(c.a);
	}

}
