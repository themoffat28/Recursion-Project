package View;

import controller.Controller;
import java.awt.Dimension;
import javax.swing.*;

public class Frame extends JFrame
{
	private Panel basePanel;
	private Controller baseController;
	
	public Frame(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.basePanel = new Panel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Math Tool");
		this.setSize(new Dimension (900, 600));
		this.setVisible(true);
	}
}
