package container;

public class Refill {
	private String inkColorString;
	private int length;
	private Nib tipNib;
	Refill(){
		
	}
	Refill(String color,int length, Nib tip){
		this.inkColorString=color;
		this.length=length;
		this.tipNib=tip;
	}
	public void setInkColorString(String inkColorString) {
		this.inkColorString = inkColorString;
	}
	public String getInkColorString() {
		return inkColorString;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void settipNib(Nib tip) {
		this.tipNib=tip;
	}
	public Nib gettipNib() {
		return tipNib;
	}
}
