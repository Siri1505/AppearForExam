package com.Spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Spring.Model.ExamDescription;
import com.Spring.Repo.ExamRepo;


@Service

public class ExamService {
	@Autowired
	ExamRepo examRepo;

	public Object addExamDescription(ExamDescription examdescriptionObj) {
		return examRepo.save(examdescriptionObj);
	}

	public List<ExamDescription> queryIdByTraineeename(String traineenameObj) {
		return examRepo.save(traineenameObj);
	}

	public List<ExamDescription> ScoreByTrainee(String traineeIdObj){
		return examRepo.save(traineeIdObj);
	}
		
		
	

	
}
