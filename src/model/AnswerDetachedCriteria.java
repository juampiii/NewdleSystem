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

public class AnswerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression score;
	public final StringExpression text;
	
	public AnswerDetachedCriteria() {
		super(model.Answer.class, model.AnswerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		score = new DoubleExpression("score", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public AnswerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.AnswerCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		score = new DoubleExpression("score", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public QuestionDetachedCriteria createAnsw_has_questsCriteria() {
		return new QuestionDetachedCriteria(createCriteria("answ_has_quests"));
	}
	
	public model.TestDetachedCriteria createAnsw_has_testsCriteria() {
		return new model.TestDetachedCriteria(createCriteria("ORM_Answ_has_tests"));
	}
	
	public Answer uniqueAnswer(PersistentSession session) {
		return (Answer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Answer[] listAnswer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Answer[]) list.toArray(new Answer[list.size()]);
	}
}

