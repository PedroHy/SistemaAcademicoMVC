package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

import controller.AlunoController;
import controller.CursoController;
import model.Aluno;
import model.Curso;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textCurso;
	private JTextField textCampus;
	private JTextField textPeriodo;

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
		
		lblRaOuCpf = new JLabel("RA:");
		lblRaOuCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblRaOuCpf.setBounds(118, 35, 87, 33);
		add(lblRaOuCpf);
		
		textRaCpf = new JTextField();
		textRaCpf.setColumns(10);
		textRaCpf.setBounds(186, 35, 593, 33);
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
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursoController cursoController = new CursoController();
				Curso curso;
				AlunoController controller = new AlunoController();
				try {
					curso = cursoController.getCursoByName(textCurso.getText());
					controller.salvar(textRa.getText(), "path", textCpf.getText(), 
							textNome.getText(), textEmail.getText(), textEnd.getText(),
							textCelular.getText(), textDataNascimento.getText(), textUf.getText(),
							textMunicipio.getText(), curso.getId(), textCampus.getText(), textPeriodo.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnConsultar.setBackground(new Color(27, 95, 158));
		btnConsultar.setBounds(703, 639, 169, 49);
		add(btnConsultar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AlunoController alunoController = new AlunoController();
				try {
					alunoController.excluir(textRaCpf.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnExcluir.setBackground(new Color(255, 50, 37));
		btnExcluir.setBounds(489, 639, 169, 49);
		add(btnExcluir);
		
		textCurso = new JTextField();
		textCurso.setEditable(false);
		textCurso.setColumns(10);
		textCurso.setBounds(186, 475, 684, 33);
		add(textCurso);
		
		textCampus = new JTextField();
		textCampus.setEditable(false);
		textCampus.setColumns(10);
		textCampus.setBounds(186, 519, 684, 33);
		add(textCampus);
		
		textPeriodo = new JTextField();
		textPeriodo.setEditable(false);
		textPeriodo.setColumns(10);
		textPeriodo.setBounds(186, 563, 256, 33);
		add(textPeriodo);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setForeground(new Color(255, 255, 255));
		btnPesquisar.setBackground(new Color(30, 144, 255));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursoController cursoController = new CursoController();
				AlunoController alunoController = new AlunoController();
				
				try {
					Aluno aluno = alunoController.consultar(textRaCpf.getText());
					Curso curso = cursoController.getCurso(aluno.getIdCurso());
					textRa.setText(aluno.getRa());
					textCpf.setText(aluno.getCpf());
					textNome.setText(aluno.getNome());
					textDataNascimento.setText(aluno.getDataNascimento());
					textCelular.setText(aluno.getTelefone());
					textEmail.setText(aluno.getEmail());
					textEnd.setText(aluno.getEndereco());
					textUf.setText(aluno.getUf());
					textMunicipio.setText(aluno.getMunicipio());
					textPeriodo.setText(aluno.getPeriodo());
					textCampus.setText(aluno.getIdCampus());
					textCurso.setText(curso.getNome());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPesquisar.setBounds(781, 32, 89, 39);
		add(btnPesquisar);

	}
}
