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

public class TestDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression score;
	
	public TestDetachedCriteria() {
		super(model.Test.class, model.TestCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		score = new DoubleExpression("score", this.getDetachedCriteria());
	}
	
	public TestDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.TestCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		score = new DoubleExpression("score", this.getDetachedCriteria());
	}
	
	public model.Test_TemplateDetachedCriteria createTest_has_test_tempCriteria() {
		return new model.Test_TemplateDetachedCriteria(createCriteria("ORM_Test_has_test_temp"));
	}
	
	public model.UserDetachedCriteria createTest_has_studentsCriteria() {
		return new model.UserDetachedCriteria(createCriteria("ORM_Test_has_students"));
	}
	
	public model.AnswerDetachedCriteria createTest_has_answersCriteria() {
		return new model.AnswerDetachedCriteria(createCriteria("ORM_Test_has_answers"));
	}
	
	public Test uniqueTest(PersistentSession session) {
		return (Test) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Test[] listTest(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Test[]) list.toArray(new Test[list.size()]);
	}
}

