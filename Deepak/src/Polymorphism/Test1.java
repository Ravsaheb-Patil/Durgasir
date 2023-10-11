package Polymorphism;

public class Test1 {
	
	public  void m1(String s) {
		System.out.println("String version");
	}

	public void m1(StringBuffer s) {
		
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		
		t.m1("Ravsaheb");
		t.m1(new StringBuffer("Patil"));
		t.m1(null);
		
	}
}
