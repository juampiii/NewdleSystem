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
public class Question implements Serializable {
	public Question() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_QUESTION_CE_HAS_QUESTION) {
			return ORM_cE_has_Question;
		}
		else if (key == model.ORMConstants.KEY_QUESTION_QUEST_HAS_ANSWERS) {
			return ORM_quest_has_answers;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_QUESTION_TEST_TEMPLATE_HAS_QUESTION) {
			this.test_Template_has_question = (model.Test_Template) owner;
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
	
	private model.Test_Template test_Template_has_question;
	
	private double points;
	
	private String text;
	
	private String subevaluation_criteria;
	
	private java.util.Set ORM_cE_has_Question = new java.util.HashSet();
	
	private java.util.Set ORM_quest_has_answers = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPoints(double value) {
		this.points = value;
	}
	
	public double getPoints() {
		return points;
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setSubevaluation_criteria(String value) {
		this.subevaluation_criteria = value;
	}
	
	public String getSubevaluation_criteria() {
		return subevaluation_criteria;
	}
	
	private void setORM_CE_has_Question(java.util.Set value) {
		this.ORM_cE_has_Question = value;
	}
	
	private java.util.Set getORM_CE_has_Question() {
		return ORM_cE_has_Question;
	}
	
	public final model.Course_EffectSetCollection cE_has_Question = new model.Course_EffectSetCollection(this, _ormAdapter, model.ORMConstants.KEY_QUESTION_CE_HAS_QUESTION, model.ORMConstants.KEY_COURSE_EFFECT_QUESTION_HAS_CE, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTest_Template_has_question(model.Test_Template value) {
		if (test_Template_has_question != null) {
			test_Template_has_question.question_has_tt.remove(this);
		}
		if (value != null) {
			value.question_has_tt.add(this);
		}
	}
	
	public model.Test_Template getTest_Template_has_question() {
		return test_Template_has_question;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Test_Template_has_question(model.Test_Template value) {
		this.test_Template_has_question = value;
	}
	
	private model.Test_Template getORM_Test_Template_has_question() {
		return test_Template_has_question;
	}
	
	private void setORM_Quest_has_answers(java.util.Set value) {
		this.ORM_quest_has_answers = value;
	}
	
	private java.util.Set getORM_Quest_has_answers() {
		return ORM_quest_has_answers;
	}
	
	public final model.AnswerSetCollection quest_has_answers = new model.AnswerSetCollection(this, _ormAdapter, model.ORMConstants.KEY_QUESTION_QUEST_HAS_ANSWERS, model.ORMConstants.KEY_ANSWER_ANSW_HAS_QUESTS, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
	private service.Question_Service belong_question;
	
	public service.Question_Service getBelong_question()  {
		return this.belong_question;
	}
	
	public void setBelong_question(service.Question_Service value)  {
		this.belong_question = value;
	}
	
}
