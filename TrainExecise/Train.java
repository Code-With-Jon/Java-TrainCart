package TrainExecise;

public class Train {
	//Train Variables
	private TrainCar traincar=null;
	int index;
	
	//Train constructor with one train car
	public Train() {
		traincar = new TrainCar();
	}
	
	//add passenger method passing in Passenger p variable
	public void add(Passenger p) {
		 traincar.addPassenger(p);
	  }
	
	//countCars method - start count from at least 1 train car	
	public int countCars() {
		return countCars(traincar,1);
	}
	
	//Overload countCars method
	public int countCars(TrainCar next,int count) {
		//if there's a next traincar, increment count by 1, and update count
		if (next.checkPulling()) {
			count++;
			count = countCars(next.getPulling(),count);
		} 
		return count;
	}
	
	//removeCar method
	public void removeCar(int index) {
		TrainCar current_car=traincar;
		for (int i = 0;i < index; i++){
			current_car=current_car.getPulling();
		}
		TrainCar nextCar=current_car.getPulling().getPulling();
		current_car.setPulling(nextCar);
	}
	
	//toString method
	public String toString() {
		return(""+this.countCars());
	}
}
	

