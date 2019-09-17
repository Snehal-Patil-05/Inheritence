class Parent1{
	public void Disp1()
	{
		System.out.println("Heyy!!");
	}
}
interface Parent2{
	public void Disp2();
}

class child extends Parent1 implements Parent2
{

	@Override
	public void Disp2() {
		// TODO Auto-generated method stub
		System.out.println("Class Parent2 method");
	}
	
	
	public void Disp1()
	{ 
		super.Disp1();
		System.out.println("Class Parent1 method");
	}
	
}

public class Demo1 {
public static void main(String[] args) {

	
	child ch=new child();
	ch.Disp1();
	ch.Disp2();
}
}
