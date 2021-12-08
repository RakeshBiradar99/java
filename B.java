package rakesh;

public interface B {

		void meth1();
		void meth2();
	}
	class MyClas implements B{
		public void meth1(){
			System.out.println("interface1");
		}
		public void meth2() {
			System.out.println("interface2");
		}
		public static void main(String args[]) {
			MyClas m=new MyClas();
			m.meth1();
			m.meth2();
			
		}
	}

