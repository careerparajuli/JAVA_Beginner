
public class MasterDocument2 {

	public static void main(String[] args) {
		
		//Creating object of class aircraft
				aircraft Boing = new aircraft();
				
				Boing.passengers=100;
				Boing.cruisespeed= 12;
				Boing.fuelBurnRate=10;
				Boing.fuelCapacity=50;
				
				System.out.println("For Boing");
				System.out.println("No. of Boing passenger: "+Boing.passengers);
				System.out.println("Fuel burn rate: "+Boing.fuelBurnRate);
				System.out.println("Crusie speed: "+Boing.cruisespeed);
				System.out.println("Fuel capacity: "+Boing.fuelCapacity);
				
				//Calculation with Instance variables of an object
				double calculateRunTimes;
				calculateRunTimes= Boing.fuelCapacity/Boing.fuelBurnRate;
				System.out.println("Run Time of Boing is: "+calculateRunTimes);
				
				
				aircraft Spirit = new aircraft();
				//aircraft Spirit = new aircraft(150,10,5,40);
				Spirit.passengers=150;
				Spirit.cruisespeed= 10;
				Spirit.fuelBurnRate=5;
				Spirit.fuelCapacity=40;
				
				
				Spirit.calculateRunTime();
				
				System.out.println("Runtime of Boing is: "+ Boing.calculateRunTimeee());
				
				System.out.println("Fuel Needed "+Boing.fuelNeeded(2.5));
				System.out.println("Fuel Needed" +Spirit.fuelNeeded(2.5));		
				
				
				//for static we don't need object to be created
				aircraft.wings=2;
				System.out.println("No. of wings in any plane is : "+aircraft.wings);
				System.out.println("No of wings of Boing is: "+Boing.wings);
				System.out.println("No. of wings in Spirit is: "+Spirit.wings);
				
		printFirstName();
		printLastName();
		nameGreetings("John");
		
		
		int num1 = 11;
		int num2= 7;
		System.out.println("Multiplication reasult is: "+ multiplyNumber(num1, num2));
		System.out.print("Num 1 and Num2 are equal: ");
		System.out.println(equalNumbers(num1, num2));
		System.out.println("Adding two numbers: "+addNumbers(num1, num2));
	}
	
	public static void printFirstName() {
		System.out.print ("Ujjwal");
	}
	public static void printLastName() {
		System.out.println(" Parajuli");
	}
	public static void nameGreetings(String name) {
		System.out.println("Greetings: "+ name);
	}
	public static int multiplyNumber(int a, int b) {
	    int	number = a*b;
		return number;
	}
	public static double addNumbers (int a, int b) {
		return (a+b);
	}
	public static boolean equalNumbers( int a, int b) {
		 if (a==b) return true;
		 else 
			 return false;

	}

}

//Class Aircraft away from main method
class aircraft{
	int passengers;
	int cruisespeed;
	double fuelCapacity;
	double fuelBurnRate;	
	static int wings;
	
//	//Constructor
//			aircraft(int p, int c, double fc, double fbr){
//				passengers= p;
//				cruisespeed = c;
//				fuelCapacity = fc;
//				fuelBurnRate = fbr;
//			}
	
	
	//Methods to calculate spiritRunTime
	void calculateRunTime() {
		double runTime;
		runTime= fuelCapacity/fuelBurnRate;
		System.out.println("The runTime of Spirit is: "+ runTime);
		
	}
	//Methods to calculate BoingRun time
	 double calculateRunTimeee() {
		 double runTime;
		 runTime= fuelCapacity/fuelBurnRate;
		 return runTime;
	 }
	//Methods to calculate fuelNeeded
	 double fuelNeeded (double time ) {
		 return fuelBurnRate* time;
	 }
	
}

