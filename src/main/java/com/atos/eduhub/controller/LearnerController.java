package com.atos.eduhub.controller;

import java.util.List;

//import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.eduhub.model.Learner;
import com.atos.eduhub.model.LearnerModel;
import com.atos.eduhub.service.LearnerService;
//import com.atos.eduhub.service.impl.LearnerServiceImpl;

@RestController
@RequestMapping("/eduhubapi/v1")
public class LearnerController {

	@Autowired(required = true)
	LearnerService learnerService;

	// Add Learner
	@PutMapping("/learner")
//	public Learner addLearner(@RequestBody LearnerModel newLearner) {
//		return learnerService.addLearner(newLearner);
//	}
//	
	public String addLearner(@RequestBody LearnerModel learnermodel) {
		return learnerService.addLearner(learnermodel);
	}

	// update Learner
	@PutMapping("/learner/{id}")
	public String updateLearner(@PathVariable(name = "id") int id, @RequestBody Learner updateLearner) {
		return learnerService.updateLearner(id, updateLearner);
	}

	// Delete 1 Learner
	@DeleteMapping("/learner/{requestid}")
	public String delete1Learner(@PathVariable(value = "requestid") int requestid) {
	//	String deleteString = learnerService.delete1Learner(id);
		// return ResponseEntity.ok().build();
	//	return "Deleted Learner id " + id;\
		return learnerService.delete1Learner(requestid);
		
	}

	// Delete all Learner
	@DeleteMapping("/learner")
	public String deleteAllLearner() {
		String deleteString = learnerService.deleteAllLearner();
		// return ResponseEntity.ok().build();
		return "Deleted all learner";
	}

	// View all for 1 user
	@GetMapping("/user/{id}")
	public List<Learner> viewLearner(@PathVariable(value = "id") int id) {
		return learnerService.view1Learner(id);
	}

	// View all Learners
	@GetMapping("/learner")
	public List<Learner> viewAllLearners() {
		return learnerService.viewAllLearners();
	}
	

}