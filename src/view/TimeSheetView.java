package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class TimeSheetView {

	private JFrame frame;
	private JTextField anoTextField;
	private JTextField matriculaTextField;
	private JTextField nomeTextField;
	private JTextField cargoTextField;
	private JTextField admissaoTextField;
	private JTextField observacoesTextField;

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
		
		JComboBox mesComboBox = new JComboBox();
		mesComboBox.setBounds(31, 233, 341, 30);
		frame.getContentPane().add(mesComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Ano");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(491, 208, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		anoTextField = new JTextField();
		anoTextField.setBounds(491, 233, 137, 30);
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
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(184, 323, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(184, 348, 188, 30);
		frame.getContentPane().add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Cargo");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(382, 323, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		cargoTextField = new JTextField();
		cargoTextField.setBounds(382, 348, 105, 30);
		frame.getContentPane().add(cargoTextField);
		cargoTextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Data De Admiss\u00E3o");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(497, 324, 131, 12);
		frame.getContentPane().add(lblNewLabel_6);
		
		admissaoTextField = new JTextField();
		admissaoTextField.setBounds(497, 348, 131, 30);
		frame.getContentPane().add(admissaoTextField);
		admissaoTextField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Observa\u00E7\u00F5es");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(28, 389, 94, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		observacoesTextField = new JTextField();
		observacoesTextField.setBounds(28, 414, 600, 30);
		frame.getContentPane().add(observacoesTextField);
		observacoesTextField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 282, 597, 30);
		frame.getContentPane().add(separator);
	}
}
