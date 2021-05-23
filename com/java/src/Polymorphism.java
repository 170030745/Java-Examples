/* Polymorphism: It is a concept of doing a same action in different forms.
In polymorphism we have method overloading and method overriding.

Method overloading : We perform this in a class with same method names but using different parameters */

public class Shape
{
public double area(double l,double b)
{
return m*n;
}
public double area(double s);
{
return s*s;
}
class Overloding
{
public static void main(String args[])
{
System.out.println(Shape.area(10.5,5.5));  
System.out.println(Shape.area(8.5));
}
}

/* Method overriding: If child class has the same method name and same parameters as declared in the parent class. */

 class Mobile
{
void design()
{
System.out.println(“mobile design”);
}
}
class Samsung extends Mobile
{
void design()
{
System.out.println(“Samsung mobile has different design”);
}
}
class MobileDemo
{
public static void main(String args[])
{
Samsung s=new Samsung();
s.design();
}
}



