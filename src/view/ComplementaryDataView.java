package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import controller.EmployeeController;
import model.ComplementaryDataModel;
import model.EmployeeContactModel;
import model.EmployeeModel;
import view.EmployeeView;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComplementaryDataView {

	JFrame frame;
	private JTextField textField_naturalidade;
	private JTextField textField_nacionalidade;
	private JTextField textField_raca;
	private JTextField textField_pis;
	private JTextField textField_emissorPis;
	private JTextField textField_tituloEleitoral;
	private JTextField textField_zonaEleitoral;
	private JTextField textField_nomeConjuge;
	private JTextField textField_estadoCivil;
	private JTextField textField_nomePai;
	private JTextField textField_nomeMae;
	private JTextField textField_escolaridade;
	private JTextField textField_curso;
	private JTextField textField_licenciatura;
	private JTextField textField_instituicao;
	private JTextField textFieldposGraducao;
	private JTextField textField_cargo;
	private JTextField textField_disciplinaCurso;
	private JTextField textField_funcao;
	private JTextField textField_entrada;
	private JTextField textField_saida;
	private JTextField textField_copi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplementaryDataView window = new ComplementaryDataView();
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
	public ComplementaryDataView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDadosComplementares = new JLabel("Dados Complementares:");
		lblDadosComplementares.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDadosComplementares.setBounds(10, 11, 210, 14);
		frame.getContentPane().add(lblDadosComplementares);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade:");
		lblNaturalidade.setBounds(10, 36, 75, 14);
		frame.getContentPane().add(lblNaturalidade);
		
		textField_naturalidade = new JTextField();
		textField_naturalidade.setBounds(100, 36, 144, 20);
		frame.getContentPane().add(textField_naturalidade);
		textField_naturalidade.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setBounds(266, 36, 75, 14);
		frame.getContentPane().add(lblNacionalidade);
		
		textField_nacionalidade = new JTextField();
		textField_nacionalidade.setColumns(10);
		textField_nacionalidade.setBounds(363, 36, 137, 20);
		frame.getContentPane().add(textField_nacionalidade);
		
		JLabel lblRaa = new JLabel("Ra\u00E7a:");
		lblRaa.setBounds(10, 71, 75, 14);
		frame.getContentPane().add(lblRaa);
		
		textField_raca = new JTextField();
		textField_raca.setColumns(10);
		textField_raca.setBounds(59, 68, 86, 20);
		frame.getContentPane().add(textField_raca);
		
		JLabel lblPispasep = new JLabel("PIS/PASEP:");
		lblPispasep.setBounds(166, 71, 75, 14);
		frame.getContentPane().add(lblPispasep);
		
		textField_pis = new JTextField();
		textField_pis.setColumns(10);
		textField_pis.setBounds(245, 67, 102, 20);
		frame.getContentPane().add(textField_pis);
		
		JLabel lblEmissor = new JLabel("Emissor:");
		lblEmissor.setBounds(357, 71, 75, 14);
		frame.getContentPane().add(lblEmissor);
		
		textField_emissorPis = new JTextField();
		textField_emissorPis.setColumns(10);
		textField_emissorPis.setBounds(403, 68, 124, 20);
		frame.getContentPane().add(textField_emissorPis);
		
		JLabel lblTtuloEleitoral = new JLabel("T\u00EDtulo Eleitoral:");
		lblTtuloEleitoral.setBounds(10, 100, 75, 14);
		frame.getContentPane().add(lblTtuloEleitoral);
		
		textField_tituloEleitoral = new JTextField();
		textField_tituloEleitoral.setColumns(10);
		textField_tituloEleitoral.setBounds(96, 97, 124, 20);
		frame.getContentPane().add(textField_tituloEleitoral);
		
		JLabel lblZonaEleitoral = new JLabel("Zona Eleitoral:");
		lblZonaEleitoral.setBounds(244, 102, 75, 14);
		frame.getContentPane().add(lblZonaEleitoral);
		
		textField_zonaEleitoral = new JTextField();
		textField_zonaEleitoral.setColumns(10);
		textField_zonaEleitoral.setBounds(329, 97, 109, 20);
		frame.getContentPane().add(textField_zonaEleitoral);
		
		JLabel lblNomeCnjuge = new JLabel("Nome C\u00F4njuge:");
		lblNomeCnjuge.setBounds(244, 131, 75, 14);
		frame.getContentPane().add(lblNomeCnjuge);
		
		textField_nomeConjuge = new JTextField();
		textField_nomeConjuge.setColumns(10);
		textField_nomeConjuge.setBounds(339, 128, 276, 20);
		frame.getContentPane().add(textField_nomeConjuge);
		
		textField_estadoCivil = new JTextField();
		textField_estadoCivil.setColumns(10);
		textField_estadoCivil.setBounds(90, 128, 130, 20);
		frame.getContentPane().add(textField_estadoCivil);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 131, 75, 14);
		frame.getContentPane().add(lblEstadoCivil);
		
		textField_nomePai = new JTextField();
		textField_nomePai.setColumns(10);
		textField_nomePai.setBounds(78, 156, 180, 20);
		frame.getContentPane().add(textField_nomePai);
		
		JLabel lblNomePai = new JLabel("Nome Pai:");
		lblNomePai.setBounds(10, 159, 75, 14);
		frame.getContentPane().add(lblNomePai);
		
		textField_nomeMae = new JTextField();
		textField_nomeMae.setColumns(10);
		textField_nomeMae.setBounds(349, 156, 266, 20);
		frame.getContentPane().add(textField_nomeMae);
		
		JLabel lblNomeMe = new JLabel("Nome M\u00E3e:");
		lblNomeMe.setBounds(266, 156, 75, 14);
		frame.getContentPane().add(lblNomeMe);
		
		JLabel lblDadosAcadmicos = new JLabel("Dados Acad\u00EAmicos:");
		lblDadosAcadmicos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDadosAcadmicos.setBounds(10, 187, 124, 14);
		frame.getContentPane().add(lblDadosAcadmicos);
		
		JLabel lblEscolaridade = new JLabel("Escolaridade:");
		lblEscolaridade.setBounds(10, 212, 75, 14);
		frame.getContentPane().add(lblEscolaridade);
		
		textField_escolaridade = new JTextField();
		textField_escolaridade.setBounds(96, 209, 162, 20);
		frame.getContentPane().add(textField_escolaridade);
		textField_escolaridade.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(268, 212, 46, 14);
		frame.getContentPane().add(lblCurso);
		
		textField_curso = new JTextField();
		textField_curso.setBounds(303, 209, 312, 20);
		frame.getContentPane().add(textField_curso);
		textField_curso.setColumns(10);
		
		JLabel lblLicenciatura = new JLabel("Licenciatura:");
		lblLicenciatura.setBounds(10, 241, 75, 14);
		frame.getContentPane().add(lblLicenciatura);
		
		textField_licenciatura = new JTextField();
		textField_licenciatura.setBounds(74, 237, 184, 20);
		frame.getContentPane().add(textField_licenciatura);
		textField_licenciatura.setColumns(10);
		
		textField_instituicao = new JTextField();
		textField_instituicao.setBounds(324, 237, 291, 20);
		frame.getContentPane().add(textField_instituicao);
		textField_instituicao.setColumns(10);
		
		JLabel lblInstituio = new JLabel("Institui\u00E7\u00E3o:");
		lblInstituio.setBounds(266, 237, 63, 14);
		frame.getContentPane().add(lblInstituio);
		
		JLabel lblPsgraduao = new JLabel("P\u00F3s-Gradua\u00E7\u00E3o:");
		lblPsgraduao.setBounds(10, 266, 86, 14);
		frame.getContentPane().add(lblPsgraduao);
		
		textFieldposGraducao = new JTextField();
		textFieldposGraducao.setBounds(94, 263, 521, 20);
		frame.getContentPane().add(textFieldposGraducao);
		textFieldposGraducao.setColumns(10);
		
		JLabel lblDadosFuncionais = new JLabel("Dados Funcionais:");
		lblDadosFuncionais.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDadosFuncionais.setBounds(10, 291, 135, 14);
		frame.getContentPane().add(lblDadosFuncionais);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 311, 46, 14);
		frame.getContentPane().add(lblCargo);
		
		textField_cargo = new JTextField();
		textField_cargo.setBounds(48, 308, 210, 20);
		frame.getContentPane().add(textField_cargo);
		textField_cargo.setColumns(10);
		
		JLabel lblDisciplinaDeCurso = new JLabel("Disciplina de Curso:");
		lblDisciplinaDeCurso.setBounds(266, 311, 110, 14);
		frame.getContentPane().add(lblDisciplinaDeCurso);
		
		textField_disciplinaCurso = new JTextField();
		textField_disciplinaCurso.setBounds(363, 308, 252, 20);
		frame.getContentPane().add(textField_disciplinaCurso);
		textField_disciplinaCurso.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setBounds(10, 336, 46, 14);
		frame.getContentPane().add(lblFuno);
		
		textField_funcao = new JTextField();
		textField_funcao.setBounds(58, 333, 200, 20);
		frame.getContentPane().add(textField_funcao);
		textField_funcao.setColumns(10);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		lblEntrada.setBounds(266, 336, 46, 14);
		frame.getContentPane().add(lblEntrada);
		
		textField_entrada = new JTextField();
		textField_entrada.setBounds(314, 333, 118, 20);
		frame.getContentPane().add(textField_entrada);
		textField_entrada.setColumns(10);
		
		JLabel lblSada = new JLabel("Sa\u00EDda:");
		lblSada.setBounds(442, 336, 46, 14);
		frame.getContentPane().add(lblSada);
		
		textField_saida = new JTextField();
		textField_saida.setBounds(478, 333, 137, 20);
		frame.getContentPane().add(textField_saida);
		textField_saida.setColumns(10);
		
		JLabel lblCopiExterna = new JLabel("COPI Externa:");
		lblCopiExterna.setBounds(10, 363, 75, 14);
		frame.getContentPane().add(lblCopiExterna);
		
		textField_copi = new JTextField();
		textField_copi.setBounds(83, 360, 236, 20);
		frame.getContentPane().add(textField_copi);
		textField_copi.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				EmployeeView empV = new EmployeeView();
				empV.frame.setVisible(true);	
			}
		});
		btnVoltar.setBounds(67, 406, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					EmployeeModel employee = new EmployeeModel(EmployeeView.nomeField.getText(), EmployeeView.matriculaField.getText(), 
															   EmployeeView.tipoField.getText(), EmployeeView.admissaoField.getText(), 
															   EmployeeView.dataNascField.getText(), EmployeeView.sexoField.getText(), 
															   EmployeeView.rgField.getText(), EmployeeView.orgaoRgField.getText(), 
															   EmployeeView.cpfField.getText());
						//Dados principais
						employee.setMatricula(EmployeeView.matriculaField.getText());
						employee.setNome(EmployeeView.nomeField.getText()); 
						employee.setTipo(EmployeeView.tipoField.getText()); 
						employee.setAdmissao(EmployeeView.admissaoField.getText());
						employee.setDataNascimento(EmployeeView.dataNascField.getText());
						employee.setSexo(EmployeeView.sexoField.getText());
						employee.setRG(EmployeeView.rgField.getText());
						employee.setOrgaoRG(EmployeeView.orgaoRgField.getText());
						employee.setCPF(EmployeeView.cpfField.getText());
						
						//Dados Complemententares
						addComplementaryData(employee);
					
					// fazendo a validação dos dados 
					if ((EmployeeView.matriculaField.getText().isEmpty()) || (EmployeeView.nomeField.getText().isEmpty()) || 
							(EmployeeView.tipoField.getText().isEmpty()) || (EmployeeView.admissaoField.getText().isEmpty()) ||
							(EmployeeView.dataNascField.getText().isEmpty()) || (EmployeeView.sexoField.getText().isEmpty()) ||
							(EmployeeView.rgField.getText().isEmpty()) || (EmployeeView.orgaoRgField.getText().isEmpty()) ||
							(EmployeeView.cpfField.getText().isEmpty())) {    
								JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios"); 
					} else {   
							EmployeeController employeeController = new EmployeeController();  
							employeeController.addEmployee(employee); 
							JOptionPane.showMessageDialog(null, "Usuário "+EmployeeView.nomeField.getText()+" inserido com sucesso! "); 
							} 
					
					// apaga os dados preenchidos nos campos de texto 
					EmployeeView.matriculaField.setText(""); 
					EmployeeView.nomeField.setText("");
					EmployeeView.tipoField.setText("");
					EmployeeView.admissaoField.setText("");
					EmployeeView.dataNascField.setText("");
					EmployeeView.sexoField.setText("");
					EmployeeView.rgField.setText("");
					EmployeeView.orgaoRgField.setText("");
					EmployeeView.cpfField.setText("");
					}
			}
		);
		btnSalvar.setBounds(273, 406, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(478, 406, 89, 23);
		frame.getContentPane().add(btnSair);
	}
	
	private void addComplementaryData(EmployeeModel employee){
		EmployeeContactModel employee1 = new EmployeeContactModel(EmployeeView.enderecoField.getText(), EmployeeView.bairroField.getText(), 
				   EmployeeView.cidadeField.getText(), EmployeeView.ufField.getText(), 
				   EmployeeView.cepField.getText(), EmployeeView.telfixoField.getText(), 
				   EmployeeView.celularField.getText(), EmployeeView.emailField.getText());
		employee1.setEndereco(EmployeeView.enderecoField.getText());
		employee1.setBairro(EmployeeView.bairroField.getText());
		employee1.setCidade(EmployeeView.cidadeField.getText());
		employee1.setUf(EmployeeView.ufField.getText());
		employee1.setCep(EmployeeView.cepField.getText());
		employee1.setTelFixo(EmployeeView.telfixoField.getText());
		employee1.setTelCelular(EmployeeView.celularField.getText());
		employee1.setEmail(EmployeeView.emailField.getText());
		
		employee.setContato(employee1);
		
	}
}
