
public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		int x=8;
		int y=7;
		int a=10;
		int b=11;
		
		if(x>=y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//bitwise OR(|) and Logical OR(||)
		//Bitwise AND(&) and Logical AND (&&)
        if(!(a<b) || (a==b)) //T || F =T
        	//F || F = F
         {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}
