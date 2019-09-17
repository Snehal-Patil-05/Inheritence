
public class Baseclass {
Baseclass(int i)
{
	System.out.println(i);
}
}
class Subclass extends Baseclass{
	Subclass()
	{
		super(10);
	}

	Subclass(int b)
	{
		super(20);
		System.out.println(b);
	}
	Subclass(int c,int d)
	{
		super(30);
		System.out.println(c+"\t"+d);
	}
		
}
class Sub
{
	public static void main(String[] args) {
		Subclass s=new Subclass(7,8);
		Subclass s1=new Subclass(12);
	}
}
