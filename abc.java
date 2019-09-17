interface A
{
	public void display1();
}
interface B extends A
{
	public void display2();
}
class C implements B
{

	@Override
	public void display1() {
		System.out.println("I am method from A interface");
	}

	@Override
	public void display2() {
		System.out.println("I am method from B interface");
		
	}
	
	public void display3()
	{
		System.out.println("I am method from C interface");
	}
}

public class abc {

	public static void main(String[] args) {
		C obj=new C();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
