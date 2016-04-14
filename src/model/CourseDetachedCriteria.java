/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package model;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CourseDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ECTS;
	public final StringExpression name;
	
	public CourseDetachedCriteria() {
		super(model.Course.class, model.CourseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ECTS = new IntegerExpression("ECTS", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public CourseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.CourseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ECTS = new IntegerExpression("ECTS", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public TeacherDetachedCriteria createTeacher_has_courseCriteria() {
		return new TeacherDetachedCriteria(createCriteria("teacher_has_course"));
	}
	
	public FacultyDetachedCriteria createSub_has_facultyCriteria() {
		return new FacultyDetachedCriteria(createCriteria("sub_has_faculty"));
	}
	
	public model.Course_EffectDetachedCriteria createCE_has_courseCriteria() {
		return new model.Course_EffectDetachedCriteria(createCriteria("ORM_CE_has_course"));
	}
	
	public model.Test_TemplateDetachedCriteria createCourse_has_test_tempCriteria() {
		return new model.Test_TemplateDetachedCriteria(createCriteria("ORM_Course_has_test_temp"));
	}
	
	public Course uniqueCourse(PersistentSession session) {
		return (Course) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Course[] listCourse(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Course[]) list.toArray(new Course[list.size()]);
	}
}

