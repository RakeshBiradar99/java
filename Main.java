package rak;
	 abstract class Animal {
		  abstract void makeSound();

		  public void eat() {
		    System.out.println("I can eat.");
		  }
		}

		class Cat extends Animal {

		
		  public void makeSound() {
		    System.out.println("make sounds");
		  }
		}

		class Main {
		  public static void main(String[] args) {

		    
		    Cat c1 = new Cat();

		    c1.makeSound();
		    c1.eat();
		  }
		}


