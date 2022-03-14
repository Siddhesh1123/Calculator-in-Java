package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class calculator implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel= new JPanel();
    JTextArea textarea= new JTextArea(2, 10);
    JButton button1=new JButton();
    JButton button2=new JButton();
    JButton button3=new JButton();
    JButton button4=new JButton();
    JButton button5=new JButton();
    JButton button6=new JButton();
    JButton button7=new JButton();
    JButton button8=new JButton();
    JButton button9=new JButton();
    JButton button0=new JButton();
    JButton buttonAdd=new JButton();
    JButton buttonSub=new JButton();
    JButton buttonMul=new JButton();
    JButton buttonDiv=new JButton();
    JButton buttonDot=new JButton();
    JButton buttonClear=new JButton();
    JButton buttonEqual=new JButton();
    
    double num1,num2,result;
    String s1="";
    int Addc=0,Subc=0,Mulc=0,Divc=0;
    public calculator() {
    	
    	frame.setSize(350,500);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	frame.setTitle("NEW AGE CALCI");
    	//frame.setResizable(true);
    	frame.add(panel);
    	panel.setBackground(Color.lightGray);
    	Border border =BorderFactory.createLineBorder(Color.cyan);
    	panel.add(textarea);
    	textarea.setBackground(Color.darkGray);
    	
    	Border sborder= BorderFactory.createLineBorder(Color.RED);
    	textarea.setBorder(sborder);
    	Font f1= new Font("arial",Font.BOLD,33);
    	textarea.setFont(f1);
    	textarea.setForeground(Color.white);
    	textarea.setPreferredSize(new Dimension(2,10));
    	textarea.setLineWrap(true);
    	textarea.setSize(350, 200);
    	
    	button1.setPreferredSize(new Dimension(100,40));
        button1.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button1.png"));
        
        button2.setPreferredSize(new Dimension(100,40));
        button2.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button2.png"));
  
        button3.setPreferredSize(new Dimension(100,40));
        button3.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button3.png"));
        
        button4.setPreferredSize(new Dimension(100,40));
        button4.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button4.png"));
        
        button5.setPreferredSize(new Dimension(100,40));
        button5.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button5.png"));
        
        button6.setPreferredSize(new Dimension(100,40));
        button6.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button6.png"));
        
        button7.setPreferredSize(new Dimension(100,40));
        button7.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button7.png"));
        
        button8.setPreferredSize(new Dimension(100,40));
        button8.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button8.png"));
        
        button9.setPreferredSize(new Dimension(100,40));
        button9.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button9.png"));
        
        button0.setPreferredSize(new Dimension(100,40));
        button0.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\button0.png"));
        
        buttonDot.setPreferredSize(new Dimension(100,40));
        buttonDot.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttondot.png"));
        
        buttonAdd.setPreferredSize(new Dimension(100,40));
        buttonAdd.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttonadd.png"));
        
        buttonSub.setPreferredSize(new Dimension(100,40));
        buttonSub.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttonsub.png"));
        
        buttonMul.setPreferredSize(new Dimension(100,40));
        buttonMul.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttonmul.png"));
        
        buttonDiv.setPreferredSize(new Dimension(100,40));
        buttonDiv.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttondiv.png"));
        
        buttonClear.setPreferredSize(new Dimension(100,40));
        buttonClear.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttonclear.png"));
        
        buttonEqual.setPreferredSize(new Dimension(100,40));
        buttonEqual.setIcon(new ImageIcon("C:\\calculator images\\drive-download-20220312T110028Z-001\\buttonequal.png"));
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(buttonMul);
        panel.add(buttonDiv);
        panel.add(buttonDot);
        panel.add(buttonEqual);
        panel.add(buttonClear);
        
        
        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        buttonAdd.addActionListener((ActionListener) this);
        buttonSub.addActionListener((ActionListener) this);
        buttonMul.addActionListener((ActionListener) this);
        buttonDiv.addActionListener((ActionListener) this);
        buttonDot.addActionListener((ActionListener) this);
        buttonEqual.addActionListener((ActionListener) this);
        buttonClear.addActionListener((ActionListener) this);
       
    }
    
    public void actionPerformed(ActionEvent e) {
    Object source =  e.getSource();
    if(source==buttonClear) {
    	num1=0.0;
    	num2=0.0;
    	textarea.setText("");
    }
    if(source==button1) {
    	textarea.append("1");
    }
    if(source==button2) {
    	textarea.append("2");
    }
    if(source==button3) {
    	textarea.append("3");
    }
    if(source==button4) {
    	textarea.append("4");
    }
    if(source==button5) {
    	textarea.append("5");
    }
    if(source==button6) {
    	textarea.append("6");
    }
    if(source==button7) {
    	textarea.append("7");
    }
    if(source==button8) {
    	textarea.append("8");
    }
    if(source==button9) {
    	textarea.append("9");
    }
    if(source==button0) {
    	textarea.append("0");
    }
    if(source==buttonDot) {
    	textarea.append(".");
    }
    if(source==buttonAdd) {
    	s1 = s1+textarea.getText();
    	num1=number_reader();
    	textarea.setText("");
    	textarea.append("+");
    	s1 = s1+textarea.getText();
    	textarea.setText("");
    	
        	Addc=1;
        	Subc=0;
        	Mulc=0;
        	Divc=0;
        	
        }	
    if(source==buttonSub) {
    	s1 = s1+textarea.getText();
    	num1=number_reader();
    	textarea.setText("");
    	textarea.append("-");
    	s1 = s1+textarea.getText();
    	textarea.setText("");
        	Addc=0;
        	Subc=1;
        	Mulc=0;
        	Divc=0;
        	
        }	
    if(source==buttonDiv) {
    	s1 = s1+textarea.getText();
    	num1=number_reader();
    	textarea.setText("");
    	textarea.append("/");
    	s1 = s1+textarea.getText();
    	textarea.setText("");
        	Addc=0;
        	Subc=0;
        	Mulc=0;
        	Divc=1;
        	
        	// double = 89;
        	// double 89
        	
        }	
    if(source==buttonMul) {
    	s1 = s1+textarea.getText();
    	num1=number_reader();
    	textarea.setText("");
    	textarea.append("*");
    	s1 = s1+textarea.getText();
    	textarea.setText("");
        	Addc=0;
        	Subc=0;
        	Mulc=1;
        	Divc=0;
        	
        }	
    if(source==buttonEqual) {
    	s1 = s1+textarea.getText();
    	num2=number_reader();
        	if(Addc>0) {
        		result=num1+num2;
        		textarea.setText(s1 + "=" + " " + Double.toString(result));
        	}
        	if(Subc>0) {
        		result=num1-num2;
        		textarea.setText(s1 + "=" + " " + Double.toString(result));
        	}
        	if(Mulc>0) {
        		result=num1*num2;
        		textarea.setText(s1 + "=" + " " + Double.toString(result));
        	}
        	if(Divc>0) {
        		result=num1/num2;
        		textarea.setText(s1 + "=" + " " + Double.toString(result));
        	}
    }
    }
    
 public double number_reader() {
	 double num1;
	 String s;
	 s=textarea.getText();
	 num1=Double.parseDouble(s);
	 return num1;
    }
    }
