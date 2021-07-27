package com.sravan.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sravan.Student;

public class StudentRowmapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student st = new Student();
		st.setCourseId(rs.getInt(1));
		st.setCourseName(rs.getString(2));
		return st;
	}

}
