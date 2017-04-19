package cc.wubo.jpa.entity.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @OneToMany 会创建一个新表来维持一对多的关系
 * @JoinTable(name="mappings") 自定义创建的维持一对多关系的新表
 * joinColumns 代表当前表id,inverseJoinColumns代表对方表的id
 * @OneToMany 可以和@JoinTable 配合使用,定制生成的表的名称和字段名称
 * @OneToMany 默认是 LAZY @OneToOne 默认是立即加载
 * 注意,关联查询时使用fetch=FetchType.EAGER 立即加载,因为School查询完sission就关闭了,再去查询Student信息就会报错
 *
 */
@Entity
@Table(name="schools")
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="mappings",joinColumns=@JoinColumn(name="school_id"),inverseJoinColumns=@JoinColumn(name="stu_id"))
	private List<Student> students;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
	
	
	
}
