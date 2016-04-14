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

public class UniversityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public UniversityDetachedCriteria() {
		super(model.University.class, model.UniversityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public UniversityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.UniversityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public model.FacultyDetachedCriteria createUniv_has_facultyCriteria() {
		return new model.FacultyDetachedCriteria(createCriteria("ORM_Univ_has_faculty"));
	}
	
	public University uniqueUniversity(PersistentSession session) {
		return (University) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public University[] listUniversity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (University[]) list.toArray(new University[list.size()]);
	}
}

