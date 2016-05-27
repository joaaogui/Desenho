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
	private JTextField naturalidadeField;
	private JTextField nacionalidadeField;
	private JTextField racaField;
	private JTextField pisField;
	private JTextField emissorPisField;
	private JTextField tituloEleitoralField;
	private JTextField zonaEleitoralField;
	private JTextField nomeConjugeField;
	private JTextField estadoCivilField;
	private JTextField nomePaiField;
	private JTextField nomeMaeField;
	private JTextField escolaridadeField;
	private JTextField cursoField;
	private JTextField licenciaturaField;
	private JTextField instituicaoField;
	private JTextField posGraducaoField;
	private JTextField cargoField;
	private JTextField disciplinaCursoField;
	private JTextField funcaoField;
	private JTextField entradaField;
	private JTextField saidaField;
	private JTextField copiField;

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
		
		naturalidadeField = new JTextField();
		naturalidadeField.setBounds(100, 36, 144, 20);
		frame.getContentPane().add(naturalidadeField);
		naturalidadeField.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setBounds(266, 36, 75, 14);
		frame.getContentPane().add(lblNacionalidade);
		
		nacionalidadeField = new JTextField();
		nacionalidadeField.setColumns(10);
		nacionalidadeField.setBounds(363, 36, 137, 20);
		frame.getContentPane().add(nacionalidadeField);
		
		JLabel lblRaa = new JLabel("Ra\u00E7a:");
		lblRaa.setBounds(10, 71, 75, 14);
		frame.getContentPane().add(lblRaa);
		
		racaField = new JTextField();
		racaField.setColumns(10);
		racaField.setBounds(59, 68, 86, 20);
		frame.getContentPane().add(racaField);
		
		JLabel lblPispasep = new JLabel("PIS/PASEP:");
		lblPispasep.setBounds(166, 71, 75, 14);
		frame.getContentPane().add(lblPispasep);
		
		pisField = new JTextField();
		pisField.setColumns(10);
		pisField.setBounds(245, 67, 102, 20);
		frame.getContentPane().add(pisField);
		
		JLabel lblEmissor = new JLabel("Emissor:");
		lblEmissor.setBounds(357, 71, 75, 14);
		frame.getContentPane().add(lblEmissor);
		
		emissorPisField = new JTextField();
		emissorPisField.setColumns(10);
		emissorPisField.setBounds(403, 68, 124, 20);
		frame.getContentPane().add(emissorPisField);
		
		JLabel lblTtuloEleitoral = new JLabel("T\u00EDtulo Eleitoral:");
		lblTtuloEleitoral.setBounds(10, 100, 75, 14);
		frame.getContentPane().add(lblTtuloEleitoral);
		
		tituloEleitoralField = new JTextField();
		tituloEleitoralField.setColumns(10);
		tituloEleitoralField.setBounds(96, 97, 124, 20);
		frame.getContentPane().add(tituloEleitoralField);
		
		JLabel lblZonaEleitoral = new JLabel("Zona Eleitoral:");
		lblZonaEleitoral.setBounds(244, 102, 75, 14);
		frame.getContentPane().add(lblZonaEleitoral);
		
		zonaEleitoralField = new JTextField();
		zonaEleitoralField.setColumns(10);
		zonaEleitoralField.setBounds(329, 97, 109, 20);
		frame.getContentPane().add(zonaEleitoralField);
		
		JLabel lblNomeCnjuge = new JLabel("Nome C\u00F4njuge:");
		lblNomeCnjuge.setBounds(244, 131, 75, 14);
		frame.getContentPane().add(lblNomeCnjuge);
		
		nomeConjugeField = new JTextField();
		nomeConjugeField.setColumns(10);
		nomeConjugeField.setBounds(339, 128, 276, 20);
		frame.getContentPane().add(nomeConjugeField);
		
		estadoCivilField = new JTextField();
		estadoCivilField.setColumns(10);
		estadoCivilField.setBounds(90, 128, 130, 20);
		frame.getContentPane().add(estadoCivilField);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 131, 75, 14);
		frame.getContentPane().add(lblEstadoCivil);
		
		nomePaiField = new JTextField();
		nomePaiField.setColumns(10);
		nomePaiField.setBounds(78, 156, 180, 20);
		frame.getContentPane().add(nomePaiField);
		
		JLabel lblNomePai = new JLabel("Nome Pai:");
		lblNomePai.setBounds(10, 159, 75, 14);
		frame.getContentPane().add(lblNomePai);
		
		nomeMaeField = new JTextField();
		nomeMaeField.setColumns(10);
		nomeMaeField.setBounds(349, 156, 266, 20);
		frame.getContentPane().add(nomeMaeField);
		
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
		
		escolaridadeField = new JTextField();
		escolaridadeField.setBounds(96, 209, 162, 20);
		frame.getContentPane().add(escolaridadeField);
		escolaridadeField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(268, 212, 46, 14);
		frame.getContentPane().add(lblCurso);
		
		cursoField = new JTextField();
		cursoField.setBounds(303, 209, 312, 20);
		frame.getContentPane().add(cursoField);
		cursoField.setColumns(10);
		
		JLabel lblLicenciatura = new JLabel("Licenciatura:");
		lblLicenciatura.setBounds(10, 241, 75, 14);
		frame.getContentPane().add(lblLicenciatura);
		
		licenciaturaField = new JTextField();
		licenciaturaField.setBounds(74, 237, 184, 20);
		frame.getContentPane().add(licenciaturaField);
		licenciaturaField.setColumns(10);
		
		instituicaoField = new JTextField();
		instituicaoField.setBounds(324, 237, 291, 20);
		frame.getContentPane().add(instituicaoField);
		instituicaoField.setColumns(10);
		
		JLabel lblInstituio = new JLabel("Institui\u00E7\u00E3o:");
		lblInstituio.setBounds(266, 237, 63, 14);
		frame.getContentPane().add(lblInstituio);
		
		JLabel lblPsgraduao = new JLabel("P\u00F3s-Gradua\u00E7\u00E3o:");
		lblPsgraduao.setBounds(10, 266, 86, 14);
		frame.getContentPane().add(lblPsgraduao);
		
		posGraducaoField = new JTextField();
		posGraducaoField.setBounds(94, 263, 521, 20);
		frame.getContentPane().add(posGraducaoField);
		posGraducaoField.setColumns(10);
		
		JLabel lblDadosFuncionais = new JLabel("Dados Funcionais:");
		lblDadosFuncionais.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDadosFuncionais.setBounds(10, 291, 135, 14);
		frame.getContentPane().add(lblDadosFuncionais);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 311, 46, 14);
		frame.getContentPane().add(lblCargo);
		
		cargoField = new JTextField();
		cargoField.setBounds(48, 308, 210, 20);
		frame.getContentPane().add(cargoField);
		cargoField.setColumns(10);
		
		JLabel lblDisciplinaDeCurso = new JLabel("Disciplina de Curso:");
		lblDisciplinaDeCurso.setBounds(266, 311, 110, 14);
		frame.getContentPane().add(lblDisciplinaDeCurso);
		
		disciplinaCursoField = new JTextField();
		disciplinaCursoField.setBounds(363, 308, 252, 20);
		frame.getContentPane().add(disciplinaCursoField);
		disciplinaCursoField.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setBounds(10, 336, 46, 14);
		frame.getContentPane().add(lblFuno);
		
		funcaoField = new JTextField();
		funcaoField.setBounds(58, 333, 200, 20);
		frame.getContentPane().add(funcaoField);
		funcaoField.setColumns(10);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		lblEntrada.setBounds(266, 336, 46, 14);
		frame.getContentPane().add(lblEntrada);
		
		entradaField = new JTextField();
		entradaField.setBounds(314, 333, 118, 20);
		frame.getContentPane().add(entradaField);
		entradaField.setColumns(10);
		
		JLabel lblSada = new JLabel("Sa\u00EDda:");
		lblSada.setBounds(442, 336, 46, 14);
		frame.getContentPane().add(lblSada);
		
		saidaField = new JTextField();
		saidaField.setBounds(478, 333, 137, 20);
		frame.getContentPane().add(saidaField);
		saidaField.setColumns(10);
		
		JLabel lblCopiExterna = new JLabel("COPI Externa:");
		lblCopiExterna.setBounds(10, 363, 75, 14);
		frame.getContentPane().add(lblCopiExterna);
		
		copiField = new JTextField();
		copiField.setBounds(83, 360, 236, 20);
		frame.getContentPane().add(copiField);
		copiField.setColumns(10);
		
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
						
						//Dados de contato
						addContactData(employee);
						
						//Dados Complementares
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
	
	private void addContactData(EmployeeModel employee){
		EmployeeContactModel employeeContact = new EmployeeContactModel(EmployeeView.enderecoField.getText(), EmployeeView.bairroField.getText(), 
				   EmployeeView.cidadeField.getText(), EmployeeView.ufField.getText(), 
				   EmployeeView.cepField.getText(), EmployeeView.telfixoField.getText(), 
				   EmployeeView.celularField.getText(), EmployeeView.emailField.getText());
		employeeContact.setEndereco(EmployeeView.enderecoField.getText());
		employeeContact.setBairro(EmployeeView.bairroField.getText());
		employeeContact.setCidade(EmployeeView.cidadeField.getText());
		employeeContact.setUf(EmployeeView.ufField.getText());
		employeeContact.setCep(EmployeeView.cepField.getText());
		employeeContact.setTelFixo(EmployeeView.telfixoField.getText());
		employeeContact.setTelCelular(EmployeeView.celularField.getText());
		employeeContact.setEmail(EmployeeView.emailField.getText());
		
		employee.setContato(employeeContact);
		
	}
	
	private void addComplementaryData(EmployeeModel employee){
		ComplementaryDataModel employeeComplementary = new ComplementaryDataModel(naturalidadeField.getText(), nacionalidadeField.getText(), 
				   racaField.getText(), pisField.getText(), 
				   emissorPisField.getText(), tituloEleitoralField.getText(), 
				   zonaEleitoralField.getText(), nomeConjugeField.getText(), 
				   estadoCivilField.getText(), nomePaiField.getText(),
				   nomeMaeField.getText());
		employeeComplementary.setNaturalidade(naturalidadeField.getText());
		employeeComplementary.setNacionalidade(nacionalidadeField.getText());
		employeeComplementary.setRaca(racaField.getText());
		employeeComplementary.setPisPasep(pisField.getText());
		employeeComplementary.setEmissaoPis(emissorPisField.getText());
		employeeComplementary.setTituloEleitoral(tituloEleitoralField.getText());
		employeeComplementary.setZonaEleitoral(zonaEleitoralField.getText());
		employeeComplementary.setNomeConjuge(nomeConjugeField.getText());
		employeeComplementary.setEstadoCivil(estadoCivilField.getText());
		employeeComplementary.setNomePai(nomePaiField.getText());
		employeeComplementary.setNomeMae(nomeMaeField.getText());
		
		employee.setDadosComplementares(employeeComplementary);
		
	}
}
