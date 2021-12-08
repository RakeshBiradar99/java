package rakesh;

public class change {
	static int i=2;
int ChangeVariable()
	{
		return i++;
		
	}
public static void main(String args[]) {
	change c1=new change();

	int k=c1.ChangeVariable();
	int l=c1.ChangeVariable();
	System.out.println("k");
	System.out.println("l");
}



}
