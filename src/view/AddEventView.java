package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.EmployeeController;
import controller.EventController;
import java.util.Date;
import decorator.AbonoAnual;
import model.EmployeeModel;
import model.EventModel;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class AddEventView {

	private static JTextArea observacoesTextArea;
	static JFrame frame;
	private static JTextField matriculaTextField;
	private static JTextField nomeTextField;
	private static JComboBox tipoEventoComboBox;
	private JFormattedTextField dataInicialTextField;
	private JFormattedTextField dataFinalTextField;
	private JTextField observacoesTextField;

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
	public AddEventView(){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(56, 22, 533, 124);
		lblNewLabel.setIcon(new ImageIcon(AddEventView.class.getResource("/resources/SGP2.png")));
		frame.getContentPane().add(lblNewLabel);
		
		matriculaTextField = new JTextField();
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
		MaskFormatter dateMask;
		try{
			dateMask = new MaskFormatter("##/##/####");
			dateMask.setValidCharacters("0123456789");
			dateMask.setValueContainsLiteralCharacters(true);
			dataInicialTextField = new JFormattedTextField(dateMask);
			dataInicialTextField.setBounds(25, 332, 190, 27);
		}
		catch(ParseException e2){
			e2.printStackTrace();
		}
		frame.getContentPane().add(dataInicialTextField);
		
		JLabel lblDataFinal = new JLabel("Data Final");
		lblDataFinal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataFinal.setBounds(225, 305, 73, 14);
		frame.getContentPane().add(lblDataFinal);
		MaskFormatter dateMask2;
		try{
			dateMask2 = new MaskFormatter("##/##/####");
			dateMask2.setValidCharacters("0123456789");
			dateMask2.setValueContainsLiteralCharacters(true);
			dataFinalTextField = new JFormattedTextField(dateMask2);
			dataFinalTextField.setBounds(233, 332, 173, 27);
		}
		catch(ParseException e2){
			e2.printStackTrace();
		}
		frame.getContentPane().add(dataFinalTextField);
		
		JLabel lblTipoDeEvento = new JLabel("Tipo De Evento");
		lblTipoDeEvento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeEvento.setBounds(33, 375, 106, 14);
		frame.getContentPane().add(lblTipoDeEvento);
		
		JComboBox tipoEventoComboBox = new JComboBox();
		tipoEventoComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Abono Anual", "Adicional Noturno Administrativo", "Adicional Noturno Professor", "Afastamento para Tribunal do Juri", "Afastamento Serv. Eleitoral (TRE)", "Atestado Comparecimento", "Atestado Medico", "Dispensa de Ponto para Doa\u00E7ao de Sangue", "Exame Preventivo - LEI 840", "Falta", "Falta Por Paralisa\u00E7ao", "F\u00E9rias", "Horas Nao Trabalhadas", "LG - Licen\u00E7a Gestante", "Licen\u00E7a Gala", "Licen\u00E7a Nojo", "Licen\u00E7a Paternidade", "Licen\u00E7a por Acidente em Servi\u00E7o", "Licen\u00E7a Adotante", "Licen\u00E7a de Acompanhamento de Pessoa Doente na Fam\u00EDlia (ate 6 meses)", "Licen\u00E7a de Acompanhamento de Pessoa Doente na Fam\u00EDlia (mais de 6 meses)", "Licen\u00E7a Premio por assiduidade", "Licen\u00E7a para Tratamento de Saude", "Ponto facultativo", "Recesso"}));
		//EventModel event = new EventModel();
		//event = new AbonoAnual(event);
		//tipoEventoComboBox.setModel(new DefaultComboBoxModel(new String [] {"", event.getNomeEvento()}));
		tipoEventoComboBox.setBounds(33, 397, 276, 20);
		frame.getContentPane().add(tipoEventoComboBox);

		EmployeeModel employee = new EmployeeModel();
		EmployeeController employeeController = new EmployeeController();
		String id_string =  LocateEmployee.locateformattedTextField.getText();
		int id = Integer.parseInt(id_string); 
		employee = employeeController.searchEmployeeById(id);
		
		nomeTextField.setText(employee.getNome());
		nomeTextField.setEditable(false);
		
		matriculaTextField.setText(employee.getMatricula());
		matriculaTextField.setEditable(false);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
				EventModel event = new EventModel();
				SimpleDateFormat dataInicial = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat dataFinal = new SimpleDateFormat("dd/MM/yyyy");
				Calendar data_inicial = Calendar.getInstance();
				Calendar data_final = Calendar.getInstance();
				
				try {
					data_inicial.setTime(dataInicial.parse(dataInicialTextField.getText()));
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				try {
					data_final.setTime(dataFinal.parse(dataFinalTextField.getText()));
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				
				event.setDataInicial(data_inicial);
				event.setDataFinal(data_final);
				event.setObservacao(observacoesTextField.getText());
				//event.setMatriculaProfissional(matriculaTextField.getText());
				String nome = (String) tipoEventoComboBox.getSelectedItem();
				event.setNomeEvento(nome);
				
				EventController eventController = new EventController();
				
				eventController.addEvent(event);
				
				//JOptionPane.showMessageDialog(null, "Evento Adicionado Com Sucesso na MAtricula: "+ event.getMatriculaProfissional());
				
			}
		});
		btnGravar.setBounds(527, 419, 89, 23);
		frame.getContentPane().add(btnGravar);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObservaes.setBounds(416, 305, 73, 14);
		frame.getContentPane().add(lblObservaes);
		
		observacoesTextField = new JTextField();
		observacoesTextField.setBounds(416, 335, 200, 54);
		frame.getContentPane().add(observacoesTextField);
		observacoesTextField.setColumns(10);
				
	}
}
