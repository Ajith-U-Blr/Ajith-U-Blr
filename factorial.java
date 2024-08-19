package myFirst;

class factorial
{
	 static int getfactorial(int n)
	 {  
	  if (n == 0)  
	    return 1;  
	  else  
	    return(n * getfactorial(n-1));  
	 }  
	 public static void main(String args[])
	 {
	  int i,fact=1;
	  int number=4;  
	  fact = getfactorial(number); 
	  System.out.println("Factorial of "+number+" is: "+fact);  
	 }
	}

