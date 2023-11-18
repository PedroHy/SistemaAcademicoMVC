package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JTextField;

import controller.AlunoController;
import controller.CursoController;
import model.Campus;
import model.Curso;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class PanelCadastroDeAluno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair;
	private JLabel iconImage;
	private JLabel lblNewLabel;
	private JTextField textRA;
	private JLabel lblCpf;
	private JLabel lblNome;
	private JTextField textCpf;
	private JTextField textNome;
	private JLabel lblEmail;
	private JLabel lblEnd;
	private JLabel lblUf;
	private JLabel lblNome_1;
	private JTextField textEmail;
	private JTextField textEnd;
	private JTextField textUf;
	private JTextField textMunicipio;
	private JLabel lblCelular;
	private JLabel lblNewLabel_1;
	private JLabel lblDataDeNascimento;
	private JTextField textDataNascimento;
	private JTextField textCelular;
	private JLabel lblCurso;
	private JLabel lblNewLabel_2;
	private JLabel lblCampus;
	private JLabel lblPerodo;
	private JRadioButton rdbMatutino;
	private JRadioButton rdbVespertino;
	private JRadioButton rdbNoturno;
	private JButton btnCadastrar;
	private JComboBox cmbCampus;
	private JComboBox cmbCurso;

	// Controllers
	private CursoController cursoController;
	private AlunoController alunoController;

	/**
	 * Create the panel.
	 */
	public PanelCadastroDeAluno() {
		cursoController = new CursoController();
		alunoController = new AlunoController();

		setSize(1038, 832);
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

		iconSair.setIcon(new ImageIcon(PanelCadastroDeAluno.class.getResource("/icon/btnFechar.png")));
		iconSair.setBounds(1014, 24, 24, 24);
		add(iconSair);

		iconImage = new JLabel("");
		iconImage.setForeground(new Color(0, 0, 0));
		iconImage.setBackground(new Color(0, 0, 0));
		iconImage.setIcon(new ImageIcon(PanelCadastroDeAluno.class.getResource("/icon/images_icon.png")));
		iconImage.setBounds(108, 50, 140, 155);
		add(iconImage);

		lblNewLabel = new JLabel("RA:");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(280, 61, 58, 33);
		add(lblNewLabel);

		textRA = new JTextField();
		textRA.setBounds(348, 61, 498, 33);
		add(textRA);
		textRA.setColumns(10);

		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCpf.setBounds(280, 105, 58, 33);
		add(lblCpf);

		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(280, 149, 58, 33);
		add(lblNome);

		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(348, 105, 498, 33);
		add(textCpf);

		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(348, 152, 498, 33);
		add(textNome);

		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEmail.setBounds(108, 216, 58, 33);
		add(lblEmail);

		lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblEnd.setBounds(108, 260, 58, 33);
		add(lblEnd);

		lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblUf.setBounds(108, 304, 58, 33);
		add(lblUf);

		lblNome_1 = new JLabel("Município:");
		lblNome_1.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome_1.setBounds(280, 304, 79, 33);
		add(lblNome_1);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(176, 216, 670, 33);
		add(textEmail);

		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBounds(176, 260, 670, 33);
		add(textEnd);

		textUf = new JTextField();
		textUf.setColumns(10);
		textUf.setBounds(174, 307, 96, 33);
		add(textUf);

		textMunicipio = new JTextField();
		textMunicipio.setColumns(10);
		textMunicipio.setBounds(365, 304, 180, 33);
		add(textMunicipio);

		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCelular.setBounds(108, 348, 58, 33);
		add(lblCelular);

		lblNewLabel_1 = new JLabel("Informações pessoais:");
		lblNewLabel_1.setForeground(new Color(147, 147, 147));
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(108, 24, 140, 24);
		add(lblNewLabel_1);

		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblDataDeNascimento.setBounds(365, 348, 153, 33);
		add(lblDataDeNascimento);

		textDataNascimento = new JTextField();
		textDataNascimento.setColumns(10);
		textDataNascimento.setBounds(538, 348, 308, 33);
		add(textDataNascimento);

		textCelular = new JTextField();
		textCelular.setColumns(10);
		textCelular.setBounds(175, 348, 180, 33);
		add(textCelular);

		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(108, 434, 45, 33);
		add(lblCurso);

		lblNewLabel_2 = new JLabel("Informações do Curso:");
		lblNewLabel_2.setForeground(new Color(147, 147, 147));
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(108, 403, 140, 24);
		add(lblNewLabel_2);

		lblCampus = new JLabel("Campus:");
		lblCampus.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCampus.setBounds(108, 478, 67, 33);
		add(lblCampus);

		lblPerodo = new JLabel("Período:");
		lblPerodo.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblPerodo.setBounds(108, 522, 67, 33);
		add(lblPerodo);

		rdbMatutino = new JRadioButton("Matutino");
		rdbMatutino.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbMatutino.setBounds(176, 530, 89, 23);
		add(rdbMatutino);

		rdbVespertino = new JRadioButton("Vespertino");
		rdbVespertino.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbVespertino.setBounds(282, 532, 109, 23);
		add(rdbVespertino);

		rdbNoturno = new JRadioButton("Noturno");
		rdbNoturno.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		rdbNoturno.setBounds(407, 532, 109, 23);
		add(rdbNoturno);

		cmbCurso = new JComboBox();
		cmbCurso.setBounds(176, 437, 670, 33);
		// Pegar todos os cursos do banco de dados
		ArrayList<String> nomeCursos = new ArrayList<String>();

		try {
			ArrayList<Curso> cursos = cursoController.getAllCursos();
			nomeCursos.add("SELECIONE UMA OPÇÂO");
			for (int i = 0; i < cursos.size(); i++) {
				nomeCursos.add(cursos.get(i).getNome());
			}

		} catch (Exception err) {
			// Erro
		}

		// Evento que ao escolher um curso, ele mostra os campus disponiveis
		cmbCurso.setModel(new DefaultComboBoxModel(nomeCursos.toArray()));
		cmbCurso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selected = cmbCurso.getSelectedIndex() - 1;
				if (selected <= -1) {
					cmbCampus.setEnabled(false);
					cmbCampus.setModel(new DefaultComboBoxModel(new String[] { "SELECIONE UM CURSO PRIMEIRO" }));
					return;
				}

				try {
					ArrayList<Curso> cursos = cursoController.getAllCursos();
					ArrayList<Campus> campuss = cursoController.getCampus(cursos.get(selected).getId());

					ArrayList<String> campusNome = new ArrayList<String>();
					for (int i = 0; i < campuss.size(); i++) {
						campusNome.add(campuss.get(i).getNome());
					}

					System.out.print(campusNome);

					cmbCampus.setModel(new DefaultComboBoxModel(campusNome.toArray()));
				} catch (Exception err) {
					System.out.print(err);
					// Erro
				}

				cmbCampus.setEnabled(true);
			}
		});
		add(cmbCurso);

		// Começa desativado pois o usuário precisa selecionar um curso primeiro
		cmbCampus = new JComboBox();
		cmbCampus.setBounds(176, 481, 670, 33);
		cmbCampus.setEnabled(false);
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] { "SELECIONE UM CURSO PRIMEIRO" }));
		add(cmbCampus);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String periodo;
				if (rdbNoturno.isSelected()) {
					periodo = "Noturno";
				} else if (rdbVespertino.isSelected()) {
					periodo = "Vespertino";
				} else {
					periodo = "Matutino";
				}

				Curso curso;
				try {
					curso = cursoController.getCursoByName(cmbCurso.getSelectedItem().toString());
					alunoController.cadastrar(textRA.getText(), "path", textCpf.getText(),
							textNome.getText(), textEmail.getText(), textEnd.getText(),
							textCelular.getText(), textDataNascimento.getText(), textUf.getText(),
							textMunicipio.getText(), curso.getId(), cmbCampus.getSelectedItem().toString(), periodo);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnCadastrar.setBackground(new Color(27, 95, 158));
		btnCadastrar.setBounds(677, 664, 169, 49);
		add(btnCadastrar);

	}
}
