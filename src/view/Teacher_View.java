package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import model.Teacher;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.util.Observable;


public class Teacher_View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Visual Elements declaration*/
	protected static  JPanel container = new JPanel();
	protected  JPanel center = new JPanel();
	protected  JPanel menuTeacher = new JPanel();
	protected  JPanel menuTop = new JPanel();
	protected  JButton btnRepport = new JButton("");
	protected  JButton btnCEffects = new JButton("");
	protected  JButton btnTests = new JButton("");
	protected  JButton btnLogOut = new JButton("");
	protected  JButton btnProfile = new JButton("");
	public static JLabel lblImg = new JLabel("");
	protected  JLabel lblName;
	public static String email;
	Teacher teacher;
	String[] namesSubject;
	
	ActionListener com1;



	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_View frame = new Teacher_View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


		});
	}*/
	
	public ActionListener getCom1() {
		return com1;
	}


	public void setCom1(ActionListener com1) {
		this.com1 = com1;
	}


	/**
	 * Create the frame.
	 * @param names 
	 */
	public Teacher_View(Teacher t, JPanel p) {
		teacher = t;
		
		//loadUser();
		/*Panels*/
		loadPanels();
		/*Buttons*/
		loadMenuButtons();
		/*Menu Top*/
		loadMenuTop();
		if(p!=null)
			this.centerChange(p);
	}
	
	
	/*Methods zone:*/
	
	private void loadPanels() {
		setTitle("Newdle System - Teacher view ("+teacher.getName()+" "+teacher.getSurname()+")");
		lblName = new JLabel(teacher.getName()+" "+teacher.getSurname()+" - 16/05/2015");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600); 
		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(container);
		container.setLayout(null);
		center.setBackground(Color.DARK_GRAY);
		//center = (new Manage_Tests_View()).centerPanel;
		container.add(center, 0);
		container.setBackground(Color.DARK_GRAY);
		menuTeacher.setBackground(Color.DARK_GRAY);
		menuTeacher.setBounds(10, 147, 127, 454);
		container.add(menuTeacher, 1);
		menuTeacher.setLayout(null);

		
	}

	private void loadMenuButtons() {

		btnTests.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/tests.png")));
		btnTests.setPressedIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/testsOver.png")));

		btnTests.setBounds(0, 0, 127, 121);
		menuTeacher.add(btnTests);
		btnTests.addActionListener(com1);



		btnCEffects.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/courseEffects.png")));
		btnCEffects.setPressedIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/courseEffectsOver.png")));

		btnCEffects.setBounds(0, 120, 127, 111);
		menuTeacher.add(btnCEffects);
		btnCEffects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseEffects();
			}

			
		});
		

		btnRepport.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/report.png")));
		btnRepport.setPressedIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menu/reportOver.png")));

		btnRepport.setBounds(0, 232, 127, 111);
		menuTeacher.add(btnRepport);
		btnRepport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report();
			}
		});
		
	}

	private void loadMenuTop() {
		
		menuTop.setBounds(10, 11, 764, 80);
		menuTop.setBackground(Color.DARK_GRAY);
		container.add(menuTop, 2);
		menuTop.setLayout(null);
		lblImg.setForeground(Color.WHITE);
		lblImg.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menutop/bogu.png")));
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setBounds(0, 0, 80, 80);
		menuTop.add(lblImg);
		
		lblName.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(101, 33, 330, 21);
		menuTop.add(lblName);
		
		btnProfile.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menutop/profile.png")));
		btnProfile.setBounds(550, 0, 100, 80);
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//profile();
			}
		});
		menuTop.add(btnProfile);
		
		btnLogOut.setIcon(new ImageIcon(Teacher_View.class.getResource("/view/img/menutop/exit.png")));
		btnLogOut.setBounds(660, 0, 100, 80);
		btnLogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				logOut();
			}
		});
		menuTop.add(btnLogOut);
		
	}

	
	/*Buttons methods*/

	protected void profile() {

		Gestionar_perfil perfil = new Gestionar_perfil();
		container.getComponent(0).hide();
		container.add(perfil.central, 0);
		setTitle("Manage Profile");
		repaint();
		
	}


	public void tests(String title) {
		
		setTitle(title);
		repaint();

		
		
	}
	
	private void courseEffects() {
		// TODO Auto-generated method stub
		
	}
	
	private void report() {
		// TODO Auto-generated method stub
		
	}
	
	public static void centerChange(JPanel panel) {
			container.getComponent(0).hide();
			container.add(panel, 0);
			container.repaint();
		}

	
	private void logOut() {

		this.hide();

	}
	
	public void loadUser() {
		

	}


	public void addListener(ActionListener controller){
		//System.out.println("View      : adding controller");
		btnTests.addActionListener(controller);
		btnTests.setActionCommand("con1");
		btnCEffects.addActionListener(controller);	//need instance of controller before can add it as a listener 
		btnCEffects.setActionCommand("con2");
	
		btnRepport.setActionCommand("con00");
		btnRepport.addActionListener(controller);	//need instance of controller before can add it as a listener 

		btnLogOut.setActionCommand("con00");
		btnLogOut.addActionListener(controller);	//need instance of controller before can add it as a listener 

		btnProfile.setActionCommand("con00");
		btnProfile.addActionListener(controller);	//need instance of controller before can add it as a listener 


	} //addController()

}
