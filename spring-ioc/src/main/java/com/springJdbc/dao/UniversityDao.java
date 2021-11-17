package com.springJdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.beans.University;

public class UniversityDao {

	@Autowired
	private JdbcTemplate jtemplate;

	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}
	
	
	public int saveUniversity(University uni) {
		
		String sql="insert into tbl_university(name,location,mapedCol) values('"+uni.getName()+"' , '"+uni.getLoc()+"','"+uni.getMappedCol()+"')";
		
		return jtemplate.update(sql);
	}

}
