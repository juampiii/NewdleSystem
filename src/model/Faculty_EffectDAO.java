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

public class Faculty_EffectDAO {
	public static Faculty_Effect loadFaculty_EffectByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFaculty_EffectByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect getFaculty_EffectByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getFaculty_EffectByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFaculty_EffectByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect getFaculty_EffectByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getFaculty_EffectByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Faculty_Effect) session.load(model.Faculty_Effect.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect getFaculty_EffectByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Faculty_Effect) session.get(model.Faculty_Effect.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Faculty_Effect) session.load(model.Faculty_Effect.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect getFaculty_EffectByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Faculty_Effect) session.get(model.Faculty_Effect.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty_Effect(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryFaculty_Effect(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty_Effect(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryFaculty_Effect(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect[] listFaculty_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listFaculty_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect[] listFaculty_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listFaculty_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty_Effect(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty_Effect as Faculty_Effect");
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
	
	public static List queryFaculty_Effect(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty_Effect as Faculty_Effect");
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
	
	public static Faculty_Effect[] listFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFaculty_Effect(session, condition, orderBy);
			return (Faculty_Effect[]) list.toArray(new Faculty_Effect[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect[] listFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFaculty_Effect(session, condition, orderBy, lockMode);
			return (Faculty_Effect[]) list.toArray(new Faculty_Effect[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFaculty_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFaculty_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Faculty_Effect[] faculty_Effects = listFaculty_EffectByQuery(session, condition, orderBy);
		if (faculty_Effects != null && faculty_Effects.length > 0)
			return faculty_Effects[0];
		else
			return null;
	}
	
	public static Faculty_Effect loadFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Faculty_Effect[] faculty_Effects = listFaculty_EffectByQuery(session, condition, orderBy, lockMode);
		if (faculty_Effects != null && faculty_Effects.length > 0)
			return faculty_Effects[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFaculty_EffectByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateFaculty_EffectByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFaculty_EffectByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateFaculty_EffectByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty_Effect as Faculty_Effect");
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
	
	public static java.util.Iterator iterateFaculty_EffectByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty_Effect as Faculty_Effect");
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
	
	public static Faculty_Effect createFaculty_Effect() {
		return new model.Faculty_Effect();
	}
	
	public static boolean save(model.Faculty_Effect faculty_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(faculty_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Faculty_Effect faculty_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(faculty_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Faculty_Effect faculty_Effect)throws PersistentException {
		try {
			if(faculty_Effect.getFaculty_has_FE() != null) {
				faculty_Effect.getFaculty_has_FE().fE_has_faculty.remove(faculty_Effect);
			}
			
			model.Course_Effect[] lCE_has_FEs = faculty_Effect.cE_has_FE.toArray();
			for(int i = 0; i < lCE_has_FEs.length; i++) {
				lCE_has_FEs[i].setFE_has_CE(null);
			}
			return delete(faculty_Effect);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Faculty_Effect faculty_Effect, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(faculty_Effect.getFaculty_has_FE() != null) {
				faculty_Effect.getFaculty_has_FE().fE_has_faculty.remove(faculty_Effect);
			}
			
			model.Course_Effect[] lCE_has_FEs = faculty_Effect.cE_has_FE.toArray();
			for(int i = 0; i < lCE_has_FEs.length; i++) {
				lCE_has_FEs[i].setFE_has_CE(null);
			}
			try {
				session.delete(faculty_Effect);
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
	
	public static boolean refresh(model.Faculty_Effect faculty_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(faculty_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Faculty_Effect faculty_Effect) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(faculty_Effect);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty_Effect loadFaculty_EffectByCriteria(Faculty_EffectCriteria faculty_EffectCriteria) {
		Faculty_Effect[] faculty_Effects = listFaculty_EffectByCriteria(faculty_EffectCriteria);
		if(faculty_Effects == null || faculty_Effects.length == 0) {
			return null;
		}
		return faculty_Effects[0];
	}
	
	public static Faculty_Effect[] listFaculty_EffectByCriteria(Faculty_EffectCriteria faculty_EffectCriteria) {
		return faculty_EffectCriteria.listFaculty_Effect();
	}
}
