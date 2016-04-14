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

public class ChoiseCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression text;
	
	public ChoiseCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		text = new StringExpression("text", this);
	}
	
	public ChoiseCriteria(PersistentSession session) {
		this(session.createCriteria(Choise.class));
	}
	
	public ChoiseCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public ClosedCriteria createChoise_has_closedCriteria() {
		return new ClosedCriteria(createCriteria("choise_has_closed"));
	}
	
	public Choise uniqueChoise() {
		return (Choise) super.uniqueResult();
	}
	
	public Choise[] listChoise() {
		java.util.List list = super.list();
		return (Choise[]) list.toArray(new Choise[list.size()]);
	}
}

