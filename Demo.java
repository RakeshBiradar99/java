package rak;

abstract class MotorBike {
	  abstract void brake();
	}

	class Bike extends MotorBike {
	    
	  
	  public void brake() {
	    System.out.println("Bike Brake");
	  }
	}

	class RaceBike extends MotorBike {
	    
	 
	  public void brake() {
	    System.out.println("RaceBike Brake");
	  }
	}

	class Demo {
	  public static void main(String[] args) {
	    RaceBike r1 = new RaceBike();
	    r1.brake();
	    Bike b1 = new Bike();
	    b1.brake();
	  }
	}
