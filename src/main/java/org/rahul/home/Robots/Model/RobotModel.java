package org.rahul.home.Robots.Model;

import javax.xml.bind.annotation.XmlRootElement;


//import java.util.Date;

@XmlRootElement
public class RobotModel {

	private String id;
	private String name;
	private String schedule;
	
	RobotModel(){
		
	}
	public RobotModel(String id,String name,String schedule) {
		this.id=id;
		this.name=name;
		this.schedule=schedule;
	}
	
	
	public String getId() {
		return id;
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
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	

}
