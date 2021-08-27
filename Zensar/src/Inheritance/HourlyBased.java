package Inheritance;

public class HourlyBased extends Teacher{
	int rate_per_hour;
	int hrs;
	public HourlyBased(int rate_per_hour, int hrs) {
		super();
		this.rate_per_hour = rate_per_hour;
		this.hrs = hrs;
	}
	void salary() {
		int salary = rate_per_hour*hrs;
		//Should have initialized instance vars of Teacher
		System.out.println("Salary of"+this.getTname()+"is "+salary);
		
	}
	

}
