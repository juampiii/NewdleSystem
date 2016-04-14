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

public class TeacherDAO {
	public static Teacher loadTeacherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTeacherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher getTeacherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getTeacherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTeacherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher getTeacherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return getTeacherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Teacher) session.load(model.Teacher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher getTeacherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Teacher) session.get(model.Teacher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Teacher) session.load(model.Teacher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher getTeacherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Teacher) session.get(model.Teacher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeacher(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryTeacher(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeacher(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return queryTeacher(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher[] listTeacherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listTeacherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher[] listTeacherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return listTeacherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTeacher(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Teacher as Teacher");
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
	
	public static List queryTeacher(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Teacher as Teacher");
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
	
	public static Teacher[] listTeacherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTeacher(session, condition, orderBy);
			return (Teacher[]) list.toArray(new Teacher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher[] listTeacherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTeacher(session, condition, orderBy, lockMode);
			return (Teacher[]) list.toArray(new Teacher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTeacherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return loadTeacherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Teacher[] teachers = listTeacherByQuery(session, condition, orderBy);
		if (teachers != null && teachers.length > 0)
			return teachers[0];
		else
			return null;
	}
	
	public static Teacher loadTeacherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Teacher[] teachers = listTeacherByQuery(session, condition, orderBy, lockMode);
		if (teachers != null && teachers.length > 0)
			return teachers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTeacherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateTeacherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTeacherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.TestingPersistentManager.instance().getSession();
			return iterateTeacherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTeacherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Teacher as Teacher");
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
	
	public static java.util.Iterator iterateTeacherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Teacher as Teacher");
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
	
	public static Teacher createTeacher() {
		return new model.Teacher();
	}
	
	public static boolean save(model.Teacher teacher) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().saveObject(teacher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Teacher teacher) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().deleteObject(teacher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Teacher teacher)throws PersistentException {
		try {
			if(teacher.getTeacher_has_faculty() != null) {
				teacher.getTeacher_has_faculty().faculty_has_teachers.remove(teacher);
			}
			
			model.Test_Template[] lTeacher_has_test_temps = teacher.teacher_has_test_temp.toArray();
			for(int i = 0; i < lTeacher_has_test_temps.length; i++) {
				lTeacher_has_test_temps[i].setTest_temp_has_teacher(null);
			}
			model.Course[] lCourse_has_teachers = teacher.course_has_teacher.toArray();
			for(int i = 0; i < lCourse_has_teachers.length; i++) {
				lCourse_has_teachers[i].setTeacher_has_course(null);
			}
			model.Test[] lStud_has_testss = teacher.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(teacher);
			}
			return delete(teacher);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Teacher teacher, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(teacher.getTeacher_has_faculty() != null) {
				teacher.getTeacher_has_faculty().faculty_has_teachers.remove(teacher);
			}
			
			model.Test_Template[] lTeacher_has_test_temps = teacher.teacher_has_test_temp.toArray();
			for(int i = 0; i < lTeacher_has_test_temps.length; i++) {
				lTeacher_has_test_temps[i].setTest_temp_has_teacher(null);
			}
			model.Course[] lCourse_has_teachers = teacher.course_has_teacher.toArray();
			for(int i = 0; i < lCourse_has_teachers.length; i++) {
				lCourse_has_teachers[i].setTeacher_has_course(null);
			}
			model.Test[] lStud_has_testss = teacher.stud_has_tests.toArray();
			for(int i = 0; i < lStud_has_testss.length; i++) {
				lStud_has_testss[i].test_has_students.remove(teacher);
			}
			try {
				session.delete(teacher);
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
	
	public static boolean refresh(model.Teacher teacher) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().refresh(teacher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Teacher teacher) throws PersistentException {
		try {
			model.TestingPersistentManager.instance().getSession().evict(teacher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Teacher loadTeacherByCriteria(TeacherCriteria teacherCriteria) {
		Teacher[] teachers = listTeacherByCriteria(teacherCriteria);
		if(teachers == null || teachers.length == 0) {
			return null;
		}
		return teachers[0];
	}
	
	public static Teacher[] listTeacherByCriteria(TeacherCriteria teacherCriteria) {
		return teacherCriteria.listTeacher();
	}
}
