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

public class Test_TemplateDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression time;
	public final StringExpression evaluation_criteria;
	public final StringExpression name;
	
	public Test_TemplateDetachedCriteria() {
		super(model.Test_Template.class, model.Test_TemplateCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		time = new DoubleExpression("time", this.getDetachedCriteria());
		evaluation_criteria = new StringExpression("evaluation_criteria", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public Test_TemplateDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.Test_TemplateCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		time = new DoubleExpression("time", this.getDetachedCriteria());
		evaluation_criteria = new StringExpression("evaluation_criteria", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public CourseDetachedCriteria createTest_temp_has_courseCriteria() {
		return new CourseDetachedCriteria(createCriteria("test_temp_has_course"));
	}
	
	public TeacherDetachedCriteria createTest_temp_has_teacherCriteria() {
		return new TeacherDetachedCriteria(createCriteria("test_temp_has_teacher"));
	}
	
	public model.TestDetachedCriteria createTest_temp_has_testsCriteria() {
		return new model.TestDetachedCriteria(createCriteria("ORM_Test_temp_has_tests"));
	}
	
	public model.QuestionDetachedCriteria createQuestion_has_ttCriteria() {
		return new model.QuestionDetachedCriteria(createCriteria("ORM_Question_has_tt"));
	}
	
	public Test_Template uniqueTest_Template(PersistentSession session) {
		return (Test_Template) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Test_Template[] listTest_Template(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Test_Template[]) list.toArray(new Test_Template[list.size()]);
	}
}

