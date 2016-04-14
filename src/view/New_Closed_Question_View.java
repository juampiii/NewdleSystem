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
import model.Course_Effect;
import model.Question;
import model.Test_Template;

import org.apache.log4j.nt.NTEventLogAppender;
import org.orm.PersistentException;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Component;
import java.util.ArrayList;

public class New_Closed_Question_View extends JPanel {

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

	protected JPanel testQuestionPanel = new JPanel();
	protected JPanel FormOptionsPanel = new JPanel();
	protected JLabel lblTitle = new JLabel("New Gap Question");
	protected JLabel lblTextQuestion = new JLabel("Question:");
	protected JPanel cEffectsOptionsPanel = new JPanel();
	private final JPanel cEffectsPanel = new JPanel();
	private final JLabel lblListOfCE = new JLabel("List of Course Effects");
	private final JLabel lblPoints = new JLabel("Points:");
	private final JLabel lblAnswers = new JLabel("Answers lenght:");
	private JTextField textFieldPoints;
	private final JTextField textFieldQuestion = new JTextField();
	private final JLabel lblOptions = new JLabel("Options");
	protected JButton btnSave = new JButton("Save");
	protected JButton btnCancel = new JButton("Cancel");
	protected JButton btnAddCE = new JButton("Add");
	protected JScrollPane scrollPaneCE;
	Course_Effect[] ceffects;
	ArrayList<String> courseEffects = new ArrayList<String>();




	Course curso;
	private JTextField textFieldLenght;
	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	
	public New_Closed_Question_View(Course course, Course_Effect[] elementos) {
		// TODO Auto-generated constructor stub
		curso = course;
		ceffects = elementos;
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
		
				
				
				testQuestionPanel.setBackground(Color.DARK_GRAY);
				
						testQuestionPanel.setBounds(10, 50, 573, 153);
						centerPanel.add(testQuestionPanel);
						testQuestionPanel.setLayout(null);
						lblTextQuestion.setForeground(Color.WHITE);
						
								lblTextQuestion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
								
										lblTextQuestion.setBounds(10, 0, 99, 30);
										testQuestionPanel.add(lblTextQuestion);
										lblPoints.setForeground(Color.WHITE);
										lblPoints.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblPoints.setBounds(407, 58, 68, 30);
										
										testQuestionPanel.add(lblPoints);
										lblAnswers.setForeground(Color.WHITE);
										lblAnswers.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblAnswers.setBounds(10, 58, 175, 30);
										
										testQuestionPanel.add(lblAnswers);
										
										textFieldPoints = new JTextField();
										textFieldPoints.setBackground(SystemColor.activeCaptionBorder);
										textFieldPoints.setBounds(403, 99, 160, 40);
										testQuestionPanel.add(textFieldPoints);
										textFieldPoints.setColumns(10);
										textFieldPoints.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldQuestion.setBackground(SystemColor.activeCaptionBorder);
										textFieldQuestion.setColumns(10);
										textFieldQuestion.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldQuestion.setBounds(146, 5, 417, 40);
										
										testQuestionPanel.add(textFieldQuestion);
										
										textFieldLenght = new JTextField();
										textFieldLenght.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldLenght.setColumns(10);
										textFieldLenght.setBackground(SystemColor.activeCaptionBorder);
										textFieldLenght.setBounds(25, 99, 160, 40);
										testQuestionPanel.add(textFieldLenght);
		cEffectsPanel.setBounds(10, 214, 372, 181);
		cEffectsPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(cEffectsPanel);
		cEffectsPanel.setLayout(null);
		lblListOfCE.setForeground(Color.WHITE);
		lblListOfCE.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblListOfCE.setBounds(10, 11, 232, 30);
		
		cEffectsPanel.add(lblListOfCE);
		
		JScrollPane scrollPaneCE = new JScrollPane((Component) null);
		scrollPaneCE.setBounds(10, 52, 350, 91);
		cEffectsPanel.add(scrollPaneCE);


		cEffectsOptionsPanel.setBackground(Color.DARK_GRAY);
		
				// Favoritos
				cEffectsOptionsPanel.setBounds(386, 214, 197, 181);
				// Juego[] juegos = usuario.cargarListado();
				centerPanel.add(cEffectsOptionsPanel);
				cEffectsOptionsPanel.setLayout(null);
										
										JButton btnDeleteCE = new JButton("Delete");
										btnDeleteCE.setBackground(SystemColor.textHighlight);
										btnDeleteCE.setForeground(Color.WHITE);
										btnDeleteCE.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										btnDeleteCE.setBounds(20, 44, 120, 44);
										cEffectsOptionsPanel.add(btnDeleteCE);
										btnDeleteCE.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
											}
										});
										
										btnAddCE.setBackground(SystemColor.textHighlight);
										btnAddCE.setForeground(Color.WHITE);
										btnAddCE.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										btnAddCE.setBounds(20, 101, 120, 44);
										cEffectsOptionsPanel.add(btnAddCE);
										lblOptions.setForeground(Color.WHITE);
										lblOptions.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblOptions.setBounds(10, 11, 148, 30);
										
										cEffectsOptionsPanel.add(lblOptions);
										btnAddCE.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												selectCourseEffect();
											}
										});

											
		
		FormOptionsPanel.setBounds(10, 396, 573, 50);
		FormOptionsPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(FormOptionsPanel);
		FormOptionsPanel.setLayout(null);
		
		btnSave.setBackground(SystemColor.textHighlight);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI Light", Font.BOLD, 20));


			

		btnSave.setBounds(342, 3, 120, 44);
		FormOptionsPanel.add(btnSave);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnCancel.setBackground(SystemColor.textHighlight);
		btnCancel.setBounds(107, 3, 120, 44);
		FormOptionsPanel.add(btnCancel);

		/* Load list of tests */

		loadTestsQuestions();


		
		

		// listadoRanking.add(scrollBarRanking);

	}
	
	protected void cancel() {
		// TODO Auto-generated method stub
		//Teacher_View.centerChange(new Manage_Tests_View().centerPanel);

	}

	private void loadTestsQuestions(){
	}
	
	private void selectCourseEffect() {
		
		String[] elements = new String[ceffects.length - courseEffects.size()];
		int i=0;
		for(Course_Effect ce: ceffects){
			if(!courseEffects.contains(ce.getText())){
				elements[i] = ce.getText();
				i++;
			}
		}
		// Con JCombobox
		Object seleccion = JOptionPane.showInputDialog(
		   this,
		   "Select the course Effect",
		   "Add Course Effect",
		   JOptionPane.QUESTION_MESSAGE,
		   null,  // null para icono defecto
		   elements, 
		   elements[0]);
		if(seleccion != null){
			
			courseEffects.add(seleccion.toString());
			
			JTable listsOfQ = new JTable(courseEffects.size(), 1);
			listsOfQ.setRowHeight(100);
			listsOfQ.getColumnModel().getColumn(0).setMaxWidth(200);
			listsOfQ.getColumnModel().getColumn(0).setMinWidth(200);
			listsOfQ.setShowGrid(false);
			listsOfQ.setTableHeader(null);
			listsOfQ.setFont(new Font("Segoe UI Light", Font.BOLD, 12));

			//Create list of ce
			int j=0;
			for (String aux : courseEffects) {
				listsOfQ.setValueAt(aux, j, 0);
				j++;
			}
			// se crea la Tabla

			listsOfQ
					.setPreferredScrollableViewportSize(new Dimension(500, 300));
			// Creamos un JscrollPane y le agregamos la JTable
			
			
			
			scrollPaneCE = new JScrollPane(listsOfQ);
			scrollPaneCE.setBounds(10, 52, 350, 91);
			cEffectsPanel.add(scrollPaneCE);
			repaint();
			System.out.println("El usuario ha elegido "+seleccion);
		}
		
	}

	

	
	public void addController(ActionListener controller) {
		// TODO Auto-generated method stub
		btnSave.setActionCommand("con20");
		btnSave.addActionListener(controller);
	}
	
	public ArrayList<String> getData(){
		ArrayList<String> dataCollection = new ArrayList<String>();
		dataCollection.add(textFieldQuestion.getText());
		dataCollection.add(textFieldLenght.getText());
		dataCollection.add(textFieldPoints.getText());
		for(String ce: courseEffects)
			dataCollection.add(ce);
		return dataCollection;
	}
}
