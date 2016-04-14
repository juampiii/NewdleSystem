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

public class TestCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression score;
	
	public TestCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		score = new DoubleExpression("score", this);
	}
	
	public TestCriteria(PersistentSession session) {
		this(session.createCriteria(Test.class));
	}
	
	public TestCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public model.Test_TemplateCriteria createTest_has_test_tempCriteria() {
		return new model.Test_TemplateCriteria(createCriteria("ORM_Test_has_test_temp"));
	}
	
	public model.UserCriteria createTest_has_studentsCriteria() {
		return new model.UserCriteria(createCriteria("ORM_Test_has_students"));
	}
	
	public model.AnswerCriteria createTest_has_answersCriteria() {
		return new model.AnswerCriteria(createCriteria("ORM_Test_has_answers"));
	}
	
	public Test uniqueTest() {
		return (Test) super.uniqueResult();
	}
	
	public Test[] listTest() {
		java.util.List list = super.list();
		return (Test[]) list.toArray(new Test[list.size()]);
	}
}

