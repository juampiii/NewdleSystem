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
public class Test implements Serializable {
	public Test() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_TEST_TEST_HAS_TEST_TEMP) {
			return ORM_test_has_test_temp;
		}
		else if (key == model.ORMConstants.KEY_TEST_TEST_HAS_STUDENTS) {
			return ORM_test_has_students;
		}
		else if (key == model.ORMConstants.KEY_TEST_TEST_HAS_ANSWERS) {
			return ORM_test_has_answers;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private double score;
	
	private java.util.Set ORM_test_has_test_temp = new java.util.HashSet();
	
	private java.util.Set ORM_test_has_students = new java.util.HashSet();
	
	private java.util.Set ORM_test_has_answers = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setScore(double value) {
		this.score = value;
	}
	
	public double getScore() {
		return score;
	}
	
	private void setORM_Test_has_test_temp(java.util.Set value) {
		this.ORM_test_has_test_temp = value;
	}
	
	private java.util.Set getORM_Test_has_test_temp() {
		return ORM_test_has_test_temp;
	}
	
	public final model.Test_TemplateSetCollection test_has_test_temp = new model.Test_TemplateSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEST_TEST_HAS_TEST_TEMP, model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_TESTS, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Test_has_students(java.util.Set value) {
		this.ORM_test_has_students = value;
	}
	
	private java.util.Set getORM_Test_has_students() {
		return ORM_test_has_students;
	}
	
	public final model.UserSetCollection test_has_students = new model.UserSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEST_TEST_HAS_STUDENTS, model.ORMConstants.KEY_USER_STUD_HAS_TESTS, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Test_has_answers(java.util.Set value) {
		this.ORM_test_has_answers = value;
	}
	
	private java.util.Set getORM_Test_has_answers() {
		return ORM_test_has_answers;
	}
	
	public final model.AnswerSetCollection test_has_answers = new model.AnswerSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEST_TEST_HAS_ANSWERS, model.ORMConstants.KEY_ANSWER_ANSW_HAS_TESTS, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
