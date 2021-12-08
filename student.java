package rakesh;

public class student {
	int rollno;
	String name;
	String setname(String name)
	
	{
		return name;
	}
	int setrollno(int roll )
	{
		return rollno;
	}
	String getname(String name)
	{
		return name;	
	}
	int getrollno(int roll) {
		return rollno;
	}
	public static void main(String args[])
	{
		student s=new student();
		System.out.println(s.setname("Rakesh"));
		System.out.println("s.getrollno(45)");
		System.out.println("s.setname(Rak)");
		System.out.println("s.grtrollno(45)");
				
	}
}
