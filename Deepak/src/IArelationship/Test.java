package IArelationship;

public class Test {
	
	public static void main(String[] args) {
		
		Parent p=new Parent();
		
		p.m1();
		System.out.println("parent method ");
		Child c =new Child();
		
		c.m1();
		c.m2();
		
		System.out.println("chil d method");
	   
	}

}
