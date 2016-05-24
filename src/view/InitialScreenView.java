package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InitialScreenView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialScreenView window = new InitialScreenView();
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
	public InitialScreenView() {
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
		lblNewLabel.setIcon(new ImageIcon(InitialScreenView.class.getResource("/resources/SGP2.png")));
		lblNewLabel.setBounds(44, 11, 553, 171);
		frame.getContentPane().add(lblNewLabel);
		
		JButton cadastroButton = new JButton("Cadastro");
		cadastroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				EmployeeView employeeView = new EmployeeView();
				employeeView.frame.setVisible(true);		
			}
		});
		cadastroButton.setBounds(10, 188, 89, 23);
		frame.getContentPane().add(cadastroButton);
		
		JButton localizarFuncionarioButton = new JButton("Localizar Funcion\u00E1rio");
		localizarFuncionarioButton.setBounds(109, 188, 157, 23);
		frame.getContentPane().add(localizarFuncionarioButton);
		
		JButton lançamentoButton = new JButton("Lan\u00E7amento");
		lançamentoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				LocateEventView eventView = new LocateEventView();
				eventView.frame.setVisible(true);	
			}
		});
		lançamentoButton.setBounds(276, 188, 109, 23);
		frame.getContentPane().add(lançamentoButton);
		
		JButton listagensButton = new JButton("Listagens");
		listagensButton.setBounds(395, 188, 102, 23);
		frame.getContentPane().add(listagensButton);
		
		JButton folhaDePontoButton = new JButton("Folha De Ponto");
		folhaDePontoButton.setBounds(501, 188, 127, 23);
		frame.getContentPane().add(folhaDePontoButton);
		
		JTextPane txtpnCadastroAbaPara = new JTextPane();
		txtpnCadastroAbaPara.setText("Cadastro: aba para acessar o cadastro dos servidores, dados funcionais e complementares, dados acad\u00EAmicos (disciplina de concurso e habilita\u00E7\u00F5es), atua\u00E7\u00E3o no ano letivo, para cadastramento do funcion\u00E1rio.");
		txtpnCadastroAbaPara.setBounds(34, 237, 277, 97);
		frame.getContentPane().add(txtpnCadastroAbaPara);
		
		JTextPane txtpnLanamentoAbaPara = new JTextPane();
		txtpnLanamentoAbaPara.setText("Lan\u00E7amento: aba para registro de licen\u00E7as e afastamentos legais concedidos e autorizados ao servidor para registro na folha de ponto. ");
		txtpnLanamentoAbaPara.setBounds(376, 237, 242, 76);
		frame.getContentPane().add(txtpnLanamentoAbaPara);
		
		JTextPane txtpnListagensAbaDestinada = new JTextPane();
		txtpnListagensAbaDestinada.setText("Listagens: Aba destinada a obter listagens das mais variadas");
		txtpnListagensAbaDestinada.setBounds(376, 339, 221, 34);
		frame.getContentPane().add(txtpnListagensAbaDestinada);
		
		JTextPane txtpnAbaDestinadaA = new JTextPane();
		txtpnAbaDestinadaA.setText("Localizar Funcion\u00E1rio: Aba destinada a localiza\u00E7\u00E3o do funcion\u00E1rio desejado, afim de observar as suas infroma\u00E7\u00F5es, editar, mandar para o passivo, ou excluir o mesmo.");
		txtpnAbaDestinadaA.setBounds(34, 337, 277, 86);
		frame.getContentPane().add(txtpnAbaDestinadaA);
		
		JTextPane txtpnFolhaDePonto = new JTextPane();
		txtpnFolhaDePonto.setText("Folha De Ponto: Aba destinada a gera\u00E7\u00E3o da folha de ponto do funcion\u00E1rio escolhido.");
		txtpnFolhaDePonto.setBounds(376, 384, 221, 50);
		frame.getContentPane().add(txtpnFolhaDePonto);
	}
}
