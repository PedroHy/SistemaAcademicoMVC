package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import java.awt.Font;
import javax.swing.JTextField;

import controller.AlunoController;
import controller.CursoController;
import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.ItemBoletim;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelGerenciarNotas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair;
	private JLabel iblRaCpf;
	private JTextField textRaSearch;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblCurso;
	private JTextField textCurso;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JLabel lblSemestre_1;
	private JTextField textNota;
	private JLabel lblSemestre_2;
	private JTextField textFaltas;
	private JButton btnGerarBoletim;
	private JButton btnSalvar;
	private JComboBox<Disciplina> comboDisciplina;
	private JComboBox<Integer> comboSemestre;
	private JButton btnPesquisar;
	private JButton btnLimpar;

	/**
	 * Create the panel.
	 */
	public PanelGerenciarNotas() {
		setSize(1038, 832);

		iconSair = new JLabel("");
		iconSair.addMouseListener(new MouseAdapter() {
			private int DISPOSE_ON_CLOSE;

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);

			}
		});
		iconSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setLayout(null);

		iblRaCpf = new JLabel("RA:");
		iblRaCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		iblRaCpf.setBounds(99, 88, 91, 33);
		add(iblRaCpf);

		textRaSearch = new JTextField();
		textRaSearch.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textRaSearch.setColumns(10);
		textRaSearch.setBounds(200, 90, 597, 33);
		add(textRaSearch);

		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(99, 152, 91, 33);
		add(lblNome);

		textNome = new JTextField();
		textNome.setEditable(false);
		textNome.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textNome.setColumns(10);
		textNome.setBounds(200, 154, 722, 33);
		add(textNome);

		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(99, 215, 91, 33);
		add(lblCurso);

		textCurso = new JTextField();
		textCurso.setEditable(false);
		textCurso.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textCurso.setColumns(10);
		textCurso.setBounds(200, 217, 426, 33);
		add(textCurso);

		lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblDisciplina.setBounds(99, 272, 91, 33);
		add(lblDisciplina);

		lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre.setBounds(636, 215, 114, 33);
		add(lblSemestre);

		lblSemestre_1 = new JLabel("Nota:");
		lblSemestre_1.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre_1.setBounds(99, 332, 50, 33);
		add(lblSemestre_1);

		textNota = new JTextField();
		textNota.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textNota.setColumns(10);
		textNota.setBounds(200, 334, 162, 33);
		add(textNota);

		lblSemestre_2 = new JLabel("Faltas:");
		lblSemestre_2.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre_2.setBounds(428, 332, 57, 33);
		add(lblSemestre_2);

		textFaltas = new JTextField();
		textFaltas.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textFaltas.setColumns(10);
		textFaltas.setBounds(504, 334, 162, 33);
		add(textFaltas);

		btnGerarBoletim = new JButton("Gerar Boletim");
		btnGerarBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlunoController controller = new AlunoController();
				try {
					controller.gerarBoletim(textRaSearch.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGerarBoletim.setForeground(Color.WHITE);
		btnGerarBoletim.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnGerarBoletim.setBackground(new Color(27, 95, 158));
		btnGerarBoletim.setBounds(521, 701, 169, 49);
		add(btnGerarBoletim);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AlunoController alunoDao = new AlunoController();
				CursoController cursoDao = new CursoController();

				try {
					Disciplina disciplina = cursoDao.getDisciplina(comboDisciplina.getSelectedItem().toString());
					alunoDao.editarItemBoletim(textRaSearch.getText(), disciplina.getId(),
							Double.parseDouble(textNota.getText()), Integer.parseInt(textFaltas.getText()));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnSalvar.setBackground(new Color(27, 95, 158));
		btnSalvar.setBounds(766, 701, 156, 49);
		add(btnSalvar);

		comboDisciplina = new JComboBox<Disciplina>();
		comboDisciplina.setBackground(Color.WHITE);
		comboDisciplina.setToolTipText("Selecione a Disciplina . . .");
		comboDisciplina.setBounds(200, 275, 722, 33);
		comboDisciplina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AlunoController alunoController = new AlunoController();

				try {
					Aluno aluno = alunoController.consultar(textRaSearch.getText());
					Disciplina disciplina = (Disciplina) comboDisciplina.getSelectedItem();

					ItemBoletim item = alunoController.consultarItemBoletim(aluno.getRa(), disciplina.getId());
					textFaltas.setText(item.getFaltas().toString());
					textNota.setText(item.getNota().toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		add(comboDisciplina);

		comboSemestre = new JComboBox<Integer>();
		comboSemestre.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6 }));
		comboSemestre.setBounds(760, 218, 162, 33);
		comboSemestre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CursoController cursoController = new CursoController();
				AlunoController alunoController = new AlunoController();

				try {
					Aluno aluno = alunoController.consultar(textRaSearch.getText());
					textNome.setText(aluno.getNome());

					Curso curso = cursoController.getCurso(aluno.getIdCurso());
					textCurso.setText(curso.getNome());

					// Transforma o array de disciplinas em um Array padrão e passa como model do
					// comboDisciplina
					ArrayList<Disciplina> arrayD = cursoController.getDisciplinas(aluno.getIdCurso(),
							comboSemestre.getSelectedIndex() + 1);
					Disciplina[] disciplinas = new Disciplina[arrayD.size()];
					arrayD.toArray(disciplinas);

					comboDisciplina.setModel(new DefaultComboBoxModel<Disciplina>(disciplinas));
					// Ativa o evento do comboDisciplina
					comboDisciplina.setSelectedIndex(0);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		add(comboSemestre);

		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Faz com que ative o evento do comboSemestre
				comboSemestre.setSelectedIndex(0);
			}
		});
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setBackground(new Color(30, 144, 255));
		btnPesquisar.setBounds(807, 88, 115, 39);
		add(btnPesquisar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRaSearch.setText("");
				textNome.setText("");
				textCurso.setText("");
				textNota.setText("");
				textFaltas.setText("");
			}
		});
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnLimpar.setBackground(Color.DARK_GRAY);
		btnLimpar.setBounds(99, 701, 169, 49);
		add(btnLimpar);

	}
}
