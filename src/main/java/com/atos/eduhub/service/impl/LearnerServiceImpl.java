package com.atos.eduhub.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.atos.eduhub.model.Demo;
import com.atos.eduhub.model.Learner;
import com.atos.eduhub.service.LearnerService;

import java.security.Timestamp;

@Component
public class LearnerServiceImpl implements LearnerService{
	
	@Override
	public Learner addLearner(Learner newLearner) {
	//	newLearner.setName("Add new learner");
		return newLearner;
	}

	@Override
	public String delete1Learner(int id) {
		return "Deleted Learner id" + id;
	}

	/*@Override
	public String viewAllLearners() {
		return "No records to display";
	}*/

	@Override
	/*public String viewAllLearners() {*/
	  public List<Learner> viewAllLearners() {
		List<Learner> getLearner = new ArrayList<Learner>();
		Learner learner1 = new Learner();

		learner1.setRequestId(1001);
		learner1.setUserId(2001);
		learner1.setRole("Learner");
		learner1.setCourseId(3001);
		learner1.setRmid(4001);
		learner1.setApprovalId(5001);
		learner1.setApprovalStatus("Aproved");
		learner1.setStatusMessage("Request Approved");
		learner1.setAssignmentId(6001);
		learner1.setAssignmentStatus("Assigned");
		learner1.setAssignmentStatusMessage("Assignment Assigned");
		learner1.setLearnerDescription("Student");
		learner1.setLearnerScore("91");
		//learner1.setLast_update_on(2021-07-16-00.00.00.000001);

		/*getLearner.get1Learner(learner1);*/

		Learner learner2 = new Learner();

		learner2.setRequestId(1002);
		learner2.setUserId(2002);
		learner2.setRole("Learner");
		learner2.setCourseId(3002);
		learner2.setRmid(4002);
		learner2.setApprovalId(5002);
		learner2.setApprovalStatus("Pending");
		learner2.setStatusMessage("Request Pending");
		learner2.setAssignmentId(6002);
		learner2.setAssignmentStatus("Pending");
		learner2.setAssignmentStatusMessage("Assignment Pending");
		learner2.setLearnerDescription("Student");
		learner2.setLearnerScore("92");
		//learner2.setLast_update_on("2021-07-16-00.00.00.000002");

		/*getLearner.get1Learner(learner2);*/

		Learner learner3 = new Learner();

		learner3.setRequestId(1003);
		learner3.setUserId(2003);
		learner3.setRole("Learner");
		learner3.setCourseId(3003);
		learner3.setRmid(4003);
		learner3.setApprovalId(5003);
		learner3.setApprovalStatus("Rejected");
		learner3.setStatusMessage("Request Rejected");
		learner3.setAssignmentId(6003);
		learner3.setAssignmentStatus("Not Applicable");
		learner3.setAssignmentStatusMessage("Not Applicable");
		learner3.setLearnerDescription("Student");
		learner3.setLearnerScore("93");
		//learner3.setLast_update_on("2021-07-16-00.00.00.000003");

		/*getLearner.get1Learner(learner3);*/

		return getLearner; 
	}	

}