package cc.wubo.jpa;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cc.wubo.jpa.entity.manytomany.Student;
import cc.wubo.jpa.entity.manytomany.Teacher;
import cc.wubo.jpa.repository.manytomany.StudentRepository1;
import cc.wubo.jpa.repository.manytomany.TeacherRepository;
/**
 * 注意:
 * 1.多对多关联关系中,不要使用级联保存,级联删除(这个规则同样适用与一对多的对应关系)
 * 解决方法是:对象进行单独持久化
 * 2. 必须在保存之前设置关系,也可以之后设置,然后更新
 * 3. 双向的多对多关系,在保存的时候不能同时设置双方的关系,先设置一方的一对多关系,进行保存,再设置另一方的一对多关联关系
 * 	进行保存
 * 4. mappedBy的作用: 是吧关系的维护方交给对方,之后,自己的一方无法维护关系了,只能去对方维护关系,但是自己仍然可以获取这种关系
 * 	只能在一方使用
 * @author Administrator
 *
 */
public class ManyToManyTest {
 	 TeacherRepository teacherRepo;
 	 StudentRepository1 studentRepo;
	@Before
	public void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		teacherRepo = context.getBean(TeacherRepository.class);
		studentRepo = context.getBean(StudentRepository1.class);
		
	}
	
	@Test
	public void run() {
		
	}
	@Test
	public void caseSave() {
		Student s1 = new Student();
		s1.setAge(11);
		s1.setName("zhangsan");
		Student s2 = new Student();
		s2.setAge(12);
		s2.setName("lisi");
		Teacher t1 = new Teacher();
		t1.setName("wangwu");
		t1.setStudents(Arrays.asList(s1,s2));
		Teacher t2 = new Teacher();
		t2.setName("zhaoliu");
		t2.setStudents(Arrays.asList(s1));
		studentRepo.save(Arrays.asList(s1,s2));
		teacherRepo.save(Arrays.asList(t1,t2));
		
		
	}
	@Test
	public void caseSelect() {
		Teacher findOne = teacherRepo.findOne(14);
		System.out.println(findOne);
		System.out.println(studentRepo.findOne(13));
	}
	@Test
	public void caseDelete() {
		Teacher findOne = teacherRepo.findOne(14);
		List<Student> students = findOne.getStudents();
		System.out.println(students);
		studentRepo.delete(students);
		teacherRepo.delete(findOne);
//		teacherRepo.deleteAll();
		
	}
	

}
