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

import java.io.Serializable;
public class Test_Template implements Serializable {
	public Test_Template() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_TESTS) {
			return ORM_test_temp_has_tests;
		}
		else if (key == model.ORMConstants.KEY_TEST_TEMPLATE_QUESTION_HAS_TT) {
			return ORM_question_has_tt;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_TEACHER) {
			this.test_temp_has_teacher = (model.Teacher) owner;
		}
		
		else if (key == model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_COURSE) {
			this.test_temp_has_course = (model.Course) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private model.Course test_temp_has_course;
	
	private model.Teacher test_temp_has_teacher;
	
	private double time;
	
	private String evaluation_criteria;
	
	private String name;
	
	private java.util.Set ORM_test_temp_has_tests = new java.util.HashSet();
	
	private java.util.Set ORM_question_has_tt = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTime(double value) {
		this.time = value;
	}
	
	public double getTime() {
		return time;
	}
	
	public void setEvaluation_criteria(String value) {
		this.evaluation_criteria = value;
	}
	
	public String getEvaluation_criteria() {
		return evaluation_criteria;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTest_temp_has_teacher(model.Teacher value) {
		if (test_temp_has_teacher != null) {
			test_temp_has_teacher.teacher_has_test_temp.remove(this);
		}
		if (value != null) {
			value.teacher_has_test_temp.add(this);
		}
	}
	
	public model.Teacher getTest_temp_has_teacher() {
		return test_temp_has_teacher;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Test_temp_has_teacher(model.Teacher value) {
		this.test_temp_has_teacher = value;
	}
	
	private model.Teacher getORM_Test_temp_has_teacher() {
		return test_temp_has_teacher;
	}
	
	public void setTest_temp_has_course(model.Course value) {
		if (test_temp_has_course != null) {
			test_temp_has_course.course_has_test_temp.remove(this);
		}
		if (value != null) {
			value.course_has_test_temp.add(this);
		}
	}
	
	public model.Course getTest_temp_has_course() {
		return test_temp_has_course;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Test_temp_has_course(model.Course value) {
		this.test_temp_has_course = value;
	}
	
	private model.Course getORM_Test_temp_has_course() {
		return test_temp_has_course;
	}
	
	private void setORM_Test_temp_has_tests(java.util.Set value) {
		this.ORM_test_temp_has_tests = value;
	}
	
	private java.util.Set getORM_Test_temp_has_tests() {
		return ORM_test_temp_has_tests;
	}
	
	public final model.TestSetCollection test_temp_has_tests = new model.TestSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_TESTS, model.ORMConstants.KEY_TEST_TEST_HAS_TEST_TEMP, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Question_has_tt(java.util.Set value) {
		this.ORM_question_has_tt = value;
	}
	
	private java.util.Set getORM_Question_has_tt() {
		return ORM_question_has_tt;
	}
	
	public final model.QuestionSetCollection question_has_tt = new model.QuestionSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEST_TEMPLATE_QUESTION_HAS_TT, model.ORMConstants.KEY_QUESTION_TEST_TEMPLATE_HAS_QUESTION, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
	private service.Test_Template_Service belong_test;
	
	public service.Test_Template_Service getBelong_test()  {
		return this.belong_test;
	}
	
	public void setBelong_test(service.Test_Template_Service value)  {
		this.belong_test = value;
	}
	
}
