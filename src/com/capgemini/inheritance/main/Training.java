package com.capgemini.inheritance.main;

public abstract class Training {

	private int trainingId;
	private String subject;
	private double fees;
	
	public  abstract double getOrderValue();
	
	public Training() {
		super();
		
	}
	
	public Training(int id, String subject, double fees) {
		super();
		this.trainingId = id;
		this.subject = subject;
		this.fees = fees;
	}
	
	public int getId() {
		return trainingId;
	}
	public void setId(int id) {
		this.trainingId = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
