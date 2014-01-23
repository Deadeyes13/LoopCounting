package view;

import javax.swing.JFrame;

import controller.LoopController;

/**
 * GUI Frame for Looper project.
 * @author CJ Oman
 * @version 1.1 basic setup, Frame visibility.
 * @date 11/5/13
 */
public class LoopFrame extends JFrame
{
	/*
	 *  Defines the LoopController.
	 */
	private LoopController baseController;
	
	/*
	 *  Defines the LoopPanel.
	 */
	private LoopPanel basePanel;
	
	/*
	 *  Determines the LoopFrame.
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	/*
	 * Sets up the LoopFrame
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
	}
	

}
