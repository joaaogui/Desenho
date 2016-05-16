package view;

import model.AcademicDataModel;
import model.EmployeeModel;
import controller.EmployeeController;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingConstants;

public class EmployeeView {

	JFrame frame;
	static JTextField matriculaField;
	static JTextField nomeField;
	static JTextField tipoField;
	static JTextField sexoField;
	static JTextField dataNascField;
	static JTextField admissaoField;
	static JTextField cpfField;
	static JTextField orgaoRgField;
	static JTextField rgField;
	static JTextField enderecoField;
	static JTextField bairroField;
	static JTextField cidadeField;
	static JTextField ufField;
	static JTextField cepField;
	static JTextField telfixoField;
	static JTextField celularField;
	static JTextField emailField;

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
		frame.setBounds(100, 100, 642, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro:");
		lblCadastro.setBounds(21, 165, 57, 14);
		frame.getContentPane().add(lblCadastro);
		
		matriculaField = new JTextField();
		matriculaField.setBounds(77, 190, 86, 20);
		frame.getContentPane().add(matriculaField);
		matriculaField.setColumns(10);
		
		JLabel lblNome = new JLabel("Matr\u00EDcula:");
		lblNome.setBounds(21, 190, 57, 14);
		frame.getContentPane().add(lblNome);
		
		nomeField = new JTextField();
		nomeField.setColumns(10);
		nomeField.setBounds(77, 210, 539, 20);
		frame.getContentPane().add(nomeField);
		
		tipoField = new JTextField();
		tipoField.setColumns(10);
		tipoField.setBounds(77, 231, 129, 20);
		frame.getContentPane().add(tipoField);
		
		sexoField = new JTextField();
		sexoField.setColumns(10);
		sexoField.setBounds(77, 253, 21, 20);
		frame.getContentPane().add(sexoField);
		
		dataNascField = new JTextField();
		dataNascField.setColumns(10);
		dataNascField.setBounds(511, 231, 105, 20);
		frame.getContentPane().add(dataNascField);
		
		admissaoField = new JTextField();
		admissaoField.setColumns(10);
		admissaoField.setBounds(277, 231, 119, 20);
		frame.getContentPane().add(admissaoField);
		
		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(416, 253, 200, 20);
		frame.getContentPane().add(cpfField);
		
		orgaoRgField = new JTextField();
		orgaoRgField.setColumns(10);
		orgaoRgField.setBounds(277, 253, 98, 20);
		frame.getContentPane().add(orgaoRgField);
		
		rgField = new JTextField();
		rgField.setColumns(10);
		rgField.setBounds(129, 253, 77, 20);
		frame.getContentPane().add(rgField);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(21, 210, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(21, 231, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(21, 256, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(406, 234, 107, 14);
		frame.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblAdmisso = new JLabel("Admiss\u00E3o:");
		lblAdmisso.setBounds(216, 234, 57, 14);
		frame.getContentPane().add(lblAdmisso);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(385, 256, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblrgoRg = new JLabel("\u00D3rg\u00E3o RG:");
		lblrgoRg.setBounds(216, 256, 69, 14);
		frame.getContentPane().add(lblrgoRg);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(108, 256, 46, 14);
		frame.getContentPane().add(lblRg);
		
		JButton btnSalvar = new JButton("Avan\u00E7ar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				EmployeeModel employee =  new EmployeeModel();
				EmployeeController employeeControl = new EmployeeController();
				ComplementaryDataView complementary = new ComplementaryDataView();
								
				employee.setNome(nomeField.getText());
				employee.setMatricula(matriculaField.getText());
				employee.setTipo(tipoField.getText());
				employee.setAdmissao(admissaoField.getText());
				employee.setCPF(cpfField.getText());
				employee.setDataNascimento(dataNascField.getText());
				employee.setRG(rgField.getText());
				employee.setOrgaoRG(orgaoRgField.getText());
				
				employeeControl.addEmployee(employee);
				
				//complementary.setVi
				 
				 */
				frame.dispose();
				ComplementaryDataView cdv = new ComplementaryDataView();
				cdv.frame.setVisible(true);				
			}
			
		});
		
		btnSalvar.setBounds(21, 419, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(527, 419, 89, 23);
		frame.getContentPane().add(btnSair);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(21, 296, 57, 14);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblNewLabel = new JLabel("Bairro:");
		lblNewLabel.setBounds(406, 296, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(21, 321, 46, 14);
		frame.getContentPane().add(lblCidade);
		
		enderecoField = new JTextField();
		enderecoField.setBounds(77, 293, 319, 20);
		frame.getContentPane().add(enderecoField);
		enderecoField.setColumns(10);
		
		bairroField = new JTextField();
		bairroField.setBounds(449, 293, 167, 20);
		frame.getContentPane().add(bairroField);
		bairroField.setColumns(10);
		
		cidadeField = new JTextField();
		cidadeField.setBounds(77, 321, 319, 20);
		frame.getContentPane().add(cidadeField);
		cidadeField.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(406, 321, 25, 14);
		frame.getContentPane().add(lblUf);
		
		ufField = new JTextField();
		ufField.setBounds(427, 318, 39, 20);
		frame.getContentPane().add(ufField);
		ufField.setColumns(10);
		
		cepField = new JTextField();
		cepField.setBounds(511, 318, 105, 20);
		frame.getContentPane().add(cepField);
		cepField.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(479, 321, 34, 14);
		frame.getContentPane().add(lblCep);
		
		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo:");
		lblTelefoneFixo.setBounds(113, 346, 77, 14);
		frame.getContentPane().add(lblTelefoneFixo);
		
		telfixoField = new JTextField();
		telfixoField.setBounds(200, 343, 147, 20);
		frame.getContentPane().add(telfixoField);
		telfixoField.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(357, 346, 39, 14);
		frame.getContentPane().add(lblCelular);
		
		celularField = new JTextField();
		celularField.setColumns(10);
		celularField.setBounds(396, 343, 147, 20);
		frame.getContentPane().add(celularField);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(52, 370, 39, 14);
		frame.getContentPane().add(lblEmail);
		
		emailField = new JTextField();
		emailField.setBounds(89, 367, 527, 20);
		frame.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(EmployeeView.class.getResource("/resources/SGP3.png")));
		logo.setBounds(21, 20, 595, 143);
		frame.getContentPane().add(logo);
	}
}
