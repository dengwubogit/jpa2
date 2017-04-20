package cc.wubo.jpa.repository.manytomany;

import org.springframework.data.repository.CrudRepository;

import cc.wubo.jpa.entity.manytomany.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>{

}
