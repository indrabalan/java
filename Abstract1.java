package Firstpackage;

abstract class Bike1
{  
  abstract void run();
} 

class Abstract1 extends Bike1{  
void run()
{
   System.out.println("running safely");
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 obj = new Abstract1();  
		obj.run(); 
	}

}
