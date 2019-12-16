package TrainExecise;

public class TrainCar {
	//TrainCar Variables
	private Passenger[] passengers = new Passenger[3]; //[null,null,null]
	private int numberOfPeople=0;
	private TrainCar pulling=null;

	//TrainCar constructor
	public TrainCar() {
		
	}
	/* TrainCar t1=new TrainCar();
	 * t1.pulling=new TrainCar();
	 * TrainCar t2=t1.pulling;
	 * t2.pulling=new TrainCar();
	 * TrainCar t3=t2.pulling;
	 * t1.pulling=t3;
	 */
	
	//addPassenger method - if car has less than 3 passengers, increment numberOfPeople
	//else if more than 3 passengers on car, create new pulling train car, and then add passenger
	public void addPassenger(Passenger passenger) {
		if(numberOfPeople<3) {
			this.passengers[this.numberOfPeople]=passenger;
			this.numberOfPeople++;
		} else {
			if(this.pulling==null)this.pulling=new TrainCar();
			this.pulling.addPassenger(passenger);
		}
	}
	
	//checkPulling Method default to not null
	public boolean checkPulling() {
		return pulling!=null;
	}
	
	//Getter for Pulling
	public TrainCar getPulling() {
		return this.pulling;
	}
	
	//Setter for Pulling
	public void setPulling(TrainCar pulling) {
		this.pulling=pulling;
	}
	
	//toString Method
	public String toString() {
		return (""+this.numberOfPeople);
	}
}
