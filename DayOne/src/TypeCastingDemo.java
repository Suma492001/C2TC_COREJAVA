
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Implicit Casting Widening Casting
		byte b=10; //1byte=8 bits
		int i=b; //int -4 bytes//Implicit
		
		float f=22.14f; //float -4 bytes //double -8 bytes
		double d=f; //Implicit
		
		char ch='A'; //char -2 bytes //int -4bytes
		int ione=ch; //Implicit
		
		//Explicit casting
		double done=10.52f; //Implicit or Widening
		long l=(long)done; //long -8bytes,double-8 bytes
		System.out.println(done);
		System.out.println(1);

		//long lone=98738448784044079;
	//	int itwo=lone; //long -8bytes,int-4 bytes
		
		byte bone=90; // 1 byte-8 bits
		char chone=(char)bone; //char-2bytes
	
	}

}
