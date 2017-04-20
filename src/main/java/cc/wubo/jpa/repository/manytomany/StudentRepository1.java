package cc.wubo.jpa.repository.manytomany;

import org.springframework.data.repository.CrudRepository;

import cc.wubo.jpa.entity.manytomany.Student;

public interface StudentRepository1 extends CrudRepository<Student, Integer>{ 

}
