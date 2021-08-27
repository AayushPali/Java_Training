package day6;

public class Call_By_Value {
	private int pass;
	private static int key;
	private final int cnst=2567; 
	 
	public int getPass() {
		System.out.println("Pass: "+pass);
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public static int getKey() {
		System.out.println("Key: "+key);
		return key;
	}

	public static void setKey(int key) {
		Call_By_Value.key = key;
	}

	public int getCnst() {
		return cnst;
	}
	
	public static void main(String[] args) {
		Call_By_Value obj1=new Call_By_Value();
		obj1.setPass(250);
		obj1.setKey(350); //works but not conventional 
		Call_By_Value.setKey(351);
		Call_By_Value obj2= new Call_By_Value();
		obj2=obj1;
		//now check if heap  reference is same;
		Call_By_Value.getKey(); 
		obj2.setPass(252); 
		obj2.getPass();
		System.out.println("Pass in obj1: "+obj1.getPass());
		
	}

}
