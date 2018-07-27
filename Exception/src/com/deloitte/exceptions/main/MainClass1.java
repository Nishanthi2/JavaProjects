package com.deloitte.exceptions.main;

class IllegalAgeException extends Exception
{
	public String getMessage() {
		return "The person should be 18/above to vote";
	}
}

class Voter
{
	public void register(int age) throws IllegalAgeException
	{
		if(age < 18)
		{
			throw new IllegalAgeException();
		}
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Voter voter = new Voter();
		
		try
		{
			voter.register(16);
		}catch(IllegalAgeException e)
		{
			e.printStackTrace();
		}
	}

}
