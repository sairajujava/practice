package com.service;

import java.util.List;

import com.beans.Student;
import com.beans.UserBean;

public interface UserService {
	
	public boolean register(UserBean userBean);

	public boolean login(String email, String pwd);

	public boolean save(Student stu);

	public List<Student> viewUsers();

	public Student getUserById(Long id);

	public boolean update(Student stu);

	public int deleteUser(long userId);

	public String resetCustomerPassword(String recipient);

}
