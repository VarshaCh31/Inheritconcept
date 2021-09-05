import java.util.*;
import java.lang.*;

class A
{  
   private int a;
   public int b;
   int c;
  
   A(int a1,int b1,int c1)
   {
      a=a1;
      b=b1;
      c=c1;
   }
  
   private void display()
   {
     System.out.println("In class A"+a+"."+b+"."+c);
   }
  
}

class B extends A
{   
   B(int d)
   {
      super(b,c);
      d=4;
   }
   
   public void display()
   {
     System.out.println("In class B"+d+"."+b+"."+c);
   }
}
  
  public static void main(string args[])
  {
      A a=new A(1,2,3);
      B b=new B(4);
      
      super.display();
      b.display();
      
  }
