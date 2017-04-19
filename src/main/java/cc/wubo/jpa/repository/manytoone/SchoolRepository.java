package cc.wubo.jpa.repository.manytoone;

import org.springframework.data.repository.CrudRepository;

import cc.wubo.jpa.entity.manytoone.School;

public interface SchoolRepository extends CrudRepository<School, Integer>{

}
