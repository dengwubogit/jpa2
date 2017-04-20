package cc.wubo.jpa;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cc.wubo.jpa.repository.manytomany.StudentRepository;
import cc.wubo.jpa.repository.manytomany.TeacherRepository;

public class ManyToManyTest {
 	 TeacherRepository teacherRepo;
 	 StudentRepository studentRepo;
	@Before
	public void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		teacherRepo = context.getBean(TeacherRepository.class);
		studentRepo = context.getBean(StudentRepository.class);
		
	}
	
	@Test
	public void run() {
		
	}
	@Test
	public void caseSave() {
		
		
		
	}
	@Test
	public void caseSelect() {
		
	}
	@Test
	public void caseDelete() {
	}
	

}
