package valueobject;

import java.util.ArrayList;

import model.Test_Template;

public class Test_Template_VO {

	public static String[] getNames(Test_Template[] tests) {
		String[] names = new String[tests.length];
		for (int i = 0; i < tests.length; i++) {
			names[i] = tests[i].getName();
		}
		return names;
	}

	public static String[] getNamesCourses(Test_Template[] tests) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < tests.length; i++) {
			if(!al.contains(tests[i].getTest_temp_has_course().getName()))
				al.add(tests[i].getTest_temp_has_course().getName());
		}

		String[] names = new String[al.size()];
		int i = 0;
		for (String aux : al) {
			names[i] = aux;
			i++;
		}

		return names;
	}

	public static Test_Template[] filterTests(Test_Template[] selectTests,
			String subject) {
		ArrayList<Test_Template> aux = new ArrayList<Test_Template>();
		for (int i = 0; i < selectTests.length; i++) {
			String nameAux = selectTests[i].getTest_temp_has_course()
					.getName();
			System.out.println("Comparing ->"+nameAux + "-> " + subject);
			if (nameAux.equals(subject))
				aux.add(selectTests[i]);
		}

		Test_Template[] filters = new Test_Template[aux.size()];
		int j = 0;
		for (Test_Template aux1 : aux) {
			filters[j] = aux1;
			j++;
		}

		return filters;
	}

}
