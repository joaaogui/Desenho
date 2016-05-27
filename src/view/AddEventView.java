package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import model.EventModel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AddEventView {

	private static JTextArea observa��esTextArea;
	private static JFrame frame;
	private static JTextField matriculaTextField;
	private static JTextField nomeTextField;
	private static JTextField dataInicialTextField;
	private static JTextField dataFinalTextField;
	private static JComboBox tipoEventoComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEventView window = new AddEventView();
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
	public AddEventView() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(56, 22, 533, 124);
		lblNewLabel.setIcon(new ImageIcon(AddEventView.class.getResource("/resources/SGP2.png")));
		frame.getContentPane().add(lblNewLabel);
		
		matriculaTextField = new JTextField();
		matriculaTextField.setText("0000.000-0");
		matriculaTextField.setEditable(false);
		matriculaTextField.setBounds(33, 251, 206, 31);
		frame.getContentPane().add(matriculaTextField);
		matriculaTextField.setColumns(10);
		
		JLabel adicionarEventoJLabel = new JLabel("Adicionar Evento");
		adicionarEventoJLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		adicionarEventoJLabel.setBounds(33, 179, 151, 16);
		frame.getContentPane().add(adicionarEventoJLabel);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricula.setBounds(33, 226, 64, 14);
		frame.getContentPane().add(lblMatricula);
		
		nomeTextField = new JTextField();
		nomeTextField.setText("Marco Jos� Da Silva");
		nomeTextField.setEditable(false);
		nomeTextField.setBounds(263, 251, 353, 31);
		frame.getContentPane().add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(263, 226, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblDataInicial = new JLabel("Data Inicial");
		lblDataInicial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataInicial.setBounds(33, 305, 80, 14);
		frame.getContentPane().add(lblDataInicial);
		
		dataInicialTextField = new JTextField();
		dataInicialTextField.setBounds(33, 330, 169, 31);
		frame.getContentPane().add(dataInicialTextField);
		dataInicialTextField.setColumns(10);
		
		JLabel lblDataFinal = new JLabel("Data Final");
		lblDataFinal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataFinal.setBounds(225, 305, 73, 14);
		frame.getContentPane().add(lblDataFinal);
		
		dataFinalTextField = new JTextField();
		dataFinalTextField.setBounds(225, 330, 169, 31);
		frame.getContentPane().add(dataFinalTextField);
		dataFinalTextField.setColumns(10);
		
		JLabel lblTipoDeEvento = new JLabel("Tipo De Evento");
		lblTipoDeEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeEvento.setBounds(33, 375, 106, 14);
		frame.getContentPane().add(lblTipoDeEvento);
		
		JComboBox tipoEventoComboBox = new JComboBox();
		tipoEventoComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Abono Anual", "Adicional Noturno Administrativo", "Adicional Noturno Professor", "Afastamento para Tribunal do Juri", "Afastamento Serv. Eleitoral (TRE)", "Atestado Comparecimento", "Atestado Medico", "Dispensa de Ponto para Doa\u00E7ao de Sangue", "Exame Preventivo - LEI 840", "Falta", "Falta Por Paralisa\u00E7ao", "F\u00E9rias", "Horas Nao Trabalhadas", "LG - Licen\u00E7a Gestante", "Licen\u00E7a Gala", "Licen\u00E7a Nojo", "Licen\u00E7a Paternidade", "Licen\u00E7a por Acidente em Servi\u00E7o", "Licen\u00E7a Adotante", "Licen\u00E7a de Acompanhamento de Pessoa Doente na Fam\u00EDlia (ate 6 meses)", "Licen\u00E7a de Acompanhamento de Pessoa Doente na Fam\u00EDlia (mais de 6 meses)", "Licen\u00E7a Premio por assiduidade", "Licen\u00E7a para Tratamento de Saude", "Ponto facultativo", "Recesso"}));
		tipoEventoComboBox.setBounds(33, 397, 276, 20);
		frame.getContentPane().add(tipoEventoComboBox);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int matricula = Integer.parseInt(AddEventView.matriculaTextField.getText());
				String tipoEvento = AddEventView.tipoEventoComboBox.getSelectedItem().toString();
				EventModel event = new EventModel(AddEventView.dataInicialTextField.getText(),  AddEventView.dataFinalTextField.getText(),  AddEventView.observa��esTextArea.getText(),  tipoEvento , matricula);
				
				event.setDataInicial(AddEventView.dataInicialTextField.getText());
				event.setDataFinal(AddEventView.dataFinalTextField.getText());
				event.setObserva��o(AddEventView.observa��esTextArea.getText());
				event.setMatriculaProfissional(matricula);
				event.setTipoEvento(tipoEvento);
			}
		});
		btnGravar.setBounds(527, 419, 89, 23);
		frame.getContentPane().add(btnGravar);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObservaes.setBounds(416, 305, 73, 14);
		frame.getContentPane().add(lblObservaes);
		
		JTextArea observa��esTextArea = new JTextArea();
		observa��esTextArea.setBounds(416, 333, 200, 56);
		frame.getContentPane().add(observa��esTextArea);
	}
}