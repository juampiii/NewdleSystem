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

public class TeacherCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	
	public TeacherCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		StudentNumber = new StringExpression("StudentNumber", this);
		email = new StringExpression("email", this);
		name = new StringExpression("name", this);
		surname = new StringExpression("surname", this);
		password = new StringExpression("password", this);
		phone = new StringExpression("phone", this);
		adress = new StringExpression("adress", this);
		date_created = new DateExpression("date_created", this);
	}
	
	public TeacherCriteria(PersistentSession session) {
		this(session.createCriteria(Teacher.class));
	}
	
	public TeacherCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public FacultyCriteria createTeacher_has_facultyCriteria() {
		return new FacultyCriteria(createCriteria("teacher_has_faculty"));
	}
	
	public model.Test_TemplateCriteria createTeacher_has_test_tempCriteria() {
		return new model.Test_TemplateCriteria(createCriteria("ORM_Teacher_has_test_temp"));
	}
	
	public model.CourseCriteria createCourse_has_teacherCriteria() {
		return new model.CourseCriteria(createCriteria("ORM_Course_has_teacher"));
	}
	
	public model.TestCriteria createStud_has_testsCriteria() {
		return new model.TestCriteria(createCriteria("ORM_Stud_has_tests"));
	}
	
	public Teacher uniqueTeacher() {
		return (Teacher) super.uniqueResult();
	}
	
	public Teacher[] listTeacher() {
		java.util.List list = super.list();
		return (Teacher[]) list.toArray(new Teacher[list.size()]);
	}
}

