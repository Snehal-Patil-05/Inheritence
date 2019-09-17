//public>protected>default>private
class Vehicle {

	public void start()
	{
		System.out.println("I m Vehicle");
	}
	}
	
class Fourwheeler extends Vehicle{
	public void start()
	{
		System.out.println("I am Fourwheeler");
	}
}


public class Over{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fourwheeler fw=new Fourwheeler();
fw.start();
		
	}	
}
