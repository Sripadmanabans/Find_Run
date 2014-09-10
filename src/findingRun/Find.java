package findingRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find 
{
	/*private static String findRun(String input)
	{
		StringBuilder build = new StringBuilder();
		char c;
		String run = new String();
		c = input.charAt(0);
		build.append(c);
		for(int i = 1; i < input.length(); i++)
		{
			c = input.charAt(i);
			if(build.charAt(0) != c)
			{
				if(run.length() < build.length())
				{
					run = build.toString();
				}
				build = new StringBuilder(); 
			}
			build.append(c);
		}
		if(run.length() < build.length())
		{
			run = build.toString();
		}
		return run;
		
	}*/
	
	private static String findRun(String input)
	{
		String run = new String();
		int length = 1, pointer = 0;
		for(int i = 0; i < input.length() - 1; i++)
		{
			if(input.charAt(i) == input.charAt(i+1))
			{
				length++;
			}
			else
			{
				System.out.println("the length : " + length);
				if(run.length() < length)
				{
					run = input.substring(pointer, pointer + length);
				}
				pointer = i+1;
				length = 1;
			}
		}
		if(run.length() < length)
		{
			run = input.substring(pointer, pointer + length);
		}
		return run;
	}
	
	public static void main(String[] args) throws IOException 
	{
		String input, run;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string : ");
		input = br.readLine();
		run = findRun(input);
		System.out.println("The Run is : " + run);
	}

}
