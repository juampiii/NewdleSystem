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
public class Faculty_Effect implements Serializable {
	public Faculty_Effect() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_FACULTY_EFFECT_CE_HAS_FE) {
			return ORM_cE_has_FE;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_FACULTY_EFFECT_FACULTY_HAS_FE) {
			this.faculty_has_FE = (model.Faculty) owner;
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
	
	private model.Faculty faculty_has_FE;
	
	private String description;
	
	private String text;
	
	private java.util.Set ORM_cE_has_FE = new java.util.HashSet();
	
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
	
	public void setFaculty_has_FE(model.Faculty value) {
		if (faculty_has_FE != null) {
			faculty_has_FE.fE_has_faculty.remove(this);
		}
		if (value != null) {
			value.fE_has_faculty.add(this);
		}
	}
	
	public model.Faculty getFaculty_has_FE() {
		return faculty_has_FE;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Faculty_has_FE(model.Faculty value) {
		this.faculty_has_FE = value;
	}
	
	private model.Faculty getORM_Faculty_has_FE() {
		return faculty_has_FE;
	}
	
	private void setORM_CE_has_FE(java.util.Set value) {
		this.ORM_cE_has_FE = value;
	}
	
	private java.util.Set getORM_CE_has_FE() {
		return ORM_cE_has_FE;
	}
	
	public final model.Course_EffectSetCollection cE_has_FE = new model.Course_EffectSetCollection(this, _ormAdapter, model.ORMConstants.KEY_FACULTY_EFFECT_CE_HAS_FE, model.ORMConstants.KEY_COURSE_EFFECT_FE_HAS_CE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
