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

import org.orm.PersistentException;

import model.Course;
import model.CourseCriteria;
import model.CourseDAO;
import model.Course_Effect;
import model.Test_Template;
import model.Test_TemplateCriteria;
import model.Test_TemplateDAO;

/**
 * ORM-Component Class
 */
public class Test_Template_Service {
	public Test_Template_Service() {
	}
	
	private Common_Service bbdd_testt_service;
	
	public model.Question[] selectQuestions(int ID) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public model.Test_Template createTestT(String IDCourse, String name, double time) {
		//TODO: Implement Method
		Test_Template testT = Test_TemplateDAO.createTest_Template();
		testT.setName(name);
		testT.setTime(time);
		Course auxCourse = selectIdCourse(IDCourse);
		testT.setTest_temp_has_course(auxCourse);
		//*Improve this part for more users and evaluation criteria*/
		testT.setEvaluation_criteria("Super; Pass; Fail");
		testT.setTest_temp_has_teacher(new Teacher_Service().selectTeacher("teacher@gmail.com"));
		try {
			Test_TemplateDAO.save(testT);
			return testT;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testT;
	}
	
	public model.Test_Template[] selectTestsCourse(int IDCourse) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	public model.Test_Template[] selectTestsCourse(String NameCourse) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Course selectIdCourse(String NameCourse) {
		//TODO: Implement Method
		Course auxCourse = new Course();
		CourseCriteria criteria;
		try {
			criteria = new CourseCriteria();
			criteria.name.eq(NameCourse);
			auxCourse = criteria.uniqueCourse();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return auxCourse;

	}
	
	public Common_Service getBbdd_testt_service() {
		return bbdd_testt_service;
	}

	public void setBbdd_testt_service(Common_Service bbdd_testt_service) {
		this.bbdd_testt_service = bbdd_testt_service;
	}

	public Test_Template editTestT(Test_Template test, Course course, String string2,
			double parseDouble) {
		// TODO Auto-generated method stub
		try {
			Test_Template testAux = Test_TemplateDAO.getTest_TemplateByORMID(test.getID());
			testAux.setName(string2);
			testAux.setTime(parseDouble);
			testAux.setORM_Test_temp_has_course(course);
			Test_TemplateDAO.save(testAux);
			return testAux;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Course_Effect[] selectCourseEffectsCourse(Course test_temp_has_course) {
		// TODO Auto-generated method stub
		
		try {
			Course testAux = CourseDAO.getCourseByORMID(test_temp_has_course.getID());
			return testAux.cE_has_course.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	}
	
}
