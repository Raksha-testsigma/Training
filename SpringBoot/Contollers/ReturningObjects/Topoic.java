
//ignore typo Topic-->Topoic

package com.example.demo;

public class Topoic {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public Topoic() {
		
	}
	public Topoic(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	private String Department;
}
