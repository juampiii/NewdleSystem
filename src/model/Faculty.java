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
public class Faculty implements Serializable {
	public Faculty() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_FACULTY_FACULTY_HAS_TEACHERS) {
			return ORM_faculty_has_teachers;
		}
		else if (key == model.ORMConstants.KEY_FACULTY_FE_HAS_FACULTY) {
			return ORM_fE_has_faculty;
		}
		else if (key == model.ORMConstants.KEY_FACULTY_FACULTY_HAS_COURSE) {
			return ORM_faculty_has_course;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_FACULTY_FAC_HAS_UNIVERSITY) {
			this.fac_has_university = (model.University) owner;
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
	
	private model.University fac_has_university;
	
	private String name;
	
	private java.util.Set ORM_faculty_has_teachers = new java.util.HashSet();
	
	private java.util.Set ORM_fE_has_faculty = new java.util.HashSet();
	
	private java.util.Set ORM_faculty_has_course = new java.util.HashSet();
	
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
	
	private void setORM_Faculty_has_teachers(java.util.Set value) {
		this.ORM_faculty_has_teachers = value;
	}
	
	private java.util.Set getORM_Faculty_has_teachers() {
		return ORM_faculty_has_teachers;
	}
	
	public final model.TeacherSetCollection faculty_has_teachers = new model.TeacherSetCollection(this, _ormAdapter, model.ORMConstants.KEY_FACULTY_FACULTY_HAS_TEACHERS, model.ORMConstants.KEY_TEACHER_TEACHER_HAS_FACULTY, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setFac_has_university(model.University value) {
		if (fac_has_university != null) {
			fac_has_university.univ_has_faculty.remove(this);
		}
		if (value != null) {
			value.univ_has_faculty.add(this);
		}
	}
	
	public model.University getFac_has_university() {
		return fac_has_university;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Fac_has_university(model.University value) {
		this.fac_has_university = value;
	}
	
	private model.University getORM_Fac_has_university() {
		return fac_has_university;
	}
	
	private void setORM_FE_has_faculty(java.util.Set value) {
		this.ORM_fE_has_faculty = value;
	}
	
	private java.util.Set getORM_FE_has_faculty() {
		return ORM_fE_has_faculty;
	}
	
	public final model.Faculty_EffectSetCollection fE_has_faculty = new model.Faculty_EffectSetCollection(this, _ormAdapter, model.ORMConstants.KEY_FACULTY_FE_HAS_FACULTY, model.ORMConstants.KEY_FACULTY_EFFECT_FACULTY_HAS_FE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Faculty_has_course(java.util.Set value) {
		this.ORM_faculty_has_course = value;
	}
	
	private java.util.Set getORM_Faculty_has_course() {
		return ORM_faculty_has_course;
	}
	
	public final model.CourseSetCollection faculty_has_course = new model.CourseSetCollection(this, _ormAdapter, model.ORMConstants.KEY_FACULTY_FACULTY_HAS_COURSE, model.ORMConstants.KEY_COURSE_SUB_HAS_FACULTY, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
