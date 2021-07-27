package com.sravan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sravan.Student;
import com.sravan.rowmappers.StudentRowmapper;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public List<Student> getCources() {

		String query = "select *from courses ";
		List<Student> list = temp.query(query, new StudentRowmapper());

		return list;
	}

}
