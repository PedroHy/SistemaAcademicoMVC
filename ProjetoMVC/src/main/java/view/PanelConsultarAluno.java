package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelConsultarAluno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair;
	private JLabel iconSair_1;
	private JLabel iconImage;
	private JLabel lblRaOuCpf;
	private JTextField textRaCpf;
	private JLabel lblNewLabel;
	private JTextField textRa;
	private JTextField textCpf;
	private JLabel lblCpf;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblEmail;
	private JTextField textEmail;
	private JLabel lblEnd;
	private JTextField textEnd;
	private JLabel lblUf;
	private JTextField textUf;
	private JTextField textMunicipio;
	private JLabel lblCelular;
	private JTextField textCelular;
	private JLabel lblDataDeNascimento;
	private JTextField textDataNascimento;
	private JLabel lblNewLabel_1;
	private JLabel lblCurso;
	private JLabel lblCampus;
	private JLabel lblPerodo;
	private JLabel lblNome_1;
	private JTextField textPeriodo;
	private JButton btnConsultar;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Create the panel.
	 */
	public PanelConsultarAluno() {
		setSize(1038,832);
		
		iconSair = new JLabel("");
		iconSair.addMouseListener(new MouseAdapter() {
			private int DISPOSE_ON_CLOSE;

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
				
				
			}
		});
		
		iconSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		iconSair.setIcon(new ImageIcon(PanelConsultarAluno.class.getResource("/icon/btnFechar.png")));
		iconSair.setBounds(1014, 24, 24, 24);
		add(iconSair);
		setLayout(null);
		
		iconSair_1 = new JLabel("");
		iconSair_1.setIcon(new ImageIcon(PanelConsultarAluno.class.getResource("/icon/btnFechar.png")));
		iconSair_1.setBounds(1004, 35, 24, 24);
		add(iconSair_1);
		
		iconImage = new JLabel("");
		iconImage.setEnabled(false);
		iconImage.setIcon(new ImageIcon(PanelConsultarAluno.class.getResource("/icon/images_icon.png")));
		iconImage.setForeground(Color.BLACK);
		iconImage.setBackground(Color.BLACK);
		iconImage.setBounds(108, 102, 140, 155);
		add(iconImage);
		
		lblRaOuCpf = new JLabel("RA ou CPF:");
		lblRaOuCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblRaOuCpf.setBounds(108, 58, 87, 33);
		add(lblRaOuCpf);
		
		textRaCpf = new JTextField();
		textRaCpf.setColumns(10);
		textRaCpf.setBounds(205, 58, 655, 33);
		add(textRaCpf);
		
		lblNewLabel = new JLabel("RA:");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(280, 136, 58, 33);
		add(lblNewLabel);
		
		textRa = new JTextField();
		textRa.setEditable(false);
		textRa.setEnabled(false);
		textRa.setColumns(10);
		textRa.setBounds(362, 133, 498, 33);
		add(textRa);
		
		textCpf = new JTextField();
		textCpf.setEditable(false);
		textCpf.setEnabled(false);
		textCpf.setColumns(10);
		textCpf.setBounds(362, 177, 498, 33);
		add(textCpf);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCpf.setBounds(280, 180, 58, 33);
		add(lblCpf);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(280, 224, 58, 33);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setEditable(false);
		textNome.setEnabled(false);
		textNome.setColumns(10);
		textNome.setBounds(362, 224, 498, 33);
		add(textNome);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEmail.setBounds(108, 276, 58, 33);
		add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setEnabled(false);
		textEmail.setColumns(10);
		textEmail.setBounds(176, 276, 684, 33);
		add(textEmail);
		
		lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEnd.setBounds(108, 320, 58, 33);
		add(lblEnd);
		
		textEnd = new JTextField();
		textEnd.setEditable(false);
		textEnd.setEnabled(false);
		textEnd.setColumns(10);
		textEnd.setBounds(176, 320, 684, 33);
		add(textEnd);
		
		lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblUf.setBounds(108, 364, 58, 33);
		add(lblUf);
		
		textUf = new JTextField();
		textUf.setEditable(false);
		textUf.setEnabled(false);
		textUf.setColumns(10);
		textUf.setBounds(174, 367, 96, 33);
		add(textUf);
		
		textMunicipio = new JTextField();
		textMunicipio.setEditable(false);
		textMunicipio.setEnabled(false);
		textMunicipio.setColumns(10);
		textMunicipio.setBounds(369, 364, 180, 33);
		add(textMunicipio);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCelular.setBounds(108, 408, 58, 33);
		add(lblCelular);
		
		textCelular = new JTextField();
		textCelular.setEditable(false);
		textCelular.setEnabled(false);
		textCelular.setColumns(10);
		textCelular.setBounds(175, 408, 180, 33);
		add(textCelular);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblDataDeNascimento.setBounds(372, 408, 163, 33);
		add(lblDataDeNascimento);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setEditable(false);
		textDataNascimento.setEnabled(false);
		textDataNascimento.setColumns(10);
		textDataNascimento.setBounds(538, 408, 322, 33);
		add(textDataNascimento);
		
		lblNewLabel_1 = new JLabel("Informações do Curso:");
		lblNewLabel_1.setForeground(new Color(147, 147, 147));
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(108, 463, 140, 24);
		add(lblNewLabel_1);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(108, 498, 45, 33);
		add(lblCurso);
		
		lblCampus = new JLabel("Campus:");
		lblCampus.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCampus.setBounds(108, 542, 67, 33);
		add(lblCampus);
		
		lblPerodo = new JLabel("Período:");
		lblPerodo.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblPerodo.setBounds(108, 586, 67, 33);
		add(lblPerodo);
		
		lblNome_1 = new JLabel("Município:");
		lblNome_1.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome_1.setBounds(280, 364, 79, 33);
		add(lblNome_1);
		
		textPeriodo = new JTextField();
		textPeriodo.setEditable(false);
		textPeriodo.setEnabled(false);
		textPeriodo.setBounds(176, 589, 225, 30);
		add(textPeriodo);
		textPeriodo.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnConsultar.setBackground(new Color(27, 95, 158));
		btnConsultar.setBounds(693, 662, 169, 49);
		add(btnConsultar);
		
		comboBox = new JComboBox();
		comboBox.setBounds(176, 498, 684, 33);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(176, 545, 684, 33);
		add(comboBox_1);

	}

}
