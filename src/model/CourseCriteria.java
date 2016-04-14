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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CourseCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ECTS;
	public final StringExpression name;
	
	public CourseCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		ECTS = new IntegerExpression("ECTS", this);
		name = new StringExpression("name", this);
	}
	
	public CourseCriteria(PersistentSession session) {
		this(session.createCriteria(Course.class));
	}
	
	public CourseCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public TeacherCriteria createTeacher_has_courseCriteria() {
		return new TeacherCriteria(createCriteria("teacher_has_course"));
	}
	
	public FacultyCriteria createSub_has_facultyCriteria() {
		return new FacultyCriteria(createCriteria("sub_has_faculty"));
	}
	
	public model.Course_EffectCriteria createCE_has_courseCriteria() {
		return new model.Course_EffectCriteria(createCriteria("ORM_CE_has_course"));
	}
	
	public model.Test_TemplateCriteria createCourse_has_test_tempCriteria() {
		return new model.Test_TemplateCriteria(createCriteria("ORM_Course_has_test_temp"));
	}
	
	public Course uniqueCourse() {
		return (Course) super.uniqueResult();
	}
	
	public Course[] listCourse() {
		java.util.List list = super.list();
		return (Course[]) list.toArray(new Course[list.size()]);
	}
}

