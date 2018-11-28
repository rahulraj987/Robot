package org.rahul.home.Robots.Service;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.rahul.home.Robots.Model.RobotModel;

public class RobotService {

	
	public List<RobotModel> GetRobotDetails() {
		
		RobotModel r1 = new RobotModel("123","Robo1","23-11-2018T22:00:00");
		RobotModel r2 = new RobotModel("123","Robo1","23-11-2018T22:00:00");
		
		List<RobotModel> l1= new ArrayList<>();
		l1.add(r1);
		l1.add(r2);
		
		return l1;
		
		
	}
}
