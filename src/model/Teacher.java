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
public class Teacher extends model.User implements Serializable {
	public Teacher() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_TEACHER_TEACHER_HAS_TEST_TEMP) {
			return ORM_teacher_has_test_temp;
		}
		else if (key == model.ORMConstants.KEY_TEACHER_COURSE_HAS_TEACHER) {
			return ORM_course_has_teacher;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_TEACHER_TEACHER_HAS_FACULTY) {
			this.teacher_has_faculty = (model.Faculty) owner;
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
	
	private model.Faculty teacher_has_faculty;
	
	private java.util.Set ORM_teacher_has_test_temp = new java.util.HashSet();
	
	private java.util.Set ORM_course_has_teacher = new java.util.HashSet();
	
	public void setTeacher_has_faculty(model.Faculty value) {
		if (teacher_has_faculty != null) {
			teacher_has_faculty.faculty_has_teachers.remove(this);
		}
		if (value != null) {
			value.faculty_has_teachers.add(this);
		}
	}
	
	public model.Faculty getTeacher_has_faculty() {
		return teacher_has_faculty;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Teacher_has_faculty(model.Faculty value) {
		this.teacher_has_faculty = value;
	}
	
	private model.Faculty getORM_Teacher_has_faculty() {
		return teacher_has_faculty;
	}
	
	private void setORM_Teacher_has_test_temp(java.util.Set value) {
		this.ORM_teacher_has_test_temp = value;
	}
	
	private java.util.Set getORM_Teacher_has_test_temp() {
		return ORM_teacher_has_test_temp;
	}
	
	public final model.Test_TemplateSetCollection teacher_has_test_temp = new model.Test_TemplateSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEACHER_TEACHER_HAS_TEST_TEMP, model.ORMConstants.KEY_TEST_TEMPLATE_TEST_TEMP_HAS_TEACHER, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Course_has_teacher(java.util.Set value) {
		this.ORM_course_has_teacher = value;
	}
	
	private java.util.Set getORM_Course_has_teacher() {
		return ORM_course_has_teacher;
	}
	
	public final model.CourseSetCollection course_has_teacher = new model.CourseSetCollection(this, _ormAdapter, model.ORMConstants.KEY_TEACHER_COURSE_HAS_TEACHER, model.ORMConstants.KEY_COURSE_TEACHER_HAS_COURSE, model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	private service.Teacher_Service belong_teacher;
	
	public service.Teacher_Service getBelong_teacher()  {
		return this.belong_teacher;
	}
	
	public void setBelong_teacher(service.Teacher_Service value)  {
		this.belong_teacher = value;
	}
	
}
