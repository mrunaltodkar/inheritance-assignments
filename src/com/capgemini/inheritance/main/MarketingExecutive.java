package com.capgemini.inheritance.main;

public class MarketingExecutive extends Employee {

	private double travelledKillometers;
	private double travelAllowance;
	public static final int TELEPHONE_ALLOWANCE = 1500;

	public MarketingExecutive() {
		super();

	}

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical, double travelledKillometers) {
		super(employeeId, employeeName, basicSalary, medical);

		this.travelledKillometers = travelledKillometers;
		this.travelAllowance = 5 * travelledKillometers;

	}

	public double getTravelledKillometers() {
		return travelledKillometers;
	}

	public void setTravelledKillometers(double travelledKillometers) {
		this.travelledKillometers = travelledKillometers;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	
	public double getGrossSalary() {
		double grossSalary = super.getGrossSalary() + this.travelAllowance + TELEPHONE_ALLOWANCE;
		return grossSalary;
	}

}
