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

public class Faculty_EffectCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final StringExpression text;
	
	public Faculty_EffectCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
		text = new StringExpression("text", this);
	}
	
	public Faculty_EffectCriteria(PersistentSession session) {
		this(session.createCriteria(Faculty_Effect.class));
	}
	
	public Faculty_EffectCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public FacultyCriteria createFaculty_has_FECriteria() {
		return new FacultyCriteria(createCriteria("faculty_has_FE"));
	}
	
	public model.Course_EffectCriteria createCE_has_FECriteria() {
		return new model.Course_EffectCriteria(createCriteria("ORM_CE_has_FE"));
	}
	
	public Faculty_Effect uniqueFaculty_Effect() {
		return (Faculty_Effect) super.uniqueResult();
	}
	
	public Faculty_Effect[] listFaculty_Effect() {
		java.util.List list = super.list();
		return (Faculty_Effect[]) list.toArray(new Faculty_Effect[list.size()]);
	}
}

