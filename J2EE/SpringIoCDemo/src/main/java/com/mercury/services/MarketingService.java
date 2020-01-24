package com.mercury.services;

import com.mercury.daos.CameraDao;
import com.mercury.daos.FacilityDao;

public class MarketingService {

	private FacilityDao fd;
	private CameraDao cd;

	public MarketingService() {
		super();
		System.out.println("Creating MarketingService with FD, " + this.toString());
	}

	public FacilityDao getFd() {
		return fd;
	}

	public void setFd(FacilityDao fd) {
		this.fd = fd;
		System.out.println("Set FD: " + fd.toString() + " into MarketingService: " + this.toString());
	}
}
