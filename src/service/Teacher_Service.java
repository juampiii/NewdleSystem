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

import java.util.ArrayList;

import org.orm.PersistentException;

import edu.emory.mathcs.backport.java.util.TreeMap;
import model.Course;
import model.CourseSetCollection;
import model.Course_Effect;
import model.Question;
import model.Teacher;
import model.TeacherCriteria;
import model.TeacherDAO;
import model.Test_Template;
import model.Test_TemplateCriteria;
import model.Test_TemplateDAO;
import model.User;
import model.UserCriteria;
import model.UserDAO;

/**
 * ORM-Component Class
 */
public class Teacher_Service {
	public Teacher_Service() {
	}
	
	public model.Teacher selectTeacher(String email) {
		//TODO: Implement Method
		TeacherCriteria t;
		try {
			t = new TeacherCriteria();
			t.email.eq(email);
			return TeacherDAO.loadTeacherByCriteria(t);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public model.Test_Template[] selectTestsT(String email) {

		Teacher teacher = selectTeacher(email);
		return teacher.teacher_has_test_temp.toArray();

	}
	
	public model.Course_Effect[] selectCourseEffects(String email) {
		//TODO: Implement Method
		Teacher teacher = selectTeacher(email);
		Course[] a = teacher.course_has_teacher.toArray();
		ArrayList<Course_Effect> cEffects = new ArrayList<Course_Effect>();
		
		for(int i=0; i<a.length; i++){
			Course_Effect[] aux2 = a[i].cE_has_course.toArray();
			for(int j=0; j<aux2.length;j++)
			cEffects.add(aux2[j]);
		}
		Course_Effect[] finalmente = new Course_Effect[cEffects.size()];
		int i=0;
		for(Course_Effect auxi:cEffects){
			finalmente[i] = auxi;
			i++;
		}
		return finalmente;
	}
	
	public model.Course[] selectCourses(String email) {
		//TODO: Implement Method
		Teacher teacher = selectTeacher(email);
		throw new UnsupportedOperationException();
	}
	
	public Common_Service getBbdd_teacher_service() {
		return bbdd_teacher_service;
	}

	public void setBbdd_teacher_service(Common_Service bbdd_teacher_service) {
		this.bbdd_teacher_service = bbdd_teacher_service;
	}

	private Common_Service bbdd_teacher_service;

	public Question[] selectTestsQuestions(String name) {
		// TODO Auto-generated method stub
		Test_TemplateCriteria criteria;
		try {
			criteria = new Test_TemplateCriteria();
			criteria.name.eq(name);
			return Test_TemplateDAO.loadTest_TemplateByCriteria(criteria).question_has_tt.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Boolean existUser(String email, String password) {
		// TODO Auto-generated method stub
		UserCriteria criteria;
		try {
			criteria = new UserCriteria();
			criteria.email.eq(email);
			criteria.password.eq(password);
			if(UserDAO.loadUserByCriteria(criteria) != null) 
				return true;
			else
				return false;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public String getTypeUser(String email){
		// TODO Auto-generated method stub
				UserCriteria criteria;
				try {
					criteria = new UserCriteria();
					criteria.email.eq(email);
					User user = UserDAO.loadUserByCriteria(criteria);
					if(user == null) 
						return "None";
					else
						return user.getDiscriminator();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "None";
	}
	
}
