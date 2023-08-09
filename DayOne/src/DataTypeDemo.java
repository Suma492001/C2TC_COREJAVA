
public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5/3;
		//float a = 5.6d;
		float a1 =(float)5.6d;
		float valueone = 101/61;
		float valuetwo =101f/61f;
		double valuethree =101d/61d;
		double valuefour=101f/61f;//correct//RHS-Float -4 Bytes ;LHS -Double -8 bytes//automatically//Implicit
		
		//float valuefive=101d/61d; //LHS=Float-4 Bytes ; RHS double -8 Bytes// Manually //Explicit
		
		System.out.println(value); //2or 3//no round up
		System.out.println(valueone);
		System.out.println(valuetwo);
        System.out.println(valuethree);
        System.out.println(valuefour);
        System.out.println(a1);
        
        
        
        int marker=512;
        double percentage=marker*0.46f;
        System.out.println(percentage);
	}

}
