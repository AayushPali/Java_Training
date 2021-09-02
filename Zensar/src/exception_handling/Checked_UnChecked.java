package exception_handling;

import java.io.FileReader;

public class Checked_UnChecked {
	public static void main(String[] args) {
		try {
			FileReader f= new FileReader("X://");	//checked exception, compiler forced to implement try catch
		}             								//FileReader.class has throws in it's method
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("This always prints");
		}
		int d= 6/0;
		System.out.println(d);						//unchecked exception
	}

}
