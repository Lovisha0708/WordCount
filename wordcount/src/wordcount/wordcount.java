package wordcount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class wordcount extends JFrame implements ActionListener{

	JFrame frame;
	JLabel character , word;
	JButton wordcnt, pad , textColor;
	JTextArea textA;
	wordcount(){
		frame = new JFrame("Char Word Count Tool - JTP");
		character = new JLabel("Character");
		character.setBounds(50, 50, 100, 20);
		word = new JLabel("Word");
		word.setBounds(50, 80, 100, 20);
		
		textA = new JTextArea();
		textA.setBounds(50, 110, 300, 200);
		
		wordcnt = new JButton("WordCount");
		wordcnt.setBounds(50, 320, 100, 30);
		wordcnt.addActionListener(this);
		
		pad = new JButton("Pad color");
		pad.setBounds(160, 320, 100, 30);
		pad.addActionListener(this);
		
		textColor = new JButton("Text Color");
		textColor.setBounds(270, 320, 100, 30);
		textColor.addActionListener(this);
		
		frame.add(character);frame.add(word);frame.add(textA);
		frame.add(wordcnt);frame.add(pad);frame.add(textColor);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wordcnt){  
	        String text=textA.getText();  
	        character.setText("Characters: "+text.length());  
	        String words[]=text.split("\\s");  
	        word.setText("Words: "+words.length);  
	        }else if(e.getSource()==pad){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.WHITE);  
	            textA.setBackground(c);  
	        }else if(e.getSource()==textColor){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
	            textA.setForeground(c);  
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new wordcount();
	}
}	
