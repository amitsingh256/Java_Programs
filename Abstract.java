package Java_Examples;

abstract class parents {
	public parents() {
		System.out.println("constructor of parents");
	}

	abstract public void greet();
	abstract public void greet1();
}

class child extends parents {
@Override
	public void greet() {
		System.out.println("good morning");
	}

	@Override
	public void greet1() {
		System.out.println("good afternoon");
		
		
	}

}
abstract class child2 extends parents{
	public void th() {
		System.out.println("");
	}
}

public class Abstract {
	public static void main(String[] args) {
    // parents p=new parents(); -->> abstract class ka object nhi ban sakta
		
   //  child2 c= new child(); -->> ye bhi abstract class hai
		child c= new child();
		c.greet();
		c.greet1();
	}
}
