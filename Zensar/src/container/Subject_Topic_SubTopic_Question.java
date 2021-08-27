package container;

class Question{
	private int id;
	private String nameString;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question(int id,String nameString) {
		super();
		this.nameString = nameString;
		this.id = id;
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+"\nThis Ends HERE");
	}
	
		
}
class SubTopic{
	private int id;
	private String nameString;
	private Question objQ;
	
	public SubTopic() {
		// TODO Auto-generated constructor stub
	}
	
	public SubTopic(int id, String nameString, Question objQ) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.objQ = objQ;
	}

	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setObjQ(Question obj) {
		this.objQ=obj;
	}
	public Question getObjQ() {
		return objQ;
	}
	
	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+" ||Call Question: "+objQ);
	}
	
}
class Topic{
	private int id;
	private String nameString;
	private SubTopic objS;
	
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	
	public Topic(int id, String nameString, SubTopic objS) {
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
	public SubTopic getObjS() {
		return objS;
	}
	public void setObjS(SubTopic objS) {
		this.objS = objS;
	}
	
	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+" ||Call Sub Topic: "+objS);
	}
	
	

}
class Subject{
	private int id;
	private String nameString;
	private Topic objT;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public Subject(int id, String nameString, Topic objT) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.objT = objT;
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
	public Topic getObjT() {
		return objT;
	}
	public void setObjT(Topic objT) {
		this.objT = objT;
	}
	
	public String toString() {
		return("\nId :"+this.id+" Name :"+nameString+" ||Call Topic:"+objT);
	}
	
	
	
	
}
/*
 * public class Subject_Topic_SubTopic_Question {
 * 
 * }
 */