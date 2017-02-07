package model;

public class Timer
{
	private long excecutionTime;
	
	public Timer()
	{
		excecutionTime = 0;
	}
	
	public void startTimer()
	{
		excecutionTime = System.nanoTime();
	}
	
	public void resetTimer()
	{
		excecutionTime = 0;
	}
	
	public void stopTimer()
	{
		excecutionTime = System.nanoTime() - excecutionTime;
	}
	
	public String toString()
	{
		String info = "The excecution time is " + excecutionTime + " in nanoseconds";
		info += "\nThat means " + ((double) excecutionTime )/ 1000000000 + " seconds";
		
		return info;
	}
}
