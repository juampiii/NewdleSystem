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
public class Answer implements Serializable {
	public Answer() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_ANSWER_ANSW_HAS_TESTS) {
			return ORM_answ_has_tests;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_ANSWER_ANSW_HAS_QUESTS) {
			this.answ_has_quests = (model.Question) owner;
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
	
	private model.Question answ_has_quests;
	
	private double score;
	
	private String text;
	
	private java.util.Set ORM_answ_has_tests = new java.util.HashSet();
	
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
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setAnsw_has_quests(model.Question value) {
		if (answ_has_quests != null) {
			answ_has_quests.quest_has_answers.remove(this);
		}
		if (value != null) {
			value.quest_has_answers.add(this);
		}
	}
	
	public model.Question getAnsw_has_quests() {
		return answ_has_quests;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Answ_has_quests(model.Question value) {
		this.answ_has_quests = value;
	}
	
	private model.Question getORM_Answ_has_quests() {
		return answ_has_quests;
	}
	
	private void setORM_Answ_has_tests(java.util.Set value) {
		this.ORM_answ_has_tests = value;
	}
	
	private java.util.Set getORM_Answ_has_tests() {
		return ORM_answ_has_tests;
	}
	
	public final model.TestSetCollection answ_has_tests = new model.TestSetCollection(this, _ormAdapter, model.ORMConstants.KEY_ANSWER_ANSW_HAS_TESTS, model.ORMConstants.KEY_TEST_TEST_HAS_ANSWERS, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
