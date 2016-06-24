package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.itextpdf.text.DocumentException;

import controller.EmployeeController;
import model.EmployeeModel;
import pdf.FolhaDePonto;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TimeSheetView {

	JFrame frame;
	private JTextField anoTextField;
	private JTextField matriculaTextField;
	private JTextField observacoesTextField;
	private JTextField mesTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeSheetView window = new TimeSheetView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TimeSheetView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 670, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TimeSheetView.class.getResource("/resources/SGP2.png")));
		lblNewLabel.setBounds(54, 11, 523, 164);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00EAs Da Frequ\u00EAncia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(31, 208, 143, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		/*
		JComboBox mesComboBox = new JComboBox();
		mesComboBox.setModel(new DefaultComboBoxModel(new String[] {"Janeiro ", "Fevereiro", "Mar\u00E7o ", "Abril", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		mesComboBox.setBounds(31, 233, 341, 30);
		frame.getContentPane().add(mesComboBox);
		*/
		
		JLabel lblNewLabel_2 = new JLabel("Ano");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(419, 208, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		anoTextField = new JTextField();
		anoTextField.setBounds(419, 233, 209, 30);
		frame.getContentPane().add(anoTextField);
		anoTextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Matricula");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(31, 323, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		matriculaTextField = new JTextField();
		matriculaTextField.setBounds(31, 348, 143, 30);
		frame.getContentPane().add(matriculaTextField);
		matriculaTextField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Observa\u00E7\u00F5es");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(184, 323, 94, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		observacoesTextField = new JTextField();
		observacoesTextField.setBounds(184, 348, 444, 30);
		frame.getContentPane().add(observacoesTextField);
		observacoesTextField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 282, 597, 30);
		frame.getContentPane().add(separator);
		
		JButton btnEmitirFolha = new JButton("Emitir Folha");
		btnEmitirFolha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EmployeeController employeeController = new EmployeeController();
				EmployeeModel employee = new EmployeeModel();
				
				String id_string = matriculaTextField.getText();
				int id = Integer.parseInt(id_string); 
				employee = employeeController.searchEmployeeById(id);
				
				if(employee != null){
				
					try {
						FolhaDePonto.generatePDF(mesTextField.getText(), anoTextField.getText() , observacoesTextField.getText(),employee);
					} catch (DocumentException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Funcionário Não Encontrado - Matricula: " + id_string);

				}
			}
		});
		btnEmitirFolha.setBounds(514, 440, 117, 30);
		frame.getContentPane().add(btnEmitirFolha);
		
		mesTextField = new JTextField();
		mesTextField.setBounds(31, 233, 378, 30);
		frame.getContentPane().add(mesTextField);
		mesTextField.setColumns(10);
	}
}
