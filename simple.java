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
		 System.out.println("it is a basic drawing");
	 }
}


class Square implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a square drawn");
                                 System.out.println("it is a basic drawing");
	 }
}

class Rectangle implements Shape
{
	 @Override
	 public void draw()
	 {
		 System.out.println("a rectangle drawn");
                                 System.out.println("it is a basic drawing");
	 }
}


class ShapeFactory
{
 
	 public Shape getShape(String type) throws Exception
	 {
		 switch (type)
		 {
			 case "Circle":
				 return new Circle();
			 case "Square":
				 return new Square();
			 case "Rectangle":
				 return new Rectangle();
			 default:
				 throw new Exception( "Shape type : "+type+" cannot be instantiated");
		 }
	 }
}

class Painter
{
	public static void main(String[] args) throws Exception
	
	 {
		 
		ShapeFactory shapeFactory = new ShapeFactory();
		 Shape circle=shapeFactory.getShape("Circle");
		 circle.draw();
		 Shape square = shapeFactory.getShape("Square");
		 square.draw();
		 
		 Shape rombus = shapeFactory.getShape("Rombus");
		 rombus.draw();
		 

	 }
}