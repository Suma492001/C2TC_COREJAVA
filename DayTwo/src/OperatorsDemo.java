
public class OperatorsDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=10;
		System.out.println(a + " " + b); //Concatenation
		//2+"4" //concatenation
		//2|4 //addition
		//"2" + "4" //concatenation
		//String d =2+"4"; //concatenation
	//	int e = 214 ;//addition
		//String f ="2" + "4" ; //concatenation
		//System.out.println(d); //C
		//System.out.println(e); //A
	//	System.out.println(f); //C
		
		++a;//a-10->11 //11 output
		int d= ++a + b + a--; //41 //44//40//42//output
		int e =++a + b + --a;
		     //  12 + 20 +
		     //12+20+12 -44
		      System.out.println("d=" + d);
		      System.out.println("e=" + e);
		      System.out.println("a=" + a);
		      
		 int x =c++ + a + b--; // 10+ 11 +20 =41
		 System.out.println("x=" +x);
		       
   //pre increment/pre decrement
   //1. Increment/decrement
   //2. Assign the result to the variable or for further use
		       
   //post increment /post decrement
   // 1.Assign the value to the variable or for further use
   // 2. Increment/Decrement
		 
   //Ternary Operator
		//c= (10 ==c) ? 1:0;
		//System.out.println(c);
		 
		 int i;
		 int j;
		 for(i=1;i<=5;i++)
		 {
			 for(j=1;j<=5;j++)
			 {
			 if(i==1||i==5||j==1||j==5)
			 {
				 System.out.print("*");
			 }
			 else
				 
			 {
				 System.out.print(" ");
			 }
		 }
		 
		 System.out.println();
		       
		       
		
		

	}

}
	
