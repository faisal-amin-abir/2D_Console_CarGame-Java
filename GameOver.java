import java.util.Scanner;
import java.io.IOException;
public class GameOver
{
	public GameOver()
	{
		Scanner input= new Scanner(System.in);
		
		for(int i =0; i<10; i++)System.out.println();
		
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
		
		
		
		for(int i =0; i<50; i++)
		System.out.print(" ");
	    
		System.out.print("GAME OVER");
		
		for(int i =0; i<5;i++)System.out.print(" ");
		
		
		System.out.print("Final Score: "+Main.score);
		for(int i =0; i<5;i++)System.out.print(" ");
		System.out.print("Earned coins: "+Main.countPresentCoins);
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

		for(int i =0; i<3; i++)System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		for(int i =0; i<65; i++)System.out.print("#");
		System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		
		
		for(int i =0; i<10; i++)System.out.print(" ");
        System.out.print("Press the following key for the required action");
		for(int i =0; i<6; i++)System.out.print(" ");
		System.out.print("|");
		
        System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<22;i++)System.out.print(" ");
        System.out.print("a. Restart");
		for(int i=0; i<31; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
        for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<22;i++)System.out.print(" ");
        System.out.print("b. Exit");
		for(int i=0; i<34; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		for(int i =0; i<65; i++)System.out.print("#");
		
		for(int i =0; i<5; i++)System.out.println();
		for(int i = 0 ; i <5; i++)System.out.println();
		char d = input.next().charAt(0);
		if( d == 'a')
		{
			
			try{
			     CleanScreen();
			}catch(Exception e){}
			Main.gameOver = false;
			Main.score = 0;
			new Main();
		}else if( d == 'b')
		{
			try{
			     CleanScreen();
			}catch(Exception e){}
			Main.gameOver = false;
			Index.d = '0';
			new Index();
		}
		
		
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}