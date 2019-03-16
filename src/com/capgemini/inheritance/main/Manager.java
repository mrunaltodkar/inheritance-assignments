package com.capgemini.inheritance.main;

public class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public Manager() {
		super();
	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		this.petrolAllowance = 0.08 * basicSalary;
		this.foodAllowance = 0.13 * basicSalary;
		this.otherAllowance = 0.03 * basicSalary;
	}

	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	
	public double getGrossSalary() {
		double grossSalary = super.getGrossSalary() + petrolAllowance + foodAllowance + otherAllowance ;
		return grossSalary;
	}
	
}
