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

public class StudentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	public final IntegerExpression age;
	
	public StudentDetachedCriteria() {
		super(model.Student.class, model.StudentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		StudentNumber = new StringExpression("StudentNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		adress = new StringExpression("adress", this.getDetachedCriteria());
		date_created = new DateExpression("date_created", this.getDetachedCriteria());
		age = new IntegerExpression("age", this.getDetachedCriteria());
	}
	
	public StudentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.StudentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		StudentNumber = new StringExpression("StudentNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		adress = new StringExpression("adress", this.getDetachedCriteria());
		date_created = new DateExpression("date_created", this.getDetachedCriteria());
		age = new IntegerExpression("age", this.getDetachedCriteria());
	}
	
	public model.TestDetachedCriteria createStud_has_testsCriteria() {
		return new model.TestDetachedCriteria(createCriteria("ORM_Stud_has_tests"));
	}
	
	public Student uniqueStudent(PersistentSession session) {
		return (Student) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Student[] listStudent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Student[]) list.toArray(new Student[list.size()]);
	}
}

