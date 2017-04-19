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

public class ManyToOneTest {
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
		Student student = new Student();
		school.setName("北大");
		student.setAge(11);
		student.setName("wangwu");
		student.setSchool(school);
		studentRepo.save(student);
		
		
	}
	@Test
	public void caseSelect() {
		Student findOne = studentRepo.findOne(1);
		System.out.println(findOne);
	}
	@Test
	public void caseDelete() {
		studentRepo.delete(8);
	}
	

}
