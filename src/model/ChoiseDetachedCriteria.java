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

public class ChoiseDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression text;
	
	public ChoiseDetachedCriteria() {
		super(model.Choise.class, model.ChoiseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public ChoiseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.ChoiseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public ClosedDetachedCriteria createChoise_has_closedCriteria() {
		return new ClosedDetachedCriteria(createCriteria("choise_has_closed"));
	}
	
	public Choise uniqueChoise(PersistentSession session) {
		return (Choise) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Choise[] listChoise(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Choise[]) list.toArray(new Choise[list.size()]);
	}
}

