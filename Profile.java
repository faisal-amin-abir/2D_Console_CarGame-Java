import java.util.Scanner;
import java.io.IOException;
public class Profile
{
	public Profile()
	{
		Scanner input = new Scanner(System.in);
		for(int i =0; i<10;i++)System.out.println();
	    for(int i = 0 ; i<166; i++)
        System.out.print("#");
        System.out.println();
        for(int i = 0 ; i<166; i++)
        System.out.print("-");
        for(int i =0; i<2; i++)System.out.println();
        for(int i =0; i<70;i++)System.out.print(" ");
		
        System.out.println("Player Name: "+login.user);
		
		for(int i =0; i<70;i++)System.out.print(" ");
		
        System.out.println("Coins: "+Main.coin);
		
        System.out.println();
        System.out.println();
        for(int i = 0 ; i<166; i++)
        System.out.print("-");
        System.out.println();
        for(int i = 0 ; i<166; i++)
        System.out.print("#");
        for(int i =0; i<10; i++)System.out.println();
		for(int i =0; i<70; i++)System.out.print(" ");
		
		System.out.print("Press and Enter 'a' for exit");
		
		for(int i =0; i<10;i++)System.out.println();
		char d = input.next().charAt(0);
        if(d == 'a')
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