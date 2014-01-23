package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import controller.LoopController;
import model.Looper;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
  


/**
 * Panel for the Looper Project.
 * @author CJ Oman
 * @version 1.1 Setup the looks of the panel.
 * @date 11/5/13
 */
public class LoopPanel extends JPanel
{
	/*
	 *  Controls the Looper.
	 */
	private LoopController baseController;
	
	/*
	 *  The button to submit to looper.
	 */
	private JButton submitButton;

	/*
	 * The area users input data to.
	 */
	private JTextArea loopArea;
	
	/*
	 * Layout of the Looper.
	 */
	private SpringLayout baseLayout;
	
	/*
	 * The pane that Looper comments on
	 */
	private JScrollPane textPane;
	
	/*
	 * The Looper
	 */
	private Looper appLoop;
	private JLabel lblClickForCheats;
	private Image baseImage;
	private ImageIcon pictureSource;
	
	
	/*
	 * Defines the Looper Panel.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		this.appLoop = baseController.getMyLooper();
		
		submitButton = new JButton("Click here to start!");
		baseLayout = new SpringLayout();
		loopArea = new JTextArea(20,20);
		textPane = new JScrollPane(loopArea);
		pictureSource = new ImageIcon(getClass().getResource("/loop/view/images/background.jpg"));
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		startChat();
	}
	
	/*
	 * Starts up the Chat.
	 */
	public void startChat()
	{
		
	}
	
	/*
	 *  Setups for the Panel.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(textPane);
		
		loopArea.setLineWrap(true);
		loopArea.setWrapStyleWord(true);
		
		//Cookie button
		JButton btnClickTheCookie = new JButton("");
		baseLayout.putConstraint(SpringLayout.NORTH, btnClickTheCookie, 23, SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, btnClickTheCookie, 67, SpringLayout.EAST, textPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, btnClickTheCookie, 74, SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, btnClickTheCookie, -32, SpringLayout.EAST, submitButton);
		btnClickTheCookie.setForeground(Color.BLACK);
		btnClickTheCookie.setBackground(Color.BLACK);
		btnClickTheCookie.setIcon(new ImageIcon("C:\\Users\\coma2116\\Pictures\\smallcookie.png"));
		add(btnClickTheCookie);
		
		lblClickForCheats = new JLabel("Click for Cheats!");
		baseLayout.putConstraint(SpringLayout.NORTH, lblClickForCheats, 6, SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, lblClickForCheats, -217, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblClickForCheats, -138, SpringLayout.EAST, this);
		add(lblClickForCheats);
	}
	
	/*
	 *  Sets up the layouts.
	 */
	private void setupLayout()
	{
		loopArea.setEditable(false);
		loopArea.setBackground(Color.CYAN);
		submitButton.setBackground(Color.GREEN);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 32, SpringLayout.EAST, textPane);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getLoopResults());
				
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, getWidth(), getHeight(), null);
	}
}
