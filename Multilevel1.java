class Base
{
	/*Base()
	{
		System.out.println("Base constructor");
	}*/
	Base(int i)
	{
		System.out.println(i);
	}
}
class child1 extends Base
{
	child1(int j)
	{
		super(10);
		System.out.println(j);
	}
}
class child2 extends child1
{
	child2()
	{
		super(20);
		System.out.println("Child2 constructor");
	}
}

public class Multilevel1 {

	public static void main(String[] args) {
		child2 ch=new child2();

	}

}
