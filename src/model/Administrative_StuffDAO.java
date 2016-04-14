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

public class Administrative_StuffDAO {
	public static Administrative_Stuff loadAdministrative_StuffByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAdministrative_StuffByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff getAdministrative_StuffByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getAdministrative_StuffByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAdministrative_StuffByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff getAdministrative_StuffByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getAdministrative_StuffByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrative_Stuff) session.load(model.Administrative_Stuff.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff getAdministrative_StuffByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Administrative_Stuff) session.get(model.Administrative_Stuff.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrative_Stuff) session.load(model.Administrative_Stuff.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff getAdministrative_StuffByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrative_Stuff) session.get(model.Administrative_Stuff.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrative_Stuff(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryAdministrative_Stuff(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrative_Stuff(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryAdministrative_Stuff(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff[] listAdministrative_StuffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listAdministrative_StuffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff[] listAdministrative_StuffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listAdministrative_StuffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrative_Stuff(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Administrative_Stuff as Administrative_Stuff");
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
	
	public static List queryAdministrative_Stuff(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Administrative_Stuff as Administrative_Stuff");
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
	
	public static Administrative_Stuff[] listAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrative_Stuff(session, condition, orderBy);
			return (Administrative_Stuff[]) list.toArray(new Administrative_Stuff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff[] listAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrative_Stuff(session, condition, orderBy, lockMode);
			return (Administrative_Stuff[]) list.toArray(new Administrative_Stuff[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAdministrative_StuffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAdministrative_StuffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrative_Stuff[] administrative_Stuffs = listAdministrative_StuffByQuery(session, condition, orderBy);
		if (administrative_Stuffs != null && administrative_Stuffs.length > 0)
			return administrative_Stuffs[0];
		else
			return null;
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrative_Stuff[] administrative_Stuffs = listAdministrative_StuffByQuery(session, condition, orderBy, lockMode);
		if (administrative_Stuffs != null && administrative_Stuffs.length > 0)
			return administrative_Stuffs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrative_StuffByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateAdministrative_StuffByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrative_StuffByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateAdministrative_StuffByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Administrative_Stuff as Administrative_Stuff");
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
	
	public static java.util.Iterator iterateAdministrative_StuffByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Administrative_Stuff as Administrative_Stuff");
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
	
	public static Administrative_Stuff createAdministrative_Stuff() {
		return new model.Administrative_Stuff();
	}
	
	public static boolean save(model.Administrative_Stuff administrative_Stuff) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(administrative_Stuff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Administrative_Stuff administrative_Stuff) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(administrative_Stuff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Administrative_Stuff administrative_Stuff)throws PersistentException {
		try {
			model.Test[] lStud_has_testss = administrative_Stuff.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(administrative_Stuff);
			}
			return delete(administrative_Stuff);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Administrative_Stuff administrative_Stuff, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.Test[] lStud_has_testss = administrative_Stuff.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(administrative_Stuff);
			}
			try {
				session.delete(administrative_Stuff);
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
	
	public static boolean refresh(model.Administrative_Stuff administrative_Stuff) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(administrative_Stuff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Administrative_Stuff administrative_Stuff) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(administrative_Stuff);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrative_Stuff loadAdministrative_StuffByCriteria(Administrative_StuffCriteria administrative_StuffCriteria) {
		Administrative_Stuff[] administrative_Stuffs = listAdministrative_StuffByCriteria(administrative_StuffCriteria);
		if(administrative_Stuffs == null || administrative_Stuffs.length == 0) {
			return null;
		}
		return administrative_Stuffs[0];
	}
	
	public static Administrative_Stuff[] listAdministrative_StuffByCriteria(Administrative_StuffCriteria administrative_StuffCriteria) {
		return administrative_StuffCriteria.listAdministrative_Stuff();
	}
}
