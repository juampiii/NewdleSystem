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

public class ClosedCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression points;
	public final StringExpression text;
	public final StringExpression subevaluation_criteria;
	public final IntegerExpression right_question;
	
	public ClosedCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		points = new DoubleExpression("points", this);
		text = new StringExpression("text", this);
		subevaluation_criteria = new StringExpression("subevaluation_criteria", this);
		right_question = new IntegerExpression("right_question", this);
	}
	
	public ClosedCriteria(PersistentSession session) {
		this(session.createCriteria(Closed.class));
	}
	
	public ClosedCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public model.ChoiseCriteria createClosed_has_choisesCriteria() {
		return new model.ChoiseCriteria(createCriteria("ORM_Closed_has_choises"));
	}
	
	public Test_TemplateCriteria createTest_Template_has_questionCriteria() {
		return new Test_TemplateCriteria(createCriteria("test_Template_has_question"));
	}
	
	public model.Course_EffectCriteria createCE_has_QuestionCriteria() {
		return new model.Course_EffectCriteria(createCriteria("ORM_CE_has_Question"));
	}
	
	public model.AnswerCriteria createQuest_has_answersCriteria() {
		return new model.AnswerCriteria(createCriteria("ORM_Quest_has_answers"));
	}
	
	public Closed uniqueClosed() {
		return (Closed) super.uniqueResult();
	}
	
	public Closed[] listClosed() {
		java.util.List list = super.list();
		return (Closed[]) list.toArray(new Closed[list.size()]);
	}
}

