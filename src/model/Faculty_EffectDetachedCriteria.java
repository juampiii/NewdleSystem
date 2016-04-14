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

public class Faculty_EffectDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final StringExpression text;
	
	public Faculty_EffectDetachedCriteria() {
		super(model.Faculty_Effect.class, model.Faculty_EffectCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public Faculty_EffectDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Faculty_EffectCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public FacultyDetachedCriteria createFaculty_has_FECriteria() {
		return new FacultyDetachedCriteria(createCriteria("faculty_has_FE"));
	}
	
	public model.Course_EffectDetachedCriteria createCE_has_FECriteria() {
		return new model.Course_EffectDetachedCriteria(createCriteria("ORM_CE_has_FE"));
	}
	
	public Faculty_Effect uniqueFaculty_Effect(PersistentSession session) {
		return (Faculty_Effect) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Faculty_Effect[] listFaculty_Effect(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Faculty_Effect[]) list.toArray(new Faculty_Effect[list.size()]);
	}
}

