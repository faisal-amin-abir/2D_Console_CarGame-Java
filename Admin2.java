import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Admin2
{
	public Admin2()throws Exception
	{
	    try{CleanScreen();}catch(Exception e){}
		
		for(int i=0; i<10; i++)System.out.println();
		Scanner input = new Scanner(System.in);
		
		
			for(int i = 0 ; i<166; i++)
			System.out.print("#");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("-");
			for(int i =0; i<1; i++)System.out.println();
			for(int i =0; i<69;i++)System.out.print(" ");
			System.out.println("Admin Registration Successful");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("-");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("#");
			System.out.println();
			
			
			
			char c;
			//user
			for(int i =0; i<2; i++)System.out.println();
			for(int i =0; i<65;i++)System.out.print(" ");
			
			System.out.print("Press 'a' for login/'b' for quit...");
			c = input.next().charAt(0);
			
			for(int i =0; i<70;i++)System.out.print(" ");
			for(int i =0; i<3; i++)System.out.println();
			for(int i =0; i<65;i++)System.out.print(" ");
		    if(c == 'a')
			{
				try{CleanScreen();}catch(Exception e){}
				new login();
			}				
			else if(c =='b')
			{
				try{CleanScreen();}catch(Exception e){}
				new End();
			}
			for(int i =0; i<70;i++)System.out.print(" ");
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}