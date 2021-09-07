package inheritance;

abstract public class Teacher {
	private int Tid;
	private String Tname;
	private long mobileNo;
	
	public Teacher() {
		
	}
	public Teacher(int tid,String tname, long mobileNo) {
		this.Tid=tid;
		this.Tname=tname;
		this.mobileNo=mobileNo;		
	}
	
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	abstract void salary();

}
