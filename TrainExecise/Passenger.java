package TrainExecise;


public class Passenger {
	//Class Variables
	private String firstName;
	private String lastName;
	
	//Constructor
	public Passenger() {
		
	}
	
	//Getters & Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//To-String Method
		public String toString() {
			StringBuilder str=new StringBuilder();
		   	str.append("First Name: ");
			str.append(this.getFirstName() +"\n Last Name: ");  
			str.append(this.getLastName());
			//Return Results
			return str.toString();
		}
}
