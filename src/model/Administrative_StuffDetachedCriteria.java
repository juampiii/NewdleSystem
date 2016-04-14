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

public class Administrative_StuffDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	
	public Administrative_StuffDetachedCriteria() {
		super(model.Administrative_Stuff.class, model.Administrative_StuffCriteria.class);
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
	
	public Administrative_StuffDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Administrative_StuffCriteria.class);
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
	
	public Administrative_Stuff uniqueAdministrative_Stuff(PersistentSession session) {
		return (Administrative_Stuff) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrative_Stuff[] listAdministrative_Stuff(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrative_Stuff[]) list.toArray(new Administrative_Stuff[list.size()]);
	}
}

