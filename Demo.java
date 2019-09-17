abstract class Shape
{
	abstract public void draw();
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Triangle");
	}
}
class Polygon extends Shape
{
public void draw()
{
	System.out.println("Draw a Polygon");
}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Circle");
	}
}

public class Demo {

	public static void main(String[] args) {
		Shape ref[]=new Shape[3];
		ref[0]=new Triangle();
		ref[1]=new Polygon();
		ref[2]=new Circle();
	
	for(int i=0;i<ref.length;i++)
	{
		ref[i].draw();
	}
	
	}

}
