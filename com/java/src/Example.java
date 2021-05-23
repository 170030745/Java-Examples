/*Inheritance: Aquiring one class properties to another class.
In java there are five types of inheritance
1)single inheritance:in which 
2)multilevel inheritance
3) Hierarchical inheritance
4)multiple inheritance:It is not supported in java
4)hybrid inheritance
1)Example:
Here we take Employee as a class name and programmer is an sub class in it */
public class Employee
{
void show()
{
System.out.println(“Employee…”);
}
}
class Developer extends Employee 
{
void display()
{
System.out.println(“Developer….”);
}
}
class EmployeeDemo
{
public static void main(String args[])
{
Programmer p=new Programmer();
p.show();
p.display();
}
}
/*2)Example:
Here we take animal as a parent class of Dog and Dog is an parent class of pet*/
public class Animal
{
void display()
{
System.out.println("Animal");}  
}  
class Dog extends Animal{  
void bark()
{
System.out.println("barking");}  
}  
class Pet extends Dog{  
void eat()
{
System.out.println("eating");}  
}  
class AnimalDemo
{  
public static void main(String args[]){  
Pet p=new Pet();  
p.eat();  
p.bark();  
p.display();  
}
}  
/*3)In hierarchical inheritance, multiple subclasses extend from a single Parent class
Example: We take Animal as parent classin that we take lion and cat are the subclasses of the animal
5)It is the combination of two or more types of inheritance */








