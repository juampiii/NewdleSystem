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

public class UniversityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public UniversityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public UniversityCriteria(PersistentSession session) {
		this(session.createCriteria(University.class));
	}
	
	public UniversityCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public model.FacultyCriteria createUniv_has_facultyCriteria() {
		return new model.FacultyCriteria(createCriteria("ORM_Univ_has_faculty"));
	}
	
	public University uniqueUniversity() {
		return (University) super.uniqueResult();
	}
	
	public University[] listUniversity() {
		java.util.List list = super.list();
		return (University[]) list.toArray(new University[list.size()]);
	}
}

