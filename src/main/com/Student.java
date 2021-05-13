import java.util.*;
public class Student{  
 int id,marks,totalsub;  
 String dept;  
 public static void main(String args[]){  
  //Creating objects  
  Student sravani=new Student();  
  Student swathi=new Student();  
  //Initializing objects  
  sravani.id=12;  
  sravani.dept="CSE"; 
  sravani.marks=345;
  sravani.totalsub=7;
  swathi.id=24;  
  swathi.dept="ECE";
  swathi.marks=435;
  swathi.totalsub=8;
System.out.println(sravani.id+" "+sravani.dept+" "+sravani.marks+" "+sravani.totalsub);  
System.out.println(swathi.id+" "+swathi.dept+" "+swathi.marks+" "+swathi.totalsub); 
 }
}
