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

public class FacultyCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public FacultyCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public FacultyCriteria(PersistentSession session) {
		this(session.createCriteria(Faculty.class));
	}
	
	public FacultyCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public UniversityCriteria createFac_has_universityCriteria() {
		return new UniversityCriteria(createCriteria("fac_has_university"));
	}
	
	public model.TeacherCriteria createFaculty_has_teachersCriteria() {
		return new model.TeacherCriteria(createCriteria("ORM_Faculty_has_teachers"));
	}
	
	public model.Faculty_EffectCriteria createFE_has_facultyCriteria() {
		return new model.Faculty_EffectCriteria(createCriteria("ORM_FE_has_faculty"));
	}
	
	public model.CourseCriteria createFaculty_has_courseCriteria() {
		return new model.CourseCriteria(createCriteria("ORM_Faculty_has_course"));
	}
	
	public Faculty uniqueFaculty() {
		return (Faculty) super.uniqueResult();
	}
	
	public Faculty[] listFaculty() {
		java.util.List list = super.list();
		return (Faculty[]) list.toArray(new Faculty[list.size()]);
	}
}

