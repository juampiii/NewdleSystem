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

import java.io.Serializable;
public class User implements Serializable {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == model.ORMConstants.KEY_USER_STUD_HAS_TESTS) {
			return ORM_stud_has_tests;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String StudentNumber;
	
	private String email;
	
	private String name;
	
	private String surname;
	
	private String password;
	
	private String phone;
	
	private String adress;
	
	private java.util.Date date_created;
	
	private java.util.Set ORM_stud_has_tests = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setStudentNumber(String value) {
		this.StudentNumber = value;
	}
	
	public String getStudentNumber() {
		return StudentNumber;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String value) {
		this.surname = value;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAdress(String value) {
		this.adress = value;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setDate_created(java.util.Date value) {
		this.date_created = value;
	}
	
	public java.util.Date getDate_created() {
		return date_created;
	}
	
	private void setORM_Stud_has_tests(java.util.Set value) {
		this.ORM_stud_has_tests = value;
	}
	
	private java.util.Set getORM_Stud_has_tests() {
		return ORM_stud_has_tests;
	}
	
	public final model.TestSetCollection stud_has_tests = new model.TestSetCollection(this, _ormAdapter, model.ORMConstants.KEY_USER_STUD_HAS_TESTS, model.ORMConstants.KEY_TEST_TEST_HAS_STUDENTS, model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}

	public String getDiscriminator() {
		// TODO Auto-generated method stub
		return "Teacher";
	}
	
}
