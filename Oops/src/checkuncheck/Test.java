package checkuncheck;

import overriding.parent1;

public class Test {
	
	public static void main(String[] args) {
		
		parent1 p=new parent1();
		p.m();
		child1 c=new child1();
		c.m1();
		
		parent1 p1=new overriding.child1(); 
	}

}
