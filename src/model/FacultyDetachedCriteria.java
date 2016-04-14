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

public class FacultyDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public FacultyDetachedCriteria() {
		super(model.Faculty.class, model.FacultyCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public FacultyDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.FacultyCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public UniversityDetachedCriteria createFac_has_universityCriteria() {
		return new UniversityDetachedCriteria(createCriteria("fac_has_university"));
	}
	
	public model.TeacherDetachedCriteria createFaculty_has_teachersCriteria() {
		return new model.TeacherDetachedCriteria(createCriteria("ORM_Faculty_has_teachers"));
	}
	
	public model.Faculty_EffectDetachedCriteria createFE_has_facultyCriteria() {
		return new model.Faculty_EffectDetachedCriteria(createCriteria("ORM_FE_has_faculty"));
	}
	
	public model.CourseDetachedCriteria createFaculty_has_courseCriteria() {
		return new model.CourseDetachedCriteria(createCriteria("ORM_Faculty_has_course"));
	}
	
	public Faculty uniqueFaculty(PersistentSession session) {
		return (Faculty) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Faculty[] listFaculty(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Faculty[]) list.toArray(new Faculty[list.size()]);
	}
}

