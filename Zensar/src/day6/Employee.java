package day6;

public class Employee {
	
	private int eid;
	private String name;
	private int salary;
	Department obj_depart;
	
	public Employee() {
	}

	public Employee(int eid, String name, int salary, Department obj_depart) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.obj_depart = obj_depart;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getObj_depart() {
		return obj_depart;
	}

	public void setObj_depart(Department obj_depart) {
		this.obj_depart = obj_depart;
	}
	
	

}
