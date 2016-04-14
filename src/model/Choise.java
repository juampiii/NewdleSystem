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
public class Choise implements Serializable {
	public Choise() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == model.ORMConstants.KEY_CHOISE_CHOISE_HAS_CLOSED) {
			this.choise_has_closed = (model.Closed) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private model.Closed choise_has_closed;
	
	private String text;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setChoise_has_closed(model.Closed value) {
		if (choise_has_closed != null) {
			choise_has_closed.closed_has_choises.remove(this);
		}
		if (value != null) {
			value.closed_has_choises.add(this);
		}
	}
	
	public model.Closed getChoise_has_closed() {
		return choise_has_closed;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Choise_has_closed(model.Closed value) {
		this.choise_has_closed = value;
	}
	
	private model.Closed getORM_Choise_has_closed() {
		return choise_has_closed;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
