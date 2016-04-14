package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import org.orm.PersistentException;

import model.Test_Template;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Manage_Tests_View extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Visual Elements declaration*/
	protected JPanel centerPanel = new JPanel();
	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	protected JPanel testsListsPanel = new JPanel();
	protected JPanel filterPanel = new JPanel();
	protected JLabel lblTitle = new JLabel("Manage Tests - List of Tests");
	protected JLabel lblListOfTest = new JLabel("List of Tests");
	private JTable listsOfTests;
	protected JPanel testOptionsPanel = new JPanel();
	protected JLabel lblTestsOptions = new JLabel("Tests Options");
	protected JPanel createTestPanel = new JPanel();
	protected JLabel lblCreate = new JLabel("New Test");
	protected String[] subjects;
	protected Test_Template[] tests;
	protected JButton buttonCreateTest;
	protected JButton btnEvaluateTest = new JButton("Evaluate");
	protected JButton buttonEditTest = new JButton("Edit");
	protected JButton btnDeleteTest = new JButton("Delete");
	protected JButton buttonFilter = new JButton("Filter");
	protected JComboBox comboBoxFilterSubjects = new JComboBox();
	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	public Manage_Tests_View(String[] subjectsR, Test_Template[] testsR) {
		subjects = subjectsR;
		tests = testsR;
		loadVIewElements();
	}

	protected void loadVIewElements(){
		
		centerPanel.setBounds(181, 94, 593, 457);
		centerPanel.setBackground(Color.DARK_GRAY);
		centerPanel.setLayout(null);
		lblTitle.setForeground(Color.WHITE);
		
				lblTitle.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
				lblTitle.setBounds(20, 10, 443, 41);
				centerPanel.add(lblTitle);
		
		filterPanel.setBounds(10, 385, 366, 61);
		filterPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(filterPanel);
		filterPanel.setLayout(null);
		

		buttonFilter.setBackground(SystemColor.textHighlight);
		buttonFilter.setForeground(Color.WHITE);
		buttonFilter.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		buttonFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonFilter.setBounds(236, 11, 120, 44);
		filterPanel.add(buttonFilter);
		
		
		comboBoxFilterSubjects.setForeground(Color.WHITE);
		comboBoxFilterSubjects.setBackground(Color.DARK_GRAY);
		comboBoxFilterSubjects.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		
		comboBoxFilterSubjects.setModel(new DefaultComboBoxModel(subjects));
		comboBoxFilterSubjects.setBounds(10, 11, 216, 44);
		filterPanel.add(comboBoxFilterSubjects);

		
		
		testsListsPanel.setBackground(Color.DARK_GRAY);

		testsListsPanel.setBounds(10, 50, 366, 326);
		centerPanel.add(testsListsPanel);
		testsListsPanel.setLayout(null);
		lblListOfTest.setForeground(Color.WHITE);

		lblListOfTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblListOfTest.setBounds(10, 11, 250, 30);
		testsListsPanel.add(lblListOfTest);

		/* Load list of tests */


		listsOfTests = new JTable(tests.length, 3);
		listsOfTests.setRowHeight(100);
		listsOfTests.getColumnModel().getColumn(0).setMaxWidth(100);
		listsOfTests.getColumnModel().getColumn(0).setMinWidth(100);
		listsOfTests.getColumnModel().getColumn(1).setMaxWidth(170);
		listsOfTests.getColumnModel().getColumn(1).setMinWidth(170);
		listsOfTests.setShowGrid(false);
		listsOfTests.setTableHeader(null);
		listsOfTests.setFont(new Font("Segoe UI Light", Font.BOLD, 12));

		//Create list of tests
		int i=0;
		for (Test_Template aux : tests) {
			listsOfTests.setValueAt(aux.getName(), i, 0);
			listsOfTests.setValueAt(aux.getTest_temp_has_course().getName() + " ", i, 1);
			int entero, mins;
			entero = (int)aux.getTime();
			mins = (int) ((aux.getTime()-entero)*10);
			mins = (mins*60)/100;
			listsOfTests.setValueAt(entero+":"+mins+"0hs", i, 2);
			i++;
		}
		String[] columnNames = { "Name", "Course", "Time" };
		// se crea la Tabla

		listsOfTests
				.setPreferredScrollableViewportSize(new Dimension(500, 300));
		// Creamos un JscrollPane y le agregamos la JTable
		JScrollPane scrollBarListsOfTests = new JScrollPane(listsOfTests);
		scrollBarListsOfTests.setBounds(5, 45, 356, 269);
		// Agregamos el JScrollPane al contenedor
		testsListsPanel.add(scrollBarListsOfTests);
		testOptionsPanel.setBackground(Color.DARK_GRAY);

		// Favoritos
		testOptionsPanel.setBounds(386, 50, 197, 239);
		// Juego[] juegos = usuario.cargarListado();
		centerPanel.add(testOptionsPanel);
		testOptionsPanel.setLayout(null);
		lblTestsOptions.setForeground(Color.WHITE);

		lblTestsOptions.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblTestsOptions.setBounds(24, 11, 150, 30);
		testOptionsPanel.add(lblTestsOptions);



		//Options menu buttons


		buttonEditTest.setBackground(SystemColor.textHighlight);
		buttonEditTest.setForeground(Color.WHITE);
		buttonEditTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		buttonEditTest.setBounds(22, 50, 120, 44);
		testOptionsPanel.add(buttonEditTest);

		btnDeleteTest.setBackground(SystemColor.textHighlight);
		btnDeleteTest.setForeground(Color.WHITE);
		btnDeleteTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnDeleteTest.setBounds(22, 107, 120, 44);
		testOptionsPanel.add(btnDeleteTest);

		

		btnEvaluateTest.setBackground(SystemColor.textHighlight);
		btnEvaluateTest.setForeground(Color.WHITE);
		btnEvaluateTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnEvaluateTest.setBounds(22, 164, 120, 44);
		testOptionsPanel.add(btnEvaluateTest);

		
		
		createTestPanel.setBackground(Color.DARK_GRAY);

		createTestPanel.setBounds(386, 300, 197, 146);
		centerPanel.add(createTestPanel);
		createTestPanel.setLayout(null);
		lblCreate.setForeground(Color.WHITE);

		lblCreate.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblCreate.setBounds(25, 11, 150, 30);
		createTestPanel.add(lblCreate);

		buttonCreateTest = new JButton("Create");
		
		buttonCreateTest.setBackground(SystemColor.textHighlight);
		buttonCreateTest.setForeground(Color.WHITE);
		buttonCreateTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		buttonCreateTest.setBounds(25, 70, 120, 44);
		createTestPanel.add(buttonCreateTest);
		
		


	}
	



	
	
	public void addController(ActionListener controller){
		//System.out.println("View      : adding controllers");
		buttonEditTest.setActionCommand("con3");
		buttonEditTest.addActionListener(controller);
		btnDeleteTest.setActionCommand("con4");
		btnDeleteTest.addActionListener(controller);
		btnEvaluateTest.setActionCommand("con5");
		btnEvaluateTest.addActionListener(controller);
		buttonCreateTest.setActionCommand("con6");
		buttonCreateTest.addActionListener(controller);

		buttonFilter.setActionCommand("con7");
		buttonFilter.addActionListener(controller);
	}
	
	public boolean isTestSelected(){
		if(listsOfTests.getSelectedRow() == -1)
			return false;
		return true;
	}

	public Test_Template getTestSelected(){
		
		return tests[listsOfTests.getSelectedRow()];
	}
	
	public String getSubjectSelected(){
		return subjects[comboBoxFilterSubjects.getSelectedIndex()];
	}

}
