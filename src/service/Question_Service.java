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
import model.Course_Effect;
import model.Course_EffectCriteria;
import model.Question;
import model.QuestionDAO;
import model.Test_Template;
import model.Test_TemplateCriteria;
import model.Test_TemplateDAO;

import org.orm.PersistentException;

/**
 * ORM-Component Class
 */
public class Question_Service {
	public Question_Service() {
	}
	
	private Common_Service bbdd_question_service;
	
	public model.Question createQuestion(int ID, String text, String[] answers, int right, double points, String[] courseEffects, double lenght) {
		//TODO: Implement Method
		Question question = QuestionDAO.createQuestion();
		question.setText(text);
		question.setPoints(points);
		question.setTest_Template_has_question(selectTestT(ID));
		//Almacenar todos los course effects relacionados
		//*Improve this part for more users and evaluation criteria*/
		Course_Effect[] elementCE = new Course_Effect[courseEffects.length];
		int i=0;
		for (String aux: courseEffects){
			elementCE[i] = selectCourseEffectByName(aux);
			i++;
		}

		try {
			QuestionDAO.save(question);
			return question;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return question;
	}

	public Common_Service getBbdd_question_service() {
		return bbdd_question_service;
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
	
	public model.Test_Template selectTestT(int ID){
		Test_Template tt = new Test_Template();
		Test_TemplateCriteria criteria;
		try {
			criteria = new Test_TemplateCriteria();
			criteria.ID.eq(ID);
			tt = criteria.uniqueTest_Template();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return tt;
		
	}

	public void setBbdd_question_service(Common_Service bbdd_question_service) {
		this.bbdd_question_service = bbdd_question_service;
	}
	
}
