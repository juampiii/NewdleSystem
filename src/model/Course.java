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
public class Course implements Serializable {
	public Course() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_COURSE_CE_HAS_COURSE) {
			return ORM_cE_has_course;
		}
		else if (key == model.ORMConstants.KEY_COURSE_COURSE_HAS_TEST_TEMP) {
			return ORM_course_has_test_temp;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_COURSE_SUB_HAS_FACULTY) {
			this.sub_has_faculty = (model.Faculty) owner;
		}
		
		else if (key == model.ORMConstants.KEY_COURSE_TEACHER_HAS_COURSE) {
			this.teacher_has_course = (model.Teacher) owner;
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
	
	private model.Teacher teacher_has_course;
	
	private model.Faculty sub_has_faculty;
	
	private int ECTS;
	
	private String name;
	
	private java.util.Set ORM_cE_has_course = new java.util.HashSet();
	
	private java.util.Set ORM_course_has_test_temp = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setECTS(int value) {
		this.ECTS = value;
	}
	
	public int getECTS() {
		return ECTS;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSub_has_faculty(model.Faculty value) {
		if (sub_has_faculty != null) {
			sub_has_faculty.faculty_has_course.remove(this);
		}
		if (value != null) {
			value.faculty_has_course.add(this);
		}
	}
	
	public model.Faculty getSub_has_faculty() {
		return sub_has_faculty;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Sub_has_faculty(model.Faculty value) {
		this.sub_has_faculty = value;
	}
	
	private model.Faculty getORM_Sub_has_faculty() {
		return sub_has_faculty;
	}
	
	private void setORM_CE_has_course(java.util.Set value) {
		this.ORM_cE_has_course = value;
	}
	
	private java.util.Set getORM_CE_has_course() {
		return ORM_cE_has_course;
	}
	
	public final model.Course_EffectSetCollection cE_has_course = new model.Course_EffectSetCollection(this, _ormAdapter, model.ORMConstants.KEY_COURSE_CE_HAS_COURSE, model.ORMConstants.KEY_COURSE_EFFECT_COURSE_HAS_CE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTeacher_has_course(model.Teacher value) {
		if (teacher_has_course != null) {
			teacher_has_course.course_has_teacher.remove(this);
		}
		if (value != null) {
			value.course_has_teacher.add(this);
		}
	}
	
	public model.Teacher getTeacher_has_course() {
		return teacher_has_course;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Teacher_has_course(model.Teacher value) {
		this.teacher_has_course = value;
	}
	
	private model.Teacher getORM_Teacher_has_course() {
		return teacher_has_course;
	}
	
	private void setORM_Course_has_test_temp(java.util.Set value) {
		this.ORM_course_has_test_temp = value;
	}
	
	private java.util.Set getORM_Course_has_test_temp() {
		return ORM_course_has_test_temp;
	}
	
	public final model.Test_TemplateSetCollection course_has_test_temp = new model.Test_TemplateSetCollection(this, _ormAdapter, model.ORMConstants.KEY_COURSE_COURSE_HAS_TEST_TEMP, model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_COURSE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
