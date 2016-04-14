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

public class TeacherDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	
	public TeacherDetachedCriteria() {
		super(model.Teacher.class, model.TeacherCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		StudentNumber = new StringExpression("StudentNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		adress = new StringExpression("adress", this.getDetachedCriteria());
		date_created = new DateExpression("date_created", this.getDetachedCriteria());
	}
	
	public TeacherDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.TeacherCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		StudentNumber = new StringExpression("StudentNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		adress = new StringExpression("adress", this.getDetachedCriteria());
		date_created = new DateExpression("date_created", this.getDetachedCriteria());
	}
	
	public FacultyDetachedCriteria createTeacher_has_facultyCriteria() {
		return new FacultyDetachedCriteria(createCriteria("teacher_has_faculty"));
	}
	
	public model.Test_TemplateDetachedCriteria createTeacher_has_test_tempCriteria() {
		return new model.Test_TemplateDetachedCriteria(createCriteria("ORM_Teacher_has_test_temp"));
	}
	
	public model.CourseDetachedCriteria createCourse_has_teacherCriteria() {
		return new model.CourseDetachedCriteria(createCriteria("ORM_Course_has_teacher"));
	}
	
	public model.TestDetachedCriteria createStud_has_testsCriteria() {
		return new model.TestDetachedCriteria(createCriteria("ORM_Stud_has_tests"));
	}
	
	public Teacher uniqueTeacher(PersistentSession session) {
		return (Teacher) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Teacher[] listTeacher(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Teacher[]) list.toArray(new Teacher[list.size()]);
	}
}

