package com.Spring.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ExamDescription")
public class ExamDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "sub_ID")
	private String subId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "trainee_Id")
	private String traineeId;
	
	@Column(name = "dateOfExam")
	private Date dateOfExam;
	
	@Column(name = "mark")
	private int mark;

	@Column(name="subName")
	private String subName;
	
	@Column(name="traineename")
	private String traineename;

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public Date getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getTraineename() {
		return traineename;
	}

	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}

	public ExamDescription(String subId, String traineeId, Date dateOfExam, int mark, String subName,
			String traineename) {
		super();
		this.subId = subId;
		this.traineeId = traineeId;
		this.dateOfExam = dateOfExam;
		this.mark = mark;
		this.subName = subName;
		this.traineename = traineename;
	}

	@Override
	public String toString() {
		return "ExamDescription [subId=" + subId + ", traineeId=" + traineeId + ", dateOfExam=" + dateOfExam + ", mark="
				+ mark + ", subName=" + subName + ", traineename=" + traineename + "]";
	}
	
	
}

