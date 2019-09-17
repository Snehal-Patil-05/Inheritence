/*create interface "Game" , have an abstract method "play()".
 *  from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
 Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference 
as parameter.inside "perform()" see to it that any child object passed ,its "play()" 
method should be invoked. Call "perform()" method from main function.*/

interface Game{
	public void play();
}
class Cricket implements Game{

	@Override
	public void play() {
	System.out.println("Playing Cricket");
	}
}
class Football implements Game{

	@Override
	public void play() {
		System.out.println("Paying Football");
		
	}
	
	
}
class Tennis implements Game
{

	@Override
	public void play() {
		System.out.println("Playing Tennis");
		
	}
	
}
public class Mainclass {
public static void perform(Game g)
{
	g.play();
}
public static void main(String[] args) {
	perform(new Cricket());
	perform(new Football());
	perform(new Tennis());
}

}
