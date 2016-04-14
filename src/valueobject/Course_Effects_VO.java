package valueobject;

import model.Course_Effect;

public class Course_Effects_VO {

	public static String[] getNames(Course_Effect[] cEffects) {
		
		String[] names = new String[cEffects.length];
		for(int i=0; i<cEffects.length;i++){
			names[i]=cEffects[i].getDescription();
			}
		return names;
	}

}
