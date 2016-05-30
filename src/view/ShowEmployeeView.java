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

public class ShowEmployeeView {

	private JFrame frame;
	private JTextField matriculaTextField;
	private JTextField nomeTextField;
	private JPanel panelFuncionais;
	private JTextField admissaoTextField;
	private JLabel lblEn;
	private JTextField nascimentoTextField;
	private JTextField textField;

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
		tabbedPane.setBounds(10, 11, 634, 421);
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
		
		textField = new JTextField();
		textField.setBounds(140, 74, 97, 20);
		panelFuncionais.add(textField);
		textField.setColumns(10);
		
		JPanel panelComplementares = new JPanel();
		tabbedPane.addTab("Dados Complementares", null, panelComplementares, null);
		
		JPanel panelAcademicos = new JPanel();
		tabbedPane.addTab("Dados Acad\u00EAmicos", null, panelAcademicos, null);
		
		JPanel panelAtuacao = new JPanel();
		tabbedPane.addTab("Atua\u00E7\u00E3o", null, panelAtuacao, null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(20, 447, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(357, 447, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JButton btnDesativar = new JButton("Desativar");
		btnDesativar.setBounds(456, 447, 89, 23);
		frame.getContentPane().add(btnDesativar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(555, 447, 89, 23);
		frame.getContentPane().add(btnExcluir);
	}
}
