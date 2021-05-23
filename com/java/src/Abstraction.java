/*Abstraction:  Hiding internal details and showing required information
In this we can have both abstract and non-abstract methods
Example:we take shape as an abstarct class in which contains abstract method area . */
abstract class Shape
{
double length=7.5;
double width=5.5;
abstract void area();
}
class Rectangle extends Shape
{
void area()
{
System.out.println(length*width);
}
}
class ShapeDemo
{
public static void main(String args[]) 
{
Shape s=new Rectangle();
s.area();
}
}


