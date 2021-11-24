/*
 * package com;
 * 
 * import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.model.Address; import com.model.Student; import
 * com.repository.StudentRepository; import com.utils.DateUtils;
 * 
 * @SpringBootTest public class StudentRepositoryTest {
 * 
 * @Autowired private StudentRepository studentRepository;
 * 
 * @Test public void saveStudentWithAddress() {
 * 
 * Address add =
 * Address.builder().city("Hyderabad").state("Telangana").country("INDIA").
 * zipcode("560037").build();
 * 
 * Student student =
 * Student.builder().name("Pavan").dob(DateUtils.convertStrDateToSqlDate(
 * "1989-08-21"))
 * .course("Devops").mobile("8899776655").emailId("pavan@gmail.com").address(add
 * ).build(); studentRepository.save(student);
 * 
 * }
 * 
 * @Test public void fetchAllStudentWithAddress() {
 * 
 * List<Student> dbList = studentRepository.findAll();
 * System.out.println("dbList Size:" + dbList.size());
 * 
 * for (Student s : dbList) { System.out.println(s); }
 * 
 * }
 * 
 * @Test public void findByNameStudentWithAddress() {
 * 
 * List<Student> dbList = studentRepository.findByName("Pavan");
 * System.out.println("dbList Size:" + dbList.size());
 * 
 * for (Student s : dbList) { System.out.println(s); }
 * 
 * }
 * 
 * @Test public void findByEmailStudentWithAddress() {
 * 
 * List<Student> dbList = studentRepository.findByEmailId("pavan@gmail.com");
 * System.out.println("dbList Size:" + dbList.size());
 * 
 * for (Student s : dbList) { System.out.println(s); }
 * 
 * }
 * 
 * 
 * }
 */