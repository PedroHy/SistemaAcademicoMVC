package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import util.DragListener;

import java.awt.Cursor;

public class TelaAcademica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	PanelCadastroDeAluno cadastrarAlunos;
	PanelConsultarAluno consultarAluno;
	PanelGerenciarAluno gerenciarAluno;
	PanelGerenciarNotas gerenciarNotas;
	JPanel PanelHome;

	/*
	 * Cria o mouse listener
	 * public MouseListener getMouseListener() {
	 * //Utiliza a implementação do mouseAdapter
	 * return new MouseAdapter() {
	 * //Faz a sobre-escrita apenas no click
	 * public void mouseClicked(MouseEvent e) {
	 * ;
	 * }
	 * };
	 * }
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAcademica frame = new TelaAcademica();
					DragListener.add(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAcademica() {
		setSize(1280, 832);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 1279, 833);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		// Chamando Panels
		cadastrarAlunos = new PanelCadastroDeAluno();
		consultarAluno = new PanelConsultarAluno();
		gerenciarAluno = new PanelGerenciarAluno();
		gerenciarNotas = new PanelGerenciarNotas();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		PanelHome = new JPanel();
		setSize(1280, 832);
		contentPane.add(PanelHome, BorderLayout.CENTER);
		PanelHome.setLayout(null);

		JPanel MenuLateral = new JPanel();
		MenuLateral.setBorder(null);
		MenuLateral.setBackground(new Color(27, 95, 158));
		contentPane.add(MenuLateral, BorderLayout.WEST);

		JLabel textHome = new JLabel("Home");
		textHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Desabilitando Panels
				cadastrarAlunos.setVisible(false);
				consultarAluno.setVisible(false);
				gerenciarAluno.setVisible(false);
				gerenciarNotas.setVisible(false);
				PanelHome.setVisible(false);

				// Limpando BorderLayout Center
				BorderLayout layout = (BorderLayout) contentPane.getLayout();
				remove(layout.getLayoutComponent(BorderLayout.CENTER));

				// PanelGerenciarNotas
				getContentPane().add(PanelHome, BorderLayout.CENTER);
				PanelHome.setVisible(true);
			}
		});

		textHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textHome.setHorizontalAlignment(SwingConstants.CENTER);
		textHome.setForeground(new Color(255, 255, 255));
		textHome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));

		JLabel textCadastrar = new JLabel("Cadastrar");
		textCadastrar.setVerticalAlignment(SwingConstants.TOP);
		textCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Desabilitando Panels
				cadastrarAlunos.setVisible(false);
				consultarAluno.setVisible(false);
				gerenciarAluno.setVisible(false);
				gerenciarNotas.setVisible(false);
				PanelHome.setVisible(false);

				// Limpando BorderLayout Center
				BorderLayout layout = (BorderLayout) contentPane.getLayout();
				remove(layout.getLayoutComponent(BorderLayout.CENTER));

				// PanelCadastroDeAluno
				getContentPane().add(cadastrarAlunos, BorderLayout.CENTER);
				cadastrarAlunos.setVisible(true);

			}
		});

		textCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textCadastrar.setHorizontalAlignment(SwingConstants.LEFT);
		textCadastrar.setForeground(new Color(255, 255, 255));
		textCadastrar.setFont(new Font("Malgun Gothic", Font.BOLD, 12));

		JLabel textGerenciar = new JLabel("Gerenciar");
		textGerenciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Desabilitando Panels
				cadastrarAlunos.setVisible(false);
				consultarAluno.setVisible(false);
				gerenciarAluno.setVisible(false);
				gerenciarNotas.setVisible(false);
				PanelHome.setVisible(false);

				// Limpando BorderLayout Center
				BorderLayout layout = (BorderLayout) contentPane.getLayout();
				remove(layout.getLayoutComponent(BorderLayout.CENTER));

				// PanelGerenciarAluno
				getContentPane().add(gerenciarAluno, BorderLayout.CENTER);
				gerenciarAluno.setVisible(true);

			}
		});
		textGerenciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textGerenciar.setHorizontalAlignment(SwingConstants.LEFT);
		textGerenciar.setForeground(new Color(255, 255, 255));
		textGerenciar.setFont(new Font("Malgun Gothic", Font.BOLD, 12));

		JLabel textGerenciarNotasFaltas = new JLabel("Notas e Faltas");

		textGerenciarNotasFaltas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Desabilitando Panels
				cadastrarAlunos.setVisible(false);
				consultarAluno.setVisible(false);
				gerenciarAluno.setVisible(false);
				gerenciarNotas.setVisible(false);
				PanelHome.setVisible(false);

				// Limpando BorderLayout Center
				BorderLayout layout = (BorderLayout) contentPane.getLayout();
				remove(layout.getLayoutComponent(BorderLayout.CENTER));

				// PanelGerenciarNotas
				getContentPane().add(gerenciarNotas, BorderLayout.CENTER);
				gerenciarNotas.setVisible(true);
			}
		});

		textGerenciarNotasFaltas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textGerenciarNotasFaltas.setHorizontalAlignment(SwingConstants.CENTER);
		textGerenciarNotasFaltas.setForeground(new Color(255, 255, 255));
		textGerenciarNotasFaltas.setFont(new Font("Malgun Gothic", Font.BOLD, 12));

		JLabel textConsultar = new JLabel("Consultar");

		textConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Desabilitando Panels
				cadastrarAlunos.setVisible(false);
				consultarAluno.setVisible(false);
				gerenciarAluno.setVisible(false);
				gerenciarNotas.setVisible(false);
				PanelHome.setVisible(false);

				// Limpando BorderLayout Center
				BorderLayout layout = (BorderLayout) contentPane.getLayout();
				remove(layout.getLayoutComponent(BorderLayout.CENTER));

				// PanelConsultarAluno
				getContentPane().add(consultarAluno, BorderLayout.CENTER);
				consultarAluno.setVisible(true);
			}
		});

		textConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textConsultar.setHorizontalAlignment(SwingConstants.LEFT);
		textConsultar.setForeground(new Color(255, 255, 255));
		textConsultar.setFont(new Font("Malgun Gothic", Font.BOLD, 12));
		GroupLayout gl_MenuLateral = new GroupLayout(MenuLateral);
		gl_MenuLateral.setHorizontalGroup(
				gl_MenuLateral.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_MenuLateral.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_MenuLateral.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_MenuLateral.createSequentialGroup()
												.addGap(14)
												.addGroup(gl_MenuLateral.createParallelGroup(Alignment.LEADING)
														.addComponent(textCadastrar, GroupLayout.PREFERRED_SIZE, 122,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(textGerenciar)
														.addComponent(textConsultar, Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE, 168,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(textGerenciarNotasFaltas)))
										.addComponent(textHome, GroupLayout.PREFERRED_SIZE, 75,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(22, Short.MAX_VALUE)));
		gl_MenuLateral.setVerticalGroup(
				gl_MenuLateral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MenuLateral.createSequentialGroup()
								.addGap(69)
								.addComponent(textHome)
								.addGap(18)
								.addComponent(textCadastrar)
								.addGap(18)
								.addComponent(textGerenciar)
								.addGap(18)
								.addComponent(textConsultar)
								.addGap(18)
								.addComponent(textGerenciarNotasFaltas)
								.addContainerGap(602, Short.MAX_VALUE)));
		MenuLateral.setLayout(gl_MenuLateral);
		MenuLateral.setSize(242, 832);

		JLabel iconePC = new JLabel("");
		iconePC.setIcon(new ImageIcon(TelaAcademica.class.getResource("/image/icone-Livro.png")));
		iconePC.setBounds(395, 174, 256, 238);
		PanelHome.add(iconePC);

		JLabel txtSistemaAcademico = new JLabel("Sistema Acadêmico");
		txtSistemaAcademico.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
		txtSistemaAcademico.setBounds(385, 418, 375, 49);
		PanelHome.add(txtSistemaAcademico);

		JLabel txtElias = new JLabel("Elias Pinheiro Neto");
		txtElias.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		txtElias.setBounds(23, 705, 248, 14);
		PanelHome.add(txtElias);

		JLabel txtNicolas = new JLabel("Nicolas Hiroshi Souza Tsukada");
		txtNicolas.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		txtNicolas.setBounds(23, 730, 248, 14);
		PanelHome.add(txtNicolas);

		JLabel txtPedro = new JLabel("Pedro Henrique Ribeiro de Azevedo");
		txtPedro.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		txtPedro.setBounds(23, 755, 246, 14);
		PanelHome.add(txtPedro);

		JLabel txtVitoria = new JLabel("Vitória Silva Dias");
		txtVitoria.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		txtVitoria.setBounds(23, 781, 248, 14);
		PanelHome.add(txtVitoria);

		JLabel iconSair = new JLabel("");
		iconSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);

			}
		});
		iconSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconSair.setIcon(new ImageIcon(TelaAcademica.class.getResource("/icon/btnFechar.png")));
		iconSair.setBounds(1014, 21, 24, 24);
		PanelHome.add(iconSair);

	}
}