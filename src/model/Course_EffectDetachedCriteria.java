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

public class Course_EffectDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	public final StringExpression text;
	
	public Course_EffectDetachedCriteria() {
		super(model.Course_Effect.class, model.Course_EffectCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public Course_EffectDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Course_EffectCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public Faculty_EffectDetachedCriteria createFE_has_CECriteria() {
		return new Faculty_EffectDetachedCriteria(createCriteria("FE_has_CE"));
	}
	
	public CourseDetachedCriteria createCourse_has_CECriteria() {
		return new CourseDetachedCriteria(createCriteria("course_has_CE"));
	}
	
	public model.QuestionDetachedCriteria createQuestion_has_CECriteria() {
		return new model.QuestionDetachedCriteria(createCriteria("ORM_Question_has_CE"));
	}
	
	public Course_Effect uniqueCourse_Effect(PersistentSession session) {
		return (Course_Effect) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Course_Effect[] listCourse_Effect(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Course_Effect[]) list.toArray(new Course_Effect[list.size()]);
	}
}

