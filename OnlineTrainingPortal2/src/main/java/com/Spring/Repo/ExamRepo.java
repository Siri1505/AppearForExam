package com.Spring.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Spring.Model.ExamDescription;


@Repository
public interface ExamRepo extends JpaRepository<ExamDescription, Integer>{

	List<ExamDescription> save(String traineenameObj);

	

}

