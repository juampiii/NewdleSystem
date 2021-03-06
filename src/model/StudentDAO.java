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

public class StudentDAO {
	public static Student loadStudentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadStudentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getStudentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadStudentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getStudentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Student) session.load(model.Student.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Student) session.get(model.Student.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Student) session.load(model.Student.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Student) session.get(model.Student.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryStudent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryStudent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Student as Student");
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
	
	public static List queryStudent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Student as Student");
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
	
	public static Student[] listStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStudent(session, condition, orderBy);
			return (Student[]) list.toArray(new Student[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStudent(session, condition, orderBy, lockMode);
			return (Student[]) list.toArray(new Student[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Student[] students = listStudentByQuery(session, condition, orderBy);
		if (students != null && students.length > 0)
			return students[0];
		else
			return null;
	}
	
	public static Student loadStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Student[] students = listStudentByQuery(session, condition, orderBy, lockMode);
		if (students != null && students.length > 0)
			return students[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Student as Student");
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
	
	public static java.util.Iterator iterateStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Student as Student");
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
	
	public static Student createStudent() {
		return new model.Student();
	}
	
	public static boolean save(model.Student student) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Student student) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Student student)throws PersistentException {
		try {
			model.Test[] lStud_has_testss = student.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(student);
			}
			return delete(student);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Student student, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.Test[] lStud_has_testss = student.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(student);
			}
			try {
				session.delete(student);
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
	
	public static boolean refresh(model.Student student) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Student student) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByCriteria(StudentCriteria studentCriteria) {
		Student[] students = listStudentByCriteria(studentCriteria);
		if(students == null || students.length == 0) {
			return null;
		}
		return students[0];
	}
	
	public static Student[] listStudentByCriteria(StudentCriteria studentCriteria) {
		return studentCriteria.listStudent();
	}
}
