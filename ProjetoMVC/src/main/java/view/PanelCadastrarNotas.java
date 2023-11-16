package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;

public class PanelCadastrarNotas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair1;
	private JLabel iblRaCpf;
	private JTextField textRaCpf;
	protected int DISPOSE_ON_CLOSE;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblCurso;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JTextField textField;
	private JLabel lblSemestre_1;
	private JTextField textField_3;
	private JLabel lblSemestre_2;
	private JTextField textField_4;
	private JButton btnGerarBoletim;
	private JButton btnCadastrar;

	/**
	 * Create the panel.
	 */
	public PanelCadastrarNotas() {
		setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		setSize(1038,832);
		setLayout(null);
		
		iconSair1 = new JLabel("");
		iconSair1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
				
				
			}
		});
		
		iconSair1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconSair1.setIcon(new ImageIcon(PanelCadastrarNotas.class.getResource("/icon/btnFechar.png")));
		iconSair1.setBounds(1014, 21, 24, 24);
		add(iconSair1);
		
		iblRaCpf = new JLabel("RA ou CPF:");
		iblRaCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		iblRaCpf.setBounds(77, 115, 91, 33);
		add(iblRaCpf);
		
		textRaCpf = new JTextField();
		textRaCpf.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textRaCpf.setBounds(178, 117, 722, 33);
		add(textRaCpf);
		textRaCpf.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(77, 179, 91, 33);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setEditable(false);
		textNome.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textNome.setColumns(10);
		textNome.setBounds(178, 181, 722, 33);
		add(textNome);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(77, 242, 91, 33);
		add(lblCurso);
		
		lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblDisciplina.setBounds(77, 299, 91, 33);
		add(lblDisciplina);
		
		lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre.setBounds(77, 364, 91, 33);
		add(lblSemestre);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(178, 244, 722, 33);
		add(textField);
		
		lblSemestre_1 = new JLabel("Nota:");
		lblSemestre_1.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre_1.setBounds(389, 364, 50, 33);
		add(lblSemestre_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(449, 366, 162, 33);
		add(textField_3);
		
		lblSemestre_2 = new JLabel("Faltas:");
		lblSemestre_2.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre_2.setBounds(662, 364, 57, 33);
		add(lblSemestre_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(738, 366, 162, 33);
		add(textField_4);
		
		btnGerarBoletim = new JButton("Gerar Boletim");
		btnGerarBoletim.setForeground(new Color(255, 255, 255));
		btnGerarBoletim.setBackground(new Color(27, 95, 158));
		btnGerarBoletim.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnGerarBoletim.setBounds(499, 729, 169, 49);
		add(btnGerarBoletim);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setBackground(new Color(27, 95, 158));
		btnCadastrar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnCadastrar.setBounds(744, 729, 156, 49);
		add(btnCadastrar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(178, 302, 722, 33);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(178, 367, 162, 33);
		add(comboBox_1);

	}
}
