package org.rahul.home.Robots.Robot;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rahul.home.Robots.Model.RobotModel;
import org.rahul.home.Robots.Service.RobotService;

@Path("/RobotsList")
public class Robot {

	
	RobotService service = new RobotService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<RobotModel> getRobot(){
		//return "HelloWorld";
		return service.GetRobotDetails();
	}
	
}
