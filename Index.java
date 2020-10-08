import java.util.Scanner;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JFrame;
import java.io.IOException;

public class Index extends JFrame
{
	static char d = '0';
	Scanner input = new Scanner(System.in);
	public Index()
	{
		
		try{
		 CleanScreen();
		}catch(Exception e){}
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
		
		
		
		for(int i =0; i<7; i++)
		System.out.print(" ");
	    System.out.print("p.Profile");
		for(int i =0; i<54; i++)
		System.out.print(" ");
		System.out.print("2D Car Game");
		for(int i =0; i<54; i++)System.out.print(" ");
		System.out.print("Coins: "+Main.coin);
		
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
		
		
		for(int i =0; i<5; i++)System.out.println();
		
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
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
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
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("a. Play");
		for(int i=0; i<32; i++)System.out.print(" ");
		System.out.println("|");
		
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("b. Highest Score");
		for(int i=0; i<23; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("c. View Contributors");
		for(int i=0; i<19; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.print("|");
		
		System.out.println();
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("d. Quit");
		for(int i=0; i<32; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		for(int i =0; i<65; i++)System.out.print("#");
		
		for(int i =0; i<5; i++)System.out.println();
		d = input.next().charAt(0);
		
		
		
		if(d == 'a')
		{
			try{
				CleanScreen();
			}catch(Exception e){}
			new Main();
		}else if(d == 'b')
		{
			try{
				CleanScreen();
			}catch(Exception e){}
			new viewHighestScore();
		}
		else if( d == 'd')
		{
			try{
				CleanScreen();
			}catch(Exception e){}
			Main.gameOver = true;
			new End();
		}else if( d == 'c')
		{
			try{
				CleanScreen();
			}catch(Exception e){}
			new Contributors();
		}else if( d == 'p')
		{
			try{
				CleanScreen();
			}catch(Exception e){}
			new Profile();
		}
		
		/**
		this.setSize(10, 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ads");
		this.setVisible(true);
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				 d = e.getKeyChar();				
				}
			});
		
		
		
		
			
		if(d == 'a')
		{
			this.setVisible(false);
			new Main();
		}else if(d == 'c')
		{
			System.out.println("Gamed finished");
			System.exit(0);
		}			
		**/
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}