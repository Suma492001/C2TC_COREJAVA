
public class Customer {
	//variables
	private int customerId=1;
	private String customerName;
	private String customerCity;
	
	void display() {
	}
	//void show() {
	
	//}
	
	//int show() {
		
	//}
	
	//User Defined constructor -no argument
	Customer(){
	System.out.println("In user defined No argument constructor");
	}
	
	//user Defined Constructor  -parametrised/argumented Constructor
	Customer(int id,String name,String city){
		customerId=id;
		customerName=name;
		customerCity=city;		
	}
	
	
	//Constructor:
	//1.Special Methods
	//2. Methods has return type; Constructor doesn't have return type
	//3. Method name can be any valid name; constructor name always be same as your class name
	//4. Method manually invoked using object reference;
	//Constructor automatically invoked at the time of object creation
	//5. Types: Default and UserDefined Constructor
	//6. Default :- no argument constructor
	//7. user Defined :- no argument constructor and parameterised constructor
	
	
	//Methods
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
