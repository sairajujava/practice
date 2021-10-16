package com.dao;

import java.util.List;

import com.beans.Student;
import com.beans.UserBean;

public interface UserDao {
	
	public boolean save(UserBean ubean);

	public boolean isUserExist(String email, String pwd);

	public boolean create(Student stu);

	public List<Student> list();

	public Student fetchStudentById(Long id);

	public boolean update(Student stu);

	public int delete(long userId);

	public UserBean findByEmail(String recipient);

}
