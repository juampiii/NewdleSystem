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
public class Closed extends model.Question implements Serializable {
	public Closed() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_CLOSED_CLOSED_HAS_CHOISES) {
			return ORM_closed_has_choises;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int right_question;
	
	private java.util.Set ORM_closed_has_choises = new java.util.HashSet();
	
	public void setRight_question(int value) {
		this.right_question = value;
	}
	
	public int getRight_question() {
		return right_question;
	}
	
	private void setORM_Closed_has_choises(java.util.Set value) {
		this.ORM_closed_has_choises = value;
	}
	
	private java.util.Set getORM_Closed_has_choises() {
		return ORM_closed_has_choises;
	}
	
	public final model.ChoiseSetCollection closed_has_choises = new model.ChoiseSetCollection(this, _ormAdapter, model.ORMConstants.KEY_CLOSED_CLOSED_HAS_CHOISES, model.ORMConstants.KEY_CHOISE_CHOISE_HAS_CLOSED, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
