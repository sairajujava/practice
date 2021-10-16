package com.service.serviceImpl;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

import com.beans.Student;
import com.beans.UserBean;
import com.dao.UserDao;
import com.dao.daoImpl.UserdaoImpl;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao udao;
	
	public  UserServiceImpl() {
		
		udao = new UserdaoImpl();
		
	}

	public boolean register(UserBean userBean) {
		return udao.save(userBean);
	}

	public boolean login(String email, String pwd) {
		// TODO Auto-generated method stub
		return udao.isUserExist(email,pwd);
	}

	@Override
	public boolean save(Student stu) {
		return udao.create(stu);
	}

	@Override
	public List<Student> viewUsers() {
		return udao.list();
	}

	@Override
	public Student getUserById(Long id) {
		return udao.fetchStudentById(id);
	}

	@Override
	public boolean update(Student stu) {
		// TODO Auto-generated method stub
		return udao.update(stu);
	}

	@Override
	public int deleteUser(long userId) {
		// TODO Auto-generated method stub
		return udao.delete(userId);
	}

	@Override
	public String resetCustomerPassword(String recipient) {
		
		 UserBean user = udao.findByEmail(recipient);
		 System.out.println("DB-Password:"+user.getPassword());
	     
		 // if you want to reset password yu can use below commented code else share the same existing database password
		   // String randomPassword = RandomStringUtils.randomAlphanumeric(10);
		     
		    //user.setPassword(randomPassword);
		    //udao.update(user);
		     
		    return user.getPassword();
	}

}
