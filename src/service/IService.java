package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.*;

public interface IService extends Remote{

	/**
	 * 
	 * @param ID
	 * @param text
	 * @param answers
	 * @param right
	 * @param points
	 * @param courseEffects
	 */
	Question createQuestion(int ID, String text, String[] answers, int right, double points, String[] courseEffects, double lenght)  throws RemoteException;

	/**
	 * 
	 * @param ID
	 */
	Question[] selectQuestions(int ID) throws RemoteException;

	/**
	 * 
	 * @param email
	 */
	Test_Template[] selectTestsT(String email) throws RemoteException;

	/**
	 * 
	 * @param email
	 */
	Teacher selectTeacher(String email) throws RemoteException;

	/**
	 * 
	 * @param email
	 */
	Test_Template[] selectTests(String email) throws RemoteException;

	/**
	 * 
	 * @param email
	 */
	Course_Effect[] selectCourseEffects(String email) throws RemoteException;

	Question[] selectTestsQuestions(String name) throws RemoteException;
	/**
	 * 
	 * @param email
	 */
	Course[] selectCourses(String email) throws RemoteException;

	/**
	 * 
	 * @param IDCourse
	 * @param name
	 * @param time
	 */
	Test_Template createTestT(String IDCourse, String name, double time) throws RemoteException;

	/**
	 * 
	 * @param IDCourse
	 */
	Test_Template[] selectTestsCourse(int IDCourse) throws RemoteException;

	/**
	 * 
	 * @param description
	 * @param text
	 */
	Course_Effect createCourseEffect(String description, String text) throws RemoteException;

	Course selectIdCourse(String string) throws RemoteException;

	Test_Template editTestT(Test_Template test, Course course, String string2,
			double parseDouble) throws RemoteException;

	Course_Effect[] selectCourseEffectsCourse(Course test_temp_has_course) throws RemoteException;

	Boolean existUser(String email, String password) throws RemoteException;
	
	String getTypeUser(String email) throws RemoteException;


}