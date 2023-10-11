package Polymorphism;

public class Test {
	
	public void m1() {
		System.out.println("no agr method");
  }
	 public void m1(int i) {
		 
		 System.out.println("int arg method");
	 }
	 
	 public void m1(double d) {
		 System.out.println("double arg method");
	 }
	public static void main(String[] args) {
		
		Test t=new Test(t.);
		
		t.m1();
		t.m1(10.5);
		t.m1(10);
		
	}

}
