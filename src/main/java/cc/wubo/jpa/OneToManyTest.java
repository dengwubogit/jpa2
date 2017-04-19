package cc.wubo.jpa;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cc.wubo.jpa.entity.manytoone.School;
import cc.wubo.jpa.entity.manytoone.Student;
import cc.wubo.jpa.repository.manytoone.SchoolRepository;
import cc.wubo.jpa.repository.manytoone.StudentRepository;

public class OneToManyTest {
 	 SchoolRepository schoolRepo;
 	 StudentRepository studentRepo;
	@Before
	public void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		schoolRepo = context.getBean(SchoolRepository.class);
		studentRepo = context.getBean(StudentRepository.class);
		
	}
	
	@Test
	public void run() {
		
	}
	@Test
	public void caseSave() {
		School school = new School();
		school.setName("清华");
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setAge(11);
		student.setName("zhangsan");
		students.add(student);
		student = new Student();
		student.setAge(12);
		student.setName("lisi");
		students.add(student);
		school.setStudents(students);
		schoolRepo.save(school);
		
		
		
	}
	@Test
	public void caseSelect() {
		School findOne = schoolRepo.findOne(1);
		System.out.println(findOne);
	}
	@Test
	public void caseDelete() {
		schoolRepo.delete(1);
	}
	

}
