package view;

import model.EmployeeModel;
import controller.EmployeeController;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeView {

	private JFrame frame;
	private JTextField matriculaField;
	private JTextField nomeField;
	private JTextField tipoField;
	private JTextField sexoField;
	private JTextField dataNascField;
	private JTextField admissaoField;
	private JTextField cpfField;
	private JTextField orgaoRgField;
	private JTextField rgField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeView window = new EmployeeView();
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
	public EmployeeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSgp = new JLabel("SGP");
		lblSgp.setBounds(21, 11, 434, 25);
		lblSgp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblSgp);
		
		JLabel lblCadastro = new JLabel("Cadastro:");
		lblCadastro.setBounds(21, 47, 57, 14);
		frame.getContentPane().add(lblCadastro);
		
		matriculaField = new JTextField();
		matriculaField.setBounds(77, 72, 86, 20);
		frame.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);
		
		JLabel lblNome = new JLabel("Matr\u00EDcula:");
		lblNome.setBounds(21, 72, 57, 14);
		frame.getContentPane().add(lblNome);
		
		nomeField = new JTextField();
		nomeField.setColumns(10);
		nomeField.setBounds(77, 92, 286, 20);
		frame.getContentPane().add(nomeField);
		
		tipoField = new JTextField();
		tipoField.setColumns(10);
		tipoField.setBounds(77, 113, 286, 20);
		frame.getContentPane().add(tipoField);
		
		sexoField = new JTextField();
		sexoField.setColumns(10);
		sexoField.setBounds(77, 161, 21, 20);
		frame.getContentPane().add(sexoField);
		
		dataNascField = new JTextField();
		dataNascField.setColumns(10);
		dataNascField.setBounds(277, 133, 86, 20);
		frame.getContentPane().add(dataNascField);
		
		admissaoField = new JTextField();
		admissaoField.setColumns(10);
		admissaoField.setBounds(77, 133, 86, 20);
		frame.getContentPane().add(admissaoField);
		
		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(76, 183, 86, 20);
		frame.getContentPane().add(cpfField);
		
		orgaoRgField = new JTextField();
		orgaoRgField.setColumns(10);
		orgaoRgField.setBounds(265, 161, 98, 20);
		frame.getContentPane().add(orgaoRgField);
		
		rgField = new JTextField();
		rgField.setColumns(10);
		rgField.setBounds(129, 161, 77, 20);
		frame.getContentPane().add(rgField);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(21, 92, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(21, 113, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(21, 161, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(173, 136, 107, 14);
		frame.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblAdmisso = new JLabel("Admiss\u00E3o:");
		lblAdmisso.setBounds(21, 136, 57, 14);
		frame.getContentPane().add(lblAdmisso);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(21, 186, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblrgoRg = new JLabel("\u00D3rg\u00E3o RG:");
		lblrgoRg.setBounds(211, 164, 69, 14);
		frame.getContentPane().add(lblrgoRg);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(108, 164, 46, 14);
		frame.getContentPane().add(lblRg);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				EmployeeModel employee = new EmployeeModel(nomeField.getText(), matriculaField.getText(), tipoField.getText(), admissaoField.getText(), 
						dataNascField.getText(), sexoField.getText(), rgField.getText(), orgaoRgField.getText(), cpfField.getText());
					employee.setMatricula(matriculaField.getText());
					employee.setNome(nomeField.getText()); 
					employee.setTipo(tipoField.getText()); 
					employee.setAdmissao(admissaoField.getText());
					employee.setDataNascimento(dataNascField.getText());
					employee.setSexo(sexoField.getText());
					employee.setRG(rgField.getText());
					employee.setOrgaoRG(orgaoRgField.getText());
					employee.setCPF(cpfField.getText());  
				
				// fazendo a validação dos dados 
				if ((matriculaField.getText().isEmpty()) || (nomeField.getText().isEmpty()) || 
						(tipoField.getText().isEmpty()) || (admissaoField.getText().isEmpty()) ||
						(dataNascField.getText().isEmpty()) || (sexoField.getText().isEmpty()) ||
						(rgField.getText().isEmpty()) || (orgaoRgField.getText().isEmpty()) ||
						(cpfField.getText().isEmpty())) {    
							JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios"); 
				} else {   
						EmployeeController employeeController = new EmployeeController();  
						employeeController.addEmployee(employee); 
						JOptionPane.showMessageDialog(null, "Usuário "+nomeField.getText()+" inserido com sucesso! "); 
						} 
				// apaga os dados preenchidos nos campos de texto 
				matriculaField.setText(""); 
				nomeField.setText("");
				tipoField.setText("");
				admissaoField.setText("");
				dataNascField.setText("");
				sexoField.setText("");
				rgField.setText("");
				orgaoRgField.setText("");
				cpfField.setText("");
				}
		});
		
		btnSalvar.setBounds(21, 227, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSair);
	}
}
