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

public class ChoiseDAO {
	public static Choise loadChoiseByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadChoiseByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise getChoiseByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getChoiseByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadChoiseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise getChoiseByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getChoiseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Choise) session.load(model.Choise.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise getChoiseByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Choise) session.get(model.Choise.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Choise) session.load(model.Choise.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise getChoiseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Choise) session.get(model.Choise.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChoise(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryChoise(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChoise(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryChoise(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise[] listChoiseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listChoiseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise[] listChoiseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listChoiseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChoise(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Choise as Choise");
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
	
	public static List queryChoise(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Choise as Choise");
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
	
	public static Choise[] listChoiseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryChoise(session, condition, orderBy);
			return (Choise[]) list.toArray(new Choise[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise[] listChoiseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryChoise(session, condition, orderBy, lockMode);
			return (Choise[]) list.toArray(new Choise[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadChoiseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadChoiseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Choise[] choises = listChoiseByQuery(session, condition, orderBy);
		if (choises != null && choises.length > 0)
			return choises[0];
		else
			return null;
	}
	
	public static Choise loadChoiseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Choise[] choises = listChoiseByQuery(session, condition, orderBy, lockMode);
		if (choises != null && choises.length > 0)
			return choises[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateChoiseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateChoiseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChoiseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateChoiseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChoiseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Choise as Choise");
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
	
	public static java.util.Iterator iterateChoiseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Choise as Choise");
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
	
	public static Choise createChoise() {
		return new model.Choise();
	}
	
	public static boolean save(model.Choise choise) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(choise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Choise choise) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(choise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Choise choise)throws PersistentException {
		try {
			if(choise.getChoise_has_closed() != null) {
				choise.getChoise_has_closed().closed_has_choises.remove(choise);
			}
			
			return delete(choise);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Choise choise, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(choise.getChoise_has_closed() != null) {
				choise.getChoise_has_closed().closed_has_choises.remove(choise);
			}
			
			try {
				session.delete(choise);
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
	
	public static boolean refresh(model.Choise choise) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(choise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Choise choise) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(choise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Choise loadChoiseByCriteria(ChoiseCriteria choiseCriteria) {
		Choise[] choises = listChoiseByCriteria(choiseCriteria);
		if(choises == null || choises.length == 0) {
			return null;
		}
		return choises[0];
	}
	
	public static Choise[] listChoiseByCriteria(ChoiseCriteria choiseCriteria) {
		return choiseCriteria.listChoise();
	}
}
