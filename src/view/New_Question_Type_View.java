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

import org.orm.PersistentException;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Component;
import javax.swing.ImageIcon;

public class New_Question_Type_View extends JPanel {

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

	protected JPanel filterPanel = new JPanel();
	protected JLabel lblTitle = new JLabel("New Question - Select Type");
	private final JLabel lblOpenQuestion = new JLabel("Open Question");
	private final JLabel label = new JLabel("Closed Question");
	protected JButton btnClose = new JButton("");
	protected JButton btnOpen = new JButton("");


	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	public New_Question_Type_View() {

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
		
		filterPanel.setBounds(10, 63, 573, 383);
		filterPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(filterPanel);
		filterPanel.setLayout(null);
		
		btnClose = new JButton("");
		btnClose.setIcon(new ImageIcon(New_Question_Type_View.class.getResource("/view/img/others/close.png")));
		btnClose.setBackground(SystemColor.textHighlight);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		
		btnOpen.setIcon(new ImageIcon(New_Question_Type_View.class.getResource("/view/img/others/open.png")));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancel();
			}
		});
		btnOpen.setForeground(Color.WHITE);
		btnOpen.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnOpen.setBackground(SystemColor.textHighlight);
		btnOpen.setBounds(10, 79, 256, 256);
		filterPanel.add(btnOpen);
		btnClose.setBounds(295, 79, 256, 256);
		filterPanel.add(btnClose);
		lblOpenQuestion.setForeground(Color.WHITE);
		lblOpenQuestion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblOpenQuestion.setBounds(50, 32, 173, 30);
		
		filterPanel.add(lblOpenQuestion);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		label.setBounds(327, 32, 173, 30);
		
		filterPanel.add(label);

		/* Load list of tests */

		
		

		// listadoRanking.add(scrollBarRanking);

	}
	
	protected void cancel() {
		// TODO Auto-generated method stub
		//Teacher_View.centerChange(new New_Open_Question_View().centerPanel);

	}

	private void loadTestsQuestions(){
	}


	public void addController(ActionListener controller) {
		// TODO Auto-generated method stub

		btnOpen.setActionCommand("con18");
		btnOpen.addActionListener(controller);
		btnClose.setActionCommand("con19");
		btnClose.addActionListener(controller);
	}
}
