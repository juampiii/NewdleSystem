package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import org.orm.PersistentException;

import model.Question;
import model.Test_Template;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Component;

public class Login2_View extends JFrame {

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
	protected JPanel optionsPanel = new JPanel();
	protected JLabel lblTitle = new JLabel("Login - Newdle System");
	protected JLabel lblEmail = new JLabel("Email:");
	private final JLabel lblPass = new JLabel("Password:");
	private JTextField textFieldPass;
	private JTextField textFieldEmail;
	protected JButton btnEnter = new JButton("Enter");
	protected JButton btnCancel = new JButton("Cancel");
	

	
	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	public Login2_View() {
		loadVIewElements();
	}

	protected void loadVIewElements(){
		
		centerPanel.setBounds(181, 94, 400, 250);
		centerPanel.setBackground(Color.DARK_GRAY);
		centerPanel.setLayout(null);
		lblTitle.setForeground(Color.WHITE);
		
				lblTitle.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
				lblTitle.setBounds(20, 11, 376, 41);
				centerPanel.add(lblTitle);
		
				
				
				testInfoPanel.setBackground(Color.DARK_GRAY);
				
						testInfoPanel.setBounds(10, 51, 380, 110);
						centerPanel.add(testInfoPanel);
						testInfoPanel.setLayout(null);
						lblEmail.setForeground(Color.WHITE);
						
								lblEmail.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
								
										lblEmail.setBounds(10, 26, 103, 30);
										testInfoPanel.add(lblEmail);
										lblPass.setForeground(Color.WHITE);
										lblPass.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
										lblPass.setBounds(10, 69, 103, 30);
										
										testInfoPanel.add(lblPass);
										
										textFieldPass = new JTextField();
										textFieldPass.setForeground(Color.WHITE);
										textFieldPass.setBackground(SystemColor.activeCaptionBorder);
										textFieldPass.setBounds(112, 59, 251, 40);
										testInfoPanel.add(textFieldPass);
										textFieldPass.setColumns(10);
										textFieldPass.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldEmail = new JTextField();
										textFieldEmail.setForeground(Color.WHITE);
										textFieldEmail.setBackground(SystemColor.activeCaptionBorder);
										textFieldEmail.setColumns(10);
										textFieldEmail.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
										textFieldEmail.setBounds(112, 11, 251, 40);
										
										testInfoPanel.add(textFieldEmail);

		
		optionsPanel.setBounds(10, 172, 380, 64);
		optionsPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(optionsPanel);
		optionsPanel.setLayout(null);

		

		btnEnter.setBackground(SystemColor.textHighlight);
		btnEnter.setForeground(Color.WHITE);
		btnEnter.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		btnEnter.setBounds(193, 11, 120, 44);
		optionsPanel.add(btnEnter);

		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnCancel.setBackground(SystemColor.textHighlight);
		btnCancel.setBounds(46, 11, 120, 44);
		optionsPanel.add(btnCancel);

		/* Load list of tests */

		
		

		// listadoRanking.add(scrollBarRanking);

	}
	


	
	
	
	public void addController(ActionListener controller) {
		// TODO Auto-generated method stub
		btnEnter.setActionCommand("con1");
		btnEnter.addActionListener(controller);
		btnCancel.setActionCommand("con2");
		btnCancel.addActionListener(controller);
		
	}
	
	public java.util.ArrayList<String> getData() {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> elements = new java.util.ArrayList<String>();
		elements.add(textFieldEmail.getText());
		elements.add(textFieldPass.getText());
		return elements;
	}
	
	public boolean fulfill(){
		if (textFieldEmail.getText().equals("")||textFieldPass.getText().equals(""))
			return false;
		else
			return true;
	}

	
}
