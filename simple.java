package creational.pattern;

interface Shape
{
	void draw();
}


class Circle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a circle drawn");
	 }
}


class Square implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a square drawn");
	 }
}

class Rectangle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a rectangle drawn");
	 }
}

class Painter
{
	 public static void main(String[] args) 
	 {
		 
		 
		 Circle c=new Circle();
		 c.draw();
		
	 }
}