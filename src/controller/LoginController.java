package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import utils.LogRegister;
import utils.ValidatorUtil;
import view.Login_View;
import view.Teacher_View;
import rmi.Client;
import service.IService;

public class LoginController {

	private Client teacherModel = new Client();
	private Teacher_View teacherView;
	public static Login_View lv;

	public void LoadLogin() {

		lv = new Login_View();
		// Aun es reversible si lo cambiamos por lo de common
		LoginButtonListener listener = new LoginButtonListener(teacherModel.getStubIS());
		lv.addController(listener);

		lv.setVisible(true);
		System.out.println("Load first window");

	}

}

// Class used to
class LoginButtonListener implements ActionListener {
	IService model;
	LogRegister logReg = new LogRegister();

	public LoginButtonListener(IService iService) {
		this.model = iService;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Register actions:
		String action = " Controller: The " + e.getActionCommand() + " button is clicked at " + new java.util.Date(e.getWhen())
				+ " with e.paramString " + e.paramString();
		logReg.registerAction(action);
		System.out.println(action);

		switch (e.getActionCommand()) {
		case "con1":
			tryLogin();
			break;
		case "con2":
			close();
			break;
		default:
			break;
		}

	}

	private void tryLogin() {
		// TODO Auto-generated method stub
		if (!LoginController.lv.fulfill())
			JOptionPane.showMessageDialog(null, "email/password cannot be empty!", "Error", JOptionPane.DEFAULT_OPTION);
		else {
			ArrayList<String> al = LoginController.lv.getData();
			String email = al.get(0), password = al.get(1);
			if (!ValidatorUtil.validateEmail(email))
				JOptionPane.showMessageDialog(null, "Incorrect e-mail address format", "Error", JOptionPane.DEFAULT_OPTION);
			else if (!ValidatorUtil.validatePassword(password))
				JOptionPane.showMessageDialog(null, "Incorrect password format", "Error", JOptionPane.DEFAULT_OPTION);
			else {
				Boolean exist = false;
				try {
					exist = model.existUser(email, password);
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				if (!exist)
					JOptionPane.showMessageDialog(null, "Incorrect email/password", "Error", JOptionPane.DEFAULT_OPTION);
				else {
					String type = "None";
					try {
						type = model.getTypeUser(email);
					} catch (RemoteException e) {
						e.printStackTrace();
					}

					switch (type) {
					case "None":
						JOptionPane.showMessageDialog(null, "There are an error with your account. Please, contact Admin.", "Error",              
								JOptionPane.DEFAULT_OPTION);
						break;
					case "Teacher": {
						LoginController.lv.setVisible(false);
						TeacherController controller = new TeacherController();
						controller.LoadTeacher(email);
					}
						break;
					case "Student":
						// Load interface
						break;
					case "Administrative Stuff":
						// Load interface
						break;
					}

				}

			}
		}

	}

	private void close() {
		// TODO Auto-generated method stub
		LoginController.lv.setVisible(false);
		
	}

	/*
	 * private void testsAction() { Test_Template[] tests=null; try { tests =
	 * model.selectTests(email); } catch (RemoteException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } String[] names =
	 * Test_Template_VO.getNamesCourses(tests); mtv = new
	 * Manage_Tests_View(names, tests); mtv.addController(this);
	 * Teacher_View.centerChange(mtv.getCenterPanel());
	 * 
	 * }
	 */

}