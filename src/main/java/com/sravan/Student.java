package com.sravan;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private Integer courseId;

	private String courseName;

	@Override
	public String toString() {
		return "Student [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
