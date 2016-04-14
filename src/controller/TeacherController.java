package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Course_Effect;
import model.Question;
import model.Teacher;
import model.Test_Template;
import utils.LogRegister;
import valueobject.Course_Effects_VO;
import valueobject.Test_Template_VO;
import view.Course_Effects_View;
import view.Edit_Test_View;
import view.Manage_Tests_View;
import view.New_Closed_Question_View;
import view.New_Question_Type_View;
import view.New_Test_View;
import view.Teacher_View;
import rmi.Client;
import service.Common_Service;
import service.IService;
import service.Question_Service;
import service.Teacher_Service;

public class TeacherController {
	
	private Client teacherModel = new Client();
	private Teacher_View teacherView;
	private Manage_Tests_View mtv;
	
	public void LoadTeacher(String correo){
		String email = correo;
		Teacher teacher = null;
		try {
			teacher = teacherModel.getStubIS().selectTeacher(email);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		teacherView = new Teacher_View(teacher, null);
		//Aun es reversible si lo cambiamos por lo de common
		SubmitButtonListener listener = new SubmitButtonListener(teacherModel.getStubIS(), email);
		teacherView.addListener(listener);
		
		teacherView.setVisible(true);
	    System.out.println(teacher.getName());

	}
	
	public void UnloadTeacher(){
		
	}



	


}

//Class used to 
class SubmitButtonListener implements ActionListener{
	IService model;
	String email;
	Manage_Tests_View mtv;
	New_Test_View ntv;
	Edit_Test_View etv;
	New_Question_Type_View nqtv;
	New_Closed_Question_View ncqv;
	LogRegister logReg = new LogRegister();

	
	public SubmitButtonListener(IService iService, String correo) {
		super();
		this.model = iService;
		email = correo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

				//Register actions:
				String action = 
				email+ " Controller: The " + e.getActionCommand() 
					+ " button is clicked at " + new java.util.Date(e.getWhen())
					+ " with e.paramString " + e.paramString();
				logReg.registerAction(action);
				System.out.println (action);
				
				switch (e.getActionCommand()) {
				case "con1":
					testsAction();
					break;
				case "con2":
					courseEffectAction();
					break;
				case "con3":
					editTest();
					break;
				case "con4":
					deleteTest();
					break;
				case "con5":
					evaluateTest();
					break;
				case "con6":
					createTest();
					break;
				case "con7":
					//JOptionPane.showMessageDialog(null, mtv.getSubjectSelected(), "Testing", JOptionPane.DEFAULT_OPTION);
					filterTests(mtv.getSubjectSelected());
					break;
				case "con8":
					SaveTest();
					break;
				case "con9":
					CancelTest();
					break;
				case "con10":
					EditQuestion();
					break;
				case "con11":
					DeleteQuestion();
					break;
				case "con12":
					NewQuestion();
					break;
				case "con13":
					saveModifiedTest();
					break;
				case "con14":
					break;
				case "con15":
					break;
				case "con16":
					break;
				case "con17":
					NewQuestion();
					break;
				case "con18":
					newGapQuestion();
					break;
				case "con19":
					break;
				case "con20":
					saveGapQuestion();
					break;
				case "con00":
					JOptionPane.showMessageDialog(null, "We are working in this part right now!", "In construction", JOptionPane.DEFAULT_OPTION);
					break;

				default:
					break;
				}
		
	}















	

	private void registerAction(String action) {
		// TODO Auto-generated method stub
		
		
	}

	private void testsAction() {
		Test_Template[] tests=null;
		try {
			tests = model.selectTests(email);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] names = Test_Template_VO.getNamesCourses(tests);
		mtv = new Manage_Tests_View(names, tests);
		mtv.addController(this);
		Teacher_View.centerChange(mtv.getCenterPanel());
		
	}
	
	private void courseEffectAction() {
		Course_Effect[] cEffects=null;
		try {
			cEffects = model.selectCourseEffects(email);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] names = Course_Effects_VO.getNames(cEffects);
		
		Course_Effects_View cev = new Course_Effects_View(names, cEffects);
		cev.addController(this);
		Teacher_View.centerChange(cev.getCenterPanel());
		
	}

	
	private void editTest() {
		// TODO Auto-generated method stub
		if(mtv.isTestSelected()){
		Test_Template test = mtv.getTestSelected();
		String[] names=null;
		Question[] questions = null;
		try {
			names = Test_Template_VO.getNamesCourses(model.selectTests(email));
			questions = model.selectTestsQuestions(test.getName());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		etv = new Edit_Test_View(test, names, questions);
		etv.addController(this);
		Teacher_View.centerChange(etv.getCenterPanel());
		}
		
	}
	
	private void deleteTest() {
		// TODO Auto-generated method stub
		
	}
	
	

	private void evaluateTest() {
		// TODO Auto-generated method stub
		
	}

	private void createTest() {
		try {
			ntv = new New_Test_View(Test_Template_VO.getNamesCourses(model.selectTests(email)));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ntv.addController(this);
		Teacher_View.centerChange(ntv.getCenterPanel());
		
	}

	private void filterTests(String subject) {
		// TODO Auto-generated method stub
		Test_Template[] tests=null;
		String[] names=null;

		try {
			tests = Test_Template_VO.filterTests(model.selectTests(email), subject);
			names = Test_Template_VO.getNamesCourses(model.selectTests(email));

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mtv = new Manage_Tests_View(names, tests);
		mtv.addController(this);
		Teacher_View.centerChange(mtv.getCenterPanel());
	}
	
	private void SaveTest() {
		// TODO Auto-generated method stub
		ArrayList<String> elements = ntv.getData();
		try {
			model.createTestT(elements.get(2), elements.get(0), Double.parseDouble(elements.get(1)));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testsAction();
		//Despues de esto cambiamos a Edit_Test...
		
	}
	

	private void CancelTest() {
		// TODO Auto-generated method stub
		
	}
	
	private void EditQuestion() {
		// TODO Auto-generated method stub
		
	}
	
	private void DeleteQuestion() {
		// TODO Auto-generated method stub
		
	}
	
	private void NewQuestion() {
		// TODO Auto-generated method stub
		New_Question_Type_View nqtv = new New_Question_Type_View();
		nqtv.addController(this);
		Teacher_View.centerChange(nqtv.getCenterPanel());
	}
	
	private void saveModifiedTest() {
		// TODO Auto-generated method stub
		ArrayList<String> elements = etv.getData();
		try {
			etv.test = model.editTestT(etv.test, model.selectIdCourse(elements.get(2)), elements.get(0), Double.parseDouble(elements.get(1)));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		editTest();
		
	}
	
	private void newGapQuestion() {
		// TODO Auto-generated method stub
		//etv.test
		try {
			ncqv = new New_Closed_Question_View(etv.test.getTest_temp_has_course(), model.selectCourseEffectsCourse(etv.test.getTest_temp_has_course()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ncqv.addController(this);
		Teacher_View.centerChange(ncqv.getCenterPanel());
	}
	
	private void saveGapQuestion() {
		// TODO Auto-generated method stub
		ArrayList<String> data = ncqv.getData();
		int tamanyo = data.size()-3;
		String[] ceSend = new String[tamanyo];
		for(int i=0; i<tamanyo; i++)
			ceSend[i] = data.get(i+3);
		try {
			model.createQuestion(etv.test.getID(), data.get(0), null, 1, Double.parseDouble(data.get(2)), ceSend, Double.parseDouble(data.get(1)));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//message
		JOptionPane.showMessageDialog(null, "Question added!", "Operation", JOptionPane.DEFAULT_OPTION);
		
		String[] var = Edit_Test_View.getCourses();
		try {
			etv = new Edit_Test_View(etv.test, var, model.selectTestsQuestions(etv.test.getName()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		etv.addController(this);
		Teacher_View.centerChange(etv.getCenterPanel());
		
		
	}

}