
public class Validation {
	public static void Validate(int age,int weightr)throws InvalidBloodDonateException{
		if(age<18&& weight<60)
			throw new  InvalidBloodDonateException("Not eligible");
		else
			System.out.println("ypu are eligible to donate blood");
	}

}
