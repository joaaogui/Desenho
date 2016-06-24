package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.EmployeeController;
import model.EmployeeModel;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class LocateEmployee {

	JFrame frame;

	static JFormattedTextField locateformattedTextField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocateEmployee window = new LocateEmployee();
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
	public LocateEmployee() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LocateEmployee.class.getResource("/resources/SGP2.png")));
		lblNewLabel.setBounds(47, 11, 539, 144);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Localizar Funcion\u00E1rio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 166, 153, 24);
		frame.getContentPane().add(lblNewLabel_1);
		MaskFormatter mask;
		try{
			mask = new MaskFormatter("#");
			mask.setValidCharacters("0123456789");
			mask.setValueContainsLiteralCharacters(true);
			locateformattedTextField = new JFormattedTextField(mask);
			locateformattedTextField.setBounds(25, 203, 593, 39);
		}
		catch(ParseException e2){
			e2.printStackTrace();
		}
		frame.getContentPane().add(locateformattedTextField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			private EmployeeController employeeController;

			public void actionPerformed(ActionEvent arg0) {
				
				EmployeeController employeeController = new EmployeeController();
				
				EmployeeModel employee = new EmployeeModel();
				
				String id_string = locateformattedTextField.getText();
				int id = Integer.parseInt(id_string); 
				employee = employeeController.searchEmployeeById(id);
				
				if(employee != null){
					frame.dispose();
					AddEventView addEventView = new AddEventView();
					addEventView.frame.setVisible(true);
				}
				else 
					JOptionPane.showMessageDialog(null, "Funcionário Não Encontrado");

			}
		});
		btnBuscar.setBounds(529, 253, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				InitialScreenView initialView = new InitialScreenView();
				initialView.frame.setVisible(true);	
			}
		});
		voltarButton.setBounds(25, 436, 99, 34);
		frame.getContentPane().add(voltarButton);
		
	}
}
