package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import model.Course;

import org.orm.PersistentException;

import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Component;

public class New_Test_View extends JPanel {

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
	protected JPanel testInfoPanel = new JPanel();
	protected JPanel filterPanel = new JPanel();
	protected JLabel lblTitle = new JLabel("Manage Tests - New Test");
	protected JLabel lblListOfTest = new JLabel("Name:");
	protected JPanel questionsOptionsPanel = new JPanel();
	protected JLabel lblTestsOptions = new JLabel("Question Options");
	private final JPanel questionsPanel = new JPanel();
	private final JLabel lblListOfQuestions = new JLabel("List of Questions");
	private final JLabel lblTime = new JLabel("Time:");
	private final JLabel lblCourse = new JLabel("Course:");
	private JTextField textFieldTime;
	private final JTextField textFieldName = new JTextField();
	protected JButton btnSave = new JButton("Save");
	protected JButton btnCancel = new JButton("Cancel");
	protected JButton btnEditQuestion = new JButton("Edit");
	protected JButton btnDeleteQuestion = new JButton("Delete");
	protected JButton btnNewQuestion = new JButton("New");
	protected JComboBox<String> comboBoxCourse = new JComboBox<String>();
	protected String[] courses;

	/**
	 * Create the panel.
	 * @param strings 
	 * 
	 * @throws PersistentException
	 */
	public New_Test_View(String[] strings) {

		courses = strings;
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
		
				
				
				testInfoPanel.setBackground(Color.DARK_GRAY);
				
						testInfoPanel.setBounds(10, 50, 573, 110);
						centerPanel.add(testInfoPanel);
						testInfoPanel.setLayout(null);
						lblListOfTest.setForeground(Color.WHITE);
						
								lblListOfTest.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
								
										lblListOfTest.setBounds(10, 26, 83, 30);
										testInfoPanel.add(lblListOfTest);
										lblTime.setForeground(Color.WHITE);
										lblTime.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblTime.setBounds(10, 69, 83, 30);
										
										testInfoPanel.add(lblTime);
										
										comboBoxCourse.setBounds(321, 55, 216, 44);
										testInfoPanel.add(comboBoxCourse);
										comboBoxCourse.setForeground(Color.WHITE);
										comboBoxCourse.setBackground(SystemColor.activeCaptionBorder);
										comboBoxCourse.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										comboBoxCourse.setModel(new DefaultComboBoxModel(courses));
										lblCourse.setForeground(Color.WHITE);
										lblCourse.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblCourse.setBounds(321, 11, 83, 30);
										
										testInfoPanel.add(lblCourse);
										
										textFieldTime = new JTextField();
										textFieldTime.setBackground(SystemColor.activeCaptionBorder);
										textFieldTime.setBounds(105, 59, 160, 40);
										testInfoPanel.add(textFieldTime);
										textFieldTime.setColumns(10);
										textFieldTime.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldName.setBackground(SystemColor.activeCaptionBorder);
										textFieldName.setColumns(10);
										textFieldName.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldName.setBounds(105, 11, 160, 40);
										
										testInfoPanel.add(textFieldName);
		questionsPanel.setBounds(10, 163, 372, 215);
		questionsPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(questionsPanel);
		questionsPanel.setLayout(null);
		lblListOfQuestions.setForeground(Color.WHITE);
		lblListOfQuestions.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblListOfQuestions.setBounds(10, 11, 173, 30);
		
		questionsPanel.add(lblListOfQuestions);
		
		JScrollPane scrollPaneQuestions = new JScrollPane((Component) null);
		scrollPaneQuestions.setBounds(10, 50, 350, 160);
		questionsPanel.add(scrollPaneQuestions);


		questionsOptionsPanel.setBackground(Color.DARK_GRAY);
		
				// Favoritos
				questionsOptionsPanel.setBounds(386, 163, 197, 215);
				// Juego[] juegos = usuario.cargarListado();
				centerPanel.add(questionsOptionsPanel);
				questionsOptionsPanel.setLayout(null);
				lblTestsOptions.setForeground(Color.WHITE);
				
						lblTestsOptions.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
						
								lblTestsOptions.setBounds(24, 11, 173, 30);
								questionsOptionsPanel.add(lblTestsOptions);
								
								
								
										//Options menu buttons
										btnEditQuestion.setBackground(SystemColor.textHighlight);
										btnEditQuestion.setForeground(Color.WHITE);
										btnEditQuestion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										btnEditQuestion.setBounds(22, 50, 120, 44);
										questionsOptionsPanel.add(btnEditQuestion);
										btnEditQuestion.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
											}
										});
										

										btnDeleteQuestion.setBackground(SystemColor.textHighlight);
										btnDeleteQuestion.setForeground(Color.WHITE);
										btnDeleteQuestion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										btnDeleteQuestion.setBounds(22, 107, 120, 44);
										questionsOptionsPanel.add(btnDeleteQuestion);
										btnDeleteQuestion.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
											}
										});
										

										btnNewQuestion.setBackground(SystemColor.textHighlight);
										btnNewQuestion.setForeground(Color.WHITE);
										btnNewQuestion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										btnNewQuestion.setBounds(22, 164, 120, 44);
										questionsOptionsPanel.add(btnNewQuestion);
										btnNewQuestion.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												newQuestion();
											}

											
										});
		
		filterPanel.setBounds(10, 385, 573, 61);
		filterPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(filterPanel);
		filterPanel.setLayout(null);
		
		btnSave.setBackground(SystemColor.textHighlight);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save();
			}

			
		});
		btnSave.setBounds(339, 11, 120, 44);
		filterPanel.add(btnSave);
		

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancel();
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnCancel.setBackground(SystemColor.textHighlight);
		btnCancel.setBounds(104, 11, 120, 44);
		filterPanel.add(btnCancel);

		/* Load list of tests */

		loadTestsQuestions();

		String[] columnNames = { "Name", "Course", "Time" };
		
		

		// listadoRanking.add(scrollBarRanking);

	}
	
	protected void cancel() {
		// TODO Auto-generated method stub
		//Teacher_View.centerChange(new Manage_Tests_View().centerPanel);

	}

	private void loadTestsQuestions(){
	}
	
	private void save() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Test Submit Succed!", "New Test Confirmation", JOptionPane.DEFAULT_OPTION);
		//Teacher_View.centerChange(new Manage_Tests_View().centerPanel);


	}
	
	private void newQuestion() {
		// TODO Auto-generated method stub
		Teacher_View.centerChange(new New_Question_Type_View().centerPanel);

	}

	public void addController(ActionListener controller) {
		// TODO Auto-generated method stub
		btnSave.setActionCommand("con8");
		btnSave.addActionListener(controller);
		btnCancel.setActionCommand("con9");
		btnCancel.addActionListener(controller);
		btnEditQuestion.setActionCommand("con10");
		btnEditQuestion.addActionListener(controller);
		btnDeleteQuestion.setActionCommand("con11");
		btnDeleteQuestion.addActionListener(controller);
		btnNewQuestion.setActionCommand("con12");
		btnNewQuestion.addActionListener(controller);
		

	}

	public java.util.ArrayList<String> getData() {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> elements = new java.util.ArrayList<String>();
		elements.add(textFieldName.getText());
		elements.add(textFieldTime.getText());
		elements.add(courses[comboBoxCourse.getSelectedIndex()]);
		return elements;
	}
}
