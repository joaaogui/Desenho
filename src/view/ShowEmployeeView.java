package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class ShowEmployeeView {

	private JFrame frame;
	private JTextField matriculaTextField;
	private JTextField nomeTextField;
	private JPanel panelFuncionais;
	private JTextField admissaoTextField;
	private JLabel lblEn;
	private JTextField nascimentoTextField;
	private JTextField sexoTextField;
	private JTextField rgTextField;
	private JTextField emissorTextField;
	private JTextField cpfTextField;
	private JTextField telFixoTextField;
	private JTextField telCelularTextField;
	private JTextField emailTextField;
	private JTextField enderecoTextField;
	private JTextField bairroTextField;
	private JTextField cidadeTextField;
	private JTextField ufTextField;
	private JTextField cepTextField;
	private JTextField nacionalidadeTextField;
	private JTextField naturalidadeTextField;
	private JTextField ufComplementarTextField;
	private JTextField pisTextField;
	private JTextField emissaoPisTextField;
	private JTextField tituloEleitoralTextField;
	private JTextField zonaTextField;
	private JTextField secaoTextField;
	private JTextField estadoCivilTextField;
	private JTextField conjugeTextField;
	private JTextField nomePaiTextField;
	private JTextField nomemaeTextField;
	private JTextField escolaridadeTextField;
	private JTextField cursoTextField;
	private JTextField licenciaturaTextField;
	private JTextField instituicaoTextField;
	private JTextField cargoTextField;
	private JTextField disciplinaTextField;
	private JTextField funcaoTextField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowEmployeeView window = new ShowEmployeeView();
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
	public ShowEmployeeView() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 149, 634, 283);
		//tabbedPane.addTab("Dados Academicos", "nothing");
		frame.getContentPane().add(tabbedPane);
		
		panelFuncionais = new JPanel();
		panelFuncionais.setToolTipText("Dados Funcionais");
		tabbedPane.addTab("Dados Funcionais", null, panelFuncionais, null);
		panelFuncionais.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricula.setBounds(10, 11, 53, 14);
		panelFuncionais.add(lblMatricula);
		
		matriculaTextField = new JTextField();
		matriculaTextField.setBounds(10, 27, 120, 20);
		panelFuncionais.add(matriculaTextField);
		matriculaTextField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(140, 11, 32, 14);
		panelFuncionais.add(lblNome);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(140, 27, 240, 20);
		panelFuncionais.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(390, 11, 32, 14);
		panelFuncionais.add(lblNewLabel);
		
		JLabel lblAdmisso = new JLabel("Admiss\u00E3o");
		lblAdmisso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdmisso.setBounds(486, 11, 63, 14);
		panelFuncionais.add(lblAdmisso);
		
		admissaoTextField = new JTextField();
		admissaoTextField.setBounds(486, 27, 106, 20);
		panelFuncionais.add(admissaoTextField);
		admissaoTextField.setColumns(10);
		
		JComboBox tipoComboBox = new JComboBox();
		tipoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Efetivo", "Tempor\u00E1rio", "Terceirizado"}));
		tipoComboBox.setBounds(390, 27, 86, 20);
		panelFuncionais.add(tipoComboBox);
		
		lblEn = new JLabel("Data De Nascimento");
		lblEn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEn.setBounds(10, 58, 120, 14);
		panelFuncionais.add(lblEn);
		
		nascimentoTextField = new JTextField();
		nascimentoTextField.setBounds(10, 74, 120, 20);
		panelFuncionais.add(nascimentoTextField);
		nascimentoTextField.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSexo.setBounds(140, 58, 32, 14);
		panelFuncionais.add(lblSexo);
		
		sexoTextField = new JTextField();
		sexoTextField.setBounds(140, 74, 97, 20);
		panelFuncionais.add(sexoTextField);
		sexoTextField.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRg.setBounds(247, 58, 16, 14);
		panelFuncionais.add(lblRg);
		
		rgTextField = new JTextField();
		rgTextField.setBounds(247, 74, 86, 20);
		panelFuncionais.add(rgTextField);
		rgTextField.setColumns(10);
		
		JLabel lblOrgoEmissor = new JLabel("Org\u00E3o Emissor");
		lblOrgoEmissor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOrgoEmissor.setBounds(343, 58, 97, 14);
		panelFuncionais.add(lblOrgoEmissor);
		
		emissorTextField = new JTextField();
		emissorTextField.setBounds(343, 74, 86, 20);
		panelFuncionais.add(emissorTextField);
		emissorTextField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(438, 58, 26, 14);
		panelFuncionais.add(lblCpf);
		
		cpfTextField = new JTextField();
		cpfTextField.setBounds(439, 74, 153, 20);
		panelFuncionais.add(cpfTextField);
		cpfTextField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone Fixo");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 105, 86, 14);
		panelFuncionais.add(lblTelefone);
		
		telFixoTextField = new JTextField();
		telFixoTextField.setBounds(10, 121, 143, 20);
		panelFuncionais.add(telFixoTextField);
		telFixoTextField.setColumns(10);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular");
		lblTelefoneCelular.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefoneCelular.setBounds(164, 105, 99, 14);
		panelFuncionais.add(lblTelefoneCelular);
		
		telCelularTextField = new JTextField();
		telCelularTextField.setBounds(163, 121, 143, 20);
		panelFuncionais.add(telCelularTextField);
		telCelularTextField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(316, 105, 46, 14);
		panelFuncionais.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(316, 121, 276, 20);
		panelFuncionais.add(emailTextField);
		emailTextField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 152, 582, 20);
		panelFuncionais.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 162, 63, 14);
		panelFuncionais.add(lblNewLabel_1);
		
		enderecoTextField = new JTextField();
		enderecoTextField.setBounds(10, 182, 370, 20);
		panelFuncionais.add(enderecoTextField);
		enderecoTextField.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBairro.setBounds(390, 162, 46, 14);
		panelFuncionais.add(lblBairro);
		
		bairroTextField = new JTextField();
		bairroTextField.setBounds(390, 182, 202, 20);
		panelFuncionais.add(bairroTextField);
		bairroTextField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCidade.setBounds(10, 213, 46, 14);
		panelFuncionais.add(lblCidade);
		
		cidadeTextField = new JTextField();
		cidadeTextField.setBounds(10, 232, 253, 20);
		panelFuncionais.add(cidadeTextField);
		cidadeTextField.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUf.setBounds(275, 213, 46, 14);
		panelFuncionais.add(lblUf);
		
		ufTextField = new JTextField();
		ufTextField.setBounds(275, 232, 105, 20);
		panelFuncionais.add(ufTextField);
		ufTextField.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCep.setBounds(390, 213, 46, 14);
		panelFuncionais.add(lblCep);
		
		cepTextField = new JTextField();
		cepTextField.setBounds(390, 232, 202, 20);
		panelFuncionais.add(cepTextField);
		cepTextField.setColumns(10);
		
		JPanel panelComplementares = new JPanel();
		tabbedPane.addTab("Dados Complementares", null, panelComplementares, null);
		panelComplementares.setLayout(null);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNacionalidade.setBounds(10, 11, 83, 14);
		panelComplementares.add(lblNacionalidade);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade");
		lblNaturalidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNaturalidade.setBounds(162, 11, 83, 14);
		panelComplementares.add(lblNaturalidade);
		
		JLabel lblUf_1 = new JLabel("UF");
		lblUf_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUf_1.setBounds(327, 11, 46, 14);
		panelComplementares.add(lblUf_1);
		
		JComboBox racaComboBox = new JComboBox();
		racaComboBox.setBounds(454, 27, 165, 20);
		panelComplementares.add(racaComboBox);
		
		JLabel lblCorraa = new JLabel("Cor/Ra\u00E7a");
		lblCorraa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorraa.setBounds(454, 11, 77, 14);
		panelComplementares.add(lblCorraa);
		
		nacionalidadeTextField = new JTextField();
		nacionalidadeTextField.setBounds(10, 27, 142, 20);
		panelComplementares.add(nacionalidadeTextField);
		nacionalidadeTextField.setColumns(10);
		
		naturalidadeTextField = new JTextField();
		naturalidadeTextField.setBounds(162, 27, 151, 20);
		panelComplementares.add(naturalidadeTextField);
		naturalidadeTextField.setColumns(10);
		
		ufComplementarTextField = new JTextField();
		ufComplementarTextField.setBounds(327, 27, 117, 20);
		panelComplementares.add(ufComplementarTextField);
		ufComplementarTextField.setColumns(10);
		
		JLabel lblPispasep = new JLabel("PIS/PASEP");
		lblPispasep.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPispasep.setBounds(10, 58, 100, 14);
		panelComplementares.add(lblPispasep);
		
		pisTextField = new JTextField();
		pisTextField.setBounds(10, 73, 145, 20);
		panelComplementares.add(pisTextField);
		pisTextField.setColumns(10);
		
		JLabel lblEmissoPis = new JLabel("Emiss\u00E3o PIS");
		lblEmissoPis.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmissoPis.setBounds(162, 58, 83, 14);
		panelComplementares.add(lblEmissoPis);
		
		emissaoPisTextField = new JTextField();
		emissaoPisTextField.setBounds(162, 73, 124, 20);
		panelComplementares.add(emissaoPisTextField);
		emissaoPisTextField.setColumns(10);
		
		JLabel lblTituloEleitoral = new JLabel("Titulo Eleitoral");
		lblTituloEleitoral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTituloEleitoral.setBounds(296, 58, 100, 14);
		panelComplementares.add(lblTituloEleitoral);
		
		tituloEleitoralTextField = new JTextField();
		tituloEleitoralTextField.setBounds(296, 73, 117, 20);
		panelComplementares.add(tituloEleitoralTextField);
		tituloEleitoralTextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Zona");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(423, 58, 46, 14);
		panelComplementares.add(lblNewLabel_3);
		
		zonaTextField = new JTextField();
		zonaTextField.setBounds(423, 73, 86, 20);
		panelComplementares.add(zonaTextField);
		zonaTextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Se\u00E7\u00E3o");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(519, 58, 46, 14);
		panelComplementares.add(lblNewLabel_4);
		
		secaoTextField = new JTextField();
		secaoTextField.setBounds(519, 73, 100, 20);
		panelComplementares.add(secaoTextField);
		secaoTextField.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadoCivil.setBounds(10, 104, 83, 14);
		panelComplementares.add(lblEstadoCivil);
		
		JLabel lblNomeDoConjuge = new JLabel("Nome Do Conjuge");
		lblNomeDoConjuge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeDoConjuge.setBounds(150, 104, 110, 14);
		panelComplementares.add(lblNomeDoConjuge);
		
		JLabel lblNewLabel_5 = new JLabel("Nome Do Pai");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(379, 104, 90, 14);
		panelComplementares.add(lblNewLabel_5);
		
		estadoCivilTextField = new JTextField();
		estadoCivilTextField.setBounds(10, 120, 124, 20);
		panelComplementares.add(estadoCivilTextField);
		estadoCivilTextField.setColumns(10);
		
		conjugeTextField = new JTextField();
		conjugeTextField.setBounds(150, 120, 212, 20);
		panelComplementares.add(conjugeTextField);
		conjugeTextField.setColumns(10);
		
		nomePaiTextField = new JTextField();
		nomePaiTextField.setBounds(379, 120, 240, 20);
		panelComplementares.add(nomePaiTextField);
		nomePaiTextField.setColumns(10);
		
		JLabel lblNomeDaMe = new JLabel("Nome Da M\u00E3e");
		lblNomeDaMe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeDaMe.setBounds(10, 151, 83, 14);
		panelComplementares.add(lblNomeDaMe);
		
		nomemaeTextField = new JTextField();
		nomemaeTextField.setBounds(10, 166, 238, 20);
		panelComplementares.add(nomemaeTextField);
		nomemaeTextField.setColumns(10);
		
		JPanel panelAcademicos = new JPanel();
		tabbedPane.addTab("Dados Acad\u00EAmicos", null, panelAcademicos, null);
		panelAcademicos.setLayout(null);
		
		JLabel lblEscolaridade = new JLabel("Escolaridade");
		lblEscolaridade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEscolaridade.setBounds(10, 11, 91, 14);
		panelAcademicos.add(lblEscolaridade);
		
		escolaridadeTextField = new JTextField();
		escolaridadeTextField.setBounds(10, 26, 189, 20);
		panelAcademicos.add(escolaridadeTextField);
		escolaridadeTextField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(209, 11, 46, 14);
		panelAcademicos.add(lblCurso);
		
		cursoTextField = new JTextField();
		cursoTextField.setBounds(209, 26, 201, 20);
		panelAcademicos.add(cursoTextField);
		cursoTextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Licenciatura");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(418, 11, 91, 14);
		panelAcademicos.add(lblNewLabel_6);
		
		licenciaturaTextField = new JTextField();
		licenciaturaTextField.setBounds(420, 26, 199, 20);
		panelAcademicos.add(licenciaturaTextField);
		licenciaturaTextField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Institui\u00E7\u00E3o");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 57, 101, 14);
		panelAcademicos.add(lblNewLabel_7);
		
		instituicaoTextField = new JTextField();
		instituicaoTextField.setBounds(10, 73, 301, 20);
		panelAcademicos.add(instituicaoTextField);
		instituicaoTextField.setColumns(10);
		
		JLabel lblPs = new JLabel("P\u00F3s Gradua\u00E7\u00E3o");
		lblPs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPs.setBounds(321, 57, 101, 14);
		panelAcademicos.add(lblPs);
		
		JComboBox posComboBox = new JComboBox();
		posComboBox.setBounds(321, 73, 150, 20);
		panelAcademicos.add(posComboBox);
		
		JPanel panelAtuacao = new JPanel();
		tabbedPane.addTab("Atua\u00E7\u00E3o", null, panelAtuacao, null);
		panelAtuacao.setLayout(null);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCargo.setBounds(10, 11, 46, 14);
		panelAtuacao.add(lblCargo);
		
		JLabel lblNewLabel_8 = new JLabel("Disciplina De Concurso");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(192, 11, 137, 14);
		panelAtuacao.add(lblNewLabel_8);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o");
		lblFuno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuno.setBounds(425, 11, 46, 14);
		panelAtuacao.add(lblFuno);
		
		cargoTextField = new JTextField();
		cargoTextField.setBounds(10, 26, 162, 20);
		panelAtuacao.add(cargoTextField);
		cargoTextField.setColumns(10);
		
		disciplinaTextField = new JTextField();
		disciplinaTextField.setBounds(192, 26, 222, 20);
		panelAtuacao.add(disciplinaTextField);
		disciplinaTextField.setColumns(10);
		
		funcaoTextField = new JTextField();
		funcaoTextField.setBounds(425, 26, 194, 20);
		panelAtuacao.add(funcaoTextField);
		funcaoTextField.setColumns(10);
		
		JLabel lblCargaHorria = new JLabel("Carga Hor\u00E1ria");
		lblCargaHorria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargaHorria.setBounds(10, 82, 127, 14);
		panelAtuacao.add(lblCargaHorria);
		
		textField = new JTextField();
		textField.setBounds(10, 129, 99, 20);
		panelAtuacao.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 57, 609, 14);
		panelAtuacao.add(separator_1);
		
		JLabel lblHoraDeEntrada = new JLabel("Hora De Entrada");
		lblHoraDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHoraDeEntrada.setBounds(10, 107, 99, 14);
		panelAtuacao.add(lblHoraDeEntrada);
		
		JLabel lblHoraDeSada = new JLabel("Hora De Sa\u00EDda");
		lblHoraDeSada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHoraDeSada.setBounds(143, 107, 87, 14);
		panelAtuacao.add(lblHoraDeSada);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 129, 109, 20);
		panelAtuacao.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDias = new JLabel("Dias ");
		lblDias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDias.setBounds(300, 107, 46, 14);
		panelAtuacao.add(lblDias);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Segunda", "Ter\u00E7a", "Quarta", "Quinta", "Sexta"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(300, 131, 114, 92);
		panelAtuacao.add(list);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(20, 447, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnEditar = new JButton("Excluir");
		btnEditar.setBounds(321, 447, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JButton btnDesativar = new JButton("Desativar");
		btnDesativar.setBounds(420, 447, 89, 23);
		frame.getContentPane().add(btnDesativar);
		
		JButton btnExcluir = new JButton("Salvar Edi\u00E7\u00F5es");
		btnExcluir.setBounds(519, 447, 125, 23);
		frame.getContentPane().add(btnExcluir);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ShowEmployeeView.class.getResource("/resources/SGP2.png")));
		lblNewLabel_2.setBounds(75, -13, 504, 165);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
