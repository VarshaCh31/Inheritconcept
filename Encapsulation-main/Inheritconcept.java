import java.util.*;
import java.lang.*;

class A
{  
   int a,b,c;
  
   A(int a1,int b1,int c1)
   {
      a=a1;
      b=b1;
      c=c1;
   }
  
   public void display()
   {
     System.out.println("In class A");
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
   }
  
}

class B extends A
{    
    int d;
     B(int a,int b,int c, int d1)
     {
       super(a,b,c); //call the superclass constructor to initialize
       d=d1;
     }  
     
  
   public void display()  //method overriding
   {
     super.display(); // display superclass instance variable values
     System.out.println("In class B");
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
   }
}

class Inheritconcept
{
  public static void main(String args[])
  {
      
      B bob= new B(1,2,3,4);
      bob.display();           
      
  }

}
  
  
