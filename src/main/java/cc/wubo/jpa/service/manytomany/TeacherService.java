package cc.wubo.jpa.service.manytomany;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.wubo.jpa.entity.manytomany.Teacher;
@Service
public class TeacherService {
	@Autowired
	private EntityManager em;
	@Transactional
	public void add() {
		Teacher t = new Teacher();
		t.setName("小逼崽子");
		em.persist(t);
		em.persist(t);
		
	}

}
