package rakesh;

public class sumofeven {
	public static void main(String[] args) {
	     int n = 100;
		int sum=0, num = 1, count=0;
		while(count<n){
		    
		    if(num%2 == 0){
		        sum += num;
		        count++;
		    }
		    num++;
		}
		System.out.println("Sum: "+sum);
	}
}
