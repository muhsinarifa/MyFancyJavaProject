// Factory Pattern follow

//This is the interface for all shapes
interface Shape
{
	void draw();
}

// below this functions implement the interface and follow the factory pattern
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

public class ShapeFactory {
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
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
		 
		 
		 

		//get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape3.draw();
		
	 }
}
