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
public class Course_Effect implements Serializable {
	public Course_Effect() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_COURSE_EFFECT_QUESTION_HAS_CE) {
			return ORM_question_has_CE;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_COURSE_EFFECT_COURSE_HAS_CE) {
			this.course_has_CE = (model.Course) owner;
		}
		
		else if (key == model.ORMConstants.KEY_COURSE_EFFECT_FE_HAS_CE) {
			this.FE_has_CE = (model.Faculty_Effect) owner;
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
	
	private model.Faculty_Effect FE_has_CE;
	
	private model.Course course_has_CE;
	
	private String description;
	
	private String text;
	
	private java.util.Set ORM_question_has_CE = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setCourse_has_CE(model.Course value) {
		if (course_has_CE != null) {
			course_has_CE.cE_has_course.remove(this);
		}
		if (value != null) {
			value.cE_has_course.add(this);
		}
	}
	
	public model.Course getCourse_has_CE() {
		return course_has_CE;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Course_has_CE(model.Course value) {
		this.course_has_CE = value;
	}
	
	private model.Course getORM_Course_has_CE() {
		return course_has_CE;
	}
	
	public void setFE_has_CE(model.Faculty_Effect value) {
		if (FE_has_CE != null) {
			FE_has_CE.cE_has_FE.remove(this);
		}
		if (value != null) {
			value.cE_has_FE.add(this);
		}
	}
	
	public model.Faculty_Effect getFE_has_CE() {
		return FE_has_CE;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_FE_has_CE(model.Faculty_Effect value) {
		this.FE_has_CE = value;
	}
	
	private model.Faculty_Effect getORM_FE_has_CE() {
		return FE_has_CE;
	}
	
	private void setORM_Question_has_CE(java.util.Set value) {
		this.ORM_question_has_CE = value;
	}
	
	private java.util.Set getORM_Question_has_CE() {
		return ORM_question_has_CE;
	}
	
	public final model.QuestionSetCollection question_has_CE = new model.QuestionSetCollection(this, _ormAdapter, model.ORMConstants.KEY_COURSE_EFFECT_QUESTION_HAS_CE, model.ORMConstants.KEY_QUESTION_CE_HAS_QUESTION, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
	private service.Course_Effect_Service belong_course_effect;
	
	public service.Course_Effect_Service getBelong_course_effect()  {
		return this.belong_course_effect;
	}
	
	public void setBelong_course_effect(service.Course_Effect_Service value)  {
		this.belong_course_effect = value;
	}
	
}
