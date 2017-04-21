package cc.wubo.jpa.repository.manytomany;

import org.springframework.data.repository.CrudRepository;

import cc.wubo.jpa.entity.manytomany.Student;

/**
 * 关联关系总结：
 * 一： 实现方式
 * 1. OneToOne，ManyToOne 内部都是通过加字段的方式实现的
 * 2. OneToMany，ManyToMany内部是通过一张中间表来实现关联关系的
 * 3. 如果是单向的只会再单向的方面增加字段或者表，如果是双向的
 * 4. OneToOne，ManyToOne可以配合JoinColum注解使用，来定制增加字段的名字
 * 5. OneToMany， ManyToMany可以配合JoinTable注解一起使用，来定制增加表的名字或其他信息
 * 
 * 二： 级联（在操作当前对象的时候同时操作相关联的对象一起操作）
 * 1. OneToMany，ManyToMany 不要使用级联操作，特别是级联添加和级联删除
 * 
 * 三：CrudRepository 中的save()方法不是单纯的保存，如果对象不存在则保存，如果对象存在则修改
 * 
 * 四： fetch 立即加载、延迟加载
 * 1.OneToOne，ManyToOne 默认立即加载
 * 2.OneToMany， ManyToMany 默认是懒加载
 * 3.如果是双向关联，则双方不能都是立即加载，否则会出现死循环
 * 4： 懒加载的一方，不要再session调用多的一方，否则报no session的错误，必须要在session(事务)范围内使用
 * 
 * 五： OneToOne中的optional
 * 为true，在加载对方的时候，使用left join
 * 为false，在加载对方的时候，使用 inner join
 * 
 * 六： mappedBy 一般使用在双向的关联关系中，单向关联的关系不需要用到
 * 1.意思是，把关系的维护方交给对方
 * 2.交给对方之后，内部就不会增加字段，增加表来维护关联关系了
 * 3.mappedBy不需要和JoinTable，JoinColum来一起使用
 * 4.实际中：建议双向的关联关系只由一方去维护，在另一方配置mappedBy就可以了，不建议双方都去维护这种关系
 */
public interface StudentRepository1 extends CrudRepository<Student, Integer>{ 
}
