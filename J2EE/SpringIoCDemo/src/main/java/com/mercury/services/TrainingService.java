package com.mercury.services;

import com.mercury.daos.RoomDao;

public class TrainingService {
	private RoomDao rd;

	public TrainingService() {
		super();
		System.out.println("Creating Training Service " + super.toString());
	}

	public TrainingService(RoomDao rd) {
		super();
		this.rd = rd;
		System.out.println("Creating Training Service with RoomDao: " + rd + " " + super.toString());
	}

	public RoomDao getRd() {
		return rd;
	}

	public void setRd(RoomDao rd) {
		this.rd = rd;
	}
	
	public void save() {
//		rd.save();
	}

	@Override
	public String toString() {
		return "TrainingService [rd=" + rd + "]";
	}
}
