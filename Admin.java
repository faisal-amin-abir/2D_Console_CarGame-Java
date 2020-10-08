import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Admin
{
	static File file = new File("LoginHistory.txt");
	public Admin() throws Exception
	{
	
			try{CleanScreen();}catch(Exception e){}
			
			file.createNewFile();
			Scanner input = new Scanner(System.in);
			FileWriter writer = new FileWriter(file, true);
			
			for(int i=0; i<10; i++)System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("#");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("-");
			for(int i =0; i<1; i++)System.out.println();
			for(int i =0; i<69;i++)System.out.print(" ");
			System.out.println("Admin Register");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("-");
			System.out.println();
			for(int i = 0 ; i<166; i++)
			System.out.print("#");
			System.out.println();
			
			
			
			String user="",pass="";
			//user
			for(int i =0; i<2; i++)System.out.println();
			for(int i =0; i<65;i++)System.out.print(" ");
			System.out.print("Enter Admin Id: ");
			user=input.nextLine();
			writer.write("Id: "+user+"\n");
			for(int i =0; i<70;i++)System.out.print(" ");
		   
			
			//password
			for(int i =0; i<3; i++)System.out.println();
			for(int i =0; i<65;i++)System.out.print(" ");
			System.out.print("Enter Admin Password: ");
			pass=input.nextLine();
			writer.write("Password: "+pass+"\n\n");
			for(int i =0; i<70;i++)System.out.print(" ");
	
			writer.flush();
			writer.close();
			
			
			//conditions
		
		    new Admin2();
		
	}
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}	
	public static void main(String [] args) throws Exception
	{
		new Admin();
	}
	
}