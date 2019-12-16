package TrainExecise;

public class Test {

	public static void main(String[] args) {
		//Create new Train
		Train test = new Train();
		
		//create variable for loop
		int i = 0;
		
		//create loop to create 10 passengers to test Train
		while (i < 10 ) {
			test.add(new Passenger());
            i++;
		}
		
		System.out.println("Count total number of train cars: ");
		
        //Print carCount
        System.out.println(test.countCars()+ "\n");
        System.out.println("Remove first train car:");
        
        //Remove first train car
        test.removeCar(1);
        System.out.println("you removed train car: " + (test.index+1) + "\n");
        
        //print recounted number of train cars on train
        System.out.println("Recount total number of train cars: ");
        System.out.println(test);
	}        
}
		
		


