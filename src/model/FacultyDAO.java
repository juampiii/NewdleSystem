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

public class FacultyDAO {
	public static Faculty loadFacultyByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFacultyByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty getFacultyByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getFacultyByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFacultyByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty getFacultyByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getFacultyByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Faculty) session.load(model.Faculty.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty getFacultyByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Faculty) session.get(model.Faculty.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Faculty) session.load(model.Faculty.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty getFacultyByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Faculty) session.get(model.Faculty.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryFaculty(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryFaculty(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty[] listFacultyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listFacultyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty[] listFacultyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listFacultyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFaculty(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty as Faculty");
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
	
	public static List queryFaculty(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty as Faculty");
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
	
	public static Faculty[] listFacultyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFaculty(session, condition, orderBy);
			return (Faculty[]) list.toArray(new Faculty[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty[] listFacultyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFaculty(session, condition, orderBy, lockMode);
			return (Faculty[]) list.toArray(new Faculty[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFacultyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadFacultyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Faculty[] facultys = listFacultyByQuery(session, condition, orderBy);
		if (facultys != null && facultys.length > 0)
			return facultys[0];
		else
			return null;
	}
	
	public static Faculty loadFacultyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Faculty[] facultys = listFacultyByQuery(session, condition, orderBy, lockMode);
		if (facultys != null && facultys.length > 0)
			return facultys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFacultyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateFacultyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacultyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateFacultyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFacultyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty as Faculty");
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
	
	public static java.util.Iterator iterateFacultyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Faculty as Faculty");
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
	
	public static Faculty createFaculty() {
		return new model.Faculty();
	}
	
	public static boolean save(model.Faculty faculty) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(faculty);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Faculty faculty) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(faculty);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Faculty faculty)throws PersistentException {
		try {
			if(faculty.getFac_has_university() != null) {
				faculty.getFac_has_university().univ_has_faculty.remove(faculty);
			}
			
			model.Teacher[] lFaculty_has_teacherss = faculty.faculty_has_teachers.toArray();
			for(int i = 0; i < lFaculty_has_teacherss.length; i++) {
				lFaculty_has_teacherss[i].setTeacher_has_faculty(null);
			}
			model.Faculty_Effect[] lFE_has_facultys = faculty.fE_has_faculty.toArray();
			for(int i = 0; i < lFE_has_facultys.length; i++) {
				lFE_has_facultys[i].setFaculty_has_FE(null);
			}
			model.Course[] lFaculty_has_courses = faculty.faculty_has_course.toArray();
			for(int i = 0; i < lFaculty_has_courses.length; i++) {
				lFaculty_has_courses[i].setSub_has_faculty(null);
			}
			return delete(faculty);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Faculty faculty, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(faculty.getFac_has_university() != null) {
				faculty.getFac_has_university().univ_has_faculty.remove(faculty);
			}
			
			model.Teacher[] lFaculty_has_teacherss = faculty.faculty_has_teachers.toArray();
			for(int i = 0; i < lFaculty_has_teacherss.length; i++) {
				lFaculty_has_teacherss[i].setTeacher_has_faculty(null);
			}
			model.Faculty_Effect[] lFE_has_facultys = faculty.fE_has_faculty.toArray();
			for(int i = 0; i < lFE_has_facultys.length; i++) {
				lFE_has_facultys[i].setFaculty_has_FE(null);
			}
			model.Course[] lFaculty_has_courses = faculty.faculty_has_course.toArray();
			for(int i = 0; i < lFaculty_has_courses.length; i++) {
				lFaculty_has_courses[i].setSub_has_faculty(null);
			}
			try {
				session.delete(faculty);
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
	
	public static boolean refresh(model.Faculty faculty) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(faculty);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Faculty faculty) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(faculty);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Faculty loadFacultyByCriteria(FacultyCriteria facultyCriteria) {
		Faculty[] facultys = listFacultyByCriteria(facultyCriteria);
		if(facultys == null || facultys.length == 0) {
			return null;
		}
		return facultys[0];
	}
	
	public static Faculty[] listFacultyByCriteria(FacultyCriteria facultyCriteria) {
		return facultyCriteria.listFaculty();
	}
}
