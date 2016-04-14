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

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Course;
import model.Course_Effect;
import model.Test_Template;


/**
 * ORM-Component Class
 */
public class Common_Service  extends UnicastRemoteObject implements IService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Common_Service() throws RemoteException{
		
	}
	
	public model.Question createQuestion(int ID, String text, String[] answers, int right, double points, String[] courseEffects, double lenght) {
		//TODO: Implement Method
		return new Question_Service().createQuestion(ID, text, answers, right, points, courseEffects, lenght);
	}
	
	public model.Question[] selectQuestions(int ID) {
		//TODO: Implement Method
		return new Test_Template_Service().selectQuestions(ID);
	}
	
	public model.Test_Template[] selectTestsT(String email) {
		//TODO: Implement Method
		return new Teacher_Service().selectTestsT(email);
	}
	
	public model.Teacher selectTeacher(String email) {
		//TODO: Implement Method
		return new Teacher_Service().selectTeacher(email);
	}
	
	public model.Test_Template[] selectTests(String email) {
		//TODO: Implement Method
		return new Teacher_Service().selectTestsT(email);
	}
	
	public model.Question[] selectTestsQuestions(String name) {
		//TODO: Implement Method
		return new Teacher_Service().selectTestsQuestions(name);
	}
	
	public model.Course_Effect[] selectCourseEffects(String email) {
		//TODO: Implement Method
		return new Teacher_Service().selectCourseEffects(email);
	}
	
	public model.Course[] selectCourses(String email) {
		//TODO: Implement Method
		return new Teacher_Service().selectCourses(email);
	}
	
	public model.Test_Template createTestT(String IDCourse, String name, double time) {
		//TODO: Implement Method
		return new Test_Template_Service().createTestT(IDCourse, name, time);
	}
	
	public model.Test_Template[] selectTestsCourse(int IDCourse) {
		//TODO: Implement Method
		return new Test_Template_Service().selectTestsCourse(IDCourse);
	}
	
	public model.Test_Template[] selectTestsCourse(String NameCourse) {
		//TODO: Implement Method
		return new Test_Template_Service().selectTestsCourse(NameCourse);

	}
	
	public Course selectIdCourse(String NameCourse) {
		//TODO: Implement Method
		return new Test_Template_Service().selectIdCourse(NameCourse);

	}
	
	public model.Course_Effect createCourseEffect(String description, String text) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public model.Course_Effect selectCourseEffectByName(String name) {
		//TODO: Implement Method
		return new Course_Effect_Service().selectCourseEffectByName(name);
	}
	
	private service.Test_Template_Service bbdd_testt_service;
	
	public service.Test_Template_Service getBbdd_testt_service()  {
		return this.bbdd_testt_service;
	}
	
	public void setBbdd_testt_service(service.Test_Template_Service value)  {
		this.bbdd_testt_service = value;
	}
	
	private service.Course_Effect_Service course_Effect_Service;
	
	private service.Teacher_Service teacher_Service;
	
	public service.Teacher_Service getTeacher_Service()  {
		return this.teacher_Service;
	}
	
	public void setTeacher_Service(service.Teacher_Service value)  {
		this.teacher_Service = value;
	}
	
	private service.Question_Service question_Service;
	
	public service.Question_Service getQuestion_Service()  {
		return this.question_Service;
	}
	
	public void setQuestion_Service(service.Question_Service value)  {
		this.question_Service = value;
	}

	public service.Course_Effect_Service getCourse_Effect_Service() {
		return course_Effect_Service;
	}

	public void setCourse_Effect_Service(service.Course_Effect_Service course_Effect_Service) {
		this.course_Effect_Service = course_Effect_Service;
	}

	public Test_Template editTestT(Test_Template test, Course course, String string2,
			double parseDouble) {
		return new Test_Template_Service().editTestT(test, course, string2, parseDouble);

		// TODO Auto-generated method stub
		
	}

	@Override
	public Course_Effect[] selectCourseEffectsCourse(Course test_temp_has_course)
			throws RemoteException {
		// TODO Auto-generated method stub
		return new Test_Template_Service().selectCourseEffectsCourse(test_temp_has_course);
	}

	@Override
	public Boolean existUser(String email, String password)
			throws RemoteException {
		// TODO Auto-generated method stub
		return new Teacher_Service().existUser(email, password);
	}
	
	@Override
	public String getTypeUser(String email)
	throws RemoteException {
		// TODO Auto-generated method stub
		return new Teacher_Service().getTypeUser(email);
	}
	
}
