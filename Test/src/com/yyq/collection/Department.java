package com.yyq.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
	
	private String name;
	private String[] empNames;
	private List<Employee> emplist;
	private Set<Employee> empset;
	
	private Map<String, Employee> empmap; 

	public Map<String, Employee> getEmpmap() {
		return empmap;
	}
	public void setEmpmap(Map<String, Employee> empmap) {
		this.empmap = empmap;
	}
	public Set<Employee> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<Employee> empset) {
		this.empset = empset;
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpNames() {
		return empNames;
	}
	public void setEmpNames(String[] empNames) {
		this.empNames = empNames;
	}
	

}
