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

public class AnswerDAO {
	public static Answer loadAnswerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAnswerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer getAnswerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getAnswerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAnswerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer getAnswerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getAnswerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Answer) session.load(model.Answer.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer getAnswerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Answer) session.get(model.Answer.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Answer) session.load(model.Answer.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer getAnswerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Answer) session.get(model.Answer.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnswer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryAnswer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnswer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryAnswer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer[] listAnswerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listAnswerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer[] listAnswerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listAnswerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnswer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Answer as Answer");
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
	
	public static List queryAnswer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Answer as Answer");
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
	
	public static Answer[] listAnswerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnswer(session, condition, orderBy);
			return (Answer[]) list.toArray(new Answer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer[] listAnswerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnswer(session, condition, orderBy, lockMode);
			return (Answer[]) list.toArray(new Answer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAnswerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadAnswerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Answer[] answers = listAnswerByQuery(session, condition, orderBy);
		if (answers != null && answers.length > 0)
			return answers[0];
		else
			return null;
	}
	
	public static Answer loadAnswerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Answer[] answers = listAnswerByQuery(session, condition, orderBy, lockMode);
		if (answers != null && answers.length > 0)
			return answers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnswerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateAnswerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnswerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateAnswerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnswerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Answer as Answer");
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
	
	public static java.util.Iterator iterateAnswerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Answer as Answer");
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
	
	public static Answer createAnswer() {
		return new model.Answer();
	}
	
	public static boolean save(model.Answer answer) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(answer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Answer answer) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(answer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Answer answer)throws PersistentException {
		try {
			if(answer.getAnsw_has_quests() != null) {
				answer.getAnsw_has_quests().quest_has_answers.remove(answer);
			}
			
			model.Test[] lAnsw_has_testss = answer.answ_has_tests.toArray();
			for(int i = 0; i < lAnsw_has_testss.length; i++) {
				lAnsw_has_testss[i].test_has_answers.remove(answer);
			}
			return delete(answer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Answer answer, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(answer.getAnsw_has_quests() != null) {
				answer.getAnsw_has_quests().quest_has_answers.remove(answer);
			}
			
			model.Test[] lAnsw_has_testss = answer.answ_has_tests.toArray();
			for(int i = 0; i < lAnsw_has_testss.length; i++) {
				lAnsw_has_testss[i].test_has_answers.remove(answer);
			}
			try {
				session.delete(answer);
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
	
	public static boolean refresh(model.Answer answer) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(answer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Answer answer) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(answer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Answer loadAnswerByCriteria(AnswerCriteria answerCriteria) {
		Answer[] answers = listAnswerByCriteria(answerCriteria);
		if(answers == null || answers.length == 0) {
			return null;
		}
		return answers[0];
	}
	
	public static Answer[] listAnswerByCriteria(AnswerCriteria answerCriteria) {
		return answerCriteria.listAnswer();
	}
}
