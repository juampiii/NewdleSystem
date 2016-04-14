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

import model.Course_Effect;
import model.Test_Template;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Course_Effects_View extends JPanel {

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
	protected Course_Effect[] tests;
	protected JButton buttonCreateTest;
	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	public Course_Effects_View(String[] subjectsR, Course_Effect[] cEffects) {
		subjects = subjectsR;
		tests = cEffects;
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
		
		JButton buttonFilter = new JButton("Filter");
		buttonFilter.setBackground(SystemColor.textHighlight);
		buttonFilter.setForeground(Color.WHITE);
		buttonFilter.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		buttonFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonFilter.setBounds(236, 11, 120, 44);
		filterPanel.add(buttonFilter);
		
		JComboBox comboBoxFilter = new JComboBox();
		comboBoxFilter.setForeground(Color.WHITE);
		comboBoxFilter.setBackground(Color.DARK_GRAY);
		comboBoxFilter.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		
		comboBoxFilter.setModel(new DefaultComboBoxModel(subjects));
		comboBoxFilter.setBounds(10, 11, 216, 44);
		filterPanel.add(comboBoxFilter);

		
		
		testsListsPanel.setBackground(Color.DARK_GRAY);

		testsListsPanel.setBounds(10, 50, 366, 326);
		centerPanel.add(testsListsPanel);
		testsListsPanel.setLayout(null);
		lblListOfTest.setForeground(Color.WHITE);

		lblListOfTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblListOfTest.setBounds(10, 11, 250, 30);
		testsListsPanel.add(lblListOfTest);

		/* Load list of tests */


		listsOfTests = new JTable(tests.length+1, 3);
		listsOfTests.setRowHeight(100);
		listsOfTests.getColumnModel().getColumn(0).setMaxWidth(100);
		listsOfTests.getColumnModel().getColumn(0).setMinWidth(100);
		listsOfTests.getColumnModel().getColumn(1).setMaxWidth(200);
		listsOfTests.getColumnModel().getColumn(1).setMinWidth(200);
		listsOfTests.setShowGrid(false);
		listsOfTests.setTableHeader(null);
		listsOfTests.setFont(new Font("Segoe UI Light", Font.BOLD, 15));

		//Create list of tests
		int i=1;
		listsOfTests.setValueAt("Description", 0, 0);
		listsOfTests.setValueAt( "Course", 0, 1);
		listsOfTests.setValueAt("Text", 0, 2);
		for (Course_Effect aux : tests) {
			listsOfTests.setValueAt(aux.getDescription(), i, 0);
			listsOfTests.setValueAt(aux.getCourse_has_CE().getName() + " ", i, 1);
			listsOfTests.setValueAt(aux.getText(), i, 2);
			i++;
		}
		String[] columnNames = { "Description", "Course", "Text" };
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
		JButton buttonEditTest = new JButton("Edit");
		buttonEditTest.setBackground(SystemColor.textHighlight);
		buttonEditTest.setForeground(Color.WHITE);
		buttonEditTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		buttonEditTest.setBounds(22, 50, 120, 44);
		testOptionsPanel.add(buttonEditTest);
		buttonEditTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnDeleteTest = new JButton("Delete");
		btnDeleteTest.setBackground(SystemColor.textHighlight);
		btnDeleteTest.setForeground(Color.WHITE);
		btnDeleteTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnDeleteTest.setBounds(22, 107, 120, 44);
		testOptionsPanel.add(btnDeleteTest);
		btnDeleteTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnEvaluateTest = new JButton("Evaluate");
		btnEvaluateTest.setBackground(SystemColor.textHighlight);
		btnEvaluateTest.setForeground(Color.WHITE);
		btnEvaluateTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnEvaluateTest.setBounds(22, 164, 120, 44);
		testOptionsPanel.add(btnEvaluateTest);
		btnEvaluateTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
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
		System.out.println("View      : adding controller");
		buttonCreateTest.addActionListener(controller);	//need instance of controller before can add it as a listener 
		buttonCreateTest.setActionCommand("CreateTest");

	}


}
