package com.capgemini.inheritance.main;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	
	
	public static final int PT=200;
	
	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
				
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getGrossSalary() {
		double grossSalary = this.basicSalary + this.basicSalary/2 + this.medical;
		return grossSalary;
	}
	
	public double getNetSalary() {
		double netSalary = getGrossSalary() - (PT + (12 * this.basicSalary)/100);
		return netSalary;
	}
	
	

}
