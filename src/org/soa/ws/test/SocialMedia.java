package org.soa.ws.test;

public class SocialMedia {
	
	private String director;
	private String launchYear;
	private String name;
	
	
	public SocialMedia (String name, String launchYear, String director) {
		this.name = name;
		this.launchYear = launchYear;
		this.director = director;
	}
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLaunchYear() {
		return launchYear;
	}
	public void setLaunchYear(String launchYear) {
		this.launchYear = launchYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
