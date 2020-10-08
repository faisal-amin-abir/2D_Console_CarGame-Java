import java.util.Scanner;
import java.io.*;

public class Register
{
	public Register() throws Exception
	{
		try{CleanScreen();}catch(Exception e){}
	    Scanner input = new Scanner(System.in);
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
		
		
		
		for(int i =0; i<71; i++)
		System.out.print(" ");
	    
		System.out.print("Register");
		
		
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
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("a. Admin");
		for(int i=0; i<31; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
        for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
		for(int i=0; i<24;i++)System.out.print(" ");
        System.out.print("b. Login");
		for(int i=0; i<31; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.print("|");
        for(int i =0; i<63; i++)System.out.print(" ");
		System.out.println("|");
		
		for(int i =0; i<45; i++)System.out.print(" ");
		for(int i =0; i<65; i++)System.out.print("#");
		
		for(int i =0; i<10; i++)System.out.println();
		char c = input.next().charAt(0);
        if(c == 'a')
		{
			new Admin();
		}else if(c == 'b')
		{
			new login();
		}
        else System.out.println("Typed "+c+"...");		
			
  		
       		
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}