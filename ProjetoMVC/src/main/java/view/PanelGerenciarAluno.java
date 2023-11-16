package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class PanelGerenciarAluno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair;
	private JLabel lblRaOuCpf;
	private JTextField textRaCpf;
	private JLabel lblNewLabel;
	private JLabel iconImage;
	private JTextField textRa;
	private JTextField textCpf;
	private JLabel lblCpf;
	private JLabel lblNome;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textEnd;
	private JTextField textUf;
	private JTextField textCelular;
	private JTextField textMunicipio;
	private JLabel lblNome_1;
	private JLabel lblDataDeNascimento;
	private JTextField textDataNascimento;
	private JLabel lblCelular;
	private JLabel lblUf;
	private JLabel lblEnd;
	private JLabel lblEmail;
	private JLabel lblNewLabel_1;
	private JLabel lblCurso;
	private JLabel lblCampus;
	private JLabel lblPerodo;
	private JButton btnConsultar;
	private JButton btnExcluir;
	private JRadioButton rdbMatutino;
	private JRadioButton rdbVespertino;
	private JRadioButton rdbNoturno;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Create the panel.
	 */
	public PanelGerenciarAluno() {
		setSize(1038,832);
		setLayout(null);
		
		iconSair = new JLabel("");
		iconSair.addMouseListener(new MouseAdapter() {
			private int DISPOSE_ON_CLOSE;

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
				
				
			}
		});
		iconSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		iconSair = new JLabel("");
		iconSair.setIcon(new ImageIcon(PanelGerenciarAluno.class.getResource("/icon/btnFechar.png")));
		iconSair.setBounds(1014, 24, 24, 24);
		add(iconSair);
		
		lblRaOuCpf = new JLabel("RA ou CPF:");
		lblRaOuCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblRaOuCpf.setBounds(118, 35, 87, 33);
		add(lblRaOuCpf);
		
		textRaCpf = new JTextField();
		textRaCpf.setColumns(10);
		textRaCpf.setBounds(215, 35, 655, 33);
		add(textRaCpf);
		
		lblNewLabel = new JLabel("RA:");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(290, 113, 58, 33);
		add(lblNewLabel);
		
		iconImage = new JLabel("");
		iconImage.setIcon(new ImageIcon(PanelGerenciarAluno.class.getResource("/icon/images_icon.png")));
		iconImage.setForeground(Color.BLACK);
		iconImage.setEnabled(false);
		iconImage.setBackground(Color.BLACK);
		iconImage.setBounds(118, 79, 140, 155);
		add(iconImage);
		
		textRa = new JTextField();
		textRa.setEnabled(false);
		textRa.setEditable(false);
		textRa.setColumns(10);
		textRa.setBounds(372, 110, 498, 33);
		add(textRa);
		
		textCpf = new JTextField();
		textCpf.setEnabled(false);
		textCpf.setEditable(false);
		textCpf.setColumns(10);
		textCpf.setBounds(372, 154, 498, 33);
		add(textCpf);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCpf.setBounds(290, 157, 58, 33);
		add(lblCpf);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(290, 201, 58, 33);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(372, 201, 498, 33);
		add(textNome);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(186, 253, 684, 33);
		add(textEmail);
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBounds(186, 297, 684, 33);
		add(textEnd);
		
		textUf = new JTextField();
		textUf.setColumns(10);
		textUf.setBounds(184, 344, 96, 33);
		add(textUf);
		
		textCelular = new JTextField();
		textCelular.setColumns(10);
		textCelular.setBounds(185, 385, 180, 33);
		add(textCelular);
		
		textMunicipio = new JTextField();
		textMunicipio.setColumns(10);
		textMunicipio.setBounds(379, 341, 180, 33);
		add(textMunicipio);
		
		lblNome_1 = new JLabel("Município:");
		lblNome_1.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome_1.setBounds(290, 341, 79, 33);
		add(lblNome_1);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblDataDeNascimento.setBounds(382, 385, 163, 33);
		add(lblDataDeNascimento);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setEnabled(false);
		textDataNascimento.setEditable(false);
		textDataNascimento.setColumns(10);
		textDataNascimento.setBounds(548, 385, 322, 33);
		add(textDataNascimento);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCelular.setBounds(118, 385, 58, 33);
		add(lblCelular);
		
		lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblUf.setBounds(118, 341, 58, 33);
		add(lblUf);
		
		lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEnd.setBounds(118, 297, 58, 33);
		add(lblEnd);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEmail.setBounds(118, 253, 58, 33);
		add(lblEmail);
		
		lblNewLabel_1 = new JLabel("Informações do Curso:");
		lblNewLabel_1.setForeground(new Color(147, 147, 147));
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(118, 440, 140, 24);
		add(lblNewLabel_1);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(118, 475, 45, 33);
		add(lblCurso);
		
		lblCampus = new JLabel("Campus:");
		lblCampus.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCampus.setBounds(118, 519, 67, 33);
		add(lblCampus);
		
		lblPerodo = new JLabel("Período:");
		lblPerodo.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblPerodo.setBounds(118, 563, 67, 33);
		add(lblPerodo);
		
		btnConsultar = new JButton("Salvar");
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnConsultar.setBackground(new Color(27, 95, 158));
		btnConsultar.setBounds(703, 639, 169, 49);
		add(btnConsultar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnExcluir.setBackground(new Color(255, 50, 37));
		btnExcluir.setBounds(489, 639, 169, 49);
		add(btnExcluir);
		
		rdbMatutino = new JRadioButton("Matutino");
		rdbMatutino.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbMatutino.setBounds(186, 571, 89, 23);
		add(rdbMatutino);
		
		rdbVespertino = new JRadioButton("Vespertino");
		rdbVespertino.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbVespertino.setBounds(292, 573, 109, 23);
		add(rdbVespertino);
		
		rdbNoturno = new JRadioButton("Noturno");
		rdbNoturno.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbNoturno.setBounds(417, 573, 109, 23);
		add(rdbNoturno);
		
		comboBox = new JComboBox();
		comboBox.setBounds(186, 479, 684, 33);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(186, 522, 684, 33);
		add(comboBox_1);

	}

}
