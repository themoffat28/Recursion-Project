package View;

import controller.Controller;
import javax.swing.*;

public class Panel extends JPanel
{
	private JButton factButton;
	private JButton fibButton;
	private JTextField inputField;
	private JTextArea displayField;
	
	public Panel(Controller baseController)
	{
		this.factButton = new JButton();
		this.fibButton = new JButton();
		this.inputField = new JTextField();
		this.displayField = new JTextArea();
	}
}


