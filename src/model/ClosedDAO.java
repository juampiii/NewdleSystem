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

public class ClosedDAO {
	public static Closed loadClosedByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadClosedByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed getClosedByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getClosedByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadClosedByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed getClosedByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getClosedByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Closed) session.load(model.Closed.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed getClosedByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Closed) session.get(model.Closed.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Closed) session.load(model.Closed.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed getClosedByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Closed) session.get(model.Closed.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClosed(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryClosed(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClosed(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryClosed(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed[] listClosedByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listClosedByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed[] listClosedByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listClosedByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClosed(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Closed as Closed");
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
	
	public static List queryClosed(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Closed as Closed");
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
	
	public static Closed[] listClosedByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClosed(session, condition, orderBy);
			return (Closed[]) list.toArray(new Closed[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed[] listClosedByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClosed(session, condition, orderBy, lockMode);
			return (Closed[]) list.toArray(new Closed[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadClosedByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadClosedByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Closed[] closeds = listClosedByQuery(session, condition, orderBy);
		if (closeds != null && closeds.length > 0)
			return closeds[0];
		else
			return null;
	}
	
	public static Closed loadClosedByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Closed[] closeds = listClosedByQuery(session, condition, orderBy, lockMode);
		if (closeds != null && closeds.length > 0)
			return closeds[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClosedByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateClosedByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClosedByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateClosedByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClosedByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Closed as Closed");
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
	
	public static java.util.Iterator iterateClosedByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Closed as Closed");
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
	
	public static Closed createClosed() {
		return new model.Closed();
	}
	
	public static boolean save(model.Closed closed) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(closed);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Closed closed) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(closed);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Closed closed)throws PersistentException {
		try {
			model.Choise[] lClosed_has_choisess = closed.closed_has_choises.toArray();
			for(int i = 0; i < lClosed_has_choisess.length; i++) {
				lClosed_has_choisess[i].setChoise_has_closed(null);
			}
			if(closed.getTest_Template_has_question() != null) {
				closed.getTest_Template_has_question().question_has_tt.remove(closed);
			}
			
			model.Course_Effect[] lCE_has_Questions = closed.cE_has_Question.toArray();
			for(int i = 0; i < lCE_has_Questions.length; i++) {
				lCE_has_Questions[i].question_has_CE.remove(closed);
			}
			model.Answer[] lQuest_has_answerss = closed.quest_has_answers.toArray();
			for(int i = 0; i < lQuest_has_answerss.length; i++) {
				lQuest_has_answerss[i].setAnsw_has_quests(null);
			}
			return delete(closed);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Closed closed, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.Choise[] lClosed_has_choisess = closed.closed_has_choises.toArray();
			for(int i = 0; i < lClosed_has_choisess.length; i++) {
				lClosed_has_choisess[i].setChoise_has_closed(null);
			}
			if(closed.getTest_Template_has_question() != null) {
				closed.getTest_Template_has_question().question_has_tt.remove(closed);
			}
			
			model.Course_Effect[] lCE_has_Questions = closed.cE_has_Question.toArray();
			for(int i = 0; i < lCE_has_Questions.length; i++) {
				lCE_has_Questions[i].question_has_CE.remove(closed);
			}
			model.Answer[] lQuest_has_answerss = closed.quest_has_answers.toArray();
			for(int i = 0; i < lQuest_has_answerss.length; i++) {
				lQuest_has_answerss[i].setAnsw_has_quests(null);
			}
			try {
				session.delete(closed);
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
	
	public static boolean refresh(model.Closed closed) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(closed);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Closed closed) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(closed);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Closed loadClosedByCriteria(ClosedCriteria closedCriteria) {
		Closed[] closeds = listClosedByCriteria(closedCriteria);
		if(closeds == null || closeds.length == 0) {
			return null;
		}
		return closeds[0];
	}
	
	public static Closed[] listClosedByCriteria(ClosedCriteria closedCriteria) {
		return closedCriteria.listClosed();
	}
}
