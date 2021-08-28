package container;

public class Main_Refill_Nib2_toString_Constructor {
	public static void main(String[] args) {
		Pen objPen= new Pen(new Refill("red",10,new Nib("copper", 0.5f)),4,"Montex");
		System.out.println(objPen.toString());
	}

}
