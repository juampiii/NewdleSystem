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
public class University implements Serializable {
	public University() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_UNIVERSITY_UNIV_HAS_FACULTY) {
			return ORM_univ_has_faculty;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String name;
	
	private java.util.Set ORM_univ_has_faculty = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setORM_Univ_has_faculty(java.util.Set value) {
		this.ORM_univ_has_faculty = value;
	}
	
	private java.util.Set getORM_Univ_has_faculty() {
		return ORM_univ_has_faculty;
	}
	
	public final model.FacultySetCollection univ_has_faculty = new model.FacultySetCollection(this, _ormAdapter, model.ORMConstants.KEY_UNIVERSITY_UNIV_HAS_FACULTY, model.ORMConstants.KEY_FACULTY_FAC_HAS_UNIVERSITY, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
