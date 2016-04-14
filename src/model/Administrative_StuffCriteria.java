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

public class Administrative_StuffCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression StudentNumber;
	public final StringExpression email;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression password;
	public final StringExpression phone;
	public final StringExpression adress;
	public final DateExpression date_created;
	
	public Administrative_StuffCriteria(Criteria criteria) {
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
	
	public Administrative_StuffCriteria(PersistentSession session) {
		this(session.createCriteria(Administrative_Stuff.class));
	}
	
	public Administrative_StuffCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public model.TestCriteria createStud_has_testsCriteria() {
		return new model.TestCriteria(createCriteria("ORM_Stud_has_tests"));
	}
	
	public Administrative_Stuff uniqueAdministrative_Stuff() {
		return (Administrative_Stuff) super.uniqueResult();
	}
	
	public Administrative_Stuff[] listAdministrative_Stuff() {
		java.util.List list = super.list();
		return (Administrative_Stuff[]) list.toArray(new Administrative_Stuff[list.size()]);
	}
}

