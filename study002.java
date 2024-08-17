package myFirst;

public class study002 {
	
	public static void main(String args[]){    
		  int count=10;  
		  float pincome[][] =  new float[2][3];
		  pincome[0][0] = (float) 5.8;
		  pincome[0][0] = (float) 19.2;
		  pincome[0][0] = (float) 519.2;
		  pincome[0][0] = (float) 51.8;
		  pincome[0][0] = (float) 9.2;
		  pincome[0][0] = (float) 19.2;		
		 } 
	 static void print(float[][] arr)
	 {
		 for(int i =0 ; i<arr.length; i++)
		 {
			 for(int j =0;j < arr[0].length; j++)				 
			 {
				 System.out.print(arr[i][j] + "\t");
				 System.out.print("\n");
			 }
			 System.out.println();
		}
	 }	 
	  

}
