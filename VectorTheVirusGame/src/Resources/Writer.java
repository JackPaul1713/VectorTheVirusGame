package Resources;

import java.util.Scanner;

public class Writer
{

	public static void main(String[] args)
	{
		
		Scanner strInp = new Scanner(System.in);
		String input = strInp.nextLine();
		
		for (int i = 0; i < input.length(); i++)
		{
			
			//System.out.print("robot.keyPress(KeyEvent.VK_" + input.substring(i, i+1) + "); Thread.sleep(time); ");
			System.out.print("robot.keyPress(KeyEvent.VK_" + input.substring(i, i+1) + ");");
			
		}
		
	}
	
}
