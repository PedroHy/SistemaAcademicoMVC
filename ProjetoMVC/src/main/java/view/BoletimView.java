package view;

import java.awt.Container;
import java.awt.EventQueue;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class BoletimView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public BoletimView() throws IOException{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = frame.getContentPane();

		String URL = ("file:///"+System.getProperty("user.dir") + "/src/Arv/image/paginaloca.html");

		String novo=URLCaracteresInvalidos(URL);
		
		JEditorPane jep = new JEditorPane("file:/C:/mytest.html");
		JScrollPane jsp = new JScrollPane(jep);
		con.add(jsp);

		frame.setBounds(50, 50, 600, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) throws IOException {
		BoletimView exibeHtml= new BoletimView();
	}

	/**
	 * Create the frame.
	 */
	public static String URLCaracteresInvalidos(String URL){  

		final StringBuilder resultado = new StringBuilder();  
		final StringCharacterIterator iterator = new StringCharacterIterator(URL);  
		char character =  iterator.current();  
		while (character != CharacterIterator.DONE ) {  
			if (character == '\\') {  
				resultado.append("/");  
			} else if (character == ' ') {  
				resultado.append("%20");  
			} else {   
				resultado.append(character);  
			}  
			character = iterator.next();  
		}  
		return resultado.toString();  
	}  

}
