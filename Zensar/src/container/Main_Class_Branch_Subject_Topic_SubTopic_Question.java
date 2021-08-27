package container;

public class Main_Class_Branch_Subject_Topic_SubTopic_Question {
	public static void main(String[] args) {
		Question objQuestion= new Question(1,"Question");
		SubTopic objSubTopic= new SubTopic();
		objSubTopic.setId(12);
		objSubTopic.setNameString("Sub Topic");
		objSubTopic.setObjQ(objQuestion);
		Topic objTopic= new Topic(13,"Topic",objSubTopic);
		Subject objSubject= new Subject(14,"Subject",objTopic);
		Branch objBranch= new Branch(15,"Branch");
		objBranch.setObjS(objSubject);
		Class objClass= new Class(16,"Class",objBranch);
		//Data Entry complete..tight coupling.CONTAINMENT
		//Now print Everything... have overloaded toString to print instance variables
		System.out.println(objClass);
		//get Question using Class object
		
		String qnameString =objClass.getObjB().getObjS().getObjT().getObjS().getObjQ().getNameString();
		System.out.println("Accessing Question Name using object of Class"+qnameString);
		
	}

}
