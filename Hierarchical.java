class Base1
{
	Base1(int num)
	{
		System.out.println(num);
	}
}
class Child1 extends Base1
{
	Child1()
	{
		super(100);
		System.out.println("Child1");
	}
}
class Child2 extends Base1
{
	Child2()
	{
		super(200);
		System.out.println("Child2");
	}
}
public class Hierarchical {
public static void main(String[] args) {
	Child2 ch=new Child2();
	Child1 ch1=new Child1();

}
	
}
