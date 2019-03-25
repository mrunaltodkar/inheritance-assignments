package com.capgemini.inheritance.main;

public class PublicTraning extends Training {

	private int participants;

	public PublicTraning() {
		super();

	}

	public PublicTraning(int id, String subject, double fees, int participants) {
		super(id, subject, fees);

		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	@Override
	public double getOrderValue() {
		return getFees() * participants;
	}

}
