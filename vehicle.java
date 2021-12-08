package rakesh;

public interface vehicle {
	 public double tuneUpCost();
	 public boolean canCarry(int numPassengers);
}
 class veh implements vehicle{

	 
		   
		    public double tuneUpCost(){
		    	System.out.println(45);
		    	return 2.45;
		    }
		    
		    public boolean canCarry(int x){
		    	
		    System.out.println();
		    return true;
		  }
		    public static void main(String args[]) {
		    	veh v=new veh();
		    	v.tuneUpCost();
		    	v.canCarry(25);
		    }
}
