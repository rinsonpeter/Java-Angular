import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	String oldValue;
	boolean isOperatorClicked=false;
	 
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenbutton,eightbutton,ninebutton,fourbutton,fivebutton,sixbutton,threebutton,twobutton,onebutton,zerobutton;
	JButton dotbutton,equalbutton,divbutton,starbutton,minusbutton,plusbutton,clearButton;
	
	
	public Calculator() {
		jf=new JFrame();
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jf.add(displayLabel);
		
		sevenbutton = new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.setFont(new Font("Arial", Font.PLAIN,40));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		eightbutton = new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		eightbutton.setFont(new Font("Arial", Font.PLAIN,40));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton = new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		ninebutton.setFont(new Font("Arial", Font.PLAIN,40));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton = new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.setFont(new Font("Arial", Font.PLAIN,40));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);

		fivebutton = new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		fivebutton.setFont(new Font("Arial", Font.PLAIN,40));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);

		sixbutton = new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		sixbutton.setFont(new Font("Arial", Font.PLAIN,40));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);

		onebutton = new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.setFont(new Font("Arial", Font.PLAIN,40));
		onebutton.addActionListener(this);
		jf.add(onebutton);

		twobutton = new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		twobutton.setFont(new Font("Arial", Font.PLAIN,40));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton = new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		threebutton.setFont(new Font("Arial", Font.PLAIN,40));
		threebutton.addActionListener(this);
		jf.add(threebutton);
        
		zerobutton = new JButton("0");
		zerobutton.setBounds(30, 430, 80, 80);
		zerobutton.setFont(new Font("Arial", Font.PLAIN,40));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);

		dotbutton = new JButton(".");
		dotbutton.setBounds(130, 430, 80, 80);
		dotbutton.setFont(new Font("Arial", Font.PLAIN,40));
		dotbutton.addActionListener(this);
		jf.add(dotbutton);
		
		equalbutton = new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		equalbutton.setFont(new Font("Arial", Font.PLAIN,40));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);

		divbutton = new JButton("/");
		divbutton.setBounds(330, 130, 80, 80);
		jf.add(divbutton);

		starbutton = new JButton("*");
		starbutton.setBounds(330, 230, 80, 80);
		jf.add(starbutton);
		
		minusbutton = new JButton("-");
		minusbutton.setBounds(330, 330, 80, 80);
		jf.add(minusbutton);
		
		plusbutton = new JButton("+");
		plusbutton.setBounds(330, 430, 80, 80);
		jf.add(plusbutton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(430, 430, 80, 80);
		jf.add(clearButton);

		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
					
	}
	
	public static void main(String[]args) {
		new Calculator();
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}	
		}else if(e.getSource()==eightbutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource()==ninebutton){
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {	
			displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==fourbutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==fivebutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixbutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==threebutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==twobutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==onebutton){
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==dotbutton){
			displayLabel.setText(displayLabel.getText()+".");	
		}else if(e.getSource()==divbutton){
			
		}else if(e.getSource()==starbutton){
			
		}else if(e.getSource()==minusbutton){
			
		}else if(e.getSource()==plusbutton){
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			
		}
		else if(e.getSource()==equalbutton){
			float oldValue=Float.parseFloat(oldValue);
			float newValue=Float.parseFloat(newValue);
			
			Float result=oldValue+newValue;
		}else if(e.getSource()==clearButton){
			displayLabel.setText(null);
			
		}
		 
		
	}
}
