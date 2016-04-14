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

public class Test_TemplateCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression time;
	public final StringExpression evaluation_criteria;
	public final StringExpression name;
	
	public Test_TemplateCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		time = new DoubleExpression("time", this);
		evaluation_criteria = new StringExpression("evaluation_criteria", this);
		name = new StringExpression("name", this);
	}
	
	public Test_TemplateCriteria(PersistentSession session) {
		this(session.createCriteria(Test_Template.class));
	}
	
	public Test_TemplateCriteria() throws PersistentException {
		this(model.TestingPersistentManager.instance().getSession());
	}
	
	public CourseCriteria createTest_temp_has_courseCriteria() {
		return new CourseCriteria(createCriteria("test_temp_has_course"));
	}
	
	public TeacherCriteria createTest_temp_has_teacherCriteria() {
		return new TeacherCriteria(createCriteria("test_temp_has_teacher"));
	}
	
	public model.TestCriteria createTest_temp_has_testsCriteria() {
		return new model.TestCriteria(createCriteria("ORM_Test_temp_has_tests"));
	}
	
	public model.QuestionCriteria createQuestion_has_ttCriteria() {
		return new model.QuestionCriteria(createCriteria("ORM_Question_has_tt"));
	}
	
	public Test_Template uniqueTest_Template() {
		return (Test_Template) super.uniqueResult();
	}
	
	public Test_Template[] listTest_Template() {
		java.util.List list = super.list();
		return (Test_Template[]) list.toArray(new Test_Template[list.size()]);
	}
}

