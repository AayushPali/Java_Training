package container;

//import java.util.Scanner;
public class Main_Pen_Refill_Nib {
	public static void main(String[] args) {
		Pen newPen= new Pen();
		 
		Nib tip=new Nib("Steel",0.5f);
		Refill refill=new Refill();
		//setting values using setter
		refill.setInkColorString("Blue");
		refill.setLength(12);
		refill.settipNib(tip);
		//setting using parametrised constructor
		//newPen(refill,3,"Mercury"); but constructor already initialised above!! Can't do again.
		newPen.setRefill(refill);
		newPen.setCapLength(5);
		newPen.setBrandString("Mercury");
		//use get to retrieve values
		//getting all values by newpen as newpen has refill which has Nib
		
		String brandString;
		/*Scanner sc= new Scanner(System.in);*/
		
		brandString=newPen.getBrandString();
		System.out.println("Brand :"+brandString);
		System.out.println("Cap Lenght(cm): "+newPen.getCapLength());
		System.out.println("Refill Length(cm): "+(newPen.getRefill().getLength()));
		System.out.println("Color :"+newPen.getRefill().getInkColorString());
		//directly
		String material=tip.getMaterialTypeString();
		//properly
		float width=newPen.getRefill().gettipNib().getWidth();
		System.out.println("Nib Material: "+material);
		System.out.println("Nib Width(mm): "+width);
		
		
		
	}

}
