package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;

public class PanelGerenciarNotas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel iconSair;
	private JLabel iconSair_1;
	private JLabel iblRaCpf;
	private JTextField textField;
	private JLabel lblNome;
	private JTextField textField_1;
	private JLabel lblCurso;
	private JTextField textField_2;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JLabel lblSemestre_1;
	private JTextField textField_5;
	private JLabel lblSemestre_2;
	private JTextField textField_6;
	private JButton btnGerarBoletim;
	private JButton btnSalvar;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Create the panel.
	 */
	public PanelGerenciarNotas() {
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
		setLayout(null);
		
		iconSair_1 = new JLabel("");
		iconSair_1.setBounds(1014, 28, 24, 24);
		iconSair_1.setIcon(new ImageIcon(PanelGerenciarNotas.class.getResource("/icon/btnFechar.png")));
		add(iconSair_1);
		
		iblRaCpf = new JLabel("RA ou CPF:");
		iblRaCpf.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		iblRaCpf.setBounds(99, 88, 91, 33);
		add(iblRaCpf);
		
		textField = new JTextField();
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(200, 90, 722, 33);
		add(textField);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblNome.setBounds(99, 152, 91, 33);
		add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 154, 722, 33);
		add(textField_1);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblCurso.setBounds(99, 215, 91, 33);
		add(lblCurso);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
		textField_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(200, 217, 426, 33);
		add(textField_2);
		
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
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(200, 334, 162, 33);
		add(textField_5);
		
		lblSemestre_2 = new JLabel("Faltas:");
		lblSemestre_2.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		lblSemestre_2.setBounds(428, 332, 57, 33);
		add(lblSemestre_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(504, 334, 162, 33);
		add(textField_6);
		
		btnGerarBoletim = new JButton("Gerar Boletim");
		btnGerarBoletim.setForeground(Color.WHITE);
		btnGerarBoletim.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnGerarBoletim.setBackground(new Color(27, 95, 158));
		btnGerarBoletim.setBounds(521, 701, 169, 49);
		add(btnGerarBoletim);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		btnSalvar.setBackground(new Color(27, 95, 158));
		btnSalvar.setBounds(766, 701, 156, 49);
		add(btnSalvar);
		
		comboBox = new JComboBox<Object>();
		comboBox.setToolTipText("Selecione a Disciplina . . .");
		comboBox.setBounds(200, 275, 722, 33);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(760, 218, 162, 33);
		add(comboBox_1);

	}
}
