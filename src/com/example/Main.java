class Voorbeeld{
	public static void main(String... args){
		System.out.println("Hallo");
		System.out.println("Wereld");
		int getal1; // Declaratie
		getal1 = 9; // Initialisatie

		int getal2 = 14;
		int getal3, getal4;

		int getal5 = 7, getal6;
//		System.out.println(getal3);  // Kan Niet
		
		Auto auto = null;
		Auto car = new Auto();
		Voorbeeld jojo = new Voorbeeld();
		jojo.uitproberen("hoi");

		System.out.println( 36    );
	}

	static int optellen(){

		return 6;
	}


	static void uitproberen(){
		System.out.println("hoppakee");
	}		
	void uitproberen(int a){
		System.out.println("hoppakee");
	}
	void uitproberen(String b){
		System.out.println("in string");
	}		

}


class Auto{

	static int carsAmount;
	private String brand = "bmw";

	static int getAmountOfCars () {
		return carsAmount;
	}	

	String getBrand () {
		return this.brand;
	}
}
