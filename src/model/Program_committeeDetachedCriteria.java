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

public class Program_committeeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	
	public Program_committeeDetachedCriteria() {
		super(model.Program_committee.class, model.Program_committeeCriteria.class);
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
	
	public Program_committeeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Program_committeeCriteria.class);
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
	
	public model.TestDetachedCriteria createStud_has_testsCriteria() {
		return new model.TestDetachedCriteria(createCriteria("ORM_Stud_has_tests"));
	}
	
	public Program_committee uniqueProgram_committee(PersistentSession session) {
		return (Program_committee) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Program_committee[] listProgram_committee(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Program_committee[]) list.toArray(new Program_committee[list.size()]);
	}
}

