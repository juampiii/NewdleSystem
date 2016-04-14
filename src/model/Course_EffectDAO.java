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

public class Course_EffectDAO {
	public static Course_Effect loadCourse_EffectByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadCourse_EffectByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect getCourse_EffectByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getCourse_EffectByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadCourse_EffectByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect getCourse_EffectByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getCourse_EffectByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Course_Effect) session.load(model.Course_Effect.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect getCourse_EffectByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Course_Effect) session.get(model.Course_Effect.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Course_Effect) session.load(model.Course_Effect.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect getCourse_EffectByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Course_Effect) session.get(model.Course_Effect.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCourse_Effect(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryCourse_Effect(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCourse_Effect(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryCourse_Effect(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect[] listCourse_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listCourse_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect[] listCourse_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listCourse_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCourse_Effect(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Course_Effect as Course_Effect");
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
	
	public static List queryCourse_Effect(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Course_Effect as Course_Effect");
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
	
	public static Course_Effect[] listCourse_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCourse_Effect(session, condition, orderBy);
			return (Course_Effect[]) list.toArray(new Course_Effect[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect[] listCourse_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCourse_Effect(session, condition, orderBy, lockMode);
			return (Course_Effect[]) list.toArray(new Course_Effect[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadCourse_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadCourse_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Course_Effect[] course_Effects = listCourse_EffectByQuery(session, condition, orderBy);
		if (course_Effects != null && course_Effects.length > 0)
			return course_Effects[0];
		else
			return null;
	}
	
	public static Course_Effect loadCourse_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Course_Effect[] course_Effects = listCourse_EffectByQuery(session, condition, orderBy, lockMode);
		if (course_Effects != null && course_Effects.length > 0)
			return course_Effects[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCourse_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateCourse_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCourse_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateCourse_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCourse_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Course_Effect as Course_Effect");
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
	
	public static java.util.Iterator iterateCourse_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Course_Effect as Course_Effect");
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
	
	public static Course_Effect createCourse_Effect() {
		return new model.Course_Effect();
	}
	
	public static boolean save(model.Course_Effect course_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(course_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Course_Effect course_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(course_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Course_Effect course_Effect)throws PersistentException {
		try {
			if(course_Effect.getFE_has_CE() != null) {
				course_Effect.getFE_has_CE().cE_has_FE.remove(course_Effect);
			}
			
			if(course_Effect.getCourse_has_CE() != null) {
				course_Effect.getCourse_has_CE().cE_has_course.remove(course_Effect);
			}
			
			model.Question[] lQuestion_has_CEs = course_Effect.question_has_CE.toArray();
			for(int i = 0; i < lQuestion_has_CEs.length; i++) {
				lQuestion_has_CEs[i].cE_has_Question.remove(course_Effect);
			}
			return delete(course_Effect);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Course_Effect course_Effect, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(course_Effect.getFE_has_CE() != null) {
				course_Effect.getFE_has_CE().cE_has_FE.remove(course_Effect);
			}
			
			if(course_Effect.getCourse_has_CE() != null) {
				course_Effect.getCourse_has_CE().cE_has_course.remove(course_Effect);
			}
			
			model.Question[] lQuestion_has_CEs = course_Effect.question_has_CE.toArray();
			for(int i = 0; i < lQuestion_has_CEs.length; i++) {
				lQuestion_has_CEs[i].cE_has_Question.remove(course_Effect);
			}
			try {
				session.delete(course_Effect);
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
	
	public static boolean refresh(model.Course_Effect course_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(course_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Course_Effect course_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(course_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Course_Effect loadCourse_EffectByCriteria(Course_EffectCriteria course_EffectCriteria) {
		Course_Effect[] course_Effects = listCourse_EffectByCriteria(course_EffectCriteria);
		if(course_Effects == null || course_Effects.length == 0) {
			return null;
		}
		return course_Effects[0];
	}
	
	public static Course_Effect[] listCourse_EffectByCriteria(Course_EffectCriteria course_EffectCriteria) {
		return course_EffectCriteria.listCourse_Effect();
	}
}
