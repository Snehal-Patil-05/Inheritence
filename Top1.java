
 class Top {

	public void disp1()
	{
		System.out.println("Top1");
	}
	
}
class Bottom1 extends Top 
{
	public void disp1()
	{
		System.out.println("Bottom1");
	}
}
class Bottom2 extends Top
{
	public void disp1()
	{
		System.out.println("Bottom2");
	}
}

class Top1{
	static void perform(Top t)
	{
		t.disp1();
	}
	
	public static void main(String[] args) {
		perform(new Top());
		perform(new Bottom1());
		perform(new Bottom2());
	
	}
}