import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class MathApplet extends Applet implements  ActionListener
{
TextField txtProb = new TextField(20);
TextField txtAnswer = new TextField(20);
Button btnCheck = new Button("Check"); 
TextField txtOutput = new TextField(20);
Button btnNew = new Button("New Problem"); 

int correct = 0;
int youranswer = 0;
int num1, num2;
String problem;
Random r;
//Boolean =+ true


public void init() //constructor
{
	setSize(300,300);
	setBackground(Color.BLUE);
	add(txtProb);
	add(txtAnswer);
	add(btnCheck);
	add(txtOutput);
	add(btnNew);
	r = new Random();
	
	num1 = r.nextInt(10);
	num2 = r.nextInt(10);
	problem = String.valueOf(num1) + " + " + String.valueOf(num2) + " = "; 
	txtProb.setText(problem);
	txtProb.setEditable(false);
	correct = num1 + num2;
	btnCheck.addActionListener(this);
	btnNew.addActionListener(this);
	
	
}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource() == btnCheck)
	{
		youranswer = Integer.parseInt(txtAnswer.getText());
		if (youranswer == correct )
		{
			txtOutput.setText("Correct!");
		}
		else
			txtOutput.setText("Answer is " + String.valueOf(correct));
	}


if (e.getSource() == btnNew)
{
	txtAnswer.setText("");
	txtOutput.setText("");
	num1 = r.nextInt(10);
	num2 = r.nextInt(10);
	problem = String.valueOf(num1) + " + " + String.valueOf(num2) + " = ";
}


}
}
