package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

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
		frame.setBounds(100, 100, 642, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InitialScreenView.class.getResource("/resources/SGP2.png")));
		lblNewLabel.setBounds(44, 11, 553, 171);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.setBounds(10, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Localizar Funcion\u00E1rio");
		btnNewButton_1.setBounds(109, 188, 131, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lan\u00E7amento");
		btnNewButton_2.setBounds(264, 188, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listagens");
		btnNewButton_3.setBounds(395, 188, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Folha De Ponto");
		btnNewButton_4.setBounds(507, 188, 109, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JTextPane txtpnCadastroAbaPara = new JTextPane();
		txtpnCadastroAbaPara.setText("Cadastro: aba para acessar o cadastro dos servidores, dados funcionais e complementares, dados acad\u00EAmicos (disciplina de concurso e habilita\u00E7\u00F5es), atua\u00E7\u00E3o no ano letivo, para cadastramento de professor substituto e de empregado terceirizado.");
		txtpnCadastroAbaPara.setBounds(10, 238, 277, 86);
		frame.getContentPane().add(txtpnCadastroAbaPara);
		
		JTextPane txtpnLanamentoAbaPara = new JTextPane();
		txtpnLanamentoAbaPara.setText("Lan\u00E7amento: aba para registro de licen\u00E7as e afastamentos legais concedidos e autorizados ao servidor para registro na folha de ponto e, caso o servidor afastado necessitar de substitui\u00E7\u00E3o ser\u00E1 poss\u00EDvel \u201Cgerar car\u00EAncia\u201D.");
		txtpnLanamentoAbaPara.setBounds(312, 235, 242, 78);
		frame.getContentPane().add(txtpnLanamentoAbaPara);
		
		JTextPane txtpnListagensAbaDestinada = new JTextPane();
		txtpnListagensAbaDestinada.setText("Listagens: Aba destinada a obter listagens das mais variadas");
		txtpnListagensAbaDestinada.setBounds(312, 326, 185, 34);
		frame.getContentPane().add(txtpnListagensAbaDestinada);
		
		JTextPane txtpnAbaDestinadaA = new JTextPane();
		txtpnAbaDestinadaA.setText("Localizar Funcion\u00E1rio: Aba destinada a localiza\u00E7\u00E3o do funcion\u00E1rios desejado, afim de observar as suas infroma\u00E7\u00F5es, editar, mandar para o passivo, ou excluir o funcion\u00E1rio.");
		txtpnAbaDestinadaA.setBounds(10, 324, 277, 62);
		frame.getContentPane().add(txtpnAbaDestinadaA);
		
		JTextPane txtpnFolhaDePonto = new JTextPane();
		txtpnFolhaDePonto.setText("Folha De Ponto: Aba destinada a gera\u00E7a\u00F5 da folha de ponto do funcion\u00E1rio escolhido.");
		txtpnFolhaDePonto.setBounds(312, 372, 175, 50);
		frame.getContentPane().add(txtpnFolhaDePonto);
	}
}
