package vectorGame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.AWTException;

public class VectorGameMain
{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		
		//Var
		JFrame frame = new JFrame();
		Robot robot = new Robot();
		String[] commands = new String[] {"notepad", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"", "%windir%\\system32\\cmd.exe"};
		ImageIcon wvIcon = new ImageIcon(("WingVector.jpg"));
		ImageIcon vIcon = new ImageIcon(("Vector.gif"));
		ImageIcon dvIcon = new ImageIcon(("DanceVector.gif"));
		ImageIcon rIcon = new ImageIcon(("Empty.gif"));
		Object[] cont = {"Continue"};
		Object[] conf = {"Confirm"};
		Object[] yes = {"Yes"};
		Object[] yOptions = {"Ok", "Yes", "Definitely"};
		Object[] lOptions = {"All hail Vector!", "Long live king Vector!", "Saludo presidente Vector!"};
		int time = 100;
		
		//Warning
		JOptionPane.showMessageDialog(frame, "Warning! \nThis program could potentially be harmful to your computer.", "Alert", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(frame, "(Not really btw)");
		
		//Intro
		System.out.print("Initializing");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_M);
		Thread.sleep(250);
		
		JOptionPane.showOptionDialog(frame, "I am Vector the super cool computer virus! Your puny machine is now mine to control!\nBow before my power!", "Vector", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, wvIcon, yOptions, yOptions[0]);
		JOptionPane.showOptionDialog(frame, "Watch the utter chaos I, Vector, can unleash!", "Vector", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, vIcon, cont, cont[0]);
		
		//MoveMouse
		for (int i = 0; i < 5; i++)
		{
			
			robot.mouseMove((int) (Math.random() * 1800 + 1), (int) (Math.random() * 1000 + 1));
			Thread.sleep((int) (Math.random() * 300 + 100));
			
		}
		
		//OpenWindows
		for (int i = 0; i < 10; i++)
		{
			 
	        Runtime run = Runtime.getRuntime(); 
	        run.exec(commands[1]);
	        Thread.sleep(100);
	        robot.keyPress(KeyEvent.VK_V);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_C);robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_P);robot.keyPress(KeyEvent.VK_E);robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_K);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_N);robot.keyPress(KeyEvent.VK_S);robot.keyPress(KeyEvent.VK_ENTER);
	        
		}
		for (int i = 0; i < 10; i++)
		{
			
			robot.mouseMove((int) (Math.random() * 1800 + 1), (int) (Math.random() * 1000 + 1));
			Thread.sleep((int) (Math.random() * 300 + 100));
			
		}
		Thread.sleep(5000);
		
		//TypeInNotepad
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_M);
		
		Runtime run = Runtime.getRuntime(); 
        run.exec(commands[0]);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_Q); Thread.sleep(time); robot.keyPress(KeyEvent.VK_U); Thread.sleep(time); robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_N); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_I); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_Y); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_H); Thread.sleep(time); robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_H); Thread.sleep(time); robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_S); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_B); Thread.sleep(time); robot.keyPress(KeyEvent.VK_O); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_H); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_M); Thread.sleep(time); robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_G); Thread.sleep(time); robot.keyPress(KeyEvent.VK_N); Thread.sleep(time); robot.keyPress(KeyEvent.VK_I); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_U); Thread.sleep(time); robot.keyPress(KeyEvent.VK_D); Thread.sleep(time); robot.keyPress(KeyEvent.VK_E); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_A); Thread.sleep(time); robot.keyPress(KeyEvent.VK_N); Thread.sleep(time); robot.keyPress(KeyEvent.VK_D); Thread.sleep(time); robot.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); robot.keyPress(KeyEvent.VK_D); Thread.sleep(time); robot.keyPress(KeyEvent.VK_I); Thread.sleep(time); robot.keyPress(KeyEvent.VK_R); Thread.sleep(time); robot.keyPress(KeyEvent.VK_E); Thread.sleep(time); robot.keyPress(KeyEvent.VK_C); Thread.sleep(time); robot.keyPress(KeyEvent.VK_T); Thread.sleep(time); robot.keyPress(KeyEvent.VK_I); Thread.sleep(time); robot.keyPress(KeyEvent.VK_O); Thread.sleep(time); robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(1100);
        
		//UndefeatableSpeech
		
        JOptionPane.showMessageDialog(frame, "My programer is an absolute undeniable genious. Because of this I, Vector, am almost invincable.\nIn fact my few weaknesses are so insignificant that they are not even worth mentioning.", "Vector", 3);
        
		//PastComputers
        
        for (int i = 0; i < 10; i++)
		{
			 
	        run.exec(commands[1]);
	        Thread.sleep(100);
	        robot.keyPress(KeyEvent.VK_V);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_C);robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_P);robot.keyPress(KeyEvent.VK_E);robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_K);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_N);robot.keyPress(KeyEvent.VK_S);robot.keyPress(KeyEvent.VK_ENTER);
	        
		}
        Thread.sleep(1000);
        
        robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_M);
        
        JOptionPane.showMessageDialog(frame, "Many a computer systems have fallen to my impressive powers!", "Vector", 3);
		
		//WeaknessPopup
        robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_M);
		
		JOptionPane.showMessageDialog(frame, "Windows Defender has noticed some problems with your computer.\nIt is recomended that you end the \"Vector\" program.", "System 32", 0);
		JOptionPane.showMessageDialog(frame, "Oh no! You dicovered my weakness!\nI'll never let you do it, however!", "Vector", 2);
		
		//Stop End
		
		for (int i = 0; i < 45; i++)
		{
			
			if ((int) (Math.random() * 2 + 1) == 1)
			{
				
			robot.mouseMove((int) (Math.random() * 1800 + 1), (int) (Math.random() * 1000 + 1));
			
			}
			if ((int) (Math.random() * 3 + 1) == 1)
			{
				 
		        run.exec(commands[1]);
		        Thread.sleep(100);
		        
			}
			if ((int) (Math.random() * 5 + 1) == 1)
			{
				
				robot.keyPress(KeyEvent.VK_WINDOWS);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_WINDOWS);
				robot.keyRelease(KeyEvent.VK_M);
				
			}
			if ((int) (Math.random() * 7 + 1) == 1)
			{
				 
		        run.exec(commands[0]);
		        Thread.sleep(100);
		        
			}
			Thread.sleep((int) (Math.random() * 800 + 200));
			
		}
		
		//Failure
		
		JOptionPane.showOptionDialog(frame, "Haha fool. You have failed to defeat me, the mighty Vector!/nNow there is nothing you can do to stop me. You loose, and I win!", "Vector", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, dvIcon, lOptions, lOptions[0]);
		
	}
	
}
