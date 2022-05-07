package com.Spring.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Model.ExamDescription;
import com.Spring.Service.ExamService;




@RestController
@RequestMapping("/ExamDescription")
public class ExamDescriptionController {
	@Autowired
	ExamService examService;
	
	@PostMapping("/addExamDescription")
	public ResponseEntity<String> addExamDescriptionDetails(@Validated @RequestBody ExamDescription examdescription){
	    Object examResponse = examService.addExamDescription(examdescription);
		return new ResponseEntity<String>(examResponse.toString(), HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping("/ScoreByTrainee")
	public List<ExamDescription> ScoreByTrainee(HttpServletRequest request)throws Exception{
		HttpSession session = request.getSession();
		String traineename = String.valueOf(session.getAttribute("traineenameSession"));
		String traineeId = examService.queryIdByTraineeename(traineename).toString();
		
		List<ExamDescription> scoreList = null;
		try {
			scoreList = examService.ScoreByTrainee(traineeId);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return scoreList;
	}
	
}
