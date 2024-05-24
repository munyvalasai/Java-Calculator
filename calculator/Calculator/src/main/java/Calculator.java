import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Calculator implements ActionListener{
	
	double num1 = 0, num2 = 0, result = 0;
	int calculation;
	
//	Create Constructor
	Calculator(){
		
		// Call the prepareGui() function
		prepareGui();

		// Call the addComponents() function
		addComponents();

		// Call the addActionEvent() function
		addActionEvent();
	}
	
	
//	Create UI Frame/WIndow GUI for calculator
	JFrame frame = new JFrame("Calculator");
	
//	Create Label Object for field
	JLabel label = new JLabel();

//	Create Label Field Object
	JTextField textField = new JTextField();
	
//	Create Radio Buttons
	JRadioButton onRedioButton = new JRadioButton("on");
	JRadioButton offRedioButton = new JRadioButton("off");
	
//	Create buttons for all numbers & symbols
	JButton buttonZero = new JButton("0");
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");
	JButton buttonThree = new JButton("3");
	JButton buttonFour = new JButton("4");
	JButton buttonFive = new JButton("5");
	JButton buttonSix = new JButton("6");
	JButton buttonSeven = new JButton("7");
	JButton buttonEight = new JButton("8");
	JButton buttonNine = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonClear = new JButton("C");
	JButton buttonDelete = new JButton("DEL");
	JButton buttonEqual = new JButton("=");
	JButton buttonMul = new JButton("X");
	JButton buttonDiv = new JButton("/");
	JButton buttonPlus = new JButton("+");
	JButton buttonMinus = new JButton("-");
	JButton buttonSquare = new JButton("x\u00B2");  // power of symbol
	JButton buttonReciprocal = new JButton("l/x");
	JButton buttonSqrt = new JButton("\u221A");
	
	
//	GUI Function for Calculator
	public void prepareGui() {
		frame.setSize(305, 510);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null); // It appears at center
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	Add Components on GUI
	public void addComponents() {
		
		label.setBounds(250,0,50,50); // set the position of the label
		label.setForeground(Color.white);
		frame.add(label);
		
		textField.setBounds(10,40,270,40); // set the position of the Text Field
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);
		
		// adding onRedioButton on frame
		onRedioButton.setBounds(10,95,60,40);
		onRedioButton.setSelected(true);
		onRedioButton.setFont(new Font("Arial",Font.BOLD,14));
		onRedioButton.setBackground(Color.black);
		onRedioButton.setForeground(Color.white);
		onRedioButton.setFocusable(false);
		frame.add(onRedioButton);

		// adding offRedioButton on frame
		offRedioButton.setBounds(10,120,60,40);
		offRedioButton.setSelected(false);
		offRedioButton.setFont(new Font("Arial",Font.BOLD,14));
		offRedioButton.setBackground(Color.black);
		offRedioButton.setForeground(Color.white);
		offRedioButton.setFocusable(false);
		frame.add(offRedioButton);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(onRedioButton);
		btnGroup.add(offRedioButton);
		
		//buttonSeven add on frame
		buttonSeven.setBounds(10,230,60,40);
		buttonSeven.setFont(new Font("Arial", Font.BOLD,20));
		buttonSeven.setFocusable(false);
		frame.add(buttonSeven);

		//buttonEight add on frame
		buttonEight.setBounds(80,230,60,40);
		buttonEight.setFont(new Font("Arial", Font.BOLD,20));
		buttonEight.setFocusable(false);
		frame.add(buttonEight);
		
		//buttonNine add on frame
		buttonNine.setBounds(150,230,60,40);
		buttonNine.setFont(new Font("Arial", Font.BOLD,20));
		buttonNine.setFocusable(false);
		frame.add(buttonNine);

		//buttonFour add on frame
		buttonFour.setBounds(10,290,60,40);
		buttonFour.setFont(new Font("Arial", Font.BOLD,20));
		buttonFour.setFocusable(false);
		frame.add(buttonFour);
		
		//buttonFive add on frame
		buttonFive.setBounds(80,290,60,40);
		buttonFive.setFont(new Font("Arial", Font.BOLD,20));
		buttonFive.setFocusable(false);
		frame.add(buttonFive);

		//buttonSix add on frame
		buttonSix.setBounds(150,290,60,40);
		buttonSix.setFont(new Font("Arial", Font.BOLD,20));
		buttonSix.setFocusable(false);
		frame.add(buttonSix);
		
		//buttonOne add on frame
		buttonOne.setBounds(10,350,60,40);
		buttonOne.setFont(new Font("Arial", Font.BOLD,20));
		buttonOne.setFocusable(false);
		frame.add(buttonOne);

		//buttonTwo add on frame
		buttonTwo.setBounds(80,350,60,40);
		buttonTwo.setFont(new Font("Arial", Font.BOLD,20));
		buttonTwo.setFocusable(false);
		frame.add(buttonTwo);

		//buttonThree add on frame
		buttonThree.setBounds(150,350,60,40);
		buttonThree.setFont(new Font("Arial", Font.BOLD,20));
		buttonThree.setFocusable(false);
		frame.add(buttonThree);

		//buttonZero add on frame
		buttonZero.setBounds(10,410,130,40);
		buttonZero.setFont(new Font("Arial", Font.BOLD,20));
		buttonZero.setFocusable(false);
		frame.add(buttonZero);

		//buttonDot add on frame
		buttonDot.setBounds(150,410,60,40);
		buttonDot.setFont(new Font("Arial", Font.BOLD,20));
		buttonDot.setFocusable(false);
		frame.add(buttonDot);

		//buttonEqual add on frame
		buttonEqual.setBounds(220,350,60,100);
		buttonEqual.setFont(new Font("Arial", Font.BOLD,20));
//		buttonEqual.setBackground(new Color(239,188,2));
		buttonEqual.setBackground(Color.yellow);
		buttonEqual.setFocusable(false);
		frame.add(buttonEqual);

		//buttonDiv add on frame
		buttonDiv.setBounds(220,110,60,40);
		buttonDiv.setFont(new Font("Arial", Font.BOLD,20));
		buttonDiv.setBackground(Color.yellow);
		buttonDiv.setFocusable(false);
		frame.add(buttonDiv);

		//buttonSqrt add on frame
		buttonSqrt.setBounds(10,170,60,40);
		buttonSqrt.setFont(new Font("Arial", Font.BOLD,18));
		buttonSqrt.setFocusable(false);
		frame.add(buttonSqrt);

		//buttonMul add on frame
		buttonMul.setBounds(220,230,60,40);
		buttonMul.setFont(new Font("Arial", Font.BOLD,20));
		buttonMul.setBackground(Color.yellow);
		buttonMul.setFocusable(false);
		frame.add(buttonMul);

		//buttonMinus add on frame
		buttonMinus.setBounds(220,170,60,40);
		buttonMinus.setFont(new Font("Arial", Font.BOLD,20));
		buttonMinus.setBackground(Color.yellow);
		buttonMinus.setFocusable(false);
		frame.add(buttonMinus);

		//buttonPlus add on frame
		buttonPlus.setBounds(220,290,60,40);
		buttonPlus.setFont(new Font("Arial", Font.BOLD,20));
		buttonPlus.setBackground(Color.yellow);
		buttonPlus.setFocusable(false);
		frame.add(buttonPlus);

		//buttonPlus add on frame
		buttonSquare.setBounds(80,170,60,40);
		buttonSquare.setFont(new Font("Arial", Font.BOLD,20));
		buttonSquare.setFocusable(false);
		frame.add(buttonSquare);

		//buttonReciprocal add on frame
		buttonReciprocal.setBounds(150,170,60,40);
		buttonReciprocal.setFont(new Font("Arial", Font.BOLD,15));
		buttonReciprocal.setFocusable(false);
		frame.add(buttonReciprocal);

		//buttonDelete add on frame
		buttonDelete.setBounds(150,110,60,40);
		buttonDelete.setFont(new Font("Arial", Font.BOLD,12));
		buttonDelete.setBackground(Color.red);
		buttonDelete.setForeground(Color.white);
		buttonDelete.setFocusable(false);
		frame.add(buttonDelete);

		//buttonClear add on frame
		buttonClear.setBounds(80,110,60,40);
		buttonClear.setFont(new Font("Arial", Font.BOLD,12));
		buttonClear.setBackground(Color.red);
		buttonClear.setForeground(Color.white);
		buttonClear.setFocusable(false);
		frame.add(buttonClear);
		
	}
	
	
	// Add action events on GUI
	public void addActionEvent() {
	
		onRedioButton.addActionListener(this);
		offRedioButton.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonSquare.addActionListener(this);
		buttonSqrt.addActionListener(this);
		buttonReciprocal.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonZero.addActionListener(this);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		buttonFive.addActionListener(this);
		buttonSix.addActionListener(this);
		buttonSeven.addActionListener(this);
		buttonEight.addActionListener(this);
		buttonNine.addActionListener(this);
	}

	
	public static void main(String[] args) {
		
		// TODO Object creation
		Calculator cal = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    // TODO Auto-generated method stub
	    
	    Object source = e.getSource();
	    
	    if(source == onRedioButton) {
	        enable();
	    }else if(source == offRedioButton) {
	        disable();
	    }else if(source == buttonClear) {
	        label.setText("");
	        textField.setText("");
	    }else if(source == buttonDelete) {
	        int len = textField.getText().length();
	        int number = len - 1;
	        if(len>0) {
	            StringBuilder back = new StringBuilder(textField.getText());
	            back.deleteCharAt(number);
	            textField.setText(back.toString());
	        }if(textField.getText().endsWith("")) {
	            label.setText("");
	        }	
	    }else if(source == buttonZero) {
	        if(textField.getText().equals("0"))
	            return;
	        else
	            textField.setText(textField.getText() + "0");
	    }else if(source == buttonOne) {
	        textField.setText(textField.getText() + "1");
	    }else if(source == buttonTwo) {
	        textField.setText(textField.getText() + "2");
	    }else if(source == buttonThree) {
	        textField.setText(textField.getText() + "3");
	    }else if(source == buttonFour) {
	        textField.setText(textField.getText() + "4");
	    }else if(source == buttonFive) {
	        textField.setText(textField.getText() + "5");
	    }else if(source == buttonSix) {
	        textField.setText(textField.getText() + "6");
	    }else if(source == buttonSeven) {
	        textField.setText(textField.getText() + "7");
	    }else if(source == buttonEight) {
	        textField.setText(textField.getText() + "8");
	    }else if(source == buttonNine) {
	        textField.setText(textField.getText() + "9");
	    }else if(source == buttonDot) {
	        if(textField.getText().contains("."))
	            return;
	        else
	            textField.setText(textField.getText() + ".");
	    }else if(source == buttonPlus) {
	        String str = textField.getText();
	        num1 = Double.parseDouble(textField.getText());
	        calculation = 1;
	        textField.setText("");
	        label.setText(str+"+");
	    }else if(source == buttonMinus) {
	        String str = textField.getText();
	        num1 = Double.parseDouble(textField.getText());
	        calculation = 2;
	        textField.setText("");
	        label.setText(str+"-");
	    }else if(source == buttonMul) {
	        String str = textField.getText();
	        num1 = Double.parseDouble(textField.getText());
	        calculation = 3;
	        textField.setText("");
	        label.setText(str+"x");
	    }else if(source == buttonDiv) {
	        String str = textField.getText();
	        num1 = Double.parseDouble(textField.getText());
	        calculation = 4;
	        textField.setText("");
	        label.setText(str+"/");
	    }else if(source == buttonSquare) {
	        num1 = Double.parseDouble(textField.getText());
	        double square = Math.pow(num1, 2);
	        String string = Double.toString(square);
	        if(string.endsWith(".0")) {
	            textField.setText(string.replace(".0", ""));
	        }else {
	            textField.setText(string);
	        }
	    }else if(source == buttonSqrt) {
	        num1 = Double.parseDouble(textField.getText());
	        double sqrt = Math.sqrt(num1);
	        textField.setText(Double.toString(sqrt));
	    }else if(source == buttonReciprocal) {
	        num1 = Double.parseDouble(textField.getText());
	        double reciprocal = 1/num1;
	        String str = Double.toString(reciprocal);
	        if(str.endsWith(".0"))
	            textField.setText(str.replace(".0", ""));
	        else
	            textField.setText(str);
	    }else if(source == buttonEqual) {
	            
	        num2 = Double.parseDouble(textField.getText());
	        switch(calculation) {
	            case 1:
	                result = num1+num2;
	                break;
	            case 2:
	                result = num1-num2;
	                break;
	            case 3:
	                result = num1*num2;
	                break;
	            case 4:
	                result = num1/num2;
	                break;
	            }
	            if(Double.toString(result).endsWith(".0")) {
					textField.setText(Double.toString(result).replace(".0", ""));
				}else {
					textField.setText(Double.toString(result));
				}

	            label.setText("");
				num1 = result;
	    }

	    
	}
	

	public void enable() {
		
		onRedioButton.setEnabled(false);
		offRedioButton.setEnabled(true);
		textField.setEnabled(true);
		label.setEnabled(true);

		buttonClear.setEnabled(true);
		buttonDelete.setEnabled(true);
		buttonDiv.setEnabled(true);
		buttonMul.setEnabled(true);
		buttonMinus.setEnabled(true);
		buttonPlus.setEnabled(true);
		buttonSquare.setEnabled(true);
		buttonSqrt.setEnabled(true);
		buttonReciprocal.setEnabled(true);
		buttonEqual.setEnabled(true);
		buttonDot.setEnabled(true);
		buttonZero.setEnabled(true);
		buttonOne.setEnabled(true);
		buttonTwo.setEnabled(true);
		buttonThree.setEnabled(true);
		buttonFour.setEnabled(true);
		buttonFive.setEnabled(true);
		buttonSix.setEnabled(true);
		buttonSeven.setEnabled(true);
		buttonEight.setEnabled(true);
		buttonNine.setEnabled(true);
		
	}


	public void disable() {
		
		onRedioButton.setEnabled(true);
		offRedioButton.setEnabled(false);
		textField.setEnabled(false);
		label.setEnabled(false);
		
		label.setText("");
		textField.setText("");

		buttonClear.setEnabled(false);
		buttonDelete.setEnabled(false);
		buttonDiv.setEnabled(false);
		buttonMul.setEnabled(false);
		buttonMinus.setEnabled(false);
		buttonPlus.setEnabled(false);
		buttonSquare.setEnabled(false);
		buttonSqrt.setEnabled(false);
		buttonReciprocal.setEnabled(false);
		buttonEqual.setEnabled(false);
		buttonDot.setEnabled(false);
		buttonZero.setEnabled(false);
		buttonOne.setEnabled(false);
		buttonTwo.setEnabled(false);
		buttonThree.setEnabled(false);
		buttonFour.setEnabled(false);
		buttonFive.setEnabled(false);
		buttonSix.setEnabled(false);
		buttonSeven.setEnabled(false);
		buttonEight.setEnabled(false);
		buttonNine.setEnabled(false);
		
	}

}