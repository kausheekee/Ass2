class Quadrilaterals
{
 public double base,height;
 public double getArea()
	{

	double area=base*height;
	return area;
	
	}
}

class Rectangle extends Quadrilaterals 
{
	public Rectangle(double base, double height)
	{
		this.base = base;
		this.height = height;
		System.out.println("The area of the Rectangle is " +getArea()); 	
   	}
}  
class Square extends Quadrilaterals 
{
	public Square(double base, double height) 
	{
        	this.base = base;
        	this.height = height;
		if (base == height)
         	{
           		System.out.println("The area of the Square is " +getArea());
          	} 
         	else
        	{
           		System.out.println("The base and height of the square must be equal");
         	}
	}
}
class Triangle extends Quadrilaterals
{
	public Triangle(double base,double height) 
   	{
        	this.base = base;
                this.height = height;
		System.out.println("The area of the Triangle is " + (0.5*getArea()));
        }
}
class Parallelogram extends Quadrilaterals  
{
	public Parallelogram(double base, double height)
	{
      		this.base = base;
           	this.height = height;
		System.out.println("The area of the Parallelogram is " +getArea());
	}
} 
public class AreaOfShapes
{
	public static void main(String[] args)
	{
		Rectangle c = new Rectangle(5,2);
		
		Square d = new Square(5,5); 
       
		Triangle t = new Triangle(5,7);
        	
        	Parallelogram p=new Parallelogram(2,3);	
    	}
}



        
        


        
        
        