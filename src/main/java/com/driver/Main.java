package com.driver;

public class Main {
  class product{
    int x;
    int y;
    int z;
	double xa;
	double ya;

	  product(int x,int y){
		  this.x=x;
		  this.y=y;
	  }
	  product(int x,int y,int z)
	  {
		  this(x,y);
		  this.z=z;
	  }

	  product(double xa,double ya){
		  this.xa=xa;
		  this.ya=ya;
	  }
    
     public int product(int x, int y) 
       {
         return x+y;
         
         
  }
	   public int product(int x, int y,int z) 
       {
        return x+y+z;
         
         
  }
	  public double product(double x, double y) {
		  
			return xa+ya;
         
		  
	  }
	 }
  
  public static void main(String args[])
  {
		product p=new product();
	  

p.product(10,15);
p.product(10,14,15);
p.product(10d,15d);
	  
	  
	  
  }
    
   
    }
