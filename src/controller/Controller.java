package controller;

import javax.swing.JOptionPane;
import View.*;
import model.RecursionTool;
import model.Timer;

public class Controller
{
	private Frame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public Controller()
	{
		this.mathTimer = new Timer();
		this.mathTool = new RecursionTool();
		this.baseFrame = new Frame(this);
	}
	
	public String transferFactorial (String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		
		return factorialResponse;
	}
	
	public String transferFibonacci (String value)
	{
		String fibonacciResponse = "The Fibonacci Sequence of " + value + " is: ";
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		
		return fibonacciResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
			if (test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid integer");
			return false;
		}
	}
	
	public void start()
	{
		
	}
}

