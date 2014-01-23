package model;

import java.util.ArrayList;
/**
 * 
 * @author CJ Oman
 * @version 1.1
 * @date 11/5/13
 */
public class Looper
{
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheGraveNameList();
	}
	
	public ArrayList<String>getGraveNameList()
	{
		return graveNameList;
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
		graveNameList.add("");
	}
	
	public String loopTestOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 5; counter <= 17; counter += 2)
		{
			loopResult += counter + ", ";
			numberOfTimes++;

		}
		loopResult += "was the last time.";
		loopResult += "\nThe loop executed " + numberOfTimes + " times.";

		return loopResult;
	}

	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;

//		for (int week = 0; week < 52; week++)
		{
			for (int day = 0; day < 4; day++)
			{
				for (int other = 0; other < 5; other++)
				{

					for (int count = 0; count < 7.5; count++)
					{
//						loopResult += "count is " + count + "\n";
//						for (int otherCount = 0; otherCount < 60; otherCount++)
						{
//							loopResult += "otherCount is " + otherCount;
							numberOfTimes++;
						}
					}
				}
			}
		}
		loopResult += "The loop executed " + numberOfTimes + "times - wow!";
		return loopResult;
	}
}
