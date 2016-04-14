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

public class GapDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression points;
	public final StringExpression text;
	public final StringExpression subevaluation_criteria;
	public final IntegerExpression answer_lenght;
	
	public GapDetachedCriteria() {
		super(model.Gap.class, model.GapCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		points = new DoubleExpression("points", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		subevaluation_criteria = new StringExpression("subevaluation_criteria", this.getDetachedCriteria());
		answer_lenght = new IntegerExpression("answer_lenght", this.getDetachedCriteria());
	}
	
	public GapDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.GapCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		points = new DoubleExpression("points", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		subevaluation_criteria = new StringExpression("subevaluation_criteria", this.getDetachedCriteria());
		answer_lenght = new IntegerExpression("answer_lenght", this.getDetachedCriteria());
	}
	
	public Test_TemplateDetachedCriteria createTest_Template_has_questionCriteria() {
		return new Test_TemplateDetachedCriteria(createCriteria("test_Template_has_question"));
	}
	
	public model.Course_EffectDetachedCriteria createCE_has_QuestionCriteria() {
		return new model.Course_EffectDetachedCriteria(createCriteria("ORM_CE_has_Question"));
	}
	
	public model.AnswerDetachedCriteria createQuest_has_answersCriteria() {
		return new model.AnswerDetachedCriteria(createCriteria("ORM_Quest_has_answers"));
	}
	
	public Gap uniqueGap(PersistentSession session) {
		return (Gap) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Gap[] listGap(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Gap[]) list.toArray(new Gap[list.size()]);
	}
}

