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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class Test_TemplateDAO {
	public static Test_Template loadTest_TemplateByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTest_TemplateByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template getTest_TemplateByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getTest_TemplateByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTest_TemplateByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template getTest_TemplateByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getTest_TemplateByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Test_Template) session.load(model.Test_Template.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template getTest_TemplateByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Test_Template) session.get(model.Test_Template.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Test_Template) session.load(model.Test_Template.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template getTest_TemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Test_Template) session.get(model.Test_Template.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTest_Template(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryTest_Template(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTest_Template(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryTest_Template(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template[] listTest_TemplateByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listTest_TemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template[] listTest_TemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listTest_TemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTest_Template(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Test_Template as Test_Template");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTest_Template(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Test_Template as Test_Template");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template[] listTest_TemplateByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTest_Template(session, condition, orderBy);
			return (Test_Template[]) list.toArray(new Test_Template[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template[] listTest_TemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTest_Template(session, condition, orderBy, lockMode);
			return (Test_Template[]) list.toArray(new Test_Template[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTest_TemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTest_TemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Test_Template[] test_Templates = listTest_TemplateByQuery(session, condition, orderBy);
		if (test_Templates != null && test_Templates.length > 0)
			return test_Templates[0];
		else
			return null;
	}
	
	public static Test_Template loadTest_TemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Test_Template[] test_Templates = listTest_TemplateByQuery(session, condition, orderBy, lockMode);
		if (test_Templates != null && test_Templates.length > 0)
			return test_Templates[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTest_TemplateByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateTest_TemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTest_TemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateTest_TemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTest_TemplateByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Test_Template as Test_Template");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTest_TemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Test_Template as Test_Template");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template createTest_Template() {
		return new model.Test_Template();
	}
	
	public static boolean save(model.Test_Template test_Template) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(test_Template);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Test_Template test_Template) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(test_Template);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Test_Template test_Template)throws PersistentException {
		try {
			if(test_Template.getTest_temp_has_course() != null) {
				test_Template.getTest_temp_has_course().course_has_test_temp.remove(test_Template);
			}
			
			if(test_Template.getTest_temp_has_teacher() != null) {
				test_Template.getTest_temp_has_teacher().teacher_has_test_temp.remove(test_Template);
			}
			
			model.Test[] lTest_temp_has_testss = test_Template.test_temp_has_tests.toArray();
			for(int i = 0; i < lTest_temp_has_testss.length; i++) {
				lTest_temp_has_testss[i].test_has_test_temp.remove(test_Template);
			}
			model.Question[] lQuestion_has_tts = test_Template.question_has_tt.toArray();
			for(int i = 0; i < lQuestion_has_tts.length; i++) {
				lQuestion_has_tts[i].setTest_Template_has_question(null);
			}
			return delete(test_Template);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Test_Template test_Template, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(test_Template.getTest_temp_has_course() != null) {
				test_Template.getTest_temp_has_course().course_has_test_temp.remove(test_Template);
			}
			
			if(test_Template.getTest_temp_has_teacher() != null) {
				test_Template.getTest_temp_has_teacher().teacher_has_test_temp.remove(test_Template);
			}
			
			model.Test[] lTest_temp_has_testss = test_Template.test_temp_has_tests.toArray();
			for(int i = 0; i < lTest_temp_has_testss.length; i++) {
				lTest_temp_has_testss[i].test_has_test_temp.remove(test_Template);
			}
			model.Question[] lQuestion_has_tts = test_Template.question_has_tt.toArray();
			for(int i = 0; i < lQuestion_has_tts.length; i++) {
				lQuestion_has_tts[i].setTest_Template_has_question(null);
			}
			try {
				session.delete(test_Template);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.Test_Template test_Template) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(test_Template);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Test_Template test_Template) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(test_Template);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Test_Template loadTest_TemplateByCriteria(Test_TemplateCriteria test_TemplateCriteria) {
		Test_Template[] test_Templates = listTest_TemplateByCriteria(test_TemplateCriteria);
		if(test_Templates == null || test_Templates.length == 0) {
			return null;
		}
		return test_Templates[0];
	}
	
	public static Test_Template[] listTest_TemplateByCriteria(Test_TemplateCriteria test_TemplateCriteria) {
		return test_TemplateCriteria.listTest_Template();
	}
}
