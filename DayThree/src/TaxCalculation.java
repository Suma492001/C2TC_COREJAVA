
public class TaxCalculation {
	
	public void calculateTax(Person person) {
		if(person.getAge()>65||person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax is not applicable");
		}
		
	}

}
