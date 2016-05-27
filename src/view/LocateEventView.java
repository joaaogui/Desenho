package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import controller.EmployeeController;
import model.EmployeeModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocateEventView {

	JFrame frame;
	private JTextField localizarFuncionariotextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocateEventView window = new LocateEventView();
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
	public LocateEventView() {
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
		lblNewLabel.setIcon(new ImageIcon(LocateEventView.class.getResource("/resources/SGP2.png")));
		lblNewLabel.setBounds(47, 11, 539, 144);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Localizar Funcion\u00E1rio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 166, 153, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		localizarFuncionariotextField = new JTextField();
		localizarFuncionariotextField.setBounds(25, 209, 593, 33);
		frame.getContentPane().add(localizarFuncionariotextField);
		localizarFuncionariotextField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			private EmployeeController employeeController;

			public void actionPerformed(ActionEvent arg0) {
				
				employeeController = null;
				
				EmployeeModel employee;
				
				String matricula = localizarFuncionariotextField.getText();
				employee = employeeController.searchEmployee(matricula);
				
				if(employee != null)
					JOptionPane.showMessageDialog(null, "Nome do usuário: "+employee.getNome());
				else 
					JOptionPane.showMessageDialog(null, "Nulo");

			}
		});
		btnBuscar.setBounds(529, 253, 89, 23);
		frame.getContentPane().add(btnBuscar);
	}
}
