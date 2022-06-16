
public class Abstract_demo {

	public static void main(String[] args) {
		Scooty Activa =new Scooty();
		Activa.noofwheels();
		// TODO Auto-generated method stub

	}

}

abstract class Vehicle     //Partially Implemented class
{
	abstract public void noofwheels();
	
}

class Scooty extends Vehicle 
{
      public void noofwheels() {
    	  System.out.println("No of wheels in scooty="+ 2);
      }
      public void m() {
}
}

