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
package service;

import model.Course;
import model.CourseCriteria;
import model.Course_Effect;
import model.Course_EffectCriteria;

import org.orm.PersistentException;

/**
 * ORM-Component Class
 */
public class Course_Effect_Service {
	public Course_Effect_Service() {
	}
	
	public model.Course_Effect createCourseEffect(String description, String text) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public model.Course_Effect selectCourseEffectByName(String name) {
		Course_Effect auxCourse = new Course_Effect();
		Course_EffectCriteria criteria;
		try {
			criteria = new Course_EffectCriteria();
			criteria.text.eq(name);
			auxCourse = criteria.uniqueCourse_Effect();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return auxCourse;
		//TODO: Implement Method
	}
	
	private service.Common_Service Common_Service;
	
	public service.Common_Service getCommon_Service()  {
		return this.Common_Service;
	}
	
	public void setCommon_Service(service.Common_Service value)  {
		this.Common_Service = value;
	}
	
}
