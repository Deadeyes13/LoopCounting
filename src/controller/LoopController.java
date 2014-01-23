package controller;

import java.util.ArrayList;

import model.Looper;
import view.LoopFrame;

/**
 * Controller for the Looper.
 * @author CJ Oman
 * @version 1.1 Basic Controller setup.
 * @date 11/5/13
 */
public class LoopController
{
	/*
	 * Defines the Looper.
	 */
	private Looper myLooper;
	
	/*
	 * Sets the LoopFrame.
	 */
	private LoopFrame appFrame;
	
	private int clickCount;
	
	/*
	 * Defines the LoopController
	 */
	public LoopController()
	{
		myLooper = new Looper();
		clickCount = 0;
	}
	
	/*
	 * Sets the return for getLooper.
	 */
	public Looper getMyLooper()
	{
		return myLooper;
	}

	/*
	 * Starts the program.
	 */
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String results = "";
		
		results = loopOverList();
		
		return results;
	}
	
	public String getListResults(int position)
	{
		String currentResult = "";
		
//		ArrayList<String> tempList = myLooper.getGraveNameList();
//		currentResult = tempList.get(position);
		if(position < myLooper.getGraveNameList().size())
		{
		currentResult = myLooper.getGraveNameList().get(position);
		}
		return currentResult;
	}
	
	private String loopBackwardOverList()
	{
		String results = "";
		for(int position = myLooper.getGraveNameList().size()-1; position >= 0; position--)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		return results;
	}
	
	private String loopOverList()
	{
		String results = "";
		
		for(int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			results += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return results;
	}
}
