
public class ThrowsDEmo {
	void myMethod(int num) throws IoException,ClassNotFoundException{
		if(num==1) {
			throw new IOException("IO Exception occured");
		}
		else {
			throw new ClassNotFoundException("Class not found Eexception occureed");
		}
	}
	
	public static void main (String[] args) {
		ThrowsDemo td =new ThrowsDemo();
		try {
			td.myMethod(1);
		}
		catch(Exception.e) {
			
		}
	}

}
