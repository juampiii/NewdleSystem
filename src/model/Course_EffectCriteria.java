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

public class Course_EffectCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final StringExpression text;
	
	public Course_EffectCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
		text = new StringExpression("text", this);
	}
	
	public Course_EffectCriteria(PersistentSession session) {
		this(session.createCriteria(Course_Effect.class));
	}
	
	public Course_EffectCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public Faculty_EffectCriteria createFE_has_CECriteria() {
		return new Faculty_EffectCriteria(createCriteria("FE_has_CE"));
	}
	
	public CourseCriteria createCourse_has_CECriteria() {
		return new CourseCriteria(createCriteria("course_has_CE"));
	}
	
	public model.QuestionCriteria createQuestion_has_CECriteria() {
		return new model.QuestionCriteria(createCriteria("ORM_Question_has_CE"));
	}
	
	public Course_Effect uniqueCourse_Effect() {
		return (Course_Effect) super.uniqueResult();
	}
	
	public Course_Effect[] listCourse_Effect() {
		java.util.List list = super.list();
		return (Course_Effect[]) list.toArray(new Course_Effect[list.size()]);
	}
}

