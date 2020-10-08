import java.util.Scanner;
import java.io.IOException;

public class viewHighestScore
{
	Scanner input = new Scanner(System.in);
	public viewHighestScore()
	{
		int hs;
		int arr[] = Main.highestScore;
		int totalNumberOfGame = Main.totalGamePlayed;
		int max = arr[0];
		
		for(int i =0; i<totalNumberOfGame; i++)
		{
			if(max < arr[i]) max = arr[i];
		}
		
		
		for(int i =0; i<15; i++)System.out.println();
		
		for(int i = 0; i<166; i++)
		{
			System.out.print("#");
		}
		System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
		for(int i =0; i<65; i++)
		System.out.print(" ");
	
		System.out.print("Highest Score: "+max);
		
		System.out.println();
		System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("-");
		}System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("#");
		}
		for(int i =0; i< 3; i++)
		System.out.println();
    	for(int i =0; i<2;i++)System.out.println();
		for(int i =0; i< 55; i++)System.out.print(" ");
		
		System.out.println("Press the button and 'Enter' for the action");
		
		for(int i =0; i<2;i++)System.out.println();
		for(int i =0; i< 70; i++)System.out.print(" ");
		
		System.out.println("a. Exit");
		
		for(int i = 0 ; i <15; i++)System.out.println();
		char d = input.next().charAt(0);
		if( d == 'a')
		{
			try{
			     CleanScreen();
			}catch(Exception e){}
			new Index();
		}
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}