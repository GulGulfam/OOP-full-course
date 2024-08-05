import java.util.ArrayList;
class Main {
	public static void main(String[] args) {

		Wheel w2[] = new Wheel[4];
		w2[0] = new Wheel(45);
		w2[1] = new Wheel(1);
		w2[2] = new Wheel(5);
		w2[3] = new Wheel(25);

		System.out.println("Displaying Wheel Pressure: ");
		for (Wheel data: w2 ) {
			System.out.println(data);

		}


		MediaPlayer pl1[] = new MediaPlayer[2];
		pl1[0] = new MediaPlayer(14);
		pl1[1] =new MediaPlayer(45);

		System.out.println("\nDisplying MediaPlayer volume: ");
		for (MediaPlayer show : pl1 ) {
			System.out.println(show);
			
		}

		Engine eng1 = new Engine(45,true);
		System.out.println("\nDisplying Engine");
		System.out.println(eng1);

		Car car2 = new Car("Black",80,2003,eng1,w2,pl1);
		System.out.println("\nDisplying car:");
		System.out.println(car2);

		System.out.println("\nApplying Start,Stop,VoluneUp,Down\n ");

		if (car2.getSpeed()==0) {
			if (eng1.start()) {
				System.out.println("Engine start");
				
			}
			else{
				System.out.println("Stop Engine");
			}

			
			System.out.println("Volume up for 1st mediaplayer : " +pl1[0].volumeUp());
			System.out.println("Volume up for 2nd mediaplayer : " +pl1[1].volumeUp());
		}
		else{
			if (eng1.stop()) {
				System.out.println("Car Start");
				
			}
			else{
				System.out.println("Car Stop");
			}

			System.out.println("Volume down for 1st mediaplayer: " +pl1[0].volumeDown());
			System.out.println("Volume down for 2nd mediaplayer: " +pl1[1].volumeDown());

		}
		System.out.println("\nDisplaying Wheel Pressure");


		for (int i=0; i<w2.length ; i++ ) {
			if (w2[i].getAirPressure()<10) {
				car2.park();
				w2[i].setAirPressure(30);
				
			}	

			System.out.println(w2[i]);
			System.out.println();

		}

		// int acc = 5;
		// acc.accelerate();
		System.out.println("After applying speedUp method on car speed: " +car2.speedUp());

		// System.out.println("\nAfter applying accelerate: " +car2.accelerate());

		


		










		




	}
	
}