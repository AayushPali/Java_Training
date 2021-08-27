package container;
import java.util.Scanner;

public class Main_Person_Vehicle {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Vehicle Id & Vehicle Name: ");
		Vehicle newVehicle= new Vehicle(sc.nextInt(),sc.next());
		System.out.println("Enter Id,Name:");
		Person newPerson= new Person(sc.nextInt(),sc.next(),newVehicle);
		sc.close();
		//Is it possible to enter data withou creating Vehicle object??
		System.out.println("Name: "+newPerson.nameString
				+"\nId: "+newPerson.id
				+"\nVehicle : "+newPerson.vehicle.vNameString
				+"\nVehicle Id: "+newPerson.vehicle.vId);
	}

}
