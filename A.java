package rak;


public interface A {
	void meth1();
	void meth2();
}
class MyClass implements A{
	public void meth1(){
		System.out.println("interface1");
	}
	public void meth2() {
		System.out.println("interface2");
	}
	public static void main(String args[]) {
		MyClass m=new MyClass();
		m.meth1();
		m.meth2();
		
	}
}
