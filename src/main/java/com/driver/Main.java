package com.driver;

public class Main {
  class roduct{
    int typesOffrutis;
    int numofdefectivefruits;
    int numofdefItem;
	doubtle x;
	  doube y;
    
     public int product(int x, int y) 
       {
         typesOffrutis=x;
         numofdefItem=y;
         
         
  }
	   public int product(int x, int y,int z) 
       {
         typesOffrutis=x;
         numofdefItem=y;
         
         
  }
	  public double product(double x, double y) {
		  this.x=x;
         this.y=y;
         
		  
	  }
	 }
  
  public static void main(String args[])
  {
		product p=new product(10,15);
	  product p=new product(10,15,10);
	  product p=new product(10,15);

	  System.out.print(p);
	  
	  
	  
  }
    
   
    }
