class Car {

	int yearModel ;
	String make ;
	int speed ;

	public Car(int ymd, String mk) {

		yearModel = ymd;
		make = mk;
		speed = 0;
	}
	public void setCar(int ymd, String mk, int sp) {

		yearModel = ymd;
		make = mk;
		speed = sp;
	}


	public void getCar() {

		System.out.println("Year Model: "+yearModel);
		System.out.println("Make: "+make);
		System.out.println("Speed: "+speed);
	}

	public void accelerate() {

		speed = speed + 5;
	}

	public void carBreak() {

		speed = speed - 5;
	}
}


public class Assignment6_Q2 {

	public static void main(String[] args) {
		
		System.out.println("Current status of the car: " );
		

		Car car = new Car(2004,"Porsche");
		
		car.getCar();
		for (int i=1; i<6;i++) {
			System.out.println("Accelerating...");
			car.accelerate();
			System.out.println("Now the speed is "+car.speed);
		}
		System.out.println();
		for (int i=1; i<6;i++) {
			System.out.println("Braking...");
			car.carBreak();
			System.out.println("Now the speed is "+car.speed);			
		}
			

	}

}
