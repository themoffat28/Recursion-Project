package View;

import controller.Controller;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Color.*;

public class Panel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	private JButton factButton;
	private JButton fibButton;
	private JTextField inputField;
	private JTextArea displayField;
	
	public Panel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.factButton = new JButton("Factorial");
		this.fibButton = new JButton("Fibonacci");
		this.inputField = new JTextField(15);
		this.displayField = new JTextArea(5, 25);

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(factButton);
		this.add(fibButton);
		this.add(inputField);
		this.add(displayField);
		displayField.setWrapStyleWord(true);
		displayField.setLineWrap(true);
		this.setBackground(Color.BLACK);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 24, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 128, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 0, SpringLayout.WEST, displayField);
		baseLayout.putConstraint(SpringLayout.EAST, fibButton, 0, SpringLayout.EAST, displayField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 21, SpringLayout.SOUTH, displayField);
		baseLayout.putConstraint(SpringLayout.NORTH, displayField, 28, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayField, -74, SpringLayout.EAST, this);
	}
	
	public void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayField.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayField.setText(baseController.transferFibonacci(inputField.getText()));
			}
		});
		
	}
}


