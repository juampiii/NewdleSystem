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

public class AnswerCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression score;
	public final StringExpression text;
	
	public AnswerCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		score = new DoubleExpression("score", this);
		text = new StringExpression("text", this);
	}
	
	public AnswerCriteria(PersistentSession session) {
		this(session.createCriteria(Answer.class));
	}
	
	public AnswerCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public QuestionCriteria createAnsw_has_questsCriteria() {
		return new QuestionCriteria(createCriteria("answ_has_quests"));
	}
	
	public model.TestCriteria createAnsw_has_testsCriteria() {
		return new model.TestCriteria(createCriteria("ORM_Answ_has_tests"));
	}
	
	public Answer uniqueAnswer() {
		return (Answer) super.uniqueResult();
	}
	
	public Answer[] listAnswer() {
		java.util.List list = super.list();
		return (Answer[]) list.toArray(new Answer[list.size()]);
	}
}

