package container;
//Branch and Class have overloaded parametrised constructors
class Class{
	private int id;
	private String nameString;
	Branch objB;
	public Class() {
		// TODO Auto-generated constructor stub
	}
	public Class(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}
	public Class(int id, String nameString, Branch objB) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.objB = objB;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Branch getObjB() {
		return objB;
	}
	public void setObjB(Branch objB) {
		this.objB = objB;
	}
	
	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+"|| Call Branch: "+objB);
	}
	

}
class Branch{
	private int id;
	private String nameString;
	Subject objS;
	public Branch() {
		// TODO Auto-generated constructor stub
	}
	public Branch(int id,String nameString) {
		super();
		this.nameString = nameString;
		this.id = id;
	}
	
	public Branch(int id, String nameString, Subject objS) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.objS = objS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Subject getObjS() {
		return objS;
	}
	public void setObjS(Subject objS) {
		this.objS = objS;
	}

	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+"|| Call Subject: "+objS);
	}
	
	
}
